(ns interest-is-interesting)

(defn interest-rate
  "Returns the interest rate based on the specified balance."
  [balance]

  (let [rate
        (cond
                       (and (>= balance 0.0M) (< balance 1000.0M)) 0.5
                       (and (>= balance 1000.0M) (< balance 5000.0M)) 1.621
                       (>= balance 5000.0M) 2.475
                       :else -3.213
                       )]
    (double rate))
  )

(defn- annual-amount [balance]
  (let [rate (bigdec (/ (interest-rate balance)
                              100))]
    (* (if (neg? balance) (- balance) balance) rate)
    )
  )

(defn annual-balance-update
  "Returns the annual balance update, taking into account the interest rate."
  [balance]
  (+ balance (annual-amount balance))
  )


(defn amount-to-donate
  "Returns how much money to donate based on the balance and the tax-free percentage."
  [balance tax-free-percentage]
  (if (> balance 0.0M)
    (let [percentage (bigdec (/ tax-free-percentage
                                100.0))]
      (int (* 2.0 (* balance percentage))))
    0)
  )