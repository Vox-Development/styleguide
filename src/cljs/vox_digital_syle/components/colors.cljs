(ns vox-digital-syle.components.colors
  (:require [re-frame.core :as re-frame]
            [reagent.core :as r]))

(def color-main (r/atom [
                       "bg-green" "bg-gray-lightest"
                       "bg-gray" "bg-dark-blue"
                       "bg-purple" "bg-navy"
                       "bg-orange" "bg-yellow"
                       "bg-white"]))

(def color-gradients (r/atom [
                              "bg-green-gradient" "bg-purple-gradient"
                              "bg-navy-gradient" "bg-orange-gradient"
                              "bg-dark-blue-gradient"]))

(defn color-list [bg-items]
  [:ul {:class "huge-list--unstyled list-colors"}
   (for [color bg-items]
     ^{:key color} [:li {:class "small-12 medium-2 column end"} 
                   	[:div {:class (str "color " color)}
                     [:p "." color]]])])

(defn color-list-gradients [bg-grads]
  [:ul {:class "huge-list--unstyled list-colors"}
   (for [color bg-grads]
     ^{:key color}
     [:li {:class "small-12 medium-2 column end"}
      [:div {:class (str "color " color)}
       [:p "." color]]])])

(defn colors []
  [:section {:id "colors" :class "huge-module anchor clearfix"}
	 [:h2 {:class "huge-module__title"} "Vox Colors"]
	 [:p {:class "huge-module__paragraph"} "Vox colors according to approved CI document"]
	 [color-list @color-main]
   [color-list @color-gradients]])
