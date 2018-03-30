package pl.olszak.michal.detector.domain.concurrent

import io.reactivex.Scheduler
import io.reactivex.rxjavafx.schedulers.JavaFxScheduler
import javax.inject.Inject

class UiThread @Inject constructor() : PostExecutionThread {

    override val scheduler: Scheduler
        get() = JavaFxScheduler.platform()

}