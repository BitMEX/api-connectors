#!/bin/bash

# Builds new versions of client libraries using swagger-codegen
T="$(date +%s)"
DIR=`pwd`
CLIENTS=$DIR/clients
SERVERS=$DIR/servers
RESOURCES="https://www.bitmex.com/api/explorer/resources"
declare -a CLIENTLANGS=(scala java objc php python python3 ruby csharp groovy)
declare -a SERVERLANGS=(jax-rs node sinatra scalatra)

echo "Creating output folders..."
rm -rf $CLIENTS
rm -rf $SERVERS
for clientLang in "${CLIENTLANGS[@]}"; do
  mkdir -p $CLIENTS/$clientLang
done
for serverLang in "${SERVERLANGS[@]}"; do
  mkdir -p $SERVERS/$serverLang
done

echo "Checking out newest swagger-codegen..."
git submodule init
git submodule update

echo "Building latest scala libraries..."
cd swagger-codegen
# Scala 2.11 compat
# grep "scala\.reflect\.BeanProperty" * -rl | xargs sed -i '' s/scala\.reflect\.BeanProperty/scala\.beans\.BeanProperty/
./sbt assembly

echo "Generating client libraries..."
./bin/runscala.sh com.wordnik.swagger.codegen.BasicScalaGenerator $RESOURCES
./bin/runscala.sh com.wordnik.swagger.codegen.BasicJavaGenerator $RESOURCES
./bin/runscala.sh com.wordnik.swagger.codegen.BasicObjcGenerator $RESOURCES
./bin/runscala.sh com.wordnik.swagger.codegen.BasicPHPGenerator $RESOURCES
./bin/runscala.sh com.wordnik.swagger.codegen.BasicPythonGenerator $RESOURCES
./bin/runscala.sh com.wordnik.swagger.codegen.BasicPython3Generator $RESOURCES
./bin/runscala.sh com.wordnik.swagger.codegen.BasicRubyGenerator $RESOURCES
./bin/runscala.sh com.wordnik.swagger.codegen.BasicAndroidJavaClient $RESOURCES
./bin/runscala.sh com.wordnik.swagger.codegen.BasicCSharpGenerator $RESOURCES
./bin/runscala.sh com.wordnik.swagger.codegen.BasicGroovyGenerator $RESOURCES

echo "Generating sample servers..."
./bin/runscala.sh samples/server-generator/node/NodeServerFromSpec.scala $RESOURCES
./bin/runscala.sh samples/server-generator/java-jaxrs/JavaJaxRSServerGenerator.scala $RESOURCES
./bin/runscala.sh samples/server-generator/scalatra/ScalatraServerGenerator.scala $RESOURCES
./bin/runscala.sh samples/server-generator/sinatra/SinatraServerGenerator.scala $RESOURCES


echo "Moving client libraries into apiConnectors..."
mv -f generated-code/scala/* $CLIENTS/scala
# objc directory is wrong
mv -f generated-code/src/* $CLIENTS/objc/src
mv -f generated-code/php/* $CLIENTS/php
mv -f generated-code/python/* $CLIENTS/python
mv -f generated-code/python3/* $CLIENTS/python3
mv -f generated-code/ruby/* $CLIENTS/ruby
mkdir -p $CLIENTS/java/jersey
mkdir -p $CLIENTS/java/android
mv -f generated-code/java/* $CLIENTS/java/jersey
mv -f generated-code/android-java/* $CLIENTS/java/android
mv -f generated-code/csharp/* $CLIENTS/csharp
mv -f generated-code/flash/* $CLIENTS/flash
mv -f generated-code/groovy/* $CLIENTS/groovy

echo "Moving server libraries into apiConnectors..."
mv -f samples/server-generator/java-jaxrs/output/* $SERVERS/jax-rs
mv -f samples/server-generator/node/output/* $SERVERS/node
mv -f samples/server-generator/scalatra/output/* $SERVERS/scalatra
mv -f samples/server-generator/sinatra/output/* $SERVERS/sinatra

echo "Generating static docs..."
./bin/runscala.sh com.wordnik.swagger.codegen.SwaggerDocGenerator $RESOURCES
mv -f samples/swagger-static-docs/docs/* $DIR/docs

T="$(($(date +%s)-T))"
echo "Done in ${T} seconds."
