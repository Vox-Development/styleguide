(ns vox-digital-syle.layout.head
  (:require [re-frame.core :as re-frame]))

(defn header []
  (let [name (re-frame/subscribe [:name])]
    (fn []
      [:div
	   [:header.huge-header
	      [:div.huge-header__welcome.right @name
	       [:nav.huge-header__breakpoints.right]]]])
    )
  )
