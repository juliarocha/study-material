(ns anagram
  (:require [clojure.string :as str]))

(defn- anagram? [word1 word2]
  (let [a (str/lower-case word1)
        b (str/lower-case word2)]

    (and (not= a b)
         (= (sort a) (sort b))
         )
    )
  )

(defn anagrams-for [word prospect-list] ;; <- arglist goes here
  ;; your code goes here
  (filter (partial anagram? word) prospect-list)

)
