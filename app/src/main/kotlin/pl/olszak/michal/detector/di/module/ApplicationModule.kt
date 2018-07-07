package pl.olszak.michal.detector.di.module

import dagger.Binds
import dagger.Module
import pl.olszak.michal.base.navigation.InitialNavigator
import pl.olszak.michal.base.navigation.ScreenProvider
import pl.olszak.michal.view.navigation.DetectorInitialNavigator
import pl.olszak.michal.view.navigation.DetectorScreenProvider
import javax.inject.Singleton

@Module
abstract class ApplicationModule {

    @Binds
    @Singleton
    abstract fun bindScreenProvider(detectorScreenProvider: DetectorScreenProvider): ScreenProvider
}