(ns app.main
  (:require
   [clojure.core.async :as a :refer [<! >! <!! timeout chan alt! go close!
                                     >!! <!! alt!! alts! alts!! take! put! mult tap untap
                                     thread pub sub sliding-buffer mix admix unmix]]
   [app.api.http]
   [app.api.que]
   [app.api])
  (:gen-class))


(defn -main [& args]
  #_(Thread/sleep Long/MAX_VALUE)
  (def  proc (app.api/create-proc))
  (set! app.api.http/*proc* proc)
  (app.api.http/start))
