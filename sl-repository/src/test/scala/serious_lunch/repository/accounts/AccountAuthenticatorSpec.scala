package serious_lunch.repository.accounts

import org.scalatest.{FunSpec, Matchers}

class AccountAuthenticatorSpec extends FunSpec with Matchers {

  describe("because of the correct password") {
    it("return true") {}
  }

  describe("because of the typo password") {
    it("return false") {}
  }
}
