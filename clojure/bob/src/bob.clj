(ns bob
  (:require [clojure.string :as str]))

(defn all-uppercase-and-letters? [s]
  (and (some #(Character/isLetter %) s) (= s (str/upper-case s)))
  )



(defn response-for [s] ;; <- arglist goes here
  ;; your code goes here

  (let [response (cond
                   (str/blank? s) "Fine. Be that way!"
                   (and (all-uppercase-and-letters? s) (str/ends-with? (str/trim s) "?")) "Calm down, I know what I'm doing!"
                   (all-uppercase-and-letters? s) "Whoa, chill out!"
                   ( str/ends-with? (str/trim s) "?") "Sure."
                   :else "Whatever."
                   )
        ]
    response
        )
)
