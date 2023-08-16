(ns pangram
  (:require [clojure.string :as str]))

(defn pangram? [phrase]
  (every? true?
    (for [x "abcdefghijklmnopqrstuvwxyz"]
      (str/includes? (str/lower-case phrase) (str x))
    )
  )
)