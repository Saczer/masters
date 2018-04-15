package pl.olszak.michal.domain.concurrent

import io.reactivex.Scheduler
import io.reactivex.schedulers.Schedulers
import pl.olszak.michal.base.concurrent.MastersSchedulers
import pl.olszak.michal.base.concurrent.PostExecutionThread
import pl.olszak.michal.base.concurrent.ThreadExecutor
import javax.inject.Inject

class MastersSchedulersImp @Inject constructor(
        private val postExecutionThread: PostExecutionThread,
        private val threadExecutor: ThreadExecutor) : MastersSchedulers {

    override fun io(): Scheduler = Schedulers.from(threadExecutor)

    override fun ui(): Scheduler = postExecutionThread.scheduler

}