package befaster.solutions.FIZ

object FizzBuzz {
  def fizzBuzz(number: Int): String = {
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
}
