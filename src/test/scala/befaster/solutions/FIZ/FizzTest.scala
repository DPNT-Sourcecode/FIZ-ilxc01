package befaster.solutions.FIZ

import org.scalatest.{FlatSpec, Matchers}

class FizzTest  extends FlatSpec with Matchers {
  it should "return fizz (fizzBuzz1)" in {
    FizzBuzz.fizzBuzz1(6) shouldBe "fizz"
  }

  it should "return buzz (fizzBuzz1)" in {
    FizzBuzz.fizzBuzz1(10) shouldBe "buzz"
  }

  it should "return fizz buzz (fizzBuzz1)" in {
    FizzBuzz.fizzBuzz1(15) shouldBe "fizz buzz"
  }

  it should "return fizz (fizzBuzz2 div by 3)" in {
    FizzBuzz.fizzBuzz2(6) shouldBe "fizz"
  }

  it should "return fizz (fizzBuzz2 3 in number)" in {
    FizzBuzz.fizzBuzz2(13) shouldBe "fizz"
  }

  it should "return buzz (fizzBuzz2 div by 5)" in {
    FizzBuzz.fizzBuzz2(10) shouldBe "buzz"
  }

  it should "return buzz (fizzBuzz2 5 in number)" in {
    FizzBuzz.fizzBuzz2(51) shouldBe "buzz"
  }

  it should "return fizz buzz (fizzBuzz2 div by 3 and by 5)" in {
    FizzBuzz.fizzBuzz2(15) shouldBe "fizz buzz"
  }

  it should "return fizz buzz (fizzBuzz2 3 and 5 in number)" in { //number is not div by 5, not div by 3 but has a 3 and a 5 in it
    FizzBuzz.fizzBuzz2(53) shouldBe "fizz buzz"
  }

  it should "return fizz buzz (fizzBuzz2 div by 5 and 3 in number)" in {   //number is div by 5, not div by 3 but has a 3 in it
    FizzBuzz.fizzBuzz2(35) shouldBe "fizz buzz"
  }

  it should "return fizz buzz (fizzBuzz2 div by 3 and 5 in number)" in {   //number is div by 3, not div by 5 and has a 5 in it
    FizzBuzz.fizzBuzz2(153) shouldBe "fizz buzz"
  }
}


