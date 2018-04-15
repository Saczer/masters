package pl.olszak.michal.detector.di.module

import dagger.Binds
import dagger.Module
import pl.olszak.michal.base.concurrent.MastersSchedulers
import pl.olszak.michal.base.concurrent.PostExecutionThread
import pl.olszak.michal.base.concurrent.ThreadExecutor
import pl.olszak.michal.domain.concurrent.BackgroundExecutor
import pl.olszak.michal.domain.concurrent.MastersSchedulersImp
import pl.olszak.michal.domain.concurrent.UiThread
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