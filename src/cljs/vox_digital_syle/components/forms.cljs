(ns vox-digital-syle.components.forms
  (:require [reagent.core :as r]))

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
 [:pre {:class "language-markup"}
  [:code {:class "language-markup" :data-language "markup"}
   [:span {:class "token tag"}
    [:span {:class "token tag"}
     [:span {:class "token punctuation"} "<"]"form "]
    [:span {:class "token attr-name"} " class"]
    [:span {:class "token attr-value"}
     [:span {:class "token punctuation"} "="]
     [:span {:class "token punctuation"} "'"]
     [:span {:class "token punctuation"} "'"]]
    [:span {:class "token punctuation"} ">"]]
   [:span {:class "token tag"}
    [:span {:class "token tag"}
     [:span {:class "token punctuation"} "<"]"fieldset"]
    [:span {:class "token punctuation"} ">"]]
   [:span {:class "token tag"}
    [:span {:class "token tag"}
     [:span {:class "token punctuation"} "<"]"div"]
    [:span {:class "token attr-name"} " class"]
    [:span {:class "token attr-value"}
     [:span {:class "token punctuation"} "="]
     [:span {:class "token punctuation"} "'"]"row" 
     [:span {:class "token punctuation"} "'"]]
    [:span {:class "token punctuation"} ">"]]
   [:span {:class "token tag"}
    [:span {:class "token tag"}
     [:span {:class "token punctuation"} "<"]"div"]
    [:span {:class "token attr-name"} " class"]
    [:span {:class "token attr-value"}
     [:span {:class "token punctuation"} "="]
     [:span {:class "token punctuation"} "'"]"medium-6 column" 
     [:span {:class "token punctuation"} "'"]]
    [:span {:class "token punctuation"} ">"]]
   [:span {:class "token tag"}
    [:span {:class "token tag"}
     [:span {:class "token punctuation"} "\n <"]"input"]
    [:span {:class "token attr-name"} " type"]
    [:span {:class "token attr-value"}
     [:span {:class "token punctuation"} "="]
     [:span {:class "token punctuation"} "'"]"text" 
     [:span {:class "token punctuation"} "'"]]
    [:span {:class "token attr-name"} " placeholder"]
    [:span {:class "token attr-value"}
     [:span {:class "token punctuation"} "="]
     [:span {:class "token punctuation"} "'"]"Placeholder" 
     [:span {:class "token punctuation"} "'"]]
    [:span {:class "token attr-name"} " class"]
    [:span {:class "token attr-value"}
     [:span {:class "token punctuation"} "="]
     [:span {:class "token punctuation"} "'"]"g-wide--full" 
     [:span {:class "token punctuation"} "'"]]
    [:span {:class "token punctuation"} ">"]]
   [:span {:class "token tag"}
    [:span {:class "token tag"}
     [:span {:class "token punctuation"} "</"]"div"]
    [:span {:class "token punctuation"} ">"]]
   [:span {:class "token tag"}
    [:span {:class "token tag"}
     [:span {:class "token punctuation"} "<"]"div"]
    [:span {:class "token attr-name"} " class"]
    [:span {:class "token attr-value"}
     [:span {:class "token punctuation"} "="]
     [:span {:class "token punctuation"} "'"]"medium-6 column" 
     [:span {:class "token punctuation"} "'"]]
    [:span {:class "token punctuation"} ">"]]
   [:span {:class "token tag"}
    [:span {:class "token tag"}
     [:span {:class "token punctuation"} "<"]"input"]
    [:span {:class "token attr-name"} " type"]
    [:span {:class "token attr-value"}
     [:span {:class "token punctuation"} "="]
     [:span {:class "token punctuation"} "'"]"text" 
     [:span {:class "token punctuation"} "'"]]
    [:span {:class "token attr-name"} " value"]
    [:span {:class "token attr-value"}
     [:span {:class "token punctuation"} "="]
     [:span {:class "token punctuation"} "'"]"Disabled" 
     [:span {:class "token punctuation"} "'"]]
    [:span {:class "token attr-name"} " disabled"]
    [:span {:class "token attr-name"} " class"]
    [:span {:class "token attr-value"}
     [:span {:class "token punctuation"} "="]
     [:span {:class "token punctuation"} "'"]"g-wide--full" 
     [:span {:class "token punctuation"} "'"]]
    [:span {:class "token punctuation"} ">"]]
   [:span {:class "token tag"}
    [:span {:class "token tag"}
     [:span {:class "token punctuation"} "</"]"div"]
    [:span {:class "token punctuation"} ">"]]
   [:span {:class "token tag"}
    [:span {:class "token tag"}
     [:span {:class "token punctuation"} "</"]"div"]
    [:span {:class "token punctuation"} ">"]]
   [:span {:class "token tag"}
    [:span {:class "token tag"}
     [:span {:class "token punctuation"} "<"]"div"]
    [:span {:class "token attr-name"} " class"]
    [:span {:class "token attr-value"}
     [:span {:class "token punctuation"} "="]
     [:span {:class "token punctuation"} "'"]"row" 
     [:span {:class "token punctuation"} "'"]]
    [:span {:class "token punctuation"} ">"]]
   [:span {:class "token tag"}
    [:span {:class "token tag"}
     [:span {:class "token punctuation"} "<"]"div"]
    [:span {:class "token attr-name"} " class"]
    [:span {:class "token attr-value"}
     [:span {:class "token punctuation"} "="]
     [:span {:class "token punctuation"} "'"]"medium-6 column" 
     [:span {:class "token punctuation"} "'"]]
    [:span {:class "token punctuation"} ">"]]
   [:span {:class "token tag"}
    [:span {:class "token tag"}
     [:span {:class "token punctuation"} "<"]"label"]
    [:span {:class "token punctuation"} ">"]]"Email input" 
   [:span {:class "token tag"}
    [:span {:class "token tag"}
     [:span {:class "token punctuation"} "</"]"label"]
    [:span {:class "token punctuation"} ">"]]
   [:span {:class "token tag"}
    [:span {:class "token tag"}
     [:span {:class "token punctuation"} "<"]"input"]
    [:span {:class "token attr-name"} " type"]
    [:span {:class "token attr-value"}
     [:span {:class "token punctuation"} "="]
     [:span {:class "token punctuation"} "'"]"email" 
     [:span {:class "token punctuation"} "'"]]
    [:span {:class "token punctuation"} ">"]]
   [:span {:class "token tag"}
    [:span {:class "token tag"}
     [:span {:class "token punctuation"} "</"]"div"]
    [:span {:class "token punctuation"} ">"]]
   [:span {:class "token tag"}
    [:span {:class "token tag"}
     [:span {:class "token punctuation"} "<"]"div"]
    [:span {:class "token attr-name"} " class"]
    [:span {:class "token attr-value"}
     [:span {:class "token punctuation"} "="]
     [:span {:class "token punctuation"} "'"]"medium-6 column" 
     [:span {:class "token punctuation"} "'"]]
    [:span {:class "token punctuation"} ">"]]
   [:span {:class "token tag"}
    [:span {:class "token tag"}
     [:span {:class "token punctuation"} "<"]"label"]
    [:span {:class "token punctuation"} ">"]]"Password input" 
   [:span {:class "token tag"}
    [:span {:class "token tag"}
     [:span {:class "token punctuation"} "</"]"label"]
    [:span {:class "token punctuation"} ">"]]
   [:span {:class "token tag"}
    [:span {:class "token tag"}
     [:span {:class "token punctuation"} "<"]"input"]
    [:span {:class "token attr-name"} " type"]
    [:span {:class "token attr-value"}
     [:span {:class "token punctuation"} "="]
     [:span {:class "token punctuation"} "'"]"password" 
     [:span {:class "token punctuation"} "'"]]
    [:span {:class "token attr-name"} " value"]
    [:span {:class "token attr-value"}
     [:span {:class "token punctuation"} "="]
     [:span {:class "token punctuation"} "'"]"password" 
     [:span {:class "token punctuation"} "'"]]
    [:span {:class "token punctuation"} ">"]]
   [:span {:class "token tag"}
    [:span {:class "token tag"}
     [:span {:class "token punctuation"} "</"]"div"]
    [:span {:class "token punctuation"} ">"]]
   [:span {:class "token tag"}
    [:span {:class "token tag"}
     [:span {:class "token punctuation"} "</"]"div"]
    [:span {:class "token punctuation"} ">"]]
   [:span {:class "token tag"}
    [:span {:class "token tag"}
     [:span {:class "token punctuation"} "<"]"div"]
    [:span {:class "token attr-name"} " class"]
    [:span {:class "token attr-value"}
     [:span {:class "token punctuation"} "="]
     [:span {:class "token punctuation"} "'"]"row" 
     [:span {:class "token punctuation"} "'"]]
    [:span {:class "token punctuation"} ">"]]
   [:span {:class "token tag"}
    [:span {:class "token tag"}
     [:span {:class "token punctuation"} "<"]"div"]
    [:span {:class "token attr-name"} " class"]
    [:span {:class "token attr-value"}
     [:span {:class "token punctuation"} "="]
     [:span {:class "token punctuation"} "'"]"medium-6 column" 
     [:span {:class "token punctuation"} "'"]]
    [:span {:class "token punctuation"} ">"]]
   [:span {:class "token tag"}
    [:span {:class "token tag"}
     [:span {:class "token punctuation"} "<"]"label"]
    [:span {:class "token punctuation"} ">"]]"Textarea" 
   [:span {:class "token tag"}
    [:span {:class "token tag"}
     [:span {:class "token punctuation"} "</"]"label"]
    [:span {:class "token punctuation"} ">"]]
   [:span {:class "token tag"}
    [:span {:class "token tag"}
     [:span {:class "token punctuation"} "<"]"textarea"]
    [:span {:class "token attr-name"} " cols"]
    [:span {:class "token attr-value"}
     [:span {:class "token punctuation"} "="]
     [:span {:class "token punctuation"} "'"]"30" 
     [:span {:class "token punctuation"} "'"]]
    [:span {:class "token attr-name"} " rows"]
    [:span {:class "token attr-value"}
     [:span {:class "token punctuation"} "="]
     [:span {:class "token punctuation"} "'"]"5" 
     [:span {:class "token punctuation"} "'"]]
    [:span {:class "token punctuation"} ">"]]"Textarea text" 
   [:span {:class "token tag"}
    [:span {:class "token tag"}
     [:span {:class "token punctuation"} "</"]"textarea"]
    [:span {:class "token punctuation"} ">"]]
   [:span {:class "token tag"}
    [:span {:class "token tag"}
     [:span {:class "token punctuation"} "</"]"div"]
    [:span {:class "token punctuation"} ">"]]
   [:span {:class "token tag"}
    [:span {:class "token tag"}
     [:span {:class "token punctuation"} "<"]"div"]
    [:span {:class "token attr-name"} " class"]
    [:span {:class "token attr-value"}
     [:span {:class "token punctuation"} "="]
     [:span {:class "token punctuation"} "'"]"medium-6 column" 
     [:span {:class "token punctuation"} "'"]]
    [:span {:class "token punctuation"} ">"]]
   [:span {:class "token tag"}
    [:span {:class "token tag"}
     [:span {:class "token punctuation"} "<"]"label"]
    [:span {:class "token punctuation"} ">"]]"Select field" 
   [:span {:class "token tag"}
    [:span {:class "token tag"}
     [:span {:class "token punctuation"} "</"]"label"]
    [:span {:class "token punctuation"} ">"]]
   [:span {:class "token tag"}
    [:span {:class "token tag"}
     [:span {:class "token punctuation"} "<"]"select"]
    [:span {:class "token punctuation"} ">"]]
   [:span {:class "token tag"}
    [:span {:class "token tag"}
     [:span {:class "token punctuation"} "<"]"option"]
    [:span {:class "token punctuation"} ">"]]"Option 01" 
   [:span {:class "token tag"}
    [:span {:class "token tag"}
     [:span {:class "token punctuation"} "</"]"option"]
    [:span {:class "token punctuation"} ">"]]
   [:span {:class "token tag"}
    [:span {:class "token tag"}
     [:span {:class "token punctuation"} "<"]"option"]
    [:span {:class "token punctuation"} ">"]]"Option 02" 
   [:span {:class "token tag"}
    [:span {:class "token tag"}
     [:span {:class "token punctuation"} "</"]"option"]
    [:span {:class "token punctuation"} ">"]]
   [:span {:class "token tag"}
    [:span {:class "token tag"}
     [:span {:class "token punctuation"} "</"]"select"]
    [:span {:class "token punctuation"} ">"]]
   [:span {:class "token tag"}
    [:span {:class "token tag"}
     [:span {:class "token punctuation"} "</"]"div"]
    [:span {:class "token punctuation"} ">"]]
   [:span {:class "token tag"}
    [:span {:class "token tag"}
     [:span {:class "token punctuation"} "<"]"div"]
    [:span {:class "token attr-name"} " class"]
    [:span {:class "token attr-value"}
     [:span {:class "token punctuation"} "="]
     [:span {:class "token punctuation"} "'"]"medium-6 column" 
     [:span {:class "token punctuation"} "'"]]
    [:span {:class "token punctuation"} ">"]]
   [:span {:class "token tag"}
    [:span {:class "token tag"}
     [:span {:class "token punctuation"} "<"]"label"]
    [:span {:class "token punctuation"} ">"]]"File input" 
   [:span {:class "token tag"}
    [:span {:class "token tag"}
     [:span {:class "token punctuation"} "</"]"label"]
    [:span {:class "token punctuation"} ">"]]
   [:span {:class "token tag"}
    [:span {:class "token tag"}
     [:span {:class "token punctuation"} "<"]"input"]
    [:span {:class "token attr-name"} " type"]
    [:span {:class "token attr-value"}
     [:span {:class "token punctuation"} "="]
     [:span {:class "token punctuation"} "'"]"file" 
     [:span {:class "token punctuation"} "'"]]
    [:span {:class "token punctuation"} ">"]]
   [:span {:class "token tag"}
    [:span {:class "token tag"}
     [:span {:class "token punctuation"} "</"]"div"]
    [:span {:class "token punctuation"} ">"]]
   [:span {:class "token tag"}
    [:span {:class "token tag"}
     [:span {:class "token punctuation"} "</"]"div"]
    [:span {:class "token punctuation"} ">"]]
   [:span {:class "token tag"}
    [:span {:class "token tag"}
     [:span {:class "token punctuation"} "<"]"div"]
    [:span {:class "token attr-name"} " class"]
    [:span {:class "token attr-value"}
     [:span {:class "token punctuation"} "="]
     [:span {:class "token punctuation"} "'"]"row" 
     [:span {:class "token punctuation"} "'"]]
    [:span {:class "token punctuation"} ">"]]
   [:span {:class "token tag"}
    [:span {:class "token tag"}
     [:span {:class "token punctuation"} "<"]"div"]
    [:span {:class "token attr-name"} " class"]
    [:span {:class "token attr-value"}
     [:span {:class "token punctuation"} "="]
     [:span {:class "token punctuation"} "'"]"medium-6 column" 
     [:span {:class "token punctuation"} "'"]]
    [:span {:class "token punctuation"} ">"]]
   [:span {:class "token tag"}
    [:span {:class "token tag"}
     [:span {:class "token punctuation"} "<"]"label"]
    [:span {:class "token punctuation"} ">"]]
   [:span {:class "token tag"}
    [:span {:class "token tag"}
     [:span {:class "token punctuation"} "<"]"input"]
    [:span {:class "token attr-name"} " type"]
    [:span {:class "token attr-value"}
     [:span {:class "token punctuation"} "="]
     [:span {:class "token punctuation"} "'"]"radio" 
     [:span {:class "token punctuation"} "'"]]
    [:span {:class "token attr-name"} " name"]
    [:span {:class "token attr-value"}
     [:span {:class "token punctuation"} "="]
     [:span {:class "token punctuation"} "'"]"rad" 
     [:span {:class "token punctuation"} "'"]]
    [:span {:class "token punctuation"} ">"]]"Radio\n input" 
   [:span {:class "token tag"}
    [:span {:class "token tag"}
     [:span {:class "token punctuation"} "</"]"label"]
    [:span {:class "token punctuation"} ">"]]
   [:span {:class "token tag"}
    [:span {:class "token tag"}
     [:span {:class "token punctuation"} "<"]"label"]
    [:span {:class "token punctuation"} ">"]]
   [:span {:class "token tag"}
    [:span {:class "token tag"}
     [:span {:class "token punctuation"} "<"]"input"]
    [:span {:class "token attr-name"} " type"]
    [:span {:class "token attr-value"}
     [:span {:class "token punctuation"} "="]
     [:span {:class "token punctuation"} "'"]"checkbox" 
     [:span {:class "token punctuation"} "'"]]
    [:span {:class "token punctuation"} ">"]]"Checkbox input" 
   [:span {:class "token tag"}
    [:span {:class "token tag"}
     [:span {:class "token punctuation"} "</"]"label"]
    [:span {:class "token punctuation"} ">"]]
   [:span {:class "token tag"}
    [:span {:class "token tag"}
     [:span {:class "token punctuation"} "</"]"div"]
    [:span {:class "token punctuation"} ">"]]
   [:span {:class "token tag"}
    [:span {:class "token tag"}
     [:span {:class "token punctuation"} "<"]"div"]
    [:span {:class "token attr-name"} " class"]
    [:span {:class "token attr-value"}
     [:span {:class "token punctuation"} "="]
     [:span {:class "token punctuation"} "'"]"medium-6 column" 
     [:span {:class "token punctuation"} "'"]]
    [:span {:class "token punctuation"} ">"]]
   [:span {:class "token tag"}
    [:span {:class "token tag"}
     [:span {:class "token punctuation"} "<"]"label"]
    [:span {:class "token punctuation"} ">"]]"Number input" 
   [:span {:class "token tag"}
    [:span {:class "token tag"}
     [:span {:class "token punctuation"} "</"]"label"]
    [:span {:class "token punctuation"} ">"]]
   [:span {:class "token tag"}
    [:span {:class "token tag"}
     [:span {:class "token punctuation"} "<"]"input"]
    [:span {:class "token attr-name"} " type"]
    [:span {:class "token attr-value"}
     [:span {:class "token punctuation"} "="]
     [:span {:class "token punctuation"} "'"]"number" 
     [:span {:class "token punctuation"} "'"]]
    [:span {:class "token attr-name"} " value"]
    [:span {:class "token attr-value"}
     [:span {:class "token punctuation"} "="]
     [:span {:class "token punctuation"} "'"]"5" 
     [:span {:class "token punctuation"} "'"]]
    [:span {:class "token attr-name"} " min"]
    [:span {:class "token attr-value"}
     [:span {:class "token punctuation"} "="]
     [:span {:class "token punctuation"} "'"]"0" 
     [:span {:class "token punctuation"} "'"]]
    [:span {:class "token attr-name"} " max"]"='" 
    [:span {:class "token attr-name"} " 10"]"'" 
    [:span {:class "token punctuation"} "> \n"]]
   [:span {:class "token tag"}
    [:span {:class "token tag"}
     [:span {:class "token punctuation"} "</"]"div"]
    [:span {:class "token punctuation"} ">"]]
   [:span {:class "token tag"}
    [:span {:class "token tag"}
     [:span {:class "token punctuation"} "</"]"div"]
    [:span {:class "token punctuation"} ">"]]
   [:span {:class "token tag"}
    [:span {:class "token tag"}
     [:span {:class "token punctuation"} "<"]"div"]
    [:span {:class "token attr-name"} " class"]
    [:span {:class "token attr-value"}
     [:span {:class "token punctuation"} "="]
     [:span {:class "token punctuation"} "'"]"row" 
     [:span {:class "token punctuation"} "'"]]
    [:span {:class "token punctuation"} ">"]]
   [:span {:class "token tag"}
    [:span {:class "token tag"}
     [:span {:class "token punctuation"} "<"]"div"]
    [:span {:class "token attr-name"} " class"]
    [:span {:class "token attr-value"}
     [:span {:class "token punctuation"} "="]
     [:span {:class "token punctuation"} "'"]"medium-6 column" 
     [:span {:class "token punctuation"} "'"]]
    [:span {:class "token punctuation"} ">"]]
   [:span {:class "token tag"}
    [:span {:class "token tag"}
     [:span {:class "token punctuation"} "<"]"label"]
    [:span {:class "token punctuation"} ">"]]"Date input" 
   [:span {:class "token tag"}
    [:span {:class "token tag"}
     [:span {:class "token punctuation"} "</"]"label"]
    [:span {:class "token punctuation"} ">"]]
   [:span {:class "token tag"}
    [:span {:class "token tag"}
     [:span {:class "token punctuation"} "<"]"input"]
    [:span {:class "token attr-name"} " type"]
    [:span {:class "token attr-value"}
     [:span {:class "token punctuation"} "="]
     [:span {:class "token punctuation"} "'"]"date" 
     [:span {:class "token punctuation"} "'"]]
    [:span {:class "token punctuation"} ">"]]
   [:span {:class "token tag"}
    [:span {:class "token tag"}
     [:span {:class "token punctuation"} "</"]"div"]
    [:span {:class "token punctuation"} ">"]]
   [:span {:class "token tag"}
    [:span {:class "token tag"}
     [:span {:class "token punctuation"} "<"]"div"]
    [:span {:class "token attr-name"} " class"]
    [:span {:class "token attr-value"}
     [:span {:class "token punctuation"} "="]
     [:span {:class "token punctuation"} "'"]"medium-6 column" 
     [:span {:class "token punctuation"} "'"]]
    [:span {:class "token punctuation"} ">"]]
   [:span {:class "token tag"}
    [:span {:class "token tag"}
     [:span {:class "token punctuation"} "<"]"label"]
    [:span {:class "token punctuation"} ">"]]"Time input" 
   [:span {:class "token tag"}
    [:span {:class "token tag"}
     [:span {:class "token punctuation"} "</"]"label"]
    [:span {:class "token punctuation"} ">"]]
   [:span {:class "token tag"}
    [:span {:class "token tag"}
     [:span {:class "token punctuation"} "<"]"input"]
    [:span {:class "token attr-name"} " type"]
    [:span {:class "token attr-value"}
     [:span {:class "token punctuation"} "="]
     [:span {:class "token punctuation"} "'"]"time" 
     [:span {:class "token punctuation"} "'"]]
    [:span {:class "token punctuation"} ">"]]
   [:span {:class "token tag"}
    [:span {:class "token tag"}
     [:span {:class "token punctuation"} "</"]"div"]
    [:span {:class "token punctuation"} ">"]]
   [:span {:class "token tag"}
    [:span {:class "token tag"}
     [:span {:class "token punctuation"} "</"]"div"]
    [:span {:class "token punctuation"} ">"]]
   [:span {:class "token tag"}
    [:span {:class "token tag"}
     [:span {:class "token punctuation"} "</"]"fieldset"]
    [:span {:class "token punctuation"} ">"]]
   [:span {:class "token tag"}
    [:span {:class "token tag"}
     [:span {:class "token punctuation"} "</"]"form"]
    [:span {:class "token punctuation"} ">"]]]])]
  )

