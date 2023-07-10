object findPrime {
  def prime(n: Int, divisor: Int = 2): Boolean = {
    if (n <= 1){
      false
    }
    else if (n == divisor){
      true
    }
    else if (n % divisor == 0){
      false
    }
    else{
      prime(n, divisor + 1)
    }
  }

  def main(args : Array[String]) : Unit = {
    println(prime(2))
    println(prime(8))
  }
}
