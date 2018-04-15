package pl.olszak.michal.domain

import io.reactivex.Observable
import io.reactivex.observers.DisposableObserver
import pl.olszak.michal.base.concurrent.MastersSchedulers

abstract class ObservableUseCase<T, in Params> constructor(private val schedulers: MastersSchedulers) : UseCase() {

    abstract fun buildUseCase(params: Params? = null): Observable<T>

    fun execute(disposableObserver: DisposableObserver<T>, params: Params? = null) {

        val observable = buildUseCase(params)
                .subscribeOn(schedulers.io())
                .observeOn(schedulers.ui())
        addDisposable(observable.subscribeWith(disposableObserver))
    }

}