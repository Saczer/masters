package pl.olszak.michal.detector.di.component

import dagger.BindsInstance
import dagger.Component
import javafx.stage.Stage
import pl.olszak.michal.detector.Detector
import pl.olszak.michal.detector.di.module.ApplicationModule
import pl.olszak.michal.detector.di.module.ConcurrentModule
import pl.olszak.michal.detector.di.module.NavigationModule
import pl.olszak.michal.detector.di.module.ViewFactoryModule
import javax.inject.Singleton

@Singleton
@Component(modules = [
    ApplicationModule::class,
    ViewFactoryModule::class,
    NavigationModule::class,
    ConcurrentModule::class])
interface ApplicationComponent {

    @Component.Builder
    interface Builder {
        @BindsInstance
        fun stage(stage: Stage): Builder

        fun build(): ApplicationComponent
    }

    fun inject(detector: Detector)
}