(ns clojure-mongo-noir.views.welcome
  (:require [clojure-mongo-noir.views.common :as common]
            [noir.content.getting-started])
  (:use [noir.core :only [defpage]]))

(defpage "/welcome" []
         (common/layout
           [:p "Welcome to clojure-mongo-noir"]))
(defpage "/coolpage"[]
					(html
						[:h1 "This is a Super Cool Page!"])
	)
