object stringFormatting {
  def toUpper(input : String) : String = {
    return input.toUpperCase();
  }

  def toLower(input : String) : String = {
    return input.toLowerCase();
  }

  def formatNames(name:String , formatter:String => String) : String = {
    formatter(name);
  }

  def main(args: Array[String]) : Unit = {
    var name1 = "Benny"
    var name2 = "Niroshan"
    var name3 = "Saman"
    var name4 = "Kumara"

    println(formatNames((name1),(toUpper)));
    println(formatNames((name2.take(2)),(toUpper)) + formatNames((name2.drop(2)) , (toLower)));
    println(formatNames((name3),(toLower)));
    println(name4.take(5) + formatNames((name4.drop(5)),(toUpper)))
  }
}