package pl.olszak.michal.detector.di.module

import dagger.Binds
import dagger.Module
import dagger.Provides
import javafx.stage.Stage
import pl.olszak.michal.detector.navigation.DetectorScreenProvider
import pl.olszak.michal.detector.navigation.DetectorNavigator
import pl.olszak.michal.detector.navigation.Navigator
import pl.olszak.michal.detector.navigation.ScreenProvider
import javax.inject.Singleton

@Module
abstract class ApplicationModule {

    @Binds
    @Singleton
    abstract fun bindScreenProvider(detectorScreenProvider: DetectorScreenProvider): ScreenProvider

    @Module
    companion object {

        @Provides
        @JvmStatic
        @Singleton
        fun provideNavigator(stage: Stage, screenProvider: ScreenProvider): Navigator {
            return DetectorNavigator(stage, screenProvider)
        }
    }
}