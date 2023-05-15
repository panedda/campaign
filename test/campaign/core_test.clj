(ns campaign.core-test
  (:require [clojure.test :refer :all]
            [campaign.core :refer :all]))

(deftest test-an-interaction
  (testing "Testing an interaction between two players"
    (is (= 0 1))))

(deftest test-an-action
  (testing "Testing an action triggered by a player"
    (is (= 0 1))))

(deftest test-a-reaction
  (testing "Testing a reaction triggered by a player"
    (is (= 0 1))))

(deftest test-fight
  (testing "Testing a fight"
    (is (= 0 1))))

(deftest test-a-round
  (testing "Testing a round"
    (is (= 0 1))))

(deftest test-set-the-round-oreder
  (testing "Testing the round order"
    (is (= 0 1))))

