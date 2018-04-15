package pl.olszak.michal.view.navigation

import javafx.util.Callback
import pl.olszak.michal.base.logger.getLogger
import pl.olszak.michal.base.navigation.ScreenController
import javax.inject.Inject
import javax.inject.Provider
import javax.inject.Singleton

@Singleton
class DetectorViewFactory @Inject constructor(
        private val creators: Map<Class<out ScreenController>, @JvmSuppressWildcards Provider<ScreenController>>
) : Callback<Class<out ScreenController>, ScreenController> {

    companion object {
        private val logger = getLogger(DetectorViewFactory::class.java)
    }

    override fun call(param: Class<out ScreenController>?): ScreenController {
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
            logger.error("Could not find $param")
            throw IllegalArgumentException("Unknown model class $param")
        }
        return creator.get()
    }

}