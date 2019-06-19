package befaster.solutions.FIZ

object FizzBuzz {
  def fizzBuzz1(number: Int): String = {
    val divBy3 = number % 3
    val divBy5 = number % 5

    if (divBy3 == 0 && divBy5 == 0)
      "fizz buzz"
    else if (divBy3 == 0)
      "fizz"
    else if (divBy5 == 0)
      "buzz"
    else
      number.toString
  }

  def fizzBuzz2(number: Int): String = {
    val divBy3 = number % 3
    val divBy5 = number % 5

    val numStr = number.toString
    val hasA3 = numStr.contains('3')
    val hasA5 = numStr.contains('5')

    if ( (divBy3 == 0 || hasA3) && (divBy5 == 0 || hasA5))
     "fizz buzz"
    else if (divBy3 == 0 || hasA3)
      "fizz"
    else if (divBy5 == 0 || hasA5)
      "buzz"
    else
      numStr
  }

  val fizzBuzz = fizzBuzz2 _


}
