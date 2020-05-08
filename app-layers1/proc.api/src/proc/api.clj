(ns proc.api
  (:require
   [proc.protocol :as p]))

(defn foo [proc]
  (p/foo proc))

(defn bar [proc]
  (p/bar proc))