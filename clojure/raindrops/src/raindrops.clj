(ns raindrops
  (:require [clojure.string :as str]))


;has 3 as a factor, add 'Pling' to the result.
;has 5 as a factor, add 'Plang' to the result.
;has 7 as a factor, add 'Plong' to the result.
;does not have any of 3, 5, or 7 as a factor, the result should be the digits of the number.

(defn convert [num] ;; <- arglist goes here
      ;; your code goes here

  (let [rain (str
               (when (= 0 (mod num 3)) "Pling")
               (when (= 0 (mod num 5)) "Plang")
               (when (= 0 (mod num 7)) "Plong")
               )
        ]
    (if (empty? rain)
      (str num)
      rain))
)
