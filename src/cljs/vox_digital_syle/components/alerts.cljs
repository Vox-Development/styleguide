(ns vox-digital-syle.components.alerts
  (:require [reagent.core :as r]))

(def expanded (r/atom nil))

(defn alerts []
  [:section {:id "alerts" :class "huge-module anchor clearfix"}
   [:a {:href "#" :class "huge-module__toggle-code" :on-click #(swap! expanded not)}]
   [:h2 {:class "huge-module__title"} "Alerts"]

   [:div {:class "bs-example" :data-example-id "simple-alerts"}
    [:div {:class "alert alert-success" :role "alert"}
     [:strong "Well done!"]" You successfully read this important alert message. "]
    [:div {:class "alert alert-info" :role "alert"}
     [:strong "Heads up!"]" This alert needs your attention, but it`s not super important. "]
    [:div {:class "alert alert-warning" :role "alert"}
     [:strong "Warning!"]" Better check yourself, you`re not looking too good. "]
    [:div {:class "alert alert-danger" :role "alert"}
     [:strong "Oh snap!"]" Change a few things up and try submitting again. "]" "]

   (if @expanded
     [:pre {:class "language-markup"}
       [:code {:class "language-markup" :data-language "markup"}
        [:span {:class "nt"} "&lt;div"]
        [:span {:class "na"} "class="]
        [:span {:class "s"} "&quot;alert alert-success&quot;"]
        [:span {:class "na"} "role="]
        [:span {:class "s"} "&quot;alert&quot;"]
        [:span {:class "nt"} "&gt;"]"..." 
        [:span {:class "nt"} "&lt;/div&gt;"]
        [:span {:class "nt"} "&lt;div"]
        [:span {:class "na"} "class="]
        [:span {:class "s"} "&quot;alert alert-info&quot;"]
        [:span {:class "na"} "role="]
        [:span {:class "s"} "&quot;alert&quot;"]
        [:span {:class "nt"} "&gt;"]"..." 
        [:span {:class "nt"} "&lt;/div&gt;"]
        [:span {:class "nt"} "&lt;div"]
        [:span {:class "na"} "class="]
        [:span {:class "s"} "&quot;alert alert-warning&quot;"]
        [:span {:class "na"} "role="]
        [:span {:class "s"} "&quot;alert&quot;"]
        [:span {:class "nt"} "&gt;"]"..." 
        [:span {:class "nt"} "&lt;/div&gt;"]
        [:span {:class "nt"} "&lt;div"]
        [:span {:class "na"} "class="]
        [:span {:class "s"} "&quot;alert alert-danger&quot;"]
        [:span {:class "na"} "role="]
        [:span {:class "s"} "&quot;alert&quot;"]
        [:span {:class "nt"} "&gt;"]"..." 
        [:span {:class "nt"} "&lt;/div&gt;"]]])
   ]
  )

