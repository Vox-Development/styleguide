(ns vox-digital-syle.components.panels
  (:require [reagent.core :as r]))
(def expanded (r/atom nil))

(defn panels []
  [:section {:id "panels" :class "huge-module anchor clearfix"}
   [:a {:href "#" :class "huge-module__toggle-code" :on-click #(swap! expanded not)}]
   [:h2 {:class "huge-module__title"} "Panels"]
   [:div {:class "bs-example" :data-example-id "panel-with-heading"}
    [:div {:class "panel panel-default"}
     [:div {:class "panel-heading"} "Panel heading without title"]
     [:div {:class "panel-body"} " Panel content "]" "]
    [:div {:class "panel panel-default"}
     [:div {:class "panel-heading"}
      [:h3 {:class "panel-title"} "Panel title"]" "]
     [:div {:class "panel-body"} " Panel content "]" "]" "]
   
   (if @expanded
     [:pre {:class "language-markup"}
       [:code {:class "language-markup", :data-language "markup"}
        [:span {:class "nt"} "&lt;div"]
        [:span {:class "na"} "class="]
        [:span {:class "s"} "&quot;panel panel-default&quot;"]
        [:span {:class "nt"} "&gt;"]
        [:span {:class "nt"} "&lt;div"]
        [:span {:class "na"} "class="]
        [:span {:class "s"} "&quot;panel-heading&quot;"]
        [:span {:class "nt"} "&gt;"]"Panel heading without title" 
        [:span {:class "nt"} "&lt;/div&gt;"]
        [:span {:class "nt"} "&lt;div"]
        [:span {:class "na"} "class="]
        [:span {:class "s"} "&quot;panel-body&quot;"]
        [:span {:class "nt"} "&gt;"]"Panel content" 
        [:span {:class "nt"} "&lt;/div&gt;"]
        [:span {:class "nt"} "&lt;/div&gt;"]
        [:span {:class "nt"} "&lt;div"]
        [:span {:class "na"} "class="]
        [:span {:class "s"} "&quot;panel panel-default&quot;"]
        [:span {:class "nt"} "&gt;"]
        [:span {:class "nt"} "&lt;div"]
        [:span {:class "na"} "class="]
        [:span {:class "s"} "&quot;panel-heading&quot;"]
        [:span {:class "nt"} "&gt;"]
        [:span {:class "nt"} "&lt;h3"]
        [:span {:class "na"} "class="]
        [:span {:class "s"} "&quot;panel-title&quot;"]
        [:span {:class "nt"} "&gt;"]"Panel title" 
        [:span {:class "nt"} "&lt;/h3&gt;"]
        [:span {:class "nt"} "&lt;/div&gt;"]
        [:span {:class "nt"} "&lt;div"]
        [:span {:class "na"} "class="]
        [:span {:class "s"} "&quot;panel-body&quot;"]
        [:span {:class "nt"} "&gt;"]"Panel content" 
        [:span {:class "nt"} "&lt;/div&gt;"]
        [:span {:class "nt"} "&lt;/div&gt;"]]]
   )
   ])
