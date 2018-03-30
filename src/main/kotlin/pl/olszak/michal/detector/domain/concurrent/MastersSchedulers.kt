package pl.olszak.michal.detector.domain.concurrent

import io.reactivex.Scheduler

interface MastersSchedulers {

    fun io() : Scheduler

    fun ui() : Scheduler

}