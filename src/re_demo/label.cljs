(ns re-demo.label
  (:require [re-com.core   :refer [h-box v-box box gap line label]]
            [re-com.text   :refer [label-args-desc]]
            [re-demo.utils :refer [panel-title component-title args-table github-hyperlink status-text]]))


(defn label-demo
  []
  [v-box
   :size     "auto"
   :gap      "10px"
   :children [[panel-title [:span "[label ... ]"
                            [github-hyperlink "Component Source" "src/re_com/text.cljs"]
                            [github-hyperlink "Page Source"      "src/re_demo/label.cljs"]]]
              [h-box
               :gap      "50px"
               :children [[v-box
                           :gap      "10px"
                           :width    "450px"
                           :children [[component-title "Notes"]
                                      [status-text "Alpha"]
                                      [:span "The label is used to..."]
                                      [args-table label-args-desc]]]
                          [v-box
                           :gap      "10px"
                           :children [[component-title "Demo"]
                                      [v-box
                                       :children [[label :label "This is a label"]]]]]]]]])


(defn panel   ;; Only required for Reagent to update panel2 when figwheel pushes changes to the browser
  []
  [label-demo])
