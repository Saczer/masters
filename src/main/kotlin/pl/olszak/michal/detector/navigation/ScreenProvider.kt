package pl.olszak.michal.detector.navigation

import javafx.scene.Node
import pl.olszak.michal.detector.view.ScreenController
import java.util.*
import java.util.function.Consumer

interface ScreenProvider {

    fun getNode(fxml: String): Node

    fun getNode(fxml: String, consumer: Consumer<ScreenController>) : Node

}