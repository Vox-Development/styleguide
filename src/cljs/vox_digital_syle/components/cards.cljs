(ns vox-digital-syle.components.cards
  (:require [re-frame.core :as re-frame]
            [reagent.core :as r]))

(def expanded (r/atom nil))

(defn cards []
  [:section {:id "cards" :class "container huge-module anchor clearfix"}
   [:a {:href "#" :class "huge-module__toggle-code" :on-click #(swap! expanded not)}]
   [:h2 {:class "huge-module__title"} "Cards"]

   [:div {:class "row"}
     [:div {:class "col-md-4 promotion"}
      [:div {:class "card text-center"}
       [:img {:class "card-img-top", :src "https://www.vox.co.za/wp-content/uploads/2017/09/LTE-A-Web-Home-image.png", :alt "..."}]
       [:div {:class "card-block"}
        [:p {:class "text-center"} "LTE-A is now available at Vox. Purchase your LTE-A with us between now and the 30th of November, we will DOUBLE your data! T&#39;s and C&#39;s Apply."]
        [:a {:href "#", :class "btn btn-sugn-up"} "Choose"]]]]
     [:div {:class "col-md-4 promotion"}
      [:div {:class "card text-center"}
       [:img {:class "card-img-top", :src "https://www.vox.co.za/wp-content/uploads/2016/09/815.1-OMT-Static-Web-Banner-FA-297x172-V1-20170727.png", :alt "..."}]
       [:div {:class "card-block"}
        [:p {:class "text-center"} "Need to do marketing, but don’t have a marketing manager? Our DIY Online Marketing Toolbox can help. From your website to your emails,  you covered!"]
        [:a {:href "#", :class "btn btn-sugn-up"} "Choose"]]]]
     [:div {:class "col-md-4 promotion"}
      [:div {:class "card text-center"}
       [:img {:class "card-img-top", :src "https://www.vox.co.za/wp-content/uploads/2016/09/887.2-Vox-Air-static-web-banner-297x172-V2-FA-20170726.png", :alt "..."}]
       [:div {:class "card-block"}
        [:p {:class "text-center"} "Vox Air enables multi-point conferencing without expensive infrastructure and takes video conferencing into the cloud. This is a browser-based time."]
        [:a {:href "#", :class "btn btn-sugn-up"} "Choose"]]]]]

   (if @expanded
     [:div "pre code hare"])
   ]
  )

