package pl.olszak.michal.detector.di.module

import dagger.BindsInstance
import dagger.Module
import pl.olszak.michal.detector.domain.concurrent.*
import javax.inject.Singleton

@Module
abstract class ConcurrentModule {

    @BindsInstance
    @Singleton
    abstract fun bindPostExecutionThread(uiThread: UiThread) : PostExecutionThread

    @BindsInstance
    @Singleton
    abstract fun bindThreadExecutor(backgroundExecutor: BackgroundExecutor) : ThreadExecutor

    @BindsInstance
    @Singleton
    abstract fun bindMastersSchedulers(mastersSchedulersImp: MastersSchedulersImp) : MastersSchedulers

}