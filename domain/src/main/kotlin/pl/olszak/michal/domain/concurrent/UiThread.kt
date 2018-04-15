package pl.olszak.michal.domain.concurrent

import io.reactivex.Scheduler
import io.reactivex.rxjavafx.schedulers.JavaFxScheduler
import pl.olszak.michal.base.concurrent.PostExecutionThread
import javax.inject.Inject

class UiThread @Inject constructor() : PostExecutionThread {

    override val scheduler: Scheduler
        get() = JavaFxScheduler.platform()

}