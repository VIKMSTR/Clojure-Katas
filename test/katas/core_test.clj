(ns katas.core-test
  (:require [clojure.test :refer :all]
            [katas.core :refer :all]))

(deftest a-test
  (testing "FIXME, I fail."
    (is (= 0 1))))

(deftest bar-triang-test
  (testing "Basic tests"
    (is (= (bar-triang [4, 6], [12, 4], [10, 10]) [8.6667, 6.6667]))
    (is (= (bar-triang [4, 2], [12, 2], [6, 10]) [7.3333, 4.6667]))
    (is (= (bar-triang [4, 8], [8, 2], [16, 6]) [9.3333, 5.3333]))
    (is (= (bar-triang [0, 0], [1, 3], [-1, 6]) [0.0, 3.0]))
    (is (= (bar-triang [0, 0], [1, 6], [8, -6]) [3.0, 0.0]))
    (is (= (high-and-low "8 3 -5 42 -1 0 0 -9 4 7 4 -4") "42 -9"))
    (is (= (high-and-low "1 2 3") "3 1"))))

(deftest string-tests
  (is (= (endswith "samurai" "ai") true))
  (is (= (endswith "sumo" "omo") false))
  (is (= (endswith "ninja" "ja") true))
  (is (= (endswith "sensei" "i") true))
  (is (= (endswith "samurai" "ra") false))
  (is (= (endswith "abc" "abcd") false))
  (is (= (endswith "abc" "abc") true))
  (is (= (endswith "abcabc" "bc") true))
  (is (= (endswith "ails" "fails") false))
  (is (= (endswith "fails" "ails") true))
  (is (= (endswith "this" "fails") false))
  (is (= (endswith "abc" "") true))
  (is (= (endswith ":-)" ":-(") false))
  (is (= (endswith "!@#$%^&*() :-)" ":-)") true))
  (is (= (endswith "abc\n" "abc") false))
  )