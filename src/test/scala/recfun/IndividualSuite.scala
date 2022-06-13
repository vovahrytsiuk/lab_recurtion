package recfun

import org.junit.runner.RunWith
import org.scalatest.funsuite.AnyFunSuite
import org.scalatestplus.junit.JUnitRunner

@RunWith(classOf[JUnitRunner])
class IndividualSuite extends AnyFunSuite {
  import Main.individual
    test("individual: k=9 i=1 n=4 x=4") {
      assert(individual()(4) === -1)
  }

  test("individual: k=9 i=1 n=4 x=0") {
    assert(individual()(0) === 0)
  }

  test("individual: k=9 i=1 n=4 x=9") {
    assert(individual()(9) === 46301472)
  }

  test("individual: k=9 i=1 n=5 x=5")
  {
    assert(individual(n=5)(5) === -1)
  }
}
