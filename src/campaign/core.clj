(ns campaign.core
  (:gen-class))


(defrecord Player[name
                  description
                  resistance
                  strenght
                  armor])

(defn toss-a-dice
  ""
  [n]
  (inc (rand-int n)))

(defn -main
  "I don't do a whole lot ... yet."
  [& args]
  (println "Hello, World!"))
