package pl.olszak.michal.detector.view.screen

import javafx.fxml.FXML
import javafx.scene.control.Label
import org.opencv.core.CvType
import org.opencv.core.Mat
import pl.olszak.michal.detector.navigation.Navigator
import pl.olszak.michal.detector.view.ScreenController
import javax.inject.Inject

open class TestScreenController @Inject constructor(
        private val navigator: Navigator) : ScreenController {

    @FXML
    lateinit var firstLabel: Label

    fun onButtonClick() {
        val mat = Mat.zeros(3,3, CvType.CV_16S)
        firstLabel.text = mat.dump()
    }
}