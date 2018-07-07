package pl.olszak.michal.detector.di.module

import dagger.Binds
import dagger.Module
import pl.olszak.michal.base.navigation.InitialNavigator
import pl.olszak.michal.base.navigation.NodeController
import pl.olszak.michal.view.navigation.DetectorInitialNavigator
import pl.olszak.michal.view.navigation.DetectorNodeController
import javax.inject.Singleton

@Module
abstract class NavigationModule {

    @Binds
    @Singleton
    abstract fun provideNodeController(detectorNodeController: DetectorNodeController) : NodeController

    @Binds
    @Singleton
    abstract fun provideInitialNavigator(detectorInitialNavigator: DetectorInitialNavigator) : InitialNavigator
}