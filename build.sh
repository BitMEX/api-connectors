#!/bin/bash

# Builds new versions of client libraries using swagger-codegen
DIR=`pwd`
RESOURCES="https://www.bitmex.com/api/explorer/resources"

echo "Checking out newest swagger-codegen..."
git submodule init
git submodule update

echo "Building latest scala libraries..."
cd swagger-codegen
./sbt assembly

echo "Generating client libraries..."
./bin/runscala.sh com.wordnik.swagger.codegen.BasicScalaGenerator $RESOURCES
./bin/runscala.sh com.wordnik.swagger.codegen.BasicJavaGenerator $RESOURCES
./bin/runscala.sh com.wordnik.swagger.codegen.BasicObjcGenerator $RESOURCES
./bin/runscala.sh com.wordnik.swagger.codegen.BasicPHPGenerator $RESOURCES
./bin/runscala.sh com.wordnik.swagger.codegen.BasicPythonGenerator $RESOURCES
./bin/runscala.sh com.wordnik.swagger.codegen.BasicPython3Generator $RESOURCES
./bin/runscala.sh com.wordnik.swagger.codegen.BasicRubyGenerator $RESOURCES

echo "Moving client libraries into apiConnectors..."
mv generated-code/scala $DIR/scala
mv generated-code/java $DIR/java
mkdir -p $DIR/objc # for whatever reason, codegen flubs this dirname
mv generated-code/src $DIR/objc/src
mv generated-code/php $DIR/php
mv generated-code/python $DIR/python
mv generated-code/python3 $DIR/python3
mv generated-code/ruby $DIR/ruby

echo "Done!"
