(ns vox-digital-syle.components.lists
  (:require [reagent.core :as r]
            [vox-digital-syle.layout.markup :as markup]))

(def expanded (r/atom nil))

(defn lists []
  [:section {:id "lists" :class "huge-module anchor clearfix"}
	 [:h2 {:class "huge-module__title"} "Lists"]
	 [:h5 {:class "huge-module__title--small"} "Unordered"]
	 [:a {:href "#" :class "huge-module__toggle-code" :on-click #(swap! expanded not)}]
	 [:ul
		 [:li "Consectetur adipiscing elit"]
		 [:li "Nulla volutpat aliquam velit " 
		  [:ul " " 
		   [:li "Vestibulum laoreet porttitor sem"]
		   [:li "Ac tristique libero volutpat at"]" "]" "]]


	 [:h5 {:class "huge-module__title--small"} "Ordered"]
	 [:ol
		 [:li "Faucibus porta lacus fringilla vel"]
		 [:li "Aenean sit amet erat nunc"]
		 [:li "Eget porttitor lorem"]" "]

   (if @expanded
	 [markup/lists-markup])
   ])

