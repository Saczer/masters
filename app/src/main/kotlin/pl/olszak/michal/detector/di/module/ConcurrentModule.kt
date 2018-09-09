package pl.olszak.michal.detector.di.module

import dagger.Binds
import dagger.Module
import pl.olszak.michal.base.concurrent.MastersSchedulers
import pl.olszak.michal.base.domain.concurrent.MastersSchedulersImp
import javax.inject.Singleton

@Module
abstract class ConcurrentModule {

    @Binds
    @Singleton
    abstract fun bindMastersSchedulers(mastersSchedulersImp: MastersSchedulersImp) : MastersSchedulers
}