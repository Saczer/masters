package pl.olszak.michal.detector.di.module

import dagger.Binds
import dagger.Module
import dagger.multibindings.IntoMap
import pl.olszak.michal.base.navigation.ScreenController
import pl.olszak.michal.detector.di.ScreenKey
import pl.olszak.michal.view.screen.TestScreenController

@Module
abstract class ViewFactoryModule {

    @Binds
    @IntoMap
    @ScreenKey(TestScreenController::class)
    abstract fun bindTestScreenController(testScreenController: TestScreenController): ScreenController

}