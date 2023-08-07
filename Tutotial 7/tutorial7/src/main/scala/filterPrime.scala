object filterPrime {
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
  def filterPrime(numbers: List[Int]): List[Int] = {
    numbers.filter(number => prime(number))
  }

  def main(args : Array[String]) : Unit = {
    val inputList = List(1, 2, 3, 4, 5, 6, 7, 8, 9, 10)
    val outputList = filterPrime(inputList)
    println(outputList)
  }
}
