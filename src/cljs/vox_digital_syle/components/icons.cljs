(ns vox-digital-syle.components.icons
  (:require [re-frame.core :as re-frame]
            [reagent.core :as r]))

(defn icons []
  ;;A list of bootstrap icons
  [:section {:id "icons" :class "huge-module anchor clearfix"}
	  [:h2 {:class "huge-module__title"} "Icons"]
	  [:div {:class "bs-glyphicons"}
	 [:ul {:class "bs-glyphicons-list"}
	  [:li " " 
	   [:span {:class "glyphicon glyphicon-asterisk", :aria-hidden "true"}]
	   [:span {:class "glyphicon-class"} "glyphicon glyphicon-asterisk"]" "]
	  [:li " " 
	   [:span {:class "glyphicon glyphicon-plus", :aria-hidden "true"}]
	   [:span {:class "glyphicon-class"} "glyphicon glyphicon-plus"]" "]
	  [:li " " 
	   [:span {:class "glyphicon glyphicon-euro", :aria-hidden "true"}]
	   [:span {:class "glyphicon-class"} "glyphicon glyphicon-euro"]" "]
	  [:li " " 
	   [:span {:class "glyphicon glyphicon-eur", :aria-hidden "true"}]
	   [:span {:class "glyphicon-class"} "glyphicon glyphicon-eur"]" "]
	  [:li " " 
	   [:span {:class "glyphicon glyphicon-minus", :aria-hidden "true"}]
	   [:span {:class "glyphicon-class"} "glyphicon glyphicon-minus"]" "]
	  [:li " " 
	   [:span {:class "glyphicon glyphicon-cloud", :aria-hidden "true"}]
	   [:span {:class "glyphicon-class"} "glyphicon glyphicon-cloud"]" "]
	  [:li " " 
	   [:span {:class "glyphicon glyphicon-envelope", :aria-hidden "true"}]
	   [:span {:class "glyphicon-class"} "glyphicon glyphicon-envelope"]" "]
	  [:li " " 
	   [:span {:class "glyphicon glyphicon-pencil", :aria-hidden "true"}]
	   [:span {:class "glyphicon-class"} "glyphicon glyphicon-pencil"]" "]
	  [:li " " 
	   [:span {:class "glyphicon glyphicon-glass", :aria-hidden "true"}]
	   [:span {:class "glyphicon-class"} "glyphicon glyphicon-glass"]" "]
	  [:li " " 
	   [:span {:class "glyphicon glyphicon-music", :aria-hidden "true"}]
	   [:span {:class "glyphicon-class"} "glyphicon glyphicon-music"]" "]
	  [:li " " 
	   [:span {:class "glyphicon glyphicon-search", :aria-hidden "true"}]
	   [:span {:class "glyphicon-class"} "glyphicon glyphicon-search"]" "]
	  [:li " " 
	   [:span {:class "glyphicon glyphicon-heart", :aria-hidden "true"}]
	   [:span {:class "glyphicon-class"} "glyphicon glyphicon-heart"]" "]
	  [:li " " 
	   [:span {:class "glyphicon glyphicon-star", :aria-hidden "true"}]
	   [:span {:class "glyphicon-class"} "glyphicon glyphicon-star"]" "]
	  [:li " " 
	   [:span {:class "glyphicon glyphicon-star-empty", :aria-hidden "true"}]
	   [:span {:class "glyphicon-class"} "glyphicon glyphicon-star-empty"]" "]
	  [:li " " 
	   [:span {:class "glyphicon glyphicon-user", :aria-hidden "true"}]
	   [:span {:class "glyphicon-class"} "glyphicon glyphicon-user"]" "]
	  [:li " " 
	   [:span {:class "glyphicon glyphicon-film", :aria-hidden "true"}]
	   [:span {:class "glyphicon-class"} "glyphicon glyphicon-film"]" "]
	  [:li " " 
	   [:span {:class "glyphicon glyphicon-th-large", :aria-hidden "true"}]
	   [:span {:class "glyphicon-class"} "glyphicon glyphicon-th-large"]" "]
	  [:li " " 
	   [:span {:class "glyphicon glyphicon-th", :aria-hidden "true"}]
	   [:span {:class "glyphicon-class"} "glyphicon glyphicon-th"]" "]
	  [:li " " 
	   [:span {:class "glyphicon glyphicon-th-list", :aria-hidden "true"}]
	   [:span {:class "glyphicon-class"} "glyphicon glyphicon-th-list"]" "]
	  [:li " " 
	   [:span {:class "glyphicon glyphicon-ok", :aria-hidden "true"}]
	   [:span {:class "glyphicon-class"} "glyphicon glyphicon-ok"]" "]
	  [:li " " 
	   [:span {:class "glyphicon glyphicon-remove", :aria-hidden "true"}]
	   [:span {:class "glyphicon-class"} "glyphicon glyphicon-remove"]" "]
	  [:li " " 
	   [:span {:class "glyphicon glyphicon-zoom-in", :aria-hidden "true"}]
	   [:span {:class "glyphicon-class"} "glyphicon glyphicon-zoom-in"]" "]
	  [:li " " 
	   [:span {:class "glyphicon glyphicon-zoom-out", :aria-hidden "true"}]
	   [:span {:class "glyphicon-class"} "glyphicon glyphicon-zoom-out"]" "]
	  [:li " " 
	   [:span {:class "glyphicon glyphicon-off", :aria-hidden "true"}]
	   [:span {:class "glyphicon-class"} "glyphicon glyphicon-off"]" "]
	  [:li " " 
	   [:span {:class "glyphicon glyphicon-signal", :aria-hidden "true"}]
	   [:span {:class "glyphicon-class"} "glyphicon glyphicon-signal"]" "]
	  [:li " " 
	   [:span {:class "glyphicon glyphicon-cog", :aria-hidden "true"}]
	   [:span {:class "glyphicon-class"} "glyphicon glyphicon-cog"]" "]
	  [:li " " 
	   [:span {:class "glyphicon glyphicon-trash", :aria-hidden "true"}]
	   [:span {:class "glyphicon-class"} "glyphicon glyphicon-trash"]" "]
	  [:li " " 
	   [:span {:class "glyphicon glyphicon-home", :aria-hidden "true"}]
	   [:span {:class "glyphicon-class"} "glyphicon glyphicon-home"]" "]
	  [:li " " 
	   [:span {:class "glyphicon glyphicon-file", :aria-hidden "true"}]
	   [:span {:class "glyphicon-class"} "glyphicon glyphicon-file"]" "]
	  [:li " " 
	   [:span {:class "glyphicon glyphicon-time", :aria-hidden "true"}]
	   [:span {:class "glyphicon-class"} "glyphicon glyphicon-time"]" "]
	  [:li " " 
	   [:span {:class "glyphicon glyphicon-road", :aria-hidden "true"}]
	   [:span {:class "glyphicon-class"} "glyphicon glyphicon-road"]" "]
	  [:li " " 
	   [:span {:class "glyphicon glyphicon-download-alt", :aria-hidden "true"}]
	   [:span {:class "glyphicon-class"} "glyphicon glyphicon-download-alt"]" "]
	  [:li " " 
	   [:span {:class "glyphicon glyphicon-download", :aria-hidden "true"}]
	   [:span {:class "glyphicon-class"} "glyphicon glyphicon-download"]" "]
	  [:li " " 
	   [:span {:class "glyphicon glyphicon-upload", :aria-hidden "true"}]
	   [:span {:class "glyphicon-class"} "glyphicon glyphicon-upload"]" "]
	  [:li " " 
	   [:span {:class "glyphicon glyphicon-inbox", :aria-hidden "true"}]
	   [:span {:class "glyphicon-class"} "glyphicon glyphicon-inbox"]" "]
	  [:li " " 
	   [:span {:class "glyphicon glyphicon-play-circle", :aria-hidden "true"}]
	   [:span {:class "glyphicon-class"} "glyphicon glyphicon-play-circle"]" "]
	  [:li " " 
	   [:span {:class "glyphicon glyphicon-repeat", :aria-hidden "true"}]
	   [:span {:class "glyphicon-class"} "glyphicon glyphicon-repeat"]" "]
	  [:li " " 
	   [:span {:class "glyphicon glyphicon-refresh", :aria-hidden "true"}]
	   [:span {:class "glyphicon-class"} "glyphicon glyphicon-refresh"]" "]
	  [:li " " 
	   [:span {:class "glyphicon glyphicon-list-alt", :aria-hidden "true"}]
	   [:span {:class "glyphicon-class"} "glyphicon glyphicon-list-alt"]" "]
	  [:li " " 
	   [:span {:class "glyphicon glyphicon-lock", :aria-hidden "true"}]
	   [:span {:class "glyphicon-class"} "glyphicon glyphicon-lock"]" "]
	  [:li " " 
	   [:span {:class "glyphicon glyphicon-flag", :aria-hidden "true"}]
	   [:span {:class "glyphicon-class"} "glyphicon glyphicon-flag"]" "]
	  [:li " " 
	   [:span {:class "glyphicon glyphicon-headphones", :aria-hidden "true"}]
	   [:span {:class "glyphicon-class"} "glyphicon glyphicon-headphones"]" "]
	  [:li " " 
	   [:span {:class "glyphicon glyphicon-volume-off", :aria-hidden "true"}]
	   [:span {:class "glyphicon-class"} "glyphicon glyphicon-volume-off"]" "]
	  [:li " " 
	   [:span {:class "glyphicon glyphicon-volume-down", :aria-hidden "true"}]
	   [:span {:class "glyphicon-class"} "glyphicon glyphicon-volume-down"]" "]
	  [:li " " 
	   [:span {:class "glyphicon glyphicon-volume-up", :aria-hidden "true"}]
	   [:span {:class "glyphicon-class"} "glyphicon glyphicon-volume-up"]" "]
	  [:li " " 
	   [:span {:class "glyphicon glyphicon-qrcode", :aria-hidden "true"}]
	   [:span {:class "glyphicon-class"} "glyphicon glyphicon-qrcode"]" "]
	  [:li " " 
	   [:span {:class "glyphicon glyphicon-barcode", :aria-hidden "true"}]
	   [:span {:class "glyphicon-class"} "glyphicon glyphicon-barcode"]" "]
	  [:li " " 
	   [:span {:class "glyphicon glyphicon-tag", :aria-hidden "true"}]
	   [:span {:class "glyphicon-class"} "glyphicon glyphicon-tag"]" "]
	  [:li " " 
	   [:span {:class "glyphicon glyphicon-tags", :aria-hidden "true"}]
	   [:span {:class "glyphicon-class"} "glyphicon glyphicon-tags"]" "]
	  [:li " " 
	   [:span {:class "glyphicon glyphicon-book", :aria-hidden "true"}]
	   [:span {:class "glyphicon-class"} "glyphicon glyphicon-book"]" "]
	  [:li " " 
	   [:span {:class "glyphicon glyphicon-bookmark", :aria-hidden "true"}]
	   [:span {:class "glyphicon-class"} "glyphicon glyphicon-bookmark"]" "]
	  [:li " " 
	   [:span {:class "glyphicon glyphicon-print", :aria-hidden "true"}]
	   [:span {:class "glyphicon-class"} "glyphicon glyphicon-print"]" "]
	  [:li " " 
	   [:span {:class "glyphicon glyphicon-camera", :aria-hidden "true"}]
	   [:span {:class "glyphicon-class"} "glyphicon glyphicon-camera"]" "]
	  [:li " " 
	   [:span {:class "glyphicon glyphicon-font", :aria-hidden "true"}]
	   [:span {:class "glyphicon-class"} "glyphicon glyphicon-font"]" "]
	  [:li " " 
	   [:span {:class "glyphicon glyphicon-bold", :aria-hidden "true"}]
	   [:span {:class "glyphicon-class"} "glyphicon glyphicon-bold"]" "]
	  [:li " " 
	   [:span {:class "glyphicon glyphicon-italic", :aria-hidden "true"}]
	   [:span {:class "glyphicon-class"} "glyphicon glyphicon-italic"]" "]
	  [:li " " 
	   [:span {:class "glyphicon glyphicon-text-height", :aria-hidden "true"}]
	   [:span {:class "glyphicon-class"} "glyphicon glyphicon-text-height"]" "]
	  [:li " " 
	   [:span {:class "glyphicon glyphicon-text-width", :aria-hidden "true"}]
	   [:span {:class "glyphicon-class"} "glyphicon glyphicon-text-width"]" "]
	  [:li " " 
	   [:span {:class "glyphicon glyphicon-align-left", :aria-hidden "true"}]
	   [:span {:class "glyphicon-class"} "glyphicon glyphicon-align-left"]" "]
	  [:li " " 
	   [:span {:class "glyphicon glyphicon-align-center", :aria-hidden "true"}]
	   [:span {:class "glyphicon-class"} "glyphicon glyphicon-align-center"]" "]
	  [:li " " 
	   [:span {:class "glyphicon glyphicon-align-right", :aria-hidden "true"}]
	   [:span {:class "glyphicon-class"} "glyphicon glyphicon-align-right"]" "]
	  [:li " " 
	   [:span {:class "glyphicon glyphicon-align-justify", :aria-hidden "true"}]
	   [:span {:class "glyphicon-class"} "glyphicon glyphicon-align-justify"]" "]
	  [:li " " 
	   [:span {:class "glyphicon glyphicon-list", :aria-hidden "true"}]
	   [:span {:class "glyphicon-class"} "glyphicon glyphicon-list"]" "]
	  [:li " " 
	   [:span {:class "glyphicon glyphicon-indent-left", :aria-hidden "true"}]
	   [:span {:class "glyphicon-class"} "glyphicon glyphicon-indent-left"]" "]
	  [:li " " 
	   [:span {:class "glyphicon glyphicon-indent-right", :aria-hidden "true"}]
	   [:span {:class "glyphicon-class"} "glyphicon glyphicon-indent-right"]" "]
	  [:li " " 
	   [:span {:class "glyphicon glyphicon-facetime-video", :aria-hidden "true"}]
	   [:span {:class "glyphicon-class"} "glyphicon glyphicon-facetime-video"]" "]
	  [:li " " 
	   [:span {:class "glyphicon glyphicon-picture", :aria-hidden "true"}]
	   [:span {:class "glyphicon-class"} "glyphicon glyphicon-picture"]" "]
	  [:li " " 
	   [:span {:class "glyphicon glyphicon-map-marker", :aria-hidden "true"}]
	   [:span {:class "glyphicon-class"} "glyphicon glyphicon-map-marker"]" "]
	  [:li " " 
	   [:span {:class "glyphicon glyphicon-adjust", :aria-hidden "true"}]
	   [:span {:class "glyphicon-class"} "glyphicon glyphicon-adjust"]" "]
	  [:li " " 
	   [:span {:class "glyphicon glyphicon-tint", :aria-hidden "true"}]
	   [:span {:class "glyphicon-class"} "glyphicon glyphicon-tint"]" "]
	  [:li " " 
	   [:span {:class "glyphicon glyphicon-edit", :aria-hidden "true"}]
	   [:span {:class "glyphicon-class"} "glyphicon glyphicon-edit"]" "]
	  [:li " " 
	   [:span {:class "glyphicon glyphicon-share", :aria-hidden "true"}]
	   [:span {:class "glyphicon-class"} "glyphicon glyphicon-share"]" "]
	  [:li " " 
	   [:span {:class "glyphicon glyphicon-check", :aria-hidden "true"}]
	   [:span {:class "glyphicon-class"} "glyphicon glyphicon-check"]" "]
	  [:li " " 
	   [:span {:class "glyphicon glyphicon-move", :aria-hidden "true"}]
	   [:span {:class "glyphicon-class"} "glyphicon glyphicon-move"]" "]
	  [:li " " 
	   [:span {:class "glyphicon glyphicon-step-backward", :aria-hidden "true"}]
	   [:span {:class "glyphicon-class"} "glyphicon glyphicon-step-backward"]" "]
	  [:li " " 
	   [:span {:class "glyphicon glyphicon-fast-backward", :aria-hidden "true"}]
	   [:span {:class "glyphicon-class"} "glyphicon glyphicon-fast-backward"]" "]
	  [:li " " 
	   [:span {:class "glyphicon glyphicon-backward", :aria-hidden "true"}]
	   [:span {:class "glyphicon-class"} "glyphicon glyphicon-backward"]" "]
	  [:li " " 
	   [:span {:class "glyphicon glyphicon-play", :aria-hidden "true"}]
	   [:span {:class "glyphicon-class"} "glyphicon glyphicon-play"]" "]
	  [:li " " 
	   [:span {:class "glyphicon glyphicon-pause", :aria-hidden "true"}]
	   [:span {:class "glyphicon-class"} "glyphicon glyphicon-pause"]" "]
	  [:li " " 
	   [:span {:class "glyphicon glyphicon-stop", :aria-hidden "true"}]
	   [:span {:class "glyphicon-class"} "glyphicon glyphicon-stop"]" "]
	  [:li " " 
	   [:span {:class "glyphicon glyphicon-forward", :aria-hidden "true"}]
	   [:span {:class "glyphicon-class"} "glyphicon glyphicon-forward"]" "]
	  [:li " " 
	   [:span {:class "glyphicon glyphicon-fast-forward", :aria-hidden "true"}]
	   [:span {:class "glyphicon-class"} "glyphicon glyphicon-fast-forward"]" "]
	  [:li " " 
	   [:span {:class "glyphicon glyphicon-step-forward", :aria-hidden "true"}]
	   [:span {:class "glyphicon-class"} "glyphicon glyphicon-step-forward"]" "]
	  [:li " " 
	   [:span {:class "glyphicon glyphicon-eject", :aria-hidden "true"}]
	   [:span {:class "glyphicon-class"} "glyphicon glyphicon-eject"]" "]
	  [:li " " 
	   [:span {:class "glyphicon glyphicon-chevron-left", :aria-hidden "true"}]
	   [:span {:class "glyphicon-class"} "glyphicon glyphicon-chevron-left"]" "]
	  [:li " " 
	   [:span {:class "glyphicon glyphicon-chevron-right", :aria-hidden "true"}]
	   [:span {:class "glyphicon-class"} "glyphicon glyphicon-chevron-right"]" "]
	  [:li " " 
	   [:span {:class "glyphicon glyphicon-plus-sign", :aria-hidden "true"}]
	   [:span {:class "glyphicon-class"} "glyphicon glyphicon-plus-sign"]" "]
	  [:li " " 
	   [:span {:class "glyphicon glyphicon-minus-sign", :aria-hidden "true"}]
	   [:span {:class "glyphicon-class"} "glyphicon glyphicon-minus-sign"]" "]
	  [:li " " 
	   [:span {:class "glyphicon glyphicon-remove-sign", :aria-hidden "true"}]
	   [:span {:class "glyphicon-class"} "glyphicon glyphicon-remove-sign"]" "]
	  [:li " " 
	   [:span {:class "glyphicon glyphicon-ok-sign", :aria-hidden "true"}]
	   [:span {:class "glyphicon-class"} "glyphicon glyphicon-ok-sign"]" "]
	  [:li " " 
	   [:span {:class "glyphicon glyphicon-question-sign", :aria-hidden "true"}]
	   [:span {:class "glyphicon-class"} "glyphicon glyphicon-question-sign"]" "]
	  [:li " " 
	   [:span {:class "glyphicon glyphicon-info-sign", :aria-hidden "true"}]
	   [:span {:class "glyphicon-class"} "glyphicon glyphicon-info-sign"]" "]
	  [:li " " 
	   [:span {:class "glyphicon glyphicon-screenshot", :aria-hidden "true"}]
	   [:span {:class "glyphicon-class"} "glyphicon glyphicon-screenshot"]" "]
	  [:li " " 
	   [:span {:class "glyphicon glyphicon-remove-circle", :aria-hidden "true"}]
	   [:span {:class "glyphicon-class"} "glyphicon glyphicon-remove-circle"]" "]
	  [:li " " 
	   [:span {:class "glyphicon glyphicon-ok-circle", :aria-hidden "true"}]
	   [:span {:class "glyphicon-class"} "glyphicon glyphicon-ok-circle"]" "]
	  [:li " " 
	   [:span {:class "glyphicon glyphicon-ban-circle", :aria-hidden "true"}]
	   [:span {:class "glyphicon-class"} "glyphicon glyphicon-ban-circle"]" "]
	  [:li " " 
	   [:span {:class "glyphicon glyphicon-arrow-left", :aria-hidden "true"}]
	   [:span {:class "glyphicon-class"} "glyphicon glyphicon-arrow-left"]" "]
	  [:li " " 
	   [:span {:class "glyphicon glyphicon-arrow-right", :aria-hidden "true"}]
	   [:span {:class "glyphicon-class"} "glyphicon glyphicon-arrow-right"]" "]
	  [:li " " 
	   [:span {:class "glyphicon glyphicon-arrow-up", :aria-hidden "true"}]
	   [:span {:class "glyphicon-class"} "glyphicon glyphicon-arrow-up"]" "]
	  [:li " " 
	   [:span {:class "glyphicon glyphicon-arrow-down", :aria-hidden "true"}]
	   [:span {:class "glyphicon-class"} "glyphicon glyphicon-arrow-down"]" "]
	  [:li " " 
	   [:span {:class "glyphicon glyphicon-share-alt", :aria-hidden "true"}]
	   [:span {:class "glyphicon-class"} "glyphicon glyphicon-share-alt"]" "]
	  [:li " " 
	   [:span {:class "glyphicon glyphicon-resize-full", :aria-hidden "true"}]
	   [:span {:class "glyphicon-class"} "glyphicon glyphicon-resize-full"]" "]
	  [:li " " 
	   [:span {:class "glyphicon glyphicon-resize-small", :aria-hidden "true"}]
	   [:span {:class "glyphicon-class"} "glyphicon glyphicon-resize-small"]" "]
	  [:li " " 
	   [:span {:class "glyphicon glyphicon-exclamation-sign", :aria-hidden "true"}]
	   [:span {:class "glyphicon-class"} "glyphicon glyphicon-exclamation-sign"]" "]
	  [:li " " 
	   [:span {:class "glyphicon glyphicon-gift", :aria-hidden "true"}]
	   [:span {:class "glyphicon-class"} "glyphicon glyphicon-gift"]" "]
	  [:li " " 
	   [:span {:class "glyphicon glyphicon-leaf", :aria-hidden "true"}]
	   [:span {:class "glyphicon-class"} "glyphicon glyphicon-leaf"]" "]
	  [:li " " 
	   [:span {:class "glyphicon glyphicon-fire", :aria-hidden "true"}]
	   [:span {:class "glyphicon-class"} "glyphicon glyphicon-fire"]" "]
	  [:li " " 
	   [:span {:class "glyphicon glyphicon-eye-open", :aria-hidden "true"}]
	   [:span {:class "glyphicon-class"} "glyphicon glyphicon-eye-open"]" "]
	  [:li " " 
	   [:span {:class "glyphicon glyphicon-eye-close", :aria-hidden "true"}]
	   [:span {:class "glyphicon-class"} "glyphicon glyphicon-eye-close"]" "]
	  [:li " " 
	   [:span {:class "glyphicon glyphicon-warning-sign", :aria-hidden "true"}]
	   [:span {:class "glyphicon-class"} "glyphicon glyphicon-warning-sign"]" "]
	  [:li " " 
	   [:span {:class "glyphicon glyphicon-plane", :aria-hidden "true"}]
	   [:span {:class "glyphicon-class"} "glyphicon glyphicon-plane"]" "]
	  [:li " " 
	   [:span {:class "glyphicon glyphicon-calendar", :aria-hidden "true"}]
	   [:span {:class "glyphicon-class"} "glyphicon glyphicon-calendar"]" "]
	  [:li " " 
	   [:span {:class "glyphicon glyphicon-random", :aria-hidden "true"}]
	   [:span {:class "glyphicon-class"} "glyphicon glyphicon-random"]" "]
	  [:li " " 
	   [:span {:class "glyphicon glyphicon-comment", :aria-hidden "true"}]
	   [:span {:class "glyphicon-class"} "glyphicon glyphicon-comment"]" "]
	  [:li " " 
	   [:span {:class "glyphicon glyphicon-magnet", :aria-hidden "true"}]
	   [:span {:class "glyphicon-class"} "glyphicon glyphicon-magnet"]" "]
	  [:li " " 
	   [:span {:class "glyphicon glyphicon-chevron-up", :aria-hidden "true"}]
	   [:span {:class "glyphicon-class"} "glyphicon glyphicon-chevron-up"]" "]
	  [:li " " 
	   [:span {:class "glyphicon glyphicon-chevron-down", :aria-hidden "true"}]
	   [:span {:class "glyphicon-class"} "glyphicon glyphicon-chevron-down"]" "]
	  [:li " " 
	   [:span {:class "glyphicon glyphicon-retweet", :aria-hidden "true"}]
	   [:span {:class "glyphicon-class"} "glyphicon glyphicon-retweet"]" "]
	  [:li " " 
	   [:span {:class "glyphicon glyphicon-shopping-cart", :aria-hidden "true"}]
	   [:span {:class "glyphicon-class"} "glyphicon glyphicon-shopping-cart"]" "]
	  [:li " " 
	   [:span {:class "glyphicon glyphicon-folder-close", :aria-hidden "true"}]
	   [:span {:class "glyphicon-class"} "glyphicon glyphicon-folder-close"]" "]
	  [:li " " 
	   [:span {:class "glyphicon glyphicon-folder-open", :aria-hidden "true"}]
	   [:span {:class "glyphicon-class"} "glyphicon glyphicon-folder-open"]" "]
	  [:li " " 
	   [:span {:class "glyphicon glyphicon-resize-vertical", :aria-hidden "true"}]
	   [:span {:class "glyphicon-class"} "glyphicon glyphicon-resize-vertical"]" "]
	  [:li " " 
	   [:span {:class "glyphicon glyphicon-resize-horizontal", :aria-hidden "true"}]
	   [:span {:class "glyphicon-class"} "glyphicon glyphicon-resize-horizontal"]" "]
	  [:li " " 
	   [:span {:class "glyphicon glyphicon-hdd", :aria-hidden "true"}]
	   [:span {:class "glyphicon-class"} "glyphicon glyphicon-hdd"]" "]
	  [:li " " 
	   [:span {:class "glyphicon glyphicon-bullhorn", :aria-hidden "true"}]
	   [:span {:class "glyphicon-class"} "glyphicon glyphicon-bullhorn"]" "]
	  [:li " " 
	   [:span {:class "glyphicon glyphicon-bell", :aria-hidden "true"}]
	   [:span {:class "glyphicon-class"} "glyphicon glyphicon-bell"]" "]
	  [:li " " 
	   [:span {:class "glyphicon glyphicon-certificate", :aria-hidden "true"}]
	   [:span {:class "glyphicon-class"} "glyphicon glyphicon-certificate"]" "]
	  [:li " " 
	   [:span {:class "glyphicon glyphicon-thumbs-up", :aria-hidden "true"}]
	   [:span {:class "glyphicon-class"} "glyphicon glyphicon-thumbs-up"]" "]
	  [:li " " 
	   [:span {:class "glyphicon glyphicon-thumbs-down", :aria-hidden "true"}]
	   [:span {:class "glyphicon-class"} "glyphicon glyphicon-thumbs-down"]" "]
	  [:li " " 
	   [:span {:class "glyphicon glyphicon-hand-right", :aria-hidden "true"}]
	   [:span {:class "glyphicon-class"} "glyphicon glyphicon-hand-right"]" "]
	  [:li " " 
	   [:span {:class "glyphicon glyphicon-hand-left", :aria-hidden "true"}]
	   [:span {:class "glyphicon-class"} "glyphicon glyphicon-hand-left"]" "]
	  [:li " " 
	   [:span {:class "glyphicon glyphicon-hand-up", :aria-hidden "true"}]
	   [:span {:class "glyphicon-class"} "glyphicon glyphicon-hand-up"]" "]
	  [:li " " 
	   [:span {:class "glyphicon glyphicon-hand-down", :aria-hidden "true"}]
	   [:span {:class "glyphicon-class"} "glyphicon glyphicon-hand-down"]" "]
	  [:li " " 
	   [:span {:class "glyphicon glyphicon-circle-arrow-right", :aria-hidden "true"}]
	   [:span {:class "glyphicon-class"} "glyphicon glyphicon-circle-arrow-right"]" "]
	  [:li " " 
	   [:span {:class "glyphicon glyphicon-circle-arrow-left", :aria-hidden "true"}]
	   [:span {:class "glyphicon-class"} "glyphicon glyphicon-circle-arrow-left"]" "]
	  [:li " " 
	   [:span {:class "glyphicon glyphicon-circle-arrow-up", :aria-hidden "true"}]
	   [:span {:class "glyphicon-class"} "glyphicon glyphicon-circle-arrow-up"]" "]
	  [:li " " 
	   [:span {:class "glyphicon glyphicon-circle-arrow-down", :aria-hidden "true"}]
	   [:span {:class "glyphicon-class"} "glyphicon glyphicon-circle-arrow-down"]" "]
	  [:li " " 
	   [:span {:class "glyphicon glyphicon-globe", :aria-hidden "true"}]
	   [:span {:class "glyphicon-class"} "glyphicon glyphicon-globe"]" "]
	  [:li " " 
	   [:span {:class "glyphicon glyphicon-wrench", :aria-hidden "true"}]
	   [:span {:class "glyphicon-class"} "glyphicon glyphicon-wrench"]" "]
	  [:li " " 
	   [:span {:class "glyphicon glyphicon-tasks", :aria-hidden "true"}]
	   [:span {:class "glyphicon-class"} "glyphicon glyphicon-tasks"]" "]
	  [:li " " 
	   [:span {:class "glyphicon glyphicon-filter", :aria-hidden "true"}]
	   [:span {:class "glyphicon-class"} "glyphicon glyphicon-filter"]" "]
	  [:li " " 
	   [:span {:class "glyphicon glyphicon-briefcase", :aria-hidden "true"}]
	   [:span {:class "glyphicon-class"} "glyphicon glyphicon-briefcase"]" "]
	  [:li " " 
	   [:span {:class "glyphicon glyphicon-fullscreen", :aria-hidden "true"}]
	   [:span {:class "glyphicon-class"} "glyphicon glyphicon-fullscreen"]" "]
	  [:li " " 
	   [:span {:class "glyphicon glyphicon-dashboard", :aria-hidden "true"}]
	   [:span {:class "glyphicon-class"} "glyphicon glyphicon-dashboard"]" "]
	  [:li " " 
	   [:span {:class "glyphicon glyphicon-paperclip", :aria-hidden "true"}]
	   [:span {:class "glyphicon-class"} "glyphicon glyphicon-paperclip"]" "]
	  [:li " " 
	   [:span {:class "glyphicon glyphicon-heart-empty", :aria-hidden "true"}]
	   [:span {:class "glyphicon-class"} "glyphicon glyphicon-heart-empty"]" "]
	  [:li " " 
	   [:span {:class "glyphicon glyphicon-link", :aria-hidden "true"}]
	   [:span {:class "glyphicon-class"} "glyphicon glyphicon-link"]" "]
	  [:li " " 
	   [:span {:class "glyphicon glyphicon-phone", :aria-hidden "true"}]
	   [:span {:class "glyphicon-class"} "glyphicon glyphicon-phone"]" "]
	  [:li " " 
	   [:span {:class "glyphicon glyphicon-pushpin", :aria-hidden "true"}]
	   [:span {:class "glyphicon-class"} "glyphicon glyphicon-pushpin"]" "]
	  [:li " " 
	   [:span {:class "glyphicon glyphicon-usd", :aria-hidden "true"}]
	   [:span {:class "glyphicon-class"} "glyphicon glyphicon-usd"]" "]
	  [:li " " 
	   [:span {:class "glyphicon glyphicon-gbp", :aria-hidden "true"}]
	   [:span {:class "glyphicon-class"} "glyphicon glyphicon-gbp"]" "]
	  [:li " " 
	   [:span {:class "glyphicon glyphicon-sort", :aria-hidden "true"}]
	   [:span {:class "glyphicon-class"} "glyphicon glyphicon-sort"]" "]
	  [:li " " 
	   [:span {:class "glyphicon glyphicon-sort-by-alphabet", :aria-hidden "true"}]
	   [:span {:class "glyphicon-class"} "glyphicon glyphicon-sort-by-alphabet"]" "]
	  [:li " " 
	   [:span {:class "glyphicon glyphicon-sort-by-alphabet-alt", :aria-hidden "true"}]
	   [:span {:class "glyphicon-class"} "glyphicon glyphicon-sort-by-alphabet-alt"]" "]
	  [:li " " 
	   [:span {:class "glyphicon glyphicon-sort-by-order", :aria-hidden "true"}]
	   [:span {:class "glyphicon-class"} "glyphicon glyphicon-sort-by-order"]" "]
	  [:li " " 
	   [:span {:class "glyphicon glyphicon-sort-by-order-alt", :aria-hidden "true"}]
	   [:span {:class "glyphicon-class"} "glyphicon glyphicon-sort-by-order-alt"]" "]
	  [:li " " 
	   [:span {:class "glyphicon glyphicon-sort-by-attributes", :aria-hidden "true"}]
	   [:span {:class "glyphicon-class"} "glyphicon glyphicon-sort-by-attributes"]" "]
	  [:li " " 
	   [:span {:class "glyphicon glyphicon-sort-by-attributes-alt", :aria-hidden "true"}]
	   [:span {:class "glyphicon-class"} "glyphicon glyphicon-sort-by-attributes-alt"]" "]
	  [:li " " 
	   [:span {:class "glyphicon glyphicon-unchecked", :aria-hidden "true"}]
	   [:span {:class "glyphicon-class"} "glyphicon glyphicon-unchecked"]" "]
	  [:li " " 
	   [:span {:class "glyphicon glyphicon-expand", :aria-hidden "true"}]
	   [:span {:class "glyphicon-class"} "glyphicon glyphicon-expand"]" "]
	  [:li " " 
	   [:span {:class "glyphicon glyphicon-collapse-down", :aria-hidden "true"}]
	   [:span {:class "glyphicon-class"} "glyphicon glyphicon-collapse-down"]" "]
	  [:li " " 
	   [:span {:class "glyphicon glyphicon-collapse-up", :aria-hidden "true"}]
	   [:span {:class "glyphicon-class"} "glyphicon glyphicon-collapse-up"]" "]
	  [:li " " 
	   [:span {:class "glyphicon glyphicon-log-in", :aria-hidden "true"}]
	   [:span {:class "glyphicon-class"} "glyphicon glyphicon-log-in"]" "]
	  [:li " " 
	   [:span {:class "glyphicon glyphicon-flash", :aria-hidden "true"}]
	   [:span {:class "glyphicon-class"} "glyphicon glyphicon-flash"]" "]
	  [:li " " 
	   [:span {:class "glyphicon glyphicon-log-out", :aria-hidden "true"}]
	   [:span {:class "glyphicon-class"} "glyphicon glyphicon-log-out"]" "]
	  [:li " " 
	   [:span {:class "glyphicon glyphicon-new-window", :aria-hidden "true"}]
	   [:span {:class "glyphicon-class"} "glyphicon glyphicon-new-window"]" "]
	  [:li " " 
	   [:span {:class "glyphicon glyphicon-record", :aria-hidden "true"}]
	   [:span {:class "glyphicon-class"} "glyphicon glyphicon-record"]" "]
	  [:li " " 
	   [:span {:class "glyphicon glyphicon-save", :aria-hidden "true"}]
	   [:span {:class "glyphicon-class"} "glyphicon glyphicon-save"]" "]
	  [:li " " 
	   [:span {:class "glyphicon glyphicon-open", :aria-hidden "true"}]
	   [:span {:class "glyphicon-class"} "glyphicon glyphicon-open"]" "]
	  [:li " " 
	   [:span {:class "glyphicon glyphicon-saved", :aria-hidden "true"}]
	   [:span {:class "glyphicon-class"} "glyphicon glyphicon-saved"]" "]
	  [:li " " 
	   [:span {:class "glyphicon glyphicon-import", :aria-hidden "true"}]
	   [:span {:class "glyphicon-class"} "glyphicon glyphicon-import"]" "]
	  [:li " " 
	   [:span {:class "glyphicon glyphicon-export", :aria-hidden "true"}]
	   [:span {:class "glyphicon-class"} "glyphicon glyphicon-export"]" "]
	  [:li " " 
	   [:span {:class "glyphicon glyphicon-send", :aria-hidden "true"}]
	   [:span {:class "glyphicon-class"} "glyphicon glyphicon-send"]" "]
	  [:li " " 
	   [:span {:class "glyphicon glyphicon-floppy-disk", :aria-hidden "true"}]
	   [:span {:class "glyphicon-class"} "glyphicon glyphicon-floppy-disk"]" "]
	  [:li " " 
	   [:span {:class "glyphicon glyphicon-floppy-saved", :aria-hidden "true"}]
	   [:span {:class "glyphicon-class"} "glyphicon glyphicon-floppy-saved"]" "]
	  [:li " " 
	   [:span {:class "glyphicon glyphicon-floppy-remove", :aria-hidden "true"}]
	   [:span {:class "glyphicon-class"} "glyphicon glyphicon-floppy-remove"]" "]
	  [:li " " 
	   [:span {:class "glyphicon glyphicon-floppy-save", :aria-hidden "true"}]
	   [:span {:class "glyphicon-class"} "glyphicon glyphicon-floppy-save"]" "]
	  [:li " " 
	   [:span {:class "glyphicon glyphicon-floppy-open", :aria-hidden "true"}]
	   [:span {:class "glyphicon-class"} "glyphicon glyphicon-floppy-open"]" "]
	  [:li " " 
	   [:span {:class "glyphicon glyphicon-credit-card", :aria-hidden "true"}]
	   [:span {:class "glyphicon-class"} "glyphicon glyphicon-credit-card"]" "]
	  [:li " " 
	   [:span {:class "glyphicon glyphicon-transfer", :aria-hidden "true"}]
	   [:span {:class "glyphicon-class"} "glyphicon glyphicon-transfer"]" "]
	  [:li " " 
	   [:span {:class "glyphicon glyphicon-cutlery", :aria-hidden "true"}]
	   [:span {:class "glyphicon-class"} "glyphicon glyphicon-cutlery"]" "]
	  [:li " " 
	   [:span {:class "glyphicon glyphicon-header", :aria-hidden "true"}]
	   [:span {:class "glyphicon-class"} "glyphicon glyphicon-header"]" "]
	  [:li " " 
	   [:span {:class "glyphicon glyphicon-compressed", :aria-hidden "true"}]
	   [:span {:class "glyphicon-class"} "glyphicon glyphicon-compressed"]" "]
	  [:li " " 
	   [:span {:class "glyphicon glyphicon-earphone", :aria-hidden "true"}]
	   [:span {:class "glyphicon-class"} "glyphicon glyphicon-earphone"]" "]
	  [:li " " 
	   [:span {:class "glyphicon glyphicon-phone-alt", :aria-hidden "true"}]
	   [:span {:class "glyphicon-class"} "glyphicon glyphicon-phone-alt"]" "]
	  [:li " " 
	   [:span {:class "glyphicon glyphicon-tower", :aria-hidden "true"}]
	   [:span {:class "glyphicon-class"} "glyphicon glyphicon-tower"]" "]
	  [:li " " 
	   [:span {:class "glyphicon glyphicon-stats", :aria-hidden "true"}]
	   [:span {:class "glyphicon-class"} "glyphicon glyphicon-stats"]" "]
	  [:li " " 
	   [:span {:class "glyphicon glyphicon-sd-video", :aria-hidden "true"}]
	   [:span {:class "glyphicon-class"} "glyphicon glyphicon-sd-video"]" "]
	  [:li " " 
	   [:span {:class "glyphicon glyphicon-hd-video", :aria-hidden "true"}]
	   [:span {:class "glyphicon-class"} "glyphicon glyphicon-hd-video"]" "]
	  [:li " " 
	   [:span {:class "glyphicon glyphicon-subtitles", :aria-hidden "true"}]
	   [:span {:class "glyphicon-class"} "glyphicon glyphicon-subtitles"]" "]
	  [:li " " 
	   [:span {:class "glyphicon glyphicon-sound-stereo", :aria-hidden "true"}]
	   [:span {:class "glyphicon-class"} "glyphicon glyphicon-sound-stereo"]" "]
	  [:li " " 
	   [:span {:class "glyphicon glyphicon-sound-dolby", :aria-hidden "true"}]
	   [:span {:class "glyphicon-class"} "glyphicon glyphicon-sound-dolby"]" "]
	  [:li " " 
	   [:span {:class "glyphicon glyphicon-sound-5-1", :aria-hidden "true"}]
	   [:span {:class "glyphicon-class"} "glyphicon glyphicon-sound-5-1"]" "]
	  [:li " " 
	   [:span {:class "glyphicon glyphicon-sound-6-1", :aria-hidden "true"}]
	   [:span {:class "glyphicon-class"} "glyphicon glyphicon-sound-6-1"]" "]
	  [:li " " 
	   [:span {:class "glyphicon glyphicon-sound-7-1", :aria-hidden "true"}]
	   [:span {:class "glyphicon-class"} "glyphicon glyphicon-sound-7-1"]" "]
	  [:li " " 
	   [:span {:class "glyphicon glyphicon-copyright-mark", :aria-hidden "true"}]
	   [:span {:class "glyphicon-class"} "glyphicon glyphicon-copyright-mark"]" "]
	  [:li " " 
	   [:span {:class "glyphicon glyphicon-registration-mark", :aria-hidden "true"}]
	   [:span {:class "glyphicon-class"} "glyphicon glyphicon-registration-mark"]" "]
	  [:li " " 
	   [:span {:class "glyphicon glyphicon-cloud-download", :aria-hidden "true"}]
	   [:span {:class "glyphicon-class"} "glyphicon glyphicon-cloud-download"]" "]
	  [:li " " 
	   [:span {:class "glyphicon glyphicon-cloud-upload", :aria-hidden "true"}]
	   [:span {:class "glyphicon-class"} "glyphicon glyphicon-cloud-upload"]" "]
	  [:li " " 
	   [:span {:class "glyphicon glyphicon-tree-conifer", :aria-hidden "true"}]
	   [:span {:class "glyphicon-class"} "glyphicon glyphicon-tree-conifer"]" "]
	  [:li " " 
	   [:span {:class "glyphicon glyphicon-tree-deciduous", :aria-hidden "true"}]
	   [:span {:class "glyphicon-class"} "glyphicon glyphicon-tree-deciduous"]" "]
	  [:li " " 
	   [:span {:class "glyphicon glyphicon-cd", :aria-hidden "true"}]
	   [:span {:class "glyphicon-class"} "glyphicon glyphicon-cd"]" "]
	  [:li " " 
	   [:span {:class "glyphicon glyphicon-save-file", :aria-hidden "true"}]
	   [:span {:class "glyphicon-class"} "glyphicon glyphicon-save-file"]" "]
	  [:li " " 
	   [:span {:class "glyphicon glyphicon-open-file", :aria-hidden "true"}]
	   [:span {:class "glyphicon-class"} "glyphicon glyphicon-open-file"]" "]
	  [:li " " 
	   [:span {:class "glyphicon glyphicon-level-up", :aria-hidden "true"}]
	   [:span {:class "glyphicon-class"} "glyphicon glyphicon-level-up"]" "]
	  [:li " " 
	   [:span {:class "glyphicon glyphicon-copy", :aria-hidden "true"}]
	   [:span {:class "glyphicon-class"} "glyphicon glyphicon-copy"]" "]
	  [:li " " 
	   [:span {:class "glyphicon glyphicon-paste", :aria-hidden "true"}]
	   [:span {:class "glyphicon-class"} "glyphicon glyphicon-paste"]" "]
	  [:li " " 
	   [:span {:class "glyphicon glyphicon-alert", :aria-hidden "true"}]
	   [:span {:class "glyphicon-class"} "glyphicon glyphicon-alert"]" "]
	  [:li " " 
	   [:span {:class "glyphicon glyphicon-equalizer", :aria-hidden "true"}]
	   [:span {:class "glyphicon-class"} "glyphicon glyphicon-equalizer"]" "]
	  [:li " " 
	   [:span {:class "glyphicon glyphicon-king", :aria-hidden "true"}]
	   [:span {:class "glyphicon-class"} "glyphicon glyphicon-king"]" "]
	  [:li " " 
	   [:span {:class "glyphicon glyphicon-queen", :aria-hidden "true"}]
	   [:span {:class "glyphicon-class"} "glyphicon glyphicon-queen"]" "]
	  [:li " " 
	   [:span {:class "glyphicon glyphicon-pawn", :aria-hidden "true"}]
	   [:span {:class "glyphicon-class"} "glyphicon glyphicon-pawn"]" "]
	  [:li " " 
	   [:span {:class "glyphicon glyphicon-bishop", :aria-hidden "true"}]
	   [:span {:class "glyphicon-class"} "glyphicon glyphicon-bishop"]" "]
	  [:li " " 
	   [:span {:class "glyphicon glyphicon-knight", :aria-hidden "true"}]
	   [:span {:class "glyphicon-class"} "glyphicon glyphicon-knight"]" "]
	  [:li " " 
	   [:span {:class "glyphicon glyphicon-baby-formula", :aria-hidden "true"}]
	   [:span {:class "glyphicon-class"} "glyphicon glyphicon-baby-formula"]" "]
	  [:li " " 
	   [:span {:class "glyphicon glyphicon-tent", :aria-hidden "true"}]
	   [:span {:class "glyphicon-class"} "glyphicon glyphicon-tent"]" "]
	  [:li " " 
	   [:span {:class "glyphicon glyphicon-blackboard", :aria-hidden "true"}]
	   [:span {:class "glyphicon-class"} "glyphicon glyphicon-blackboard"]" "]
	  [:li " " 
	   [:span {:class "glyphicon glyphicon-bed", :aria-hidden "true"}]
	   [:span {:class "glyphicon-class"} "glyphicon glyphicon-bed"]" "]
	  [:li " " 
	   [:span {:class "glyphicon glyphicon-apple", :aria-hidden "true"}]
	   [:span {:class "glyphicon-class"} "glyphicon glyphicon-apple"]" "]
	  [:li " " 
	   [:span {:class "glyphicon glyphicon-erase", :aria-hidden "true"}]
	   [:span {:class "glyphicon-class"} "glyphicon glyphicon-erase"]" "]
	  [:li " " 
	   [:span {:class "glyphicon glyphicon-hourglass", :aria-hidden "true"}]
	   [:span {:class "glyphicon-class"} "glyphicon glyphicon-hourglass"]" "]
	  [:li " " 
	   [:span {:class "glyphicon glyphicon-lamp", :aria-hidden "true"}]
	   [:span {:class "glyphicon-class"} "glyphicon glyphicon-lamp"]" "]
	  [:li " " 
	   [:span {:class "glyphicon glyphicon-duplicate", :aria-hidden "true"}]
	   [:span {:class "glyphicon-class"} "glyphicon glyphicon-duplicate"]" "]
	  [:li " " 
	   [:span {:class "glyphicon glyphicon-piggy-bank", :aria-hidden "true"}]
	   [:span {:class "glyphicon-class"} "glyphicon glyphicon-piggy-bank"]" "]
	  [:li " " 
	   [:span {:class "glyphicon glyphicon-scissors", :aria-hidden "true"}]
	   [:span {:class "glyphicon-class"} "glyphicon glyphicon-scissors"]" "]
	  [:li " " 
	   [:span {:class "glyphicon glyphicon-bitcoin", :aria-hidden "true"}]
	   [:span {:class "glyphicon-class"} "glyphicon glyphicon-bitcoin"]" "]
	  [:li " " 
	   [:span {:class "glyphicon glyphicon-btc", :aria-hidden "true"}]
	   [:span {:class "glyphicon-class"} "glyphicon glyphicon-btc"]" "]
	  [:li " " 
	   [:span {:class "glyphicon glyphicon-xbt", :aria-hidden "true"}]
	   [:span {:class "glyphicon-class"} "glyphicon glyphicon-xbt"]" "]
	  [:li " " 
	   [:span {:class "glyphicon glyphicon-yen", :aria-hidden "true"}]
	   [:span {:class "glyphicon-class"} "glyphicon glyphicon-yen"]" "]
	  [:li " " 
	   [:span {:class "glyphicon glyphicon-jpy", :aria-hidden "true"}]
	   [:span {:class "glyphicon-class"} "glyphicon glyphicon-jpy"]" "]
	  [:li " " 
	   [:span {:class "glyphicon glyphicon-ruble", :aria-hidden "true"}]
	   [:span {:class "glyphicon-class"} "glyphicon glyphicon-ruble"]" "]
	  [:li " " 
	   [:span {:class "glyphicon glyphicon-rub", :aria-hidden "true"}]
	   [:span {:class "glyphicon-class"} "glyphicon glyphicon-rub"]" "]
	  [:li " " 
	   [:span {:class "glyphicon glyphicon-scale", :aria-hidden "true"}]
	   [:span {:class "glyphicon-class"} "glyphicon glyphicon-scale"]" "]
	  [:li " " 
	   [:span {:class "glyphicon glyphicon-ice-lolly", :aria-hidden "true"}]
	   [:span {:class "glyphicon-class"} "glyphicon glyphicon-ice-lolly"]" "]
	  [:li " " 
	   [:span {:class "glyphicon glyphicon-ice-lolly-tasted", :aria-hidden "true"}]
	   [:span {:class "glyphicon-class"} "glyphicon glyphicon-ice-lolly-tasted"]" "]
	  [:li " " 
	   [:span {:class "glyphicon glyphicon-education", :aria-hidden "true"}]
	   [:span {:class "glyphicon-class"} "glyphicon glyphicon-education"]" "]
	  [:li " " 
	   [:span {:class "glyphicon glyphicon-option-horizontal", :aria-hidden "true"}]
	   [:span {:class "glyphicon-class"} "glyphicon glyphicon-option-horizontal"]" "]
	  [:li " " 
	   [:span {:class "glyphicon glyphicon-option-vertical", :aria-hidden "true"}]
	   [:span {:class "glyphicon-class"} "glyphicon glyphicon-option-vertical"]" "]
	  [:li " " 
	   [:span {:class "glyphicon glyphicon-menu-hamburger", :aria-hidden "true"}]
	   [:span {:class "glyphicon-class"} "glyphicon glyphicon-menu-hamburger"]" "]
	  [:li " " 
	   [:span {:class "glyphicon glyphicon-modal-window", :aria-hidden "true"}]
	   [:span {:class "glyphicon-class"} "glyphicon glyphicon-modal-window"]" "]
	  [:li " " 
	   [:span {:class "glyphicon glyphicon-oil", :aria-hidden "true"}]
	   [:span {:class "glyphicon-class"} "glyphicon glyphicon-oil"]" "]
	  [:li " " 
	   [:span {:class "glyphicon glyphicon-grain", :aria-hidden "true"}]
	   [:span {:class "glyphicon-class"} "glyphicon glyphicon-grain"]" "]
	  [:li " " 
	   [:span {:class "glyphicon glyphicon-sunglasses", :aria-hidden "true"}]
	   [:span {:class "glyphicon-class"} "glyphicon glyphicon-sunglasses"]" "]
	  [:li " " 
	   [:span {:class "glyphicon glyphicon-text-size", :aria-hidden "true"}]
	   [:span {:class "glyphicon-class"} "glyphicon glyphicon-text-size"]" "]
	  [:li " " 
	   [:span {:class "glyphicon glyphicon-text-color", :aria-hidden "true"}]
	   [:span {:class "glyphicon-class"} "glyphicon glyphicon-text-color"]" "]
	  [:li " " 
	   [:span {:class "glyphicon glyphicon-text-background", :aria-hidden "true"}]
	   [:span {:class "glyphicon-class"} "glyphicon glyphicon-text-background"]" "]
	  [:li " " 
	   [:span {:class "glyphicon glyphicon-object-align-top", :aria-hidden "true"}]
	   [:span {:class "glyphicon-class"} "glyphicon glyphicon-object-align-top"]" "]
	  [:li " " 
	   [:span {:class "glyphicon glyphicon-object-align-bottom", :aria-hidden "true"}]
	   [:span {:class "glyphicon-class"} "glyphicon glyphicon-object-align-bottom"]" "]
	  [:li " " 
	   [:span {:class "glyphicon glyphicon-object-align-horizontal", :aria-hidden "true"}]
	   [:span {:class "glyphicon-class"} "glyphicon glyphicon-object-align-horizontal"]" "]
	  [:li " " 
	   [:span {:class "glyphicon glyphicon-object-align-left", :aria-hidden "true"}]
	   [:span {:class "glyphicon-class"} "glyphicon glyphicon-object-align-left"]" "]
	  [:li " " 
	   [:span {:class "glyphicon glyphicon-object-align-vertical", :aria-hidden "true"}]
	   [:span {:class "glyphicon-class"} "glyphicon glyphicon-object-align-vertical"]" "]
	  [:li " " 
	   [:span {:class "glyphicon glyphicon-object-align-right", :aria-hidden "true"}]
	   [:span {:class "glyphicon-class"} "glyphicon glyphicon-object-align-right"]" "]
	  [:li " " 
	   [:span {:class "glyphicon glyphicon-triangle-right", :aria-hidden "true"}]
	   [:span {:class "glyphicon-class"} "glyphicon glyphicon-triangle-right"]" "]
	  [:li " " 
	   [:span {:class "glyphicon glyphicon-triangle-left", :aria-hidden "true"}]
	   [:span {:class "glyphicon-class"} "glyphicon glyphicon-triangle-left"]" "]
	  [:li " " 
	   [:span {:class "glyphicon glyphicon-triangle-bottom", :aria-hidden "true"}]
	   [:span {:class "glyphicon-class"} "glyphicon glyphicon-triangle-bottom"]" "]
	  [:li " " 
	   [:span {:class "glyphicon glyphicon-triangle-top", :aria-hidden "true"}]
	   [:span {:class "glyphicon-class"} "glyphicon glyphicon-triangle-top"]" "]
	  [:li " " 
	   [:span {:class "glyphicon glyphicon-console", :aria-hidden "true"}]
	   [:span {:class "glyphicon-class"} "glyphicon glyphicon-console"]" "]
	  [:li " " 
	   [:span {:class "glyphicon glyphicon-superscript", :aria-hidden "true"}]
	   [:span {:class "glyphicon-class"} "glyphicon glyphicon-superscript"]" "]
	  [:li " " 
	   [:span {:class "glyphicon glyphicon-subscript", :aria-hidden "true"}]
	   [:span {:class "glyphicon-class"} "glyphicon glyphicon-subscript"]" "]
	  [:li " " 
	   [:span {:class "glyphicon glyphicon-menu-left", :aria-hidden "true"}]
	   [:span {:class "glyphicon-class"} "glyphicon glyphicon-menu-left"]" "]
	  [:li " " 
	   [:span {:class "glyphicon glyphicon-menu-right", :aria-hidden "true"}]
	   [:span {:class "glyphicon-class"} "glyphicon glyphicon-menu-right"]" "]
	  [:li " " 
	   [:span {:class "glyphicon glyphicon-menu-down", :aria-hidden "true"}]
	   [:span {:class "glyphicon-class"} "glyphicon glyphicon-menu-down"]" "]
	  [:li " " 
	   [:span {:class "glyphicon glyphicon-menu-up", :aria-hidden "true"}]
	   [:span {:class "glyphicon-class"} "glyphicon glyphicon-menu-up"]" "]" "]" "]]

  )

