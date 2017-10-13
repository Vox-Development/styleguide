(ns vox-digital-syle.components.forms
  (:require [reagent.core :as r]
            [vox-digital-syle.layout.markup :as markup]))

(def expanded (r/atom nil))

(defn forms []
    [:section {:id "forms" :class "huge-module anchor clearfix"}
     [:h2 {:class "huge-module__title"} "Forms"]
     [:a {:href "#" :class "huge-module__toggle-code" :on-click #(swap! expanded not)}]

     [:form {:class "form"} 
         [:div {:class "form-group"}
          [:label {:for "exampleInputEmail1"} "Email address"]
          [:input {:type "email" :class "form-control round-btn" :id "exampleInputEmail1" :placeholder "Email"}]" "]
         [:div {:class "form-group"}
          [:label {:for "exampleInputPassword1"} "Password"]
          [:input {:type "password" :class "form-control round-btn" :id "exampleInputPassword1" :placeholder "Password"}]" "]
         [:div {:class "form-group"}
          [:label {:for "exampleInputFile"} "File input"]
          [:input {:type "file" :id "exampleInputFile"}]
          [:p {:class "help-block"} "Example block-level help text here."]" "]
         [:div {:class "checkbox"}
          [:label " " 
           [:input {:type "checkbox"}]" Check me out "]" "]
         [:button {:type "submit" :class "btn btn-sugn-up"} "Submit"]" "]
     
    (if @expanded
      [markup/form-markup])])

