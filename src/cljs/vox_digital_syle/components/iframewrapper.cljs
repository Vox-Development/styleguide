(ns vox-digital-syle.components.iframewrapper
  (:require [vox-digital-syle.components.introduction :as intro]
            [vox-digital-syle.components.colors :as colors]
            [vox-digital-syle.components.typography :as typo]
            [vox-digital-syle.components.buttons :as buttons]
            [vox-digital-syle.components.lists :as lists]
            [vox-digital-syle.components.forms :as forms]
            [vox-digital-syle.components.tables :as tables]
            [vox-digital-syle.components.icons :as icons]
            [vox-digital-syle.components.alerts :as alerts]
            [vox-digital-syle.components.panels :as panels]
            [vox-digital-syle.components.cards :as cards]
            [vox-digital-syle.components.images :as images]
            [vox-digital-syle.components.grid :as grid]
            ))

(defn wrapper []
    [:main.container
        [:div {:class "huge-frame-content"}
            [intro/introduction]
        	[colors/colors]
        	[typo/typography]
            [buttons/buttons]
            [lists/lists]
            [forms/forms]
            [tables/tables]
            [alerts/alerts]
            [panels/panels]
            [cards/cards]
            [images/images]
            [grid/grid]
            [icons/icons]]])

