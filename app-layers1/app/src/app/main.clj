(ns app.main
  (:require
   [clojure.core.async :as a :refer [<! >! <!! timeout chan alt! go close!
                                     >!! <!! alt!! alts! alts!! take! put! mult tap untap
                                     thread pub sub sliding-buffer mix admix unmix]]
   [app.api.http]
   [proc.impl])
  (:gen-class))


(defn -main [& args]
  #_(Thread/sleep Long/MAX_VALUE)
  (def ^:dynamic *proc* (proc.impl/create))
  (set! app.api.http/*proc*)
  (app.api.http/start))
