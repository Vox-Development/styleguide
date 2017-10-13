(ns vox-digital-syle.components.panels
  (:require [reagent.core :as r]
            [vox-digital-syle.layout.markup :as markup]))

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
     [markup/panel-markup]
   )])
