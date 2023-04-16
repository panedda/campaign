(ns campaign.core
  (:gen-class))

(defrecord Creature[name
                    description
                    resistance
                    strenght
                    armor])

(defrecord Avenger[name
                    description
                    resistance
                    strenght
                    armor])

(defn -main
  "I don't do a whole lot ... yet."
  [& args]
  (println "Hello, World!"))
