(ns collatz-conjecture)

(defn- calc [count num]
  (if (= num 1)
    count
    (if (even? num)
       (calc (inc count) (/ num 2))
       (calc (inc count) (inc (* num 3)))
       )
    )
  )

(defn collatz [num] ;; <- arglist goes here
  ;; your code goes here
  (calc 0 num)
)
