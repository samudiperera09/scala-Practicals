object primeSequence {
  def prime(n: Int, divisor: Int = 2): Boolean = {
    if (n <= 1) {
      false
    }
    else if (n == divisor) {
      true
    }
    else if (n % divisor == 0) {
      false
    }
    else {
      prime(n, divisor + 1)
    }
  }

  def primeSeq(n: Int, current: Int = 2): Unit = {
    if (current <= n) {
      if (prime(current)) {
        print(current + " ")
      }
      primeSeq(n, current + 1)
    }
  }

  def main(args : Array[String]) : Unit = {
    primeSeq(10)
  }
}
