(ns acronym
  (:require [clojure.string :as str]))

(defn acronym
  "Converts phrase to its acronym."
  [phrase]
  (str/upper-case
    (apply str
           (map first
                (str/split phrase #"(\p{Punct}|\p{Space}|\p{Lower}(?=\p{Upper}))+"))))
  )
