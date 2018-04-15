package pl.olszak.michal.detector.di.module

import dagger.Binds
import dagger.Module
import dagger.Provides
import javafx.stage.Stage
import pl.olszak.michal.base.navigation.Navigator
import pl.olszak.michal.base.navigation.ScreenProvider
import pl.olszak.michal.view.navigation.DetectorNavigator
import pl.olszak.michal.view.navigation.DetectorScreenProvider
import javax.inject.Singleton

@Module
abstract class ApplicationModule {

    @Binds
    @Singleton
    abstract fun bindScreenProvider(detectorScreenProvider: DetectorScreenProvider): ScreenProvider

    @Module
    companion object {

        @Provides
        @Singleton
        @JvmStatic
        fun provideNavigator(stage: Stage, screenProvider: ScreenProvider): Navigator {
            return DetectorNavigator(stage, screenProvider)
        }

    }
}