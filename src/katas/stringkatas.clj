(ns katas.stringkatas
  (:require [clojure.string :as str]))

;https://www.codewars.com/kata/515de9ae9dcfc28eb6000001
;Split Strings
(defn solution
  [s]
  (map str/join (partition 2 2 ["_"] s))
  )