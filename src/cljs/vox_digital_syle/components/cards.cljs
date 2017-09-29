(ns vox-digital-syle.components.cards
  (:require [reagent.core :as r]))

(def expanded (r/atom nil))
(def base-url "https://www.vox.co.za")

(defn card [url]
  [:div {:class "col-md-4 promotion"}
      [:div {:class "card text-center"}
       [:img {:class "card-img-top" :src (str base-url url) :alt "cards"}]
       [:div {:class "card-block"}
        [:p {:class "text-center"} "LTE-A is now available at Vox. Purchase your LTE-A with us between now and the 30th of November"]
        [:a {:href "#" :class "btn btn-sugn-up"} "Choose"]]]])

(defn cards []
  [:section {:id "cards" :class "container huge-module anchor clearfix"}
   [:a {:href "#" :class "huge-module__toggle-code" :on-click #(swap! expanded not)}]
   [:h2 {:class "huge-module__title"} "Cards"]

   [:div {:class "row"}
    [card 
     "/wp-content/uploads/2017/09/LTE-A-Web-Home-image.png"]
    [card 
     "/wp-content/uploads/2016/09/815.1-OMT-Static-Web-Banner-FA-297x172-V1-20170727.png"]
    
    [card 
     "/wp-content/uploads/2016/09/887.2-Vox-Air-static-web-banner-297x172-V2-FA-20170726.png"]]

   (if @expanded
     [:div "pre code hare"])
   ]
  )

