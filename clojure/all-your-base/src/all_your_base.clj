(ns all-your-base)

(defn- exp [x n]
  (if (zero? n) 1
                (* x (exp x (dec n)))))

(defn- to-list [num]
  (remove )
  (if (> num 0)
    (concat (to-list (int (/ num 10))) (list (mod num 10)))
    '()
    )
  )


(defn- to-decimal [list-num base]
  (if (not-empty list-num)
    (+ (* (first list-num) (exp base (- (count list-num) 1))) (to-decimal (rest list-num) base))
    0
   )
  )

(defn- from-decimal [num base]
  (if (= 10 base)
    (to-list num)
    (if (not= num 1)
        (concat (from-decimal (int (/ num base)) base) (list (mod num base)))
      '(1)
      )
    )
  )

(defn convert [base-inic list-numero base-final] ;; <- arglist goes here
  ;; your code goes here
  (if (or (not (< 1 base-inic))
          (not (< 1 base-final))
          (not (empty? (filter (fn [x] (or (not (<= 0 x)) (> x (dec base-inic)))) list-numero))))
    nil
    (if (not-empty list-numero)
      (if (every? zero? list-numero)
        '(0)
        (let [decimal
              (to-decimal list-numero base-inic)
              result
              (from-decimal decimal base-final)]
          result)
        )
      '()
    )
  )
)
