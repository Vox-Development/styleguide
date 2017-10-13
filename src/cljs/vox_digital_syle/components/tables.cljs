(ns vox-digital-syle.components.tables
  (:require [reagent.core :as r]
            [vox-digital-syle.layout.markup :as markup]))

(def expanded (r/atom nil))

(defn tables []
  [:section {:id "tables" :class "huge-module anchor clearfix table-responsive table-colorful"}
   [:h2 {:class "huge-module__title"} "Tables"]
   [:tfooter ]
   [:a {:href "#" :class "huge-module__toggle-code" :on-click #(swap! expanded not)}]
     [:table {:class "table table-hover tbl-bordered"}
      [:thead.heading-colors
       [:tr
        [:th "Offices"]
        [:th "Vox Job Openings in Technology"]]]
      [:tbody
       [:tr
        [:td "Capetown"]
        [:td "6"]]
       [:tr
        [:td "Gauteng"]
        [:td "12"]]
       [:tr
        [:td "Pretoria"]
        [:td "1"]]
       [:tr
        [:td "Free State"]
        [:td "3"]]
       [:tr
        [:td "Limpopo"]
        [:td "3"]]
       [:tr
        [:td "North West"]
        [:td "2"]]
       [:tr
        [:td "Northern Cape"]
        [:td "2"]]]
      [:tbody
       [:tr]]]
     
  (if @expanded
   [:p [:strong "Must be wrapped inside a parent container that has class .table-responsive  and .table-colorful if need color eg:"]
      [:pre {:class "language-markup"}
       [:code {:class " language-markup" :data-language "markup"} "<div class='table-responsive table-colorful'>...</div>"]]])
  
  (if @expanded
   [markup/table-markup])])

