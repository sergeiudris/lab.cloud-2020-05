(ns proc.api
  (:require
   [app.impl.protocols :as p]
   [app.impl.proc :as proc]))

(defn create-proc []
  (proc/create))

(defn foo [proc]
  (p/foo proc))

(defn bar [proc]
  (p/bar proc))

