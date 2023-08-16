(ns cars-assemble)

(def cars-per-hour 221)

(defn production-rate
  "Returns the assembly line's production rate per hour,
   taking into account its success rate"
  [speed]
  (let [success-rate (cond
                       (and (>= speed 1) (<= speed 4)) 1.0
                       (and (>= speed 5) (<= speed 8)) 0.9
                       (= 9 speed) 0.8
                       (= 10 speed) 0.77
                       :else 0
                       )]
    (double (* success-rate (* speed cars-per-hour)))
    )
  )

(defn working-items
  "Calculates how many working cars are produced per minute"
  [speed]

  (let [cars-produced (production-rate speed)]
    (int (/ cars-produced 60))
    )
  )
