(ns vox-digital-syle.views
  (:require [re-frame.core :as re-frame]
            [vox-digital-syle.layout.head :as head]
            [vox-digital-syle.layout.sidebar :as sidebar]
            [vox-digital-syle.components.iframewrapper :as wrapper]
            [vox-digital-syle.layout.footer :as footer]
  ))

;; home
(defn home-panel []
  [:div
   [:main.container
     [head/header]
     [sidebar/sidebar]
     [wrapper/wrapper]
     [footer/footer]]])


;; main
(defn- panels [panel-name]
  (case panel-name
    :home-panel [home-panel]
    [home-panel]))

(defn show-panel [panel-name]
  [panels panel-name])

(defn main-panel []
  (let [active-panel (re-frame/subscribe [:active-panel])]
    (fn []
      [show-panel @active-panel])))