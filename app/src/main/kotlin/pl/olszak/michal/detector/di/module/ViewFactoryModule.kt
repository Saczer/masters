package pl.olszak.michal.detector.di.module

import dagger.Binds
import dagger.Module
import dagger.multibindings.IntoMap
import pl.olszak.michal.base.navigation.ScreenController
import pl.olszak.michal.detector.di.ScreenKey
import pl.olszak.michal.view.screen.DatabaseScreenController
import pl.olszak.michal.view.screen.MainScreenController
import pl.olszak.michal.view.screen.SegmentationScreenController

@Module
abstract class ViewFactoryModule {

    @Binds
    @IntoMap
    @ScreenKey(SegmentationScreenController::class)
    abstract fun bindTestScreenController(segmentationScreenController: SegmentationScreenController): ScreenController

    @Binds
    @IntoMap
    @ScreenKey(MainScreenController::class)
    abstract fun bindMainScreenController(mainScreenController: MainScreenController): ScreenController

    @Binds
    @IntoMap
    @ScreenKey(DatabaseScreenController::class)
    abstract fun bindDatabaseScreenController(databaseScreenController: DatabaseScreenController): ScreenController
}