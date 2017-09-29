(ns vox-digital-syle.db)

(def default-db
  {:img-placeholder "data:image/svg+xml;base64,PD94bWwgdmVyc2lvbj0iMS4wIiBlbmNvZGluZz0iVVRGLTgiIHN0YW5kYWxvbmU9InllcyI/
                    PjxzdmcgeG1sbnM9Imh0dHA6Ly93d3cudzMub3JnLzIwMDAvc3ZnIiB3aWR0aD0iMTQwIiBoZWlnaHQ9IjE0MCIgdmlld0JveD
                    0iMCAwIDE0MCAxNDAiIHByZXNlcnZlQXNwZWN0UmF0aW89Im5vbmUiPjwhLS0KU291cmNlIFVSTDogaG9sZGVyLmpzLzE0MHgx
                    NDAKQ3JlYXRlZCB3aXRoIEhvbGRlci5qcyAyLjYuMC4KTGVhcm4gbW9yZSBhdCBodHRwOi8vaG9sZGVyanMuY29tCihjKSAyMD
                    EyLTIwMTUgSXZhbiBNYWxvcGluc2t5IC0gaHR0cDovL2ltc2t5LmNvCi0tPjxkZWZzPjxzdHlsZSB0eXBlPSJ0ZXh0L2NzcyI+
                    PCFbQ0RBVEFbI2hvbGRlcl8xNWViZDE5YjM3NCB0ZXh0IHsgZmlsbDojQUFBQUFBO2ZvbnQtd2VpZ2h0OmJvbGQ7Zm9udC1mYW
                    1pbHk6QXJpYWwsIEhlbHZldGljYSwgT3BlbiBTYW5zLCBzYW5zLXNlcmlmLCBtb25vc3BhY2U7Zm9udC1zaXplOjEwcHQgfSBd
                    XT48L3N0eWxlPjwvZGVmcz48ZyBpZD0iaG9sZGVyXzE1ZWJkMTliMzc0Ij48cmVjdCB3aWR0aD0iMTQwIiBoZWlnaHQ9IjE0MC
                    IgZmlsbD0iI0VFRUVFRSIvPjxnPjx0ZXh0IHg9IjQ0LjA1NDY4NzUiIHk9Ijc0LjUiPjE0MHgxNDA8L3RleHQ+PC9nPjwvZz48L3N2Zz4="
   :base-url "https://www.vox.co.za"
   :name "Vox Styleguide v1"
   :logo-url "https://www.vox.co.za/wp-content/themes/vox/images/logo.png"
   :active-section (let [anchor (clojure.string/replace js/window.location.hash #"^\#" "")]
                     (if (#{"introduction"
                            "colors"
                            "typography"} anchor) anchor
                         "introduction"))})
