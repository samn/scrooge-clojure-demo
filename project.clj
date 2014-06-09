(defproject scrooge-clojure-demo "0.1.0-SNAPSHOT"
  :description "An example of generating Java classes from Thrift IDL with Leiningen"
  :url "https://github.com/samn/scrooge-clojure-demo"
  :license {:name "Eclipse Public License"
            :url "http://www.eclipse.org/legal/epl-v10.html"}
  :java-source-paths ["src/java"]
  ;; warn (but don't fail) on checksum errors since libthrift is missing one :(
  :repositories [["twitter" {:url "http://maven.twttr.com/" :checksum :warn}]]
  :dependencies [[com.twitter/scrooge-core "3.9.0"]
                 [com.twitter/scrooge-runtime "3.9.0"]
                 [org.apache.thrift/libthrift "0.5.0-1"]])
