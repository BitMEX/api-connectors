#!/bin/bash -ex

# Builds new versions of client libraries using swagger-codegen
T="$(date +%s)"
DIR=$(pwd)
CLIENTS=$DIR/auto-generated
DOCS=$DIR/docs
CLI=$DIR/swagger-codegen/modules/swagger-codegen-cli/target/swagger-codegen-cli.jar
RESOURCES="https://www.bitmex.com/api/explorer/swagger.json"
declare -a CLIENTLANGS=(android akka-scala clojure csharp java javascript go objc php python ruby scala swagger swagger-yaml swift4 typescript-node cpprest qt5cpp)
# FIXME: php and typescript-node appear to have case-sensitive FS problems
declare -a DOCLANGS=(html dynamic-html)

echo "Getting swagger json..."
rm $DIR/swagger.json || true
curl --compressed $RESOURCES | \
  # Remove `--`, which is an invalid comment in XML and the generator happily puts into XML comments
  sed s/--//g | \
  # Pretty-print
  jq '.' > \
  $DIR/swagger.json

echo "Creating output folders..."
rm -rf $CLIENTS
rm -rf $DOCS
for clientLang in "${CLIENTLANGS[@]}"; do
  mkdir -p $CLIENTS/$clientLang
done

echo "Checking out newest swagger-codegen..."
git submodule init
git submodule update --recursive --remote

echo "Building latest swagger-codegen..."
cd swagger-codegen
mvn package -DskipTests

echo "Generating client libraries..."
for clientLang in "${CLIENTLANGS[@]}"; do
  java -jar $CLI generate -i $DIR/swagger.json -l $clientLang -o $CLIENTS/$clientLang
done

echo "Generating static docs..."
for docLang in "${DOCLANGS[@]}"; do
  java -jar $CLI generate -i $DIR/swagger.json -l $docLang -o $DOCS/$docLang
done

T="$(($(date +%s)-T))"
echo "Done in ${T} seconds."
