package pl.olszak.michal.base.concurrent

import io.reactivex.Scheduler

interface MastersSchedulers {

    fun io() : Scheduler

    fun ui() : Scheduler

}