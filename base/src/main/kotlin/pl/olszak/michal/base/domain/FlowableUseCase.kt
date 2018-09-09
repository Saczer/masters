package pl.olszak.michal.base.domain

import io.reactivex.Flowable
import pl.olszak.michal.base.concurrent.MastersSchedulers

/**
 * Use when the stream is generated faster than it can be consumed
 */
abstract class FlowableUseCase<T, in Params> constructor(private val schedulers: MastersSchedulers)
    : UseCase() {

    abstract fun buildUseCase(params: Params? = null): Flowable<T>

    fun execute(onNext: (T) -> Unit,
                params: Params? = null) {
        val flowable = buildUseCase(params)
                .subscribeOn(schedulers.io())
                .observeOn(schedulers.ui())
        addDisposable(flowable.subscribe(onNext))
    }
}