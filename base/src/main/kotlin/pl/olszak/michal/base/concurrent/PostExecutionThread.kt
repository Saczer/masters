package pl.olszak.michal.base.concurrent

import io.reactivex.Scheduler

interface PostExecutionThread {

    val scheduler: Scheduler

}