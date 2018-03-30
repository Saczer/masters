package pl.olszak.michal.detector.domain.concurrent

import io.reactivex.Scheduler
import io.reactivex.schedulers.Schedulers
import javax.inject.Inject

class MastersSchedulersImp @Inject constructor(
        private val postExecutionThread: PostExecutionThread,
        private val threadExecutor: ThreadExecutor) : MastersSchedulers {

    override fun io(): Scheduler = Schedulers.from(threadExecutor)

    override fun ui(): Scheduler = postExecutionThread.scheduler

}