object patternMatching {
  def patternMatch(number : Int) : String = number match{
    case num if num <= 0 => "Negative/Zero"
    case num if num%2 == 0 => "Even Number"
    case num if num%2 == 1 => "Odd Number"
  }

  def main(args : Array[String]) : Unit = {
    println(patternMatch(args(0).toInt))
  }
}
