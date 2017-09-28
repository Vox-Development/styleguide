(ns vox-digital-syle.layout.footer
  (:require [re-frame.core :as re-frame]))

(defn footer []
  [:div.text-center
   [:a {:href "//vox.co.za" :target "_blank"}
    [:p "Crafting Great Work"]]])