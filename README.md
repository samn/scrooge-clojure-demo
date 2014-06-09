# scrooge-clojure-demo

An example of using scrooge to generate Java classes from a Thrift IDL with Leiningen

## Project Structure

A Thrift IDL file is in `resources/thrift`, it will be compiled to Java source files which will be compiled by lein.
The compilation from Thrift IDL -> Java should be done once and versioned as a golden jar.
That versioned jar can be included as a dependency in downstream projects, like the service implementation or its client.

## Usage

1. Retrieve [scrooge-generator-3.9.0-jar-with-dependencies.jar](http://maven.twttr.com/com/twitter/scrooge-generator/3.9.0/scrooge-generator-3.9.0-jar-with-dependencies.jar)
2. `java -jar scrooge-generator-3.9.0-jar-with-dependencies.jar --finagle --language java --dest src/java resources/thrift/schema.thrift`
3. `lein install`
