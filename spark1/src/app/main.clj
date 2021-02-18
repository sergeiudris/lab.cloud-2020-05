(ns app.main
  (:require
   [clojure.core.async :as a :refer [<! >! <!! timeout chan alt! go close!
                                     >!! <!! alt!! alts! alts!! take! put! mult tap untap
                                     thread pub sub sliding-buffer mix admix unmix]]
   [app.http])
  (:gen-class))

(def counter1 (atom 0))
(def counter2 (atom 0))

(def foo| (chan (sliding-buffer 10)))

(defn -main [& args]
  #_(println "hello")
  #_(Thread/sleep Long/MAX_VALUE)
  (go (loop []
        (<! (timeout 1000))
        (swap! counter1 inc)
        (println ::loop-a @counter1)
        (recur)))
  (go (loop []
        (<! (timeout 1000))
        (>! foo| @counter1)
        (recur)))
  (go (loop []
        (when-let [value (<! foo|)]
          (println ::loop-b value)
          (recur))))
  (app.http/start))
