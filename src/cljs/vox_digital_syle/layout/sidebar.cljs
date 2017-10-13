(ns vox-digital-syle.layout.sidebar
  (:require [re-frame.core :as re-frame :refer [subscribe dispatch]]))

(defn sidebar []
  (let [logo-url (subscribe [:logo-url])
        active-section (subscribe [:active-section])
        sections [
                  "introduction" "colors"
                  "typography" "buttons"
                  "lists" "forms"
                  "tables" "alerts"
                  "panels" "cards"
                  "images" "grid" "icons"]]
    (fn []
      [:div {:class "huge-sidebar"}
       [:div {:class "huge-sidebar__content" :style {:background-color "transparent"}}
        [:img.logo {:src @logo-url :style {:margin "100px 0 20px 0"}}]
        [:nav {:class "huge-sidebar__nav row clearfix"}
         [:ul {:class "huge-list--unstyled"}

          (doall
           (for [label sections]
             ^{:key label}
             [:li.huge-sidebar__nav__item
              [:a {:href (str \# label)
                   :class (str "huge-sidebar__nav__item__link huge-anchor " (when (= @active-section label) "active"))
                   :on-click #(dispatch [:set-active-section label])}
               label]]))
          ]]]])))
