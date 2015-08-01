(ns euler.p01)

(defn solve
  "Find the sum of all the multiples of 3 or 5 below 1000."
  []
  (let [nums (into [] (range 1 1000))]
    (reduce 
      +
      (filter
        (fn [n] (or (= (rem n 3) 0) (= (rem n 5) 0)))
        nums))))
