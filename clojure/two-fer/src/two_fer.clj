(ns two-fer
  (:require [clojure.string :as str]))

(defn two-fer
  ([] (two-fer "you"))
  ([name] (str "One for " name ", one for me."))
  )
