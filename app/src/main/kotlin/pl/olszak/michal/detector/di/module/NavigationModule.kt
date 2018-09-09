package pl.olszak.michal.detector.di.module

import dagger.Binds
import dagger.Module
import pl.olszak.michal.base.navigation.Navigator
import pl.olszak.michal.base.navigation.NodeController
import pl.olszak.michal.view.navigation.ApplicationNavigator
import pl.olszak.michal.view.navigation.ApplicationNodeController

@Module
abstract class NavigationModule {

    @Binds
    abstract fun provideNodeController(applicationNodeController: ApplicationNodeController) : NodeController

    @Binds
    abstract fun provideInitialNavigator(applicationInitialNavigator: ApplicationNavigator) : Navigator
}