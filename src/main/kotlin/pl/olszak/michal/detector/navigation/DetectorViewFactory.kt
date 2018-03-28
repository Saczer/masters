package pl.olszak.michal.detector.navigation

import javafx.util.Callback
import org.slf4j.LoggerFactory
import pl.olszak.michal.detector.view.ScreenController
import javax.inject.Inject
import javax.inject.Provider
import javax.inject.Singleton

@Singleton
class DetectorViewFactory @Inject constructor(
        private val creators: Map<Class<out ScreenController>, @JvmSuppressWildcards Provider<ScreenController>>
) : Callback<Class<out ScreenController>, ScreenController> {

    override fun call(param: Class<out ScreenController>?): ScreenController {
        logger.debug("Calling factory for $param")
        var creator: Provider<out ScreenController>? = creators[param]
        if (creator == null) {
            for ((key, value) in creators) {
                if (param?.isAssignableFrom(key) == true) {
                    creator = value
                    break
                }
            }
        }

        if (creator == null) {
            logger.error("Could not retrieve ScreenController for $param")
            throw IllegalArgumentException("Unknown model class $param")
        }

        logger.debug("Successfully retrieved ScreenController for $param")
        return creator.get()
    }

    companion object {
        private val logger = LoggerFactory.getLogger(DetectorViewFactory::class.java)
    }

}