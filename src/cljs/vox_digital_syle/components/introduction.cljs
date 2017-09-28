(ns vox-digital-syle.components.introduction
  (:require [re-frame.core :as re-frame]))

(defn introduction []
  [:section {:id "introduction", :class "huge-module anchor clearfix"}
	 [:h2 {:class "huge-module__title"} "Introduction"]
	 [:div {:class "feedback"}
	  [:p {:class "huge-module__paragraph"} "Hello! Welcome to the Vox Styleguide."]
	  [:p {:class "huge-module__paragraph"} "Please feel free to collaborate with the project " 
	   [:a {:href "http://github.com/Vox-Development"} "on Github"]". You can read the documentation " 
	   [:a {:href "http://github.com/Vox-development/styleguide/blob/master/README.md"} "here"]"."]]]
  )
