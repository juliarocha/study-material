(ns say)

(defn number [num] ;; <- arglist goes here
  ;; your code goes here
  (throw-if (not (and (>= num 0) (<= num 999999999999))) IllegalArgumentException.)

)

