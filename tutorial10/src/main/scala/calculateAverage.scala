object calculateAverage {

  def convert (temp: Double): Double = {
    ( ( temp * 9 ) / 5 ) + 32
  }
  def calcAverage ( temperatures : Array[Double] ): Double = {
    val convertedTemps = temperatures.map(convert)
    val sum = convertedTemps.reduce( (x,y) => x + y )
    sum/convertedTemps.length
  }

  def main(args: Array[String]): Unit = {
    val Temps : Array[Double] = Array(0,10,20,30)
    println( "Average Fahrenheit Temperature : " + calcAverage(Temps) )
  }

}
