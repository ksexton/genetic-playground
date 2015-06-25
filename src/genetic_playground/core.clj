;; Given the digits 0 through 9 and the operators +, -, * and /,  find a
;; sequence that will represent a given target number. The operators
;; will be applied sequentially from left to right as you read.

(ns genetic-playground.core
  (:gen-class))

(def chromosome
  {:0000 "0"
   :0001 "1"
   :0010 "2"
   :0011 "3"
   :0100 "4"
   :0101 "5"
   :0110 "6"
   :0111 "7"
   :1000 "8"
   :1001 "9"
   :1010 "+"
   :1011 "-"
   :1100 "*"
   :1101 "/"})

(defn select-gene
  "Return a random KEYWORD from chromosome"
  []
  (let [gene (vec (keys chromosome))]
    (get gene (rand-int (dec (count gene))))))

(defn combine-chromosome
  "Combines genes into chromosome of LENGTH"
  [length]
  (repeatedly length select-gene))

(defn more-chromosome
  []
  (map (fn [gene] (get chromosome gene))
          (combine-chromosome 20)))

(defn -main
  "I don't do a whole lot ... yet."
  [& args]
  (println "Hello, World!"))
