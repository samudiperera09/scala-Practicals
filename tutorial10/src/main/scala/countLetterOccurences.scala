object countLetterOccurences {
  def countLetters( words : Array[String]) : Int =  {
    val countedLetters = words.map( _.length)
    val sum = countedLetters.reduce( (x,y) => x + y )
    sum
  }

  def main (args : Array[String]) : Unit = {
    val Words : Array[String] = Array("apple" , "banana", "cherry", "date")
    println("Total count of letter occurrences : " + countLetters(Words))
  }
}
