(defproject com.leadtune/clj-ml "0.2.5"
  :description "Machine Learning library for Clojure built around Weka and friends"
  :repositories {"leadtune-repo" "http://utility.leadtune.com:8081/nexus/content/repositories/thirdparty/"
                 "stuart" "http://stuartsierra.com/maven2"}
  :java-source-paths ["src/java"]
  :warn-on-reflection true
  :dependencies [[org.clojure/clojure "1.4.0"]
                 [incanter/incanter-core "1.4.1"]
                 [incanter/incanter-charts "1.4.1"]
                 [cs.waikato.ac.nz/weka "3.6.3"]
                 [hr.irb/fastRandomForest "0.98"]]
  :profiles {:dev
             {:plugins [[lein-midje "2.0.0"]]
              :dependencies [[midje "1.4.0"]
                             [swank-clojure "1.4.3"]
                             [com.stuartsierra/lazytest "1.2.3"]]}})
