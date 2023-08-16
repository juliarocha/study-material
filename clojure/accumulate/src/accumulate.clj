(ns accumulate)

(defn accumulate [operation arr] ;; <- arglist goes here
      ;; your code goes here
  (map (fn [x] (operation x)) arr)
  )

