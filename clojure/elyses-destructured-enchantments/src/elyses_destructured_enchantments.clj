(ns elyses-destructured-enchantments)

(defn first-card
  "Returns the first card from deck."
  [deck]
  (let [[firstCard] deck]
    firstCard)
  )

(defn second-card
  "Returns the second card from deck."
  [deck]
  (let [[_ secondCard] deck]
    secondCard)
)

(defn swap-top-two-cards
  "Returns the deck with first two items reversed."
  [deck]
  (let [[first second & rest] deck]
    (vec (conj rest first second)))
  )

(defn discard-top-card
  "Returns a sequence containing the first card and
   a sequence of the remaining cards in the deck."
  [deck]
  (let [[first & rest] deck]
    [first rest])
  )

(def face-cards
  ["jack" "queen" "king"])

(defn insert-face-cards
  "Returns the deck with face cards between its head and tail."
  [deck]
  (let [[first & tail] deck]
    (if (nil? first) face-cards (concat [first] face-cards tail))
    )
)
