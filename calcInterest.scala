object calcInterest {
  def interest(amount : Int): Double = {
    if(amount <= 20000){
      return (amount/100)*2
    }
    else if(amount <= 200000){
      return (amount/100)*4
    }
    else if(amount <= 2000000){
      return (amount/100)*3.5
    }
    else{
      return (amount/100)*6.5
    }
  }

  def main(args : Array[String]) : Unit = {
    println("Your interest amount for the year is " + interest(25000))
  }
}
