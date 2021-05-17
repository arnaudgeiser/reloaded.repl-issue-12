(ns reloaded.repl-issue-12
  (:require [com.stuartsierra.component :as component]
            [reloaded.repl :refer [set-init! reset go]]))

(defn new-system []
  (prn "Creating new system")
  (component/system-map))

(comment
  (set-init! #(new-system))
  (go) ;; ==> Creating new system

  ;; Changing new-system definition without evaluating it in a REPL
  ;; (defn new-system []
  ;;  (prn "Recreating new system")
  ;;  (component/system-map))
  (reset)) ;; ==> Creating new system
