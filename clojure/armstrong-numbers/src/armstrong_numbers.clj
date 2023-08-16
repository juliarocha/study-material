(ns armstrong-numbers)

(defn expt [x n]
  (reduce * (repeat n x)))

(defn armstrong? [num]
  (let [num-str (str num)
        num-count (count num-str)]
    (= num (reduce + (map #(expt (Character/digit % 10) num-count) num-str)))))