package pl.olszak.michal.detector

import javafx.application.Application
import javafx.application.Platform
import javafx.stage.Stage
import nu.pattern.OpenCV
import org.opencv.core.Core
import org.slf4j.LoggerFactory
import pl.olszak.michal.detector.di.component.ApplicationComponent
import pl.olszak.michal.detector.di.component.DaggerApplicationComponent
import pl.olszak.michal.detector.navigation.Navigator
import javax.inject.Inject

class Detector : Application() {

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
        navigator.navigateToTestWindow()
    }

    companion object {

        private val logger = LoggerFactory.getLogger(Detector::class.java)

        init {
            logger.debug("loading OpenCV")
            OpenCV.loadShared()
            System.loadLibrary(Core.NATIVE_LIBRARY_NAME)
            logger.debug("OpenCv loaded")
        }

        @JvmStatic
        fun main(args: Array<String>) {
            launch(Detector::class.java, *args)
        }
    }
}