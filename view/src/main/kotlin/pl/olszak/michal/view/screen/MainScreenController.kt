package pl.olszak.michal.view.screen

import pl.olszak.michal.base.navigation.Navigator
import pl.olszak.michal.base.navigation.ScreenController
import javax.inject.Inject

open class MainScreenController @Inject constructor(private val navigator: Navigator) : ScreenController {

    fun onCreateDatabaseClick(){
        navigator.navigateToDatabseWindow()
    }

    fun onProcessSegmentationClick(){
        navigator.navigateToTestWindow()
    }
}