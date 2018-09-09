package pl.olszak.michal.base.domain

import io.reactivex.Single
import io.reactivex.observers.DisposableSingleObserver
import pl.olszak.michal.base.concurrent.MastersSchedulers

abstract class SingleUseCase<T, in Params> constructor(private val schedulers: MastersSchedulers)
    : UseCase() {

    abstract fun buildUseCase(params: Params? = null): Single<T>

    fun execute(singleObserver: DisposableSingleObserver<T>,
                params: Params? = null) {
        val single = buildUseCase(params)
                .subscribeOn(schedulers.io())
                .observeOn(schedulers.ui())

        addDisposable(single.subscribeWith(singleObserver))
    }
}