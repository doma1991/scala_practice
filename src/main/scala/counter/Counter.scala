package counter

class Counter(val count: Int) {
  def dec(amount: Int = 1) = new Counter(count - amount)
  def inc(amount: Int = 1) = new Counter(count + amount)
  def adjust(adder: Adder) =
    new Counter(adder.add(count))
}