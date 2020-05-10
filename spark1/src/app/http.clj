(ns app.http
  (:require
   [clojure.core.async :as a :refer [<! >! <!! timeout chan alt! go close!
                                     >!! <!! alt!! alts! alts!! take! put! mult tap untap
                                     thread pub sub sliding-buffer mix admix unmix]])
  (:import
   spark.Spark
   spark.Route))

; http://sparkjava.com/documentation
; https://javadoc.io/doc/com.sparkjava/spark-core/latest/spark/Spark.html



(def host "0.0.0.0")
(def port 8080)

(defn create-server []
  (def *tmp* "something defined in runtime")
  (Spark/port port)
  (Spark/init)
  (Spark/get "/" (reify Route
                   (handle [_ req res]
                     (format "hello world, %s" *tmp*)))))


(defn start []
  (println (format "; stared http server on %s:%s" host port))
  (create-server))