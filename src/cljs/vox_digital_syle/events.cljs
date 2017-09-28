(ns vox-digital-syle.events
  (:require [re-frame.core :as re-frame]
            [vox-digital-syle.db :as db]))

(re-frame/reg-event-db
 :initialize-db
 (fn  [_ _]
   db/default-db))

(re-frame/reg-event-db
 :set-active-panel
 (fn [db [_ active-panel]]
   (assoc db :active-panel active-panel)))

(re-frame/reg-event-db
 :set-active-section
 (fn [db [_ section]]
   (assoc db :active-section section)))
