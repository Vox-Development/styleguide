(ns vox-digital-syle.components.buttons
  (:require [reagent.core :as r]
            [vox-digital-syle.layout.markup :as markup]))

(def expanded (r/atom nil))

(defn button [bclass]
  [:a {:href "#" :class (str "btn " bclass)} "." bclass])

(defn buttons []
  [:section {:id "buttons" :class "huge-module anchor clearfix"}
	 [:h2 {:class "huge-module__title"} "Buttons"]
	 [:ul {:class "huge-list--unstyled"}
	  [:li.spaced
	   	[:a {:href "#" :class "huge-module__toggle-code" :on-click #(swap! expanded not)}]

      [button "btn-sugn-up"]
    	[button "btn-prev"]
    	[button "btn-next"]
    	[button "btn-success round-btn"]

      [:p "Below are bootstrap defaults"]
      [:br]

      [button "btn-success"]
    	[button "btn-warning"]
    	[button "btn-danger"]
    	[button "btn-default"]

    (if @expanded
      [markup/button-markup ])
    ]
   ]]
  )
