package serious_lunch.domain.account

sealed trait AccountLoaderError

case class UnexpectedError(cause: Throwable) extends AccountLoaderError

case class AccountNotFound(message: String) extends AccountLoaderError
