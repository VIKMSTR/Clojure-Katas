(ns katas.numberkatas-test
  (:require [clojure.test :refer :all])
  (:require [katas.numberkatas :refer [balanced-num]]))

(deftest balanced-num-test
  (testing "test balanced numbers"
    (is (= "Balanced" (balanced-num 7)))
    (is (= "Balanced" (balanced-num 959)))
    (is (= "Balanced" (balanced-num 13)))
    (is (= "Not Balanced" (balanced-num 432)))
    (is (= "Balanced" (balanced-num 424)))
    ))