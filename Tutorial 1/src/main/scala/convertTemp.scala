object convertTemp {
  def convert(celcius: Double): Double = (celcius*1.8) + 32.0

  def main(args: Array[String]): Unit = {
    val far = convert(35)
    println("35C in Farenheit is " + far + "F")
  }
}
