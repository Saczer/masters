package pl.olszak.michal.detector.di.module

import dagger.Binds
import dagger.Module
import javafx.util.Callback
import pl.olszak.michal.base.navigation.ScreenController
import pl.olszak.michal.base.navigation.ScreenProvider
import pl.olszak.michal.view.navigation.FactoryScreenProvider
import pl.olszak.michal.view.navigation.ViewFactory

@Module
abstract class ApplicationModule {

    @Binds
    abstract fun bindScreenCallback(viewFactory: ViewFactory)
            : Callback<Class<out ScreenController>, ScreenController>

    @Binds
    abstract fun bindScreenProvider(factoryScreenProvider: FactoryScreenProvider): ScreenProvider
}