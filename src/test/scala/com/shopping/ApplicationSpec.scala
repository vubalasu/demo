package com.shopping

import org.scalatest.{BeforeAndAfterAll, Matchers, WordSpecLike}
import com.shopping.Pricing._

/**
  * Created by varub on 08/08/2017.
  */
class ApplicationSpec extends WordSpecLike with Matchers with BeforeAndAfterAll  {


  "Apple" must {

    "service price one apple" in {
      totalPrice("Apple") shouldBe  0.60
    }
    "service price two apple" in {
      totalPrice("Apple,Apple") shouldBe  0.60
    }
    "service price threee apple" in {
      totalPrice("Apple,Apple,Apple") shouldBe  1.20
    }
  }

  "Orange" must {
    "service price one apple" in {
      totalPrice("Orange") shouldBe  0.25
    }
    "service price two Orange" in {
      totalPrice("Orange,Orange") shouldBe  0.50
    }
    "service price threee apple" in {
      totalPrice("Orange,Orange,Orange") shouldBe  0.50
    }
  }

  "Apple and Orange" must {
    "service price one apple" in {
      totalPrice("Apple,Orange") shouldBe  0.85
    }
    "service price two Orange" in {
      totalPrice("Apple,Apple,Orange,Orange") shouldBe  1.10
    }
    "service price threee apple" in {
      totalPrice("Apple,Apple,Orange,Orange,Orange") shouldBe  1.10
    }
  }

}