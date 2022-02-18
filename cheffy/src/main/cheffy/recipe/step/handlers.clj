(ns cheffy.recipe.step.handlers
  (:require [cheffy.recipe.db :as recipe-db]
            [cheffy.responses :as responses]
            [ring.util.response :as rr])
  (:import (java.util UUID)))


(defn create!
  [{:keys [env parameters] :as _request}]
  (let [recipe-id (-> parameters :path :recipe-id)
        step (:body parameters)
        step-id (str (UUID/randomUUID))]))
    ;; FIXME: recipe-db/transact-step


(defn update!
  [{:keys [env parameters] :as _request}]
  (let [step (:body parameters)
        recipe-id (-> parameters :path :recipe-id)]))
    ;; FIXME: recipe-db/transact-step


(defn delete!
  [{:keys [env parameters] :as _request}]
  (let [step (:body parameters)]))
    ;; FIXME: recipe-db/retract-step
