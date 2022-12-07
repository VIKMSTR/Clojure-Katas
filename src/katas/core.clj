(ns katas.core
  (:require [clojure.string :as str]))

(defn round
  "Rounds 'x' to 'places' decimal places"
  [places, x]
  (->> x
       bigdec
       (#(.setScale % places java.math.RoundingMode/HALF_UP))
       .doubleValue))

(defn bar-triang [[a b] [c d] [e f]]
  [(round 4
          (double (/ (+ a c e) 3)))
   (round 4
          (double (/ (+ b d f) 3)))
   ]
  )

(defn high-and-low [s]
  ; happy coding!
  (str (apply max (map #(Integer/parseInt %) (str/split s #" ")))
       " "
       (apply min (map #(Integer/parseInt %) (str/split s #" ")))
       )
  )

(defn endswith
  "Kata https://www.codewars.com/kata/51f2d1cafc9c0f745c00037d/train/clojure"
  [strng ending]
  (str/ends-with? strng ending))


