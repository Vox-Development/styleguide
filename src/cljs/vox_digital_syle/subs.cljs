(ns vox-digital-syle.subs
  (:require-macros [reagent.ratom :refer [reaction]])
  (:require [re-frame.core :as re-frame]))

(re-frame/reg-sub
 :name
 (fn [db]
   (:name db)))

(re-frame/reg-sub
 :logo-url
 (fn [db]
   (:logo-url db)))

(re-frame/reg-sub
 :active-panel
 (fn [db _]
   (:active-panel db)))


(re-frame/reg-sub
 :active-section
 (fn [db _]
   (:active-section db)))
