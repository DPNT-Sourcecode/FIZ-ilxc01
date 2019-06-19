package befaster.solutions.FIZ

import org.scalatest.{FlatSpec, Matchers}

class FizzTest  extends FlatSpec with Matchers {
  it should "return fizz" in {
    FizzBuzz.fizzBuzz(6) shouldBe "fizz"
  }

  it should "return buzz" in {
    FizzBuzz.fizzBuzz(10) shouldBe "buzz"
  }

  it should "return fizz buzz" in {
    FizzBuzz.fizzBuzz(15) shouldBe "fizz buzz"
  }
}


