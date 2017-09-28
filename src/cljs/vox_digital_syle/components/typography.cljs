(ns vox-digital-syle.components.typography
  (:require [re-frame.core :as re-frame]))

(defn typography []
  [:section {:id "typography", :class "huge-module anchor clearfix"}
	 [:h2 {:class "huge-module__title"} "Typography"]
	 [:h2 {:class "huge-module__title"} [:small "Font Family - Roboto"]]
	 [:div {:class "titles"}
		 [:h1 "h1. Bootstrap heading"]
		 [:h2 "h2. Bootstrap heading"]
		 [:h3 "h3. Bootstrap heading"]
		 [:h4 "h4. Bootstrap heading"]
		 [:h5 "h5. Bootstrap heading"]
		 [:h6 "h6. Bootstrap heading"]]
  
	 [:br]
	 [:h5 {:class "huge-module__title--small"} "Paragraphs"]
	 [:p {:class "p1"} "SEO is a marketing tactic that costs five percent of overall budget but brings in more than 20\n percent of revenue for many Fortune 500 companies, and yet very few of them prioritize it. Instead,\n                while slowly changing, too many CMOS still favor paid search, which costs 20 percent and brings in… 20\n                percent. In search, businesses need to shift priorities. Now."]
	 [:p {:class "p2"} "Link volume is one of the most powerful signals search engines use to rank websites. There’s a\n way to use links to generate better search results, but too many marketers rely on traditional (or even\n                black hat) tactics that just don’t work anymore."]
	 [:p {:class "p3 small-3"} " remaining essentially unchanged. It was popularised in the 1960s with the release of "]]
  )