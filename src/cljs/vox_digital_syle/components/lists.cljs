(ns vox-digital-syle.components.lists
  (:require [reagent.core :as r]))

(def expanded-ul (r/atom nil))
(def expanded-ol (r/atom nil))

(defn lists []
  [:section {:id "lists" :class "huge-module anchor clearfix"}
	 [:h2 {:class "huge-module__title"} "Lists"]
	 [:h5 {:class "huge-module__title--small"} "Unordered"]
	 [:a {:href "#" :class "huge-module__toggle-code" :on-click #(swap! expanded-ul not)}]
	 [:ul " " 
		 [:li "Lorem ipsum dolor sit amet"]
		 [:li "Consectetur adipiscing elit"]
		 [:li "Integer molestie lorem at massa"]
		 [:li "Facilisis in pretium nisl aliquet"]
		 [:li "Nulla volutpat aliquam velit " 
		  [:ul " " 
		   [:li "Phasellus iaculis neque"]
		   [:li "Purus sodales ultricies"]
		   [:li "Vestibulum laoreet porttitor sem"]
		   [:li "Ac tristique libero volutpat at"]" "]" "]
		 [:li "Faucibus porta lacus fringilla vel"]
		 [:li "Aenean sit amet erat nunc"]
		 [:li "Eget porttitor lorem"]" "]

   (if @expanded-ul
	 [:pre {:class " language-markup"}
	  [:code {:class " language-markup" :data-language "markup"}
	   [:span {:class "token tag"}
	    [:span {:class "token tag"}
	     [:span {:class "token punctuation"} "<"]"ul"]
	    [:span {:class "token attr-name"} " class"]
	    [:span {:class "token attr-value"}
	     [:span {:class "token punctuation"} "="]
	     [:span {:class "token punctuation"} "'"]"list"
	     [:span {:class "token punctuation"} "'"]]
	    [:span {:class "token punctuation"} ">"]]
	   [:span {:class "token tag"}
	    [:span {:class "token tag"}
	     [:span {:class "token punctuation"} "<"]"li"]
	    [:span {:class "token punctuation"} ">"]]"Item 1"
	   [:span {:class "token tag"}
	    [:span {:class "token tag"}
	     [:span {:class "token punctuation"} "</"]"li"]
	    [:span {:class "token punctuation"} ">"]]
	   [:span {:class "token tag"}
	    [:span {:class "token tag"}
	     [:span {:class "token punctuation"} "<"]"li"]
	    [:span {:class "token punctuation"} ">"]]"Item 2"
	   [:span {:class "token tag"}
	    [:span {:class "token tag"}
	     [:span {:class "token punctuation"} "</"]"li"]
	    [:span {:class "token punctuation"} ">"]]
	   [:span {:class "token tag"}
	    [:span {:class "token tag"}
	     [:span {:class "token punctuation"} "<"]"li"]
	    [:span {:class "token punctuation"} ">"]]"Item 3"
	   [:span {:class "token tag"}
	    [:span {:class "token tag"}
	     [:span {:class "token punctuation"} "</"]"li"]
	    [:span {:class "token punctuation"} ">"]]
	   [:span {:class "token tag"}
	    [:span {:class "token tag"}
	     [:span {:class "token punctuation"} "</"]"ul"]
	    [:span {:class "token punctuation"} ">"]]]])


	 [:h5 {:class "huge-module__title--small"} "Ordered"]
	 [:a {:href "#" :class "huge-module__toggle-code" :on-click #(swap! expanded-ol not)}]
	 [:ol " " 
		 [:li "Lorem ipsum dolor sit amet"]
		 [:li "Consectetur adipiscing elit"]
		 [:li "Integer molestie lorem at massa"]
		 [:li "Facilisis in pretium nisl aliquet"]
		 [:li "Nulla volutpat aliquam velit"]
		 [:li "Faucibus porta lacus fringilla vel"]
		 [:li "Aenean sit amet erat nunc"]
		 [:li "Eget porttitor lorem"]" "]

   (if @expanded-ol
	 [:pre {:class " language-markup"}
	  [:code {:class " language-markup" :data-language "markup"}
	   [:span {:class "token tag"}
	    [:span {:class "token tag"}
	     [:span {:class "token punctuation"} "<"]"ol"]
	    [:span {:class "token attr-name"} " class"]
	    [:span {:class "token attr-value"}
	     [:span {:class "token punctuation"} "="]
	     [:span {:class "token punctuation"} "'"]"list" 
	     [:span {:class "token punctuation"} "'"]]
	    [:span {:class "token punctuation"} ">"]]
	   [:span {:class "token tag"}
	    [:span {:class "token tag"}
	     [:span {:class "token punctuation"} "<"]"li"]
	    [:span {:class "token punctuation"} ">"]]"Item 1" 
	   [:span {:class "token tag"}
	    [:span {:class "token tag"}
	     [:span {:class "token punctuation"} "</"]"li"]
	    [:span {:class "token punctuation"} ">"]]
	   [:span {:class "token tag"}
	    [:span {:class "token tag"}
	     [:span {:class "token punctuation"} "<"]"li"]
	    [:span {:class "token punctuation"} ">"]]"Item 2" 
	   [:span {:class "token tag"}
	    [:span {:class "token tag"}
	     [:span {:class "token punctuation"} "</"]"li"]
	    [:span {:class "token punctuation"} ">"]]
	   [:span {:class "token tag"}
	    [:span {:class "token tag"}
	     [:span {:class "token punctuation"} "<"]"li"]
	    [:span {:class "token punctuation"} ">"]]"Item 3" 
	   [:span {:class "token tag"}
	    [:span {:class "token tag"}
	     [:span {:class "token punctuation"} "</"]"li"]
	    [:span {:class "token punctuation"} ">"]]
	   [:span {:class "token tag"}
	    [:span {:class "token tag"}
	     [:span {:class "token punctuation"} "</"]"ol"]
	    [:span {:class "token punctuation"} ">"]]]])
   ])

