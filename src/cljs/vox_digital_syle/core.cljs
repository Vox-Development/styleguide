(ns vox-digital-syle.core
  (:require [reagent.core :as reagent]
            [re-frame.core :as re-frame]
            [vox-digital-syle.events]
            [vox-digital-syle.subs]
            [vox-digital-syle.routes :as routes]
            [vox-digital-syle.views :as views]
            [vox-digital-syle.config :as config]))


(defn dev-setup []
  (when config/debug?
    (enable-console-print!)
    (println "dev mode")))

(defn mount-root []
  (re-frame/clear-subscription-cache!)
  (reagent/render [views/main-panel]
                  (.getElementById js/document "app")))

(defn ^:export init []
  (routes/app-routes)
  (re-frame/dispatch-sync [:initialize-db])
  (dev-setup)
  (mount-root))
