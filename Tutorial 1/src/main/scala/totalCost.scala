object totalCost {
  def tot_cost(books: Int): Double = {
    val shipping_cost = if(books >= 50) (50 * 3) + (books - 50) * 0.75 else books * 3
    val tot_cost = (24.95 * 60 * books)/100 + shipping_cost
    tot_cost
  }

  def main(args: Array[String]): Unit = {
    println("The total wholesale cost for 60 books is Rs." + tot_cost(60))
  }
}
