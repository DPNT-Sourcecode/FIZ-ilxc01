package befaster.solutions.HLO

import org.scalatest.{FlatSpec, Matchers}

class HelloTest extends FlatSpec with Matchers {
  it should "return a hello message" in {
    Hello.hello("stranger") shouldBe "Hello, World!"
  }
}


