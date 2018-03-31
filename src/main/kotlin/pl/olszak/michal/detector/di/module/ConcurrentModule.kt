package pl.olszak.michal.detector.di.module

import dagger.Binds
import dagger.BindsInstance
import dagger.Module
import pl.olszak.michal.detector.domain.concurrent.*
import javax.inject.Singleton

@Module
abstract class ConcurrentModule {

    @Binds
    @Singleton
    abstract fun bindPostExecutionThread(uiThread: UiThread) : PostExecutionThread

    @Binds
    @Singleton
    abstract fun bindThreadExecutor(backgroundExecutor: BackgroundExecutor) : ThreadExecutor

    @Binds
    @Singleton
    abstract fun bindMastersSchedulers(mastersSchedulersImp: MastersSchedulersImp) : MastersSchedulers

}