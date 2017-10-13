(ns vox-digital-syle.components.images
  (:require [re-frame.core :as re-frame]
            [reagent.core :as r]))

(def expanded (r/atom nil))

(defn img-holder [iclass]
   (let [placeholder (re-frame/subscribe [:img-placeholder])]

    (fn []
      [:img {:alt "140x140"
             :class iclass
             :style {:width "140px" :height "140px"}
             :src @placeholder }])))

(defn images []
  [:section {:id "images" :class "huge-module anchor clearfix"}
    [:a {:href "#" :class "huge-module__toggle-code" :on-click #(swap! expanded not)}]
    [:h2 {:class "huge-module__title"} "Images"]

    [img-holder "img-rounded"]
    [img-holder "img-circle"]
    [img-holder "img-thumbnail"]
    [img-holder "img-square"]

    [:h2 "Vox Bubbles"]

    [:img {:src "images/green.png" :alt "green bubble" :class "bubble col-md-3"}]
    [:img {:src "images/orange.png" :alt "green bubble" :class "bubble col-md-3"}]
    [:img {:src "images/blue.png" :alt "green bubble" :class "bubble col-md-3"}]
    
    [:br]
    
    (if @expanded 
        [:h1 "Pre code here"])])

