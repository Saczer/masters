package pl.olszak.michal.detector.domain

import io.reactivex.Flowable
import io.reactivex.subscribers.DisposableSubscriber
import pl.olszak.michal.detector.domain.concurrent.MastersSchedulers

/**
 * Use when the stream is generated faster than it can be consumed
 * todo: increase buffer/backpressure
 */
abstract class FlowableUseCase<T, in Params> constructor(private val schedulers: MastersSchedulers) : UseCase() {

    abstract fun buildUseCase(params: Params? = null): Flowable<T>

    fun execute(flowableSubscriber: DisposableSubscriber<T>,
                params: Params? = null) {

        val flowable = buildUseCase(params)
                .subscribeOn(schedulers.io())
                .observeOn(schedulers.ui())
        addDisposable(flowable.subscribeWith(flowableSubscriber))
    }

}