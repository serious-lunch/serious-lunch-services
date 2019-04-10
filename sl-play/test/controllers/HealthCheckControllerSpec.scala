package controllers

import org.scalatestplus.play.PlaySpec
import org.scalatestplus.play.guice.GuiceOneAppPerSuite
import play.api.test.FakeRequest
import play.api.test.Helpers._

class HealthCheckControllerSpec extends PlaySpec with GuiceOneAppPerSuite {

  "An index action" should {
    "return 200" in {
      val Some(health) = route(
        app,
        FakeRequest(
          method = GET,
          path = "/healthcheck",
        ))
      status(health) mustEqual OK
      contentAsString(health) mustEqual "success"
    }
  }

}
