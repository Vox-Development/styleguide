(ns vox-digital-syle.components.grid
	(:require [reagent.core :as r]))

(def expanded (r/atom nil))

(defn grid []
	
	[:section {:id "grid" :class "huge-module anchor clearfix"}
		[:a {:href "#" :class "huge-module__toggle-code" :on-click #(swap! expanded not)}]
		
		[:h2 {:class "huge-module__title"} "Grid System"]
		
		[:div {:class "row show-grid"}
		[:div {:class "col-md-1"} ".col-md-1"]
		[:div {:class "col-md-1"} ".col-md-1"]
		[:div {:class "col-md-1"} ".col-md-1"]
		[:div {:class "col-md-1"} ".col-md-1"]
		[:div {:class "col-md-1"} ".col-md-1"]
		[:div {:class "col-md-1"} ".col-md-1"]
		[:div {:class "col-md-1"} ".col-md-1"]
		[:div {:class "col-md-1"} ".col-md-1"]
		[:div {:class "col-md-1"} ".col-md-1"]
		[:div {:class "col-md-1"} ".col-md-1"]
		[:div {:class "col-md-1"} ".col-md-1"]
		[:div {:class "col-md-1"} ".col-md-1"]" "]
		
		[:div {:class "row show-grid"}
		[:div {:class "col-md-8"} ".col-md-8"]
		[:div {:class "col-md-4"} ".col-md-4"]" "]
		
		[:div {:class "row show-grid"}
		[:div {:class "col-md-4"} ".col-md-4"]
		[:div {:class "col-md-4"} ".col-md-4"]
		[:div {:class "col-md-4"} ".col-md-4"]" "]
		
		[:div {:class "row show-grid"}
		[:div {:class "col-md-6"} ".col-md-6"]
		[:div {:class "col-md-6"} ".col-md-6"]" "]
		
		(if @expanded 
    		[:h1 "Pre code here"])])

