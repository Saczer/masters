package pl.olszak.michal.detector.navigation

import javafx.util.Callback
import pl.olszak.michal.detector.view.ScreenController
import javax.inject.Inject
import javax.inject.Provider
import javax.inject.Singleton

@Singleton
class DetectorViewFactory @Inject constructor(
        private val creators: Map<Class<out ScreenController>, @JvmSuppressWildcards Provider<ScreenController>>
) : Callback<Class<out ScreenController>, ScreenController> {

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
            throw IllegalArgumentException("Unknown model class $param")
        }

        return creator.get()
    }

}