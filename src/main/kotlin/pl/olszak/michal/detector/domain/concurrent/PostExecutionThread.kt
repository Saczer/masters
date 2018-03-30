package pl.olszak.michal.detector.domain.concurrent

import io.reactivex.Scheduler

interface PostExecutionThread {

    val scheduler: Scheduler

}