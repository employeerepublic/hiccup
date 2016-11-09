(defproject employeerepublic/hiccup "1.0.6"
  :description "A fast library for rendering HTML in Clojure"
  :url "http://github.com/weavejester/hiccup"
  :license {:name "Eclipse Public License"
            :url "http://www.eclipse.org/legal/epl-v10.html"}
  :dependencies [[org.clojure/clojure "1.5.1"]]
  :plugins [[lein-codox "0.9.4"]]
  :codox
  {:output-path "codox"
   :source-uri  "http://github.com/weavejester/hiccup/blob/{version}/{filepath}#L{line}"
   :namespaces  [#"^hiccup\.(?!compiler)"]}
  :aliases {"test-all" ["with-profile" "default:+1.6:+1.7:+1.8" "test"]}
  :profiles
  {:1.6 {:dependencies [[org.clojure/clojure "1.6.0"]]}
   :1.7 {:dependencies [[org.clojure/clojure "1.7.0"]]}
   :1.8 {:dependencies [[org.clojure/clojure "1.8.0"]]}})
