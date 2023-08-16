(ns triangle)

(defn is-valid? [a b c] ;; <- arglist goes here
  ;; your code goes here
  (and (and (pos? a) (pos? b) (pos? c)) (>= (+ a b) c) (>= (+ a c) b) (>= (+ c b) a))
)

(defn equilateral? [a b c] ;; <- arglist goes here
  ;; your code goes here
  (and (is-valid? a b c) (= a b c))
  )

(defn isosceles? [a b c] ;; <- arglist goes here
  ;; your code goes here
  (and (is-valid? a b c) (or (= a c) (= b c) (= a b)))
)

(defn scalene? [a b c] ;; <- arglist goes here
  ;; your code goes here
  (and (is-valid? a b c) (not (isosceles? a b c)) (not= a b c))
)
