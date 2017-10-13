(ns vox-digital-syle.layout.markup)

(defn form-markup []
  [:pre {:style {:background "#0c1021" :color "#f8f8f8"}}
	 [:span {:style {:color "#7f90aa"}} "<" 
	  [:span {:style {:color "#7f90aa"}} "form"]
	  [:span {:style {:color "#7f90aa"}} "class"]"=" 
	  [:span {:style {:color "#61ce3c"}} "'form'"]">"]
	 [:span {:style {:color "#7f90aa"}} "<" 
	  [:span {:style {:color "#7f90aa"}} "div"]
	  [:span {:style {:color "#7f90aa"}} "class"]"=" 
	  [:span {:style {:color "#61ce3c"}} "'form-group'"]">"]
	 [:span {:style {:color "#7f90aa"}} "<" 
	  [:span {:style {:color "#7f90aa"}} "label"]
	  [:span {:style {:color "#7f90aa"}} "for"]"=" 
	  [:span {:style {:color "#61ce3c"}} "'exampleInputEmail1'"]">"]"Email address" 
	 [:span {:style {:color "#7f90aa"}} "</" 
	  [:span {:style {:color "#7f90aa"}} "label"]">"]
	 [:span {:style {:color "#7f90aa"}} "<" 
	  [:span {:style {:color "#7f90aa"}} "input"]
	  [:span {:style {:color "#7f90aa"}} "type"]"=" 
	  [:span {:style {:color "#61ce3c"}} "'email'"]
	  [:span {:style {:color "#7f90aa"}} "class"]"=" 
	  [:span {:style {:color "#61ce3c"}} "'form-control round-btn'"]
	  [:span {:style {:color "#7f90aa"}} "id"]"=" 
	  [:span {:style {:color "#61ce3c"}} "'exampleInputEmail1'"]
	  [:span {:style {:color "#7f90aa"}} "placeholder"]"=" 
	  [:span {:style {:color "#61ce3c"}} "'Email'"]">"]
	 [:span {:style {:color "#aeaeae"}}]
	 [:span {:style {:color "#aeaeae"}}]
	 [:span {:style {:color "#7f90aa"}} "</" 
	  [:span {:style {:color "#7f90aa"}} "div"]">"]
	 [:span {:style {:color "#7f90aa"}} "<" 
	  [:span {:style {:color "#7f90aa"}} "div"]
	  [:span {:style {:color "#7f90aa"}} "class"]"=" 
	  [:span {:style {:color "#61ce3c"}} "'form-group'"]">"]
	 [:span {:style {:color "#7f90aa"}} "<" 
	  [:span {:style {:color "#7f90aa"}} "label"]
	  [:span {:style {:color "#7f90aa"}} "for"]"=" 
	  [:span {:style {:color "#61ce3c"}} "'exampleInputPassword1'"]">"]"Password" 
	 [:span {:style {:color "#7f90aa"}} "</" 
	  [:span {:style {:color "#7f90aa"}} "label"]">"]
	 [:span {:style {:color "#7f90aa"}} "<" 
	  [:span {:style {:color "#7f90aa"}} "input"]
	  [:span {:style {:color "#7f90aa"}} "type"]"=" 
	  [:span {:style {:color "#61ce3c"}} "'password'"]
	  [:span {:style {:color "#7f90aa"}} "class"]"=" 
	  [:span {:style {:color "#61ce3c"}} "'form-control round-btn'"]
	  [:span {:style {:color "#7f90aa"}} "id"]"=" 
	  [:span {:style {:color "#61ce3c"}} "'exampleInputPassword1'"]
	  [:span {:style {:color "#7f90aa"}} "placeholder"]"=" 
	  [:span {:style {:color "#61ce3c"}} "'Password'"]">"]
	 [:span {:style {:color "#aeaeae"}}]
	 [:span {:style {:color "#aeaeae"}}]
	 [:span {:style {:color "#7f90aa"}} "</" 
	  [:span {:style {:color "#7f90aa"}} "div"]">"]
	 [:span {:style {:color "#7f90aa"}} "<" 
	  [:span {:style {:color "#7f90aa"}} "div"]
	  [:span {:style {:color "#7f90aa"}} "class"]"=" 
	  [:span {:style {:color "#61ce3c"}} "'form-group'"]">"]
	 [:span {:style {:color "#7f90aa"}} "<" 
	  [:span {:style {:color "#7f90aa"}} "label"]
	  [:span {:style {:color "#7f90aa"}} "for"]"=" 
	  [:span {:style {:color "#61ce3c"}} "'exampleInputFile'"]">"]"File input" 
	 [:span {:style {:color "#7f90aa"}} "</" 
	  [:span {:style {:color "#7f90aa"}} "label"]">"]
	 [:span {:style {:color "#7f90aa"}} "<" 
	  [:span {:style {:color "#7f90aa"}} "input"]
	  [:span {:style {:color "#7f90aa"}} "type"]"=" 
	  [:span {:style {:color "#61ce3c"}} "'file'"]
	  [:span {:style {:color "#7f90aa"}} "id"]"=" 
	  [:span {:style {:color "#61ce3c"}} "'exampleInputFile'"]">"]
	 [:span {:style {:color "#7f90aa"}} "<" 
	  [:span {:style {:color "#7f90aa"}} "p"]
	  [:span {:style {:color "#7f90aa"}} "class"]"=" 
	  [:span {:style {:color "#61ce3c"}} "'help-block'"]">"]"Example block-level help text here." 
	 [:span {:style {:color "#7f90aa"}} "</" 
	  [:span {:style {:color "#7f90aa"}} "p"]">"]
	 [:span {:style {:color "#aeaeae"}}]
	 [:span {:style {:color "#aeaeae"}}]
	 [:span {:style {:color "#7f90aa"}} "</" 
	  [:span {:style {:color "#7f90aa"}} "div"]">"]
	 [:span {:style {:color "#7f90aa"}} "<" 
	  [:span {:style {:color "#7f90aa"}} "div"]
	  [:span {:style {:color "#7f90aa"}} "class"]"=" 
	  [:span {:style {:color "#61ce3c"}} "'checkbox'"]">"]
	 [:span {:style {:color "#7f90aa"}} "<" 
	  [:span {:style {:color "#7f90aa"}} "label"]">"]
	 [:span {:style {:color "#aeaeae"}}]
	 [:span {:style {:color "#aeaeae"}}]
	 [:span {:style {:color "#7f90aa"}} "<" 
	  [:span {:style {:color "#7f90aa"}} "input"]
	  [:span {:style {:color "#7f90aa"}} "type"]"=" 
	  [:span {:style {:color "#61ce3c"}} "'checkbox'"]
	  [:span {:style {:color "#7f90aa"}} "value"]"=" 
	  [:span {:style {:color "#61ce3c"}} "'on'"]">"]
	 [:span {:style {:color "#aeaeae"}}]" Check me out " 
	 [:span {:style {:color "#aeaeae"}}]
	 [:span {:style {:color "#7f90aa"}} "</" 
	  [:span {:style {:color "#7f90aa"}} "label"]">"]
	 [:span {:style {:color "#aeaeae"}}]
	 [:span {:style {:color "#aeaeae"}}]
	 [:span {:style {:color "#7f90aa"}} "</" 
	  [:span {:style {:color "#7f90aa"}} "div"]">"]
	 [:span {:style {:color "#7f90aa"}} "<" 
	  [:span {:style {:color "#7f90aa"}} "button"]
	  [:span {:style {:color "#7f90aa"}} "type"]"=" 
	  [:span {:style {:color "#61ce3c"}} "'submit'"]
	  [:span {:style {:color "#7f90aa"}} "class"]"=" 
	  [:span {:style {:color "#61ce3c"}} "'btn btn-sugn-up'"]">"]"Submit" 
	 [:span {:style {:color "#7f90aa"}} "</" 
	  [:span {:style {:color "#7f90aa"}} "button"]">"]
	 [:span {:style {:color "#aeaeae"}}]
	 [:span {:style {:color "#aeaeae"}} ]
	 [:span {:style {:color "#7f90aa"}} "</" 
	  [:span {:style {:color "#7f90aa"}} "form"]">"]])

(defn table-markup []
  [:pre {:class "language-markup"}
    [:code {:class " language-markup" :data-language "markup"}
     [:span {:class "token tag"}
      [:span {:class "token tag"}
       [:span {:class "token punctuation"} "<"]"table"]
      [:span {:class "token attr-name"} " class"]
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
      [:span {:class "token punctuation"} ">"]]]])

(defn lists-markup []
  [:pre {:style {:background "#0c1021" :color "#f8f8f8"}}
	 [:span {:style {:color "#7f90aa"}} "<" 
	  [:span {:style {:color "#7f90aa"}} "ul"]">"]
	 [:span {:style {:color "#7f90aa"}} "<" 
	  [:span {:style {:color "#7f90aa"}} "li"]">"]"Consectetur adipiscing elit" 
	 [:span {:style {:color "#7f90aa"}} "</" 
	  [:span {:style {:color "#7f90aa"}} "li"]">"]
	 [:span {:style {:color "#7f90aa"}} "<" 
	  [:span {:style {:color "#7f90aa"}} "li"]">"]
	 [:span {:style {:color "#aeaeae"}}]"Nulla volutpat aliquam velit " 
	 [:span {:style {:color "#aeaeae"}}]
	 [:span {:style {:color "#7f90aa"}} "<" 
	  [:span {:style {:color "#7f90aa"}} "ul"]">"]
	 [:span {:style {:color "#aeaeae"}}]
	 [:span {:style {:color "#aeaeae"}}]
	 [:span {:style {:color "#7f90aa"}} "<" 
	  [:span {:style {:color "#7f90aa"}} "li"]">"]"Vestibulum laoreet porttitor sem" 
	 [:span {:style {:color "#7f90aa"}} "</" 
	  [:span {:style {:color "#7f90aa"}} "li"]">"]
	 [:span {:style {:color "#7f90aa"}} "<" 
	  [:span {:style {:color "#7f90aa"}} "li"]">"]"Ac tristique libero volutpat at" 
	 [:span {:style {:color "#7f90aa"}} "</" 
	  [:span {:style {:color "#7f90aa"}} "li"]">"]
	 [:span {:style {:color "#aeaeae"}}]
	 [:span {:style {:color "#aeaeae"}}]
	 [:span {:style {:color "#7f90aa"}} "</" 
	  [:span {:style {:color "#7f90aa"}} "ul"]">"]
	 [:span {:style {:color "#aeaeae"}}]
	 [:span {:style {:color "#aeaeae"}}]
	 [:span {:style {:color "#7f90aa"}} "</" 
	  [:span {:style {:color "#7f90aa"}} "li"]">"]
	 [:span {:style {:color "#7f90aa"}} "</" 
	  [:span {:style {:color "#7f90aa"}} "ul"]">"]
	 [:span {:style {:color "#7f90aa"}} "<" 
	  [:span {:style {:color "#7f90aa"}} "ol"]">"]
	 [:span {:style {:color "#7f90aa"}} "<" 
	  [:span {:style {:color "#7f90aa"}} "li"]">"]"Faucibus porta lacus fringilla vel" 
	 [:span {:style {:color "#7f90aa"}} "</" 
	  [:span {:style {:color "#7f90aa"}} "li"]">"]
	 [:span {:style {:color "#7f90aa"}} "<" 
	  [:span {:style {:color "#7f90aa"}} "li"]">"]"Aenean sit amet erat nunc" 
	 [:span {:style {:color "#7f90aa"}} "</" 
	  [:span {:style {:color "#7f90aa"}} "li"]">"]
	 [:span {:style {:color "#7f90aa"}} "<" 
	  [:span {:style {:color "#7f90aa"}} "li"]">"]"Eget porttitor lorem" 
	 [:span {:style {:color "#7f90aa"}} "</" 
	  [:span {:style {:color "#7f90aa"}} "li"]">"]
	 [:span {:style {:color "#aeaeae"}}]
	 [:span {:style {:color "#aeaeae"}}]
	 [:span {:style {:color "#7f90aa"}} "</" 
	  [:span {:style {:color "#7f90aa"}} "ol"]">"]])

(defn alerts-markup []
  [:pre {:style {:background "#0c1021" :color "#f8f8f8"}}
	 [:span {:style {:color "#7f90aa"}} "<" 
	  [:span {:style {:color "#7f90aa"}} "div"]
	  [:span {:style {:color "#7f90aa"}} " class"]"=" 
	  [:span {:style {:color "#61ce3c"}} "'alert alert-success'"]
	  [:span {:style {:color "#7f90aa"}} " role"]"=" 
	  [:span {:style {:color "#61ce3c"}} "'alert'"]">"]
	 [:span {:style {:color "#7f90aa"}} "<" 
	  [:span {:style {:color "#7f90aa"}} "strong"]">"]"Well done!" 
	 [:span {:style {:color "#7f90aa"}} "</" 
	  [:span {:style {:color "#7f90aa"}} "strong"]">"]
	 [:span {:style {:color "#aeaeae"}}]" You successfully read this important alert message. " 
	 [:span {:style {:color "#aeaeae"}}]
	 [:span {:style {:color "#7f90aa"}} "</" 
	  [:span {:style {:color "#7f90aa"}} "div"]">"]])

(defn button-markup []
  [:pre {:style {:background "#0c1021" :color "#f8f8f8"}}
	 [:span {:style {:color "#7f90aa"}} "<" 
	  [:span {:style {:color "#7f90aa"}} "a"]
	  [:span {:style {:color "#7f90aa"}} " href"]"=" 
	  [:span {:style {:color "#61ce3c"}} "'#'"]
	  [:span {:style {:color "#7f90aa"}} " class"]"=" 
	  [:span {:style {:color "#61ce3c"}} "'btn btn-sugn-up'"]">"]
	 [:span {:style {:color "#aeaeae"}}]"." 
	 [:span {:style {:color "#aeaeae"}}]
	 [:span {:style {:color "#aeaeae"}}]"btn-sugn-up" 
	 [:span {:style {:color "#aeaeae"}}]
	 [:span {:style {:color "#7f90aa"}} "</" 
	  [:span {:style {:color "#7f90aa"}} "a"]">"]
	 [:span {:style {:color "#7f90aa"}} "<" 
	  [:span {:style {:color "#7f90aa"}} "a"]
	  [:span {:style {:color "#7f90aa"}} " href"]"=" 
	  [:span {:style {:color "#61ce3c"}} "'#'"]
	  [:span {:style {:color "#7f90aa"}} " class"]"=" 
	  [:span {:style {:color "#61ce3c"}} "'btn btn-success'"]">"]
	 [:span {:style {:color "#aeaeae"}}]"." 
	 [:span {:style {:color "#aeaeae"}}]
	 [:span {:style {:color "#aeaeae"}}]"btn-success" 
	 [:span {:style {:color "#aeaeae"}}]
	 [:span {:style {:color "#7f90aa"}} "</" 
	  [:span {:style {:color "#7f90aa"}} "a"]">"]])

(defn panel-markup []
  [:pre {:style {:background "#0c1021" :color "#f8f8f8"}}
	 [:span {:style {:color "#7f90aa"}} "<" 
	  [:span {:style {:color "#7f90aa"}} "div"]
	  [:span {:style {:color "#7f90aa"}} " class"]"=" 
	  [:span {:style {:color "#61ce3c"}} "'panel panel-default'"]">"]
	 [:span {:style {:color "#7f90aa"}} "<" 
	  [:span {:style {:color "#7f90aa"}} "div"]
	  [:span {:style {:color "#7f90aa"}} " class"]"=" 
	  [:span {:style {:color "#61ce3c"}} "'panel-heading'"]">"]"Panel heading without title" 
	 [:span {:style {:color "#7f90aa"}} "</" 
	  [:span {:style {:color "#7f90aa"}} "div"]">"]
	 [:span {:style {:color "#7f90aa"}} "<" 
	  [:span {:style {:color "#7f90aa"}} "div"]
	  [:span {:style {:color "#7f90aa"}} " class"]"=" 
	  [:span {:style {:color "#61ce3c"}} "'panel-body'"]">"]" Panel content " 
	 [:span {:style {:color "#7f90aa"}} "</" 
	  [:span {:style {:color "#7f90aa"}} "div"]">"]
	 [:span {:style {:color "#aeaeae"}}]
	 [:span {:style {:color "#aeaeae"}}]
	 [:span {:style {:color "#7f90aa"}} "</" 
	  [:span {:style {:color "#7f90aa"}} "div"]">"]])