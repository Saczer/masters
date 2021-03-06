package pl.olszak.michal.base.domain.concurrent

import io.reactivex.Scheduler
import io.reactivex.rxjavafx.schedulers.JavaFxScheduler
import io.reactivex.schedulers.Schedulers
import pl.olszak.michal.base.concurrent.MastersSchedulers
import javax.inject.Inject
import javax.inject.Singleton

@Singleton
class MastersSchedulersImp @Inject constructor() : MastersSchedulers {

    override fun io(): Scheduler = Schedulers.io()

    override fun ui(): Scheduler = JavaFxScheduler.platform()
}