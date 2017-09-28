(ns vox-digital-syle.components.tables
  (:require [re-frame.core :as re-frame]
            [reagent.core :as r]))

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
   [:pre {:class "language-markup"}
    [:code {:class " language-markup" :data-language "markup"}
     [:span {:class "token tag"}
      [:span {:class "token tag"}
       [:span {:class "token punctuation"} "<"]"table"]
      [:span {:class "token attr-name"} "class"]
      [:span {:class "token attr-value"}
       [:span {:class "token punctuation"} "="]
       [:span {:class "token punctuation"} "'"]
       [:span {:class "token punctuation"} "'"]]
      [:span {:class "token punctuation"} ">"]]
     [:span {:class "token tag"}
      [:span {:class "token tag"}
       [:span {:class "token punctuation"} "<"]"thead"]
      [:span {:class "token punctuation"} ">"]]
     [:span {:class "token tag"}
      [:span {:class "token tag"}
       [:span {:class "token punctuation"} "<"]"tr"]
      [:span {:class "token punctuation"} ">"]]
     [:span {:class "token tag"}
      [:span {:class "token tag"}
       [:span {:class "token punctuation"} "<"]"th"]
      [:span {:class "token punctuation"} ">"]]"Offices" 
     [:span {:class "token tag"}
      [:span {:class "token tag"}
       [:span {:class "token punctuation"} "</"]"th"]
      [:span {:class "token punctuation"} ">"]]
     [:span {:class "token tag"}
      [:span {:class "token tag"}
       [:span {:class "token punctuation"} "<"]"th"]
      [:span {:class "token punctuation"} ">"]]"Vox Job Openings in Technology" 
     [:span {:class "token tag"}
      [:span {:class "token tag"}
       [:span {:class "token punctuation"} "</"]"th"]
      [:span {:class "token punctuation"} ">"]]
     [:span {:class "token tag"}
      [:span {:class "token tag"}
       [:span {:class "token punctuation"} "</"]"tr"]
      [:span {:class "token punctuation"} ">"]]
     [:span {:class "token tag"}
      [:span {:class "token tag"}
       [:span {:class "token punctuation"} "</"]"thead"]
      [:span {:class "token punctuation"} ">"]]
     [:span {:class "token tag"}
      [:span {:class "token tag"}
       [:span {:class "token punctuation"} "<"]"tbody"]
      [:span {:class "token punctuation"} ">"]]
     [:span {:class "token tag"}
      [:span {:class "token tag"}
       [:span {:class "token punctuation"} "<"]"tr"]
      [:span {:class "token punctuation"} ">"]]
     [:span {:class "token tag"}
      [:span {:class "token tag"}
       [:span {:class "token punctuation"} "<"]"td"]
      [:span {:class "token punctuation"} ">"]]"Capetown" 
     [:span {:class "token tag"}
      [:span {:class "token tag"}
       [:span {:class "token punctuation"} "</"]"td"]
      [:span {:class "token punctuation"} ">"]]
     [:span {:class "token tag"}
      [:span {:class "token tag"}
       [:span {:class "token punctuation"} "<"]"td"]
      [:span {:class "token punctuation"} ">"]]"6" 
     [:span {:class "token tag"}
      [:span {:class "token tag"}
       [:span {:class "token punctuation"} "</"]"td"]
      [:span {:class "token punctuation"} ">"]]
     [:span {:class "token tag"}
      [:span {:class "token tag"}
       [:span {:class "token punctuation"} "</"]"tr"]
      [:span {:class "token punctuation"} ">"]]
     [:span {:class "token tag"}
      [:span {:class "token tag"}
       [:span {:class "token punctuation"} "<"]"tr"]
      [:span {:class "token punctuation"} ">"]]
     [:span {:class "token tag"}
      [:span {:class "token tag"}
       [:span {:class "token punctuation"} "<"]"td"]
      [:span {:class "token punctuation"} ">"]]"Gauteng" 
     [:span {:class "token tag"}
      [:span {:class "token tag"}
       [:span {:class "token punctuation"} "</"]"td"]
      [:span {:class "token punctuation"} ">"]]
     [:span {:class "token tag"}
      [:span {:class "token tag"}
       [:span {:class "token punctuation"} "<"]"td"]
      [:span {:class "token punctuation"} ">"]]"12" 
     [:span {:class "token tag"}
      [:span {:class "token tag"}
       [:span {:class "token punctuation"} "</"]"td"]
      [:span {:class "token punctuation"} ">"]]
     [:span {:class "token tag"}
      [:span {:class "token tag"}
       [:span {:class "token punctuation"} "</"]"tr"]
      [:span {:class "token punctuation"} ">"]]
     [:span {:class "token tag"}
      [:span {:class "token tag"}
       [:span {:class "token punctuation"} "<"]"tr"]
      [:span {:class "token punctuation"} ">"]]
     [:span {:class "token tag"}
      [:span {:class "token tag"}
       [:span {:class "token punctuation"} "<"]"td"]
      [:span {:class "token punctuation"} ">"]]"Pretoria" 
     [:span {:class "token tag"}
      [:span {:class "token tag"}
       [:span {:class "token punctuation"} "</"]"td"]
      [:span {:class "token punctuation"} ">"]]
     [:span {:class "token tag"}
      [:span {:class "token tag"}
       [:span {:class "token punctuation"} "<"]"td"]
      [:span {:class "token punctuation"} ">"]]"1" 
     [:span {:class "token tag"}
      [:span {:class "token tag"}
       [:span {:class "token punctuation"} "</"]"td"]
      [:span {:class "token punctuation"} ">"]]
     [:span {:class "token tag"}
      [:span {:class "token tag"}
       [:span {:class "token punctuation"} "</"]"tr"]
      [:span {:class "token punctuation"} ">"]]
     [:span {:class "token tag"}
      [:span {:class "token tag"}
       [:span {:class "token punctuation"} "<"]"tr"]
      [:span {:class "token punctuation"} ">"]]
     [:span {:class "token tag"}
      [:span {:class "token tag"}
       [:span {:class "token punctuation"} "<"]"td"]
      [:span {:class "token punctuation"} ">"]]"Free State" 
     [:span {:class "token tag"}
      [:span {:class "token tag"}
       [:span {:class "token punctuation"} "</"]"td"]
      [:span {:class "token punctuation"} ">"]]
     [:span {:class "token tag"}
      [:span {:class "token tag"}
       [:span {:class "token punctuation"} "<"]"td"]
      [:span {:class "token punctuation"} ">"]]"3" 
     [:span {:class "token tag"}
      [:span {:class "token tag"}
       [:span {:class "token punctuation"} "</"]"td"]
      [:span {:class "token punctuation"} ">"]]
     [:span {:class "token tag"}
      [:span {:class "token tag"}
       [:span {:class "token punctuation"} "</"]"tr"]
      [:span {:class "token punctuation"} ">"]]
     [:span {:class "token tag"}
      [:span {:class "token tag"}
       [:span {:class "token punctuation"} "<"]"tr"]
      [:span {:class "token punctuation"} ">"]]
     [:span {:class "token tag"}
      [:span {:class "token tag"}
       [:span {:class "token punctuation"} "<"]"td"]
      [:span {:class "token punctuation"} ">"]]"Limpopo" 
     [:span {:class "token tag"}
      [:span {:class "token tag"}
       [:span {:class "token punctuation"} "</"]"td"]
      [:span {:class "token punctuation"} ">"]]
     [:span {:class "token tag"}
      [:span {:class "token tag"}
       [:span {:class "token punctuation"} "<"]"td"]
      [:span {:class "token punctuation"} ">"]]"3" 
     [:span {:class "token tag"}
      [:span {:class "token tag"}
       [:span {:class "token punctuation"} "</"]"td"]
      [:span {:class "token punctuation"} ">"]]
     [:span {:class "token tag"}
      [:span {:class "token tag"}
       [:span {:class "token punctuation"} "</"]"tr"]
      [:span {:class "token punctuation"} ">"]]
     [:span {:class "token tag"}
      [:span {:class "token tag"}
       [:span {:class "token punctuation"} "<"]"tr"]
      [:span {:class "token punctuation"} ">"]]
     [:span {:class "token tag"}
      [:span {:class "token tag"}
       [:span {:class "token punctuation"} "<"]"td"]
      [:span {:class "token punctuation"} ">"]]"North West" 
     [:span {:class "token tag"}
      [:span {:class "token tag"}
       [:span {:class "token punctuation"} "</"]"td"]
      [:span {:class "token punctuation"} ">"]]
     [:span {:class "token tag"}
      [:span {:class "token tag"}
       [:span {:class "token punctuation"} "<"]"td"]
      [:span {:class "token punctuation"} ">"]]"2" 
     [:span {:class "token tag"}
      [:span {:class "token tag"}
       [:span {:class "token punctuation"} "</"]"td"]
      [:span {:class "token punctuation"} ">"]]
     [:span {:class "token tag"}
      [:span {:class "token tag"}
       [:span {:class "token punctuation"} "</"]"tr"]
      [:span {:class "token punctuation"} ">"]]
     [:span {:class "token tag"}
      [:span {:class "token tag"}
       [:span {:class "token punctuation"} "<"]"tr"]
      [:span {:class "token punctuation"} ">"]]
     [:span {:class "token tag"}
      [:span {:class "token tag"}
       [:span {:class "token punctuation"} "<"]"td"]
      [:span {:class "token punctuation"} ">"]]"Northern Cape" 
     [:span {:class "token tag"}
      [:span {:class "token tag"}
       [:span {:class "token punctuation"} "</"]"td"]
      [:span {:class "token punctuation"} ">"]]
     [:span {:class "token tag"}
      [:span {:class "token tag"}
       [:span {:class "token punctuation"} "<"]"td"]
      [:span {:class "token punctuation"} ">"]]"2" 
     [:span {:class "token tag"}
      [:span {:class "token tag"}
       [:span {:class "token punctuation"} "</"]"td"]
      [:span {:class "token punctuation"} ">"]]
     [:span {:class "token tag"}
      [:span {:class "token tag"}
       [:span {:class "token punctuation"} "</"]"tr"]
      [:span {:class "token punctuation"} ">"]]
     [:span {:class "token tag"}
      [:span {:class "token tag"}
       [:span {:class "token punctuation"} "</"]"tbody"]
      [:span {:class "token punctuation"} ">"]]
     [:span {:class "token tag"}
      [:span {:class "token tag"}
       [:span {:class "token punctuation"} "<"]"tbody"]
      [:span {:class "token punctuation"} ">"]]
     [:span {:class "token tag"}
      [:span {:class "token tag"}
       [:span {:class "token punctuation"} "<"]"tr"]
      [:span {:class "token punctuation"} ">"]]
     [:span {:class "token tag"}
      [:span {:class "token tag"}
       [:span {:class "token punctuation"} "<"]"td"]
      [:span {:class "token punctuation"} ">"]]
     [:span {:class "token tag"}
      [:span {:class "token tag"}
       [:span {:class "token punctuation"} "</"]"td"]
      [:span {:class "token punctuation"} ">"]]
     [:span {:class "token tag"}
      [:span {:class "token tag"}
       [:span {:class "token punctuation"} "</"]"tr"]
      [:span {:class "token punctuation"} ">"]]
     [:span {:class "token tag"}
      [:span {:class "token tag"}
       [:span {:class "token punctuation"} "</"]"tbody"]
      [:span {:class "token punctuation"} ">"]]
     [:span {:class "token tag"}
      [:span {:class "token tag"}
       [:span {:class "token punctuation"} "</"]"table"]
      [:span {:class "token punctuation"} ">"]]]])])

