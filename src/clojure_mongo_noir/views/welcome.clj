(ns clojure-mongo-noir.views.welcome
  (:require [clojure-mongo-noir.views.common :as common]
            [noir.content.getting-started])
  (:use [noir.core :only [defpage]]))

(defpage "/welcome" []
         (common/layout
           [:p "Welcome to clojure-mongo-noir"]))
