(ns euler.p02)

(defn fibs
  ([] (fibs 1 1 [1]))
  ([a b acc]
   (let [c (+ a b)]
     (if (>= c 4000000)
       acc
       (recur b c (conj acc c))))))

(defn solve
  "Find the sum of all even Fibonacci numbers below four million."
  []
  (reduce + (filter even? (fibs))))
