package pl.olszak.michal.view.screen

import javafx.fxml.FXML
import javafx.scene.control.Label
import pl.olszak.michal.base.navigation.ScreenController
import pl.olszak.michal.base.navigation.Navigator
import javax.inject.Inject

open class TestScreenController @Inject constructor(
        private val navigator: Navigator) : ScreenController {

    @FXML
    lateinit var firstLabel: Label

    fun onButtonClick() {
        firstLabel.text
    }
}