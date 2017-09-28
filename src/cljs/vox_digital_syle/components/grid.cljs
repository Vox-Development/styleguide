(ns vox-digital-syle.components.grid
  (:require [re-frame.core :as re-frame]
            [reagent.core :as r]))

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
       		[:pre 
			 [:code {:class "language-html", :data-lang "html"}
			  [:span {:class "nt"} "&lt;div"]
			  [:span {:class "na"} "class="]
			  [:span {:class "s"} "&quot;row&quot;"]
			  [:span {:class "nt"} "&gt;"]
			  [:span {:class "nt"} "&lt;div"]
			  [:span {:class "na"} "class="]
			  [:span {:class "s"} "&quot;col-md-1&quot;"]
			  [:span {:class "nt"} "&gt;"]".col-md-1" 
			  [:span {:class "nt"} "&lt;/div&gt;"]
			  [:span {:class "nt"} "&lt;div"]
			  [:span {:class "na"} "class="]
			  [:span {:class "s"} "&quot;col-md-1&quot;"]
			  [:span {:class "nt"} "&gt;"]".col-md-1" 
			  [:span {:class "nt"} "&lt;/div&gt;"]
			  [:span {:class "nt"} "&lt;div"]
			  [:span {:class "na"} "class="]
			  [:span {:class "s"} "&quot;col-md-1&quot;"]
			  [:span {:class "nt"} "&gt;"]".col-md-1" 
			  [:span {:class "nt"} "&lt;/div&gt;"]
			  [:span {:class "nt"} "&lt;div"]
			  [:span {:class "na"} "class="]
			  [:span {:class "s"} "&quot;col-md-1&quot;"]
			  [:span {:class "nt"} "&gt;"]".col-md-1" 
			  [:span {:class "nt"} "&lt;/div&gt;"]
			  [:span {:class "nt"} "&lt;div"]
			  [:span {:class "na"} "class="]
			  [:span {:class "s"} "&quot;col-md-1&quot;"]
			  [:span {:class "nt"} "&gt;"]".col-md-1" 
			  [:span {:class "nt"} "&lt;/div&gt;"]
			  [:span {:class "nt"} "&lt;div"]
			  [:span {:class "na"} "class="]
			  [:span {:class "s"} "&quot;col-md-1&quot;"]
			  [:span {:class "nt"} "&gt;"]".col-md-1" 
			  [:span {:class "nt"} "&lt;/div&gt;"]
			  [:span {:class "nt"} "&lt;div"]
			  [:span {:class "na"} "class="]
			  [:span {:class "s"} "&quot;col-md-1&quot;"]
			  [:span {:class "nt"} "&gt;"]".col-md-1" 
			  [:span {:class "nt"} "&lt;/div&gt;"]
			  [:span {:class "nt"} "&lt;div"]
			  [:span {:class "na"} "class="]
			  [:span {:class "s"} "&quot;col-md-1&quot;"]
			  [:span {:class "nt"} "&gt;"]".col-md-1" 
			  [:span {:class "nt"} "&lt;/div&gt;"]
			  [:span {:class "nt"} "&lt;div"]
			  [:span {:class "na"} "class="]
			  [:span {:class "s"} "&quot;col-md-1&quot;"]
			  [:span {:class "nt"} "&gt;"]".col-md-1" 
			  [:span {:class "nt"} "&lt;/div&gt;"]
			  [:span {:class "nt"} "&lt;div"]
			  [:span {:class "na"} "class="]
			  [:span {:class "s"} "&quot;col-md-1&quot;"]
			  [:span {:class "nt"} "&gt;"]".col-md-1" 
			  [:span {:class "nt"} "&lt;/div&gt;"]
			  [:span {:class "nt"} "&lt;div"]
			  [:span {:class "na"} "class="]
			  [:span {:class "s"} "&quot;col-md-1&quot;"]
			  [:span {:class "nt"} "&gt;"]".col-md-1" 
			  [:span {:class "nt"} "&lt;/div&gt;"]
			  [:span {:class "nt"} "&lt;div"]
			  [:span {:class "na"} "class="]
			  [:span {:class "s"} "&quot;col-md-1&quot;"]
			  [:span {:class "nt"} "&gt;"]".col-md-1" 
			  [:span {:class "nt"} "&lt;/div&gt;"]
			  [:span {:class "nt"} "&lt;/div&gt;"]
			  [:span {:class "nt"} "&lt;div"]
			  [:span {:class "na"} "class="]
			  [:span {:class "s"} "&quot;row&quot;"]
			  [:span {:class "nt"} "&gt;"]
			  [:span {:class "nt"} "&lt;div"]
			  [:span {:class "na"} "class="]
			  [:span {:class "s"} "&quot;col-md-8&quot;"]
			  [:span {:class "nt"} "&gt;"]".col-md-8" 
			  [:span {:class "nt"} "&lt;/div&gt;"]
			  [:span {:class "nt"} "&lt;div"]
			  [:span {:class "na"} "class="]
			  [:span {:class "s"} "&quot;col-md-4&quot;"]
			  [:span {:class "nt"} "&gt;"]".col-md-4" 
			  [:span {:class "nt"} "&lt;/div&gt;"]
			  [:span {:class "nt"} "&lt;/div&gt;"]
			  [:span {:class "nt"} "&lt;div"]
			  [:span {:class "na"} "class="]
			  [:span {:class "s"} "&quot;row&quot;"]
			  [:span {:class "nt"} "&gt;"]
			  [:span {:class "nt"} "&lt;div"]
			  [:span {:class "na"} "class="]
			  [:span {:class "s"} "&quot;col-md-4&quot;"]
			  [:span {:class "nt"} "&gt;"]".col-md-4" 
			  [:span {:class "nt"} "&lt;/div&gt;"]
			  [:span {:class "nt"} "&lt;div"]
			  [:span {:class "na"} "class="]
			  [:span {:class "s"} "&quot;col-md-4&quot;"]
			  [:span {:class "nt"} "&gt;"]".col-md-4" 
			  [:span {:class "nt"} "&lt;/div&gt;"]
			  [:span {:class "nt"} "&lt;div"]
			  [:span {:class "na"} "class="]
			  [:span {:class "s"} "&quot;col-md-4&quot;"]
			  [:span {:class "nt"} "&gt;"]".col-md-4" 
			  [:span {:class "nt"} "&lt;/div&gt;"]
			  [:span {:class "nt"} "&lt;/div&gt;"]
			  [:span {:class "nt"} "&lt;div"]
			  [:span {:class "na"} "class="]
			  [:span {:class "s"} "&quot;row&quot;"]
			  [:span {:class "nt"} "&gt;"]
			  [:span {:class "nt"} "&lt;div"]
			  [:span {:class "na"} "class="]
			  [:span {:class "s"} "&quot;col-md-6&quot;"]
			  [:span {:class "nt"} "&gt;"]".col-md-6" 
			  [:span {:class "nt"} "&lt;/div&gt;"]
			  [:span {:class "nt"} "&lt;div"]
			  [:span {:class "na"} "class="]
			  [:span {:class "s"} "&quot;col-md-6&quot;"]
			  [:span {:class "nt"} "&gt;"]".col-md-6" 
			  [:span {:class "nt"} "&lt;/div&gt;"]
			  [:span {:class "nt"} "&lt;/div&gt;"]]])])

