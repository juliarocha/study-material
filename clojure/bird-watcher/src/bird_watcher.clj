(ns bird-watcher)

(def last-week [0 2 5 3 7 8 4])

(defn today [birds]
  (get birds (- (count birds) 1))
  )

(defn inc-bird [birds]
  (let [today-count (+ 1 (get birds (- (count birds) 1))) ]
    (assoc birds (- (count birds) 1) today-count))
  )

(defn day-without-birds? [birds]
  (> (count (filter zero? birds)) 0)
  )

(defn n-days-count [birds n]
  (reduce + (subvec birds 0 n))
  )

(defn busy-days [birds]
  (count (filter #(>= % 5) birds))
  )

(defn odd-week? [birds]
  (= birds [1 0 1 0 1 0 1])
  )
