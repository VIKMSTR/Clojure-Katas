(ns katas.stringkatas-test
  (:require [clojure.test :refer :all])
  (:require [katas.stringkatas :refer [solution]]))

(def ^:private sample-tests
  [{:tested-str "cdabefg"
    :result ["cd" "ab" "ef" "g_"]}
   {:tested-str "cdabefgh"
    :result ["cd" "ab" "ef" "gh"]}
   {:tested-str "abcd"
    :result ["ab" "cd"]}])

(doseq [{:keys [tested-str result]} sample-tests]
  (eval
    `(deftest ~(symbol (str "sample-test-" tested-str))
       (is (~'= ~result (~'solution ~tested-str))))))

(deftest partitiontest
  (testing "partitions"
    (is (= ["cd" "ab" "ef" "g_"] (solution "cdabefg")))
    (is (= ["cd" "ab" "ef" "gh"] (solution "cdabefgh")))
    (is (= ["ab" "cd"] (solution "abcd")))
    ))