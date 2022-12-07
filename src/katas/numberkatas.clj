(ns katas.numberkatas)

(defn digits [n]
  (->> n str (map (comp read-string str))))

(defn handleEven
  "Handles sequence with even amount of items"
  [sequence totalDigits]
  (if (==(reduce + (doall (take (-(quot totalDigits 2)1) sequence))) (reduce + (doall (take (-(quot totalDigits 2)1) (reverse sequence))))) "Balanced" "Not Balanced")
  )

(defn handleOdd
  "Handles sequence with odd amount of items"
  [sequence totalDigits]
  (if (==(reduce + (doall (take (quot totalDigits 2) sequence))) (reduce + (doall (take (quot totalDigits 2) (reverse sequence))))) "Balanced" "Not Balanced")
  )

  (defn balanced-num
    "A balanced number is a number where the sum of digits to the left of the middle digit(s)
    and the sum of digits to the right of the middle digit(s) are equal."
    [num]
    (let [converted-digits (digits num)
          total-digits (count converted-digits)]
      (cond
        (== total-digits 0) "Balanced"
        (== total-digits 1) "Balanced"
        (== total-digits 2) "Balanced"
        (even? total-digits) (handleEven converted-digits total-digits)
        :else (handleOdd converted-digits total-digits)
        ))
    )