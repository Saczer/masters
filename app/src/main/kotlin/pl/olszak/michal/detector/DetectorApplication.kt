package pl.olszak.michal.detector

import javafx.application.Application
import javafx.application.Platform
import javafx.stage.Stage
import nu.pattern.OpenCV
import org.opencv.core.Core
import pl.olszak.michal.base.logger.logger
import pl.olszak.michal.base.navigation.Navigator
import pl.olszak.michal.detector.di.component.ApplicationComponent
import pl.olszak.michal.detector.di.component.DaggerApplicationComponent
import javax.inject.Inject

class DetectorApplication : Application() {

    @Inject
    lateinit var navigator: Navigator

    private fun component(stage: Stage): ApplicationComponent {
        return DaggerApplicationComponent.builder()
                .stage(stage)
                .build()
    }

    override fun start(primaryStage: Stage) {
        Platform.setImplicitExit(true)
        val component = component(primaryStage)
        component.inject(this)
        navigator.navigateToMainWindow()
    }

    companion object {

        private val logger by logger()

        init {
            logger.debug("loading OpenCV")
            OpenCV.loadShared()
            System.loadLibrary(Core.NATIVE_LIBRARY_NAME)
            logger.debug("OpenCv loaded")
        }

        @JvmStatic
        fun main(args: Array<String>) {
            launch(DetectorApplication::class.java, *args)
        }
    }
}