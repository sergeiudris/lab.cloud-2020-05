(ns app.api
  (:require
   [clojure.core.async :as a :refer [<! >! <!! timeout chan alt! go close!
                                     >!! <!! alt!! alts! alts!! take! put! mult tap untap
                                     thread pub sub sliding-buffer mix admix unmix]]
   [app.impl.core :as core]
   [app.impl.abc :as abc]
   [app.impl.protocols :as p]))


