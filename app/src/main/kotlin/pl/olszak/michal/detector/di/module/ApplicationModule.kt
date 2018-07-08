package pl.olszak.michal.detector.di.module

import dagger.Binds
import dagger.Module
import javafx.util.Callback
import pl.olszak.michal.base.navigation.InitialNavigator
import pl.olszak.michal.base.navigation.ScreenController
import pl.olszak.michal.base.navigation.ScreenProvider
import pl.olszak.michal.view.navigation.DetectorInitialNavigator
import pl.olszak.michal.view.navigation.DetectorScreenProvider
import pl.olszak.michal.view.navigation.DetectorViewFactory
import javax.inject.Singleton

@Module
abstract class ApplicationModule {

    @Binds
    @Singleton
    abstract fun bindScreenCallback(detectorViewFactory: DetectorViewFactory)
            : Callback<Class<out ScreenController>, ScreenController>

    @Binds
    @Singleton
    abstract fun bindScreenProvider(detectorScreenProvider: DetectorScreenProvider): ScreenProvider
}