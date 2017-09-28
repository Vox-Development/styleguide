(ns vox-digital-syle.db)

(def default-db
  {:name "Vox Styleguide v1"
   :logo-url "https://www.vox.co.za/wp-content/themes/vox/images/logo.png"
   :active-section (let [anchor (clojure.string/replace js/window.location.hash #"^\#" "")]
                     (if (#{"introduction"
                            "colors"
                            "typography"} anchor) anchor
                         "introduction"))})
