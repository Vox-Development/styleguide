(ns vox-digital-syle.components.buttons
  (:require [re-frame.core :as re-frame]
            [reagent.core :as r]))

(def expanded (r/atom nil))

(defn buttons []
  [:section {:id "buttons" :class "huge-module anchor clearfix"}
	 [:h2 {:class "huge-module__title"} "Buttons"]
	 [:ul {:class "huge-list--unstyled"}
	  [:li.spaced
	   [:a {:href "#" :class "huge-module__toggle-code" :on-click #(swap! expanded not)}]
	   [:a {:href "#" :class "btn btn-sugn-up"} ".btn-sugn-up"]
       [:a {:href "#" :class "btn btn-prev"} ".btn-prev"]
       [:a {:href "#" :class "btn btn-next"} ".btn-next"]
       [:a {:href "#" :class "btn btn-success round-btn"} ".btn-success .round-btn"]
       [:br][:br]
       [:p "Below are bootstrap defaults"]
       [:a {:href "#" :class "btn btn-success"} ".btn-success"]
       [:a {:href "#" :class "btn btn-warning"} ".btn-warning"]
       [:a {:href "#" :class "btn btn-danger"} ".btn-danger"]
       [:a {:href "#" :class "btn btn-default"} ".btn-default"]
    (if @expanded
      [:pre {:class "language-markup"}
	    [:code {:class "language-markup" :data-language "markup"}
      	 [:span {:class "token comment"} "// add class name of the button of your choice"][:br]
         [:span {:class "token comment"} "// add class .round-btn to add radius"][:br]
	     [:span {:class "token tag"}
	      [:span {:class "token tag"}
	       [:span {:class "token punctuation"} "<"] "a"]
	      [:span {:class "token attr-name"} " href"]
	      [:span {:class "token attr-value"}
	       [:span {:class "token punctuation"} "="]
	       [:span {:class "token punctuation"} "'"]"#"
	       [:span {:class "token punctuation"} "'"]]
	      [:span {:class "token attr-name"} " class"]
	      [:span {:class "token attr-value"}
	       [:span {:class "token punctuation"} "="]
	       [:span {:class "token punctuation"} "'"]"btn btn-primary"
	       [:span {:class "token punctuation"} "'"]]
	      [:span {:class "token punctuation"} ">"]]"Buy Now"
	     [:span {:class "token tag"}
	      [:span {:class "token tag"}
	       [:span {:class "token punctuation"} "</"]"a"]
	      [:span {:class "token punctuation"} ">"]]]])
    ]
   ]]
  )
