package modules

import javax.inject.{Inject, Singleton}
import play.api.inject.ApplicationLifecycle
import scalikejdbc.config.DBs
import scala.concurrent.Future
import scala.concurrent.ExecutionContext.Implicits.global

@Singleton
class ApplicationStart @Inject()(lifecycle: ApplicationLifecycle) {
  DBs.setupAll()

  lifecycle.addStopHook { () =>
    Future(DBs.closeAll())
  }
}
