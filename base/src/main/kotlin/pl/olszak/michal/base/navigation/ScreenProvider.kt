package pl.olszak.michal.base.navigation

import javafx.scene.Node
import java.util.function.Consumer

interface ScreenProvider {

    fun getNode(fxml: String): Node

    fun getNode(fxml: String, consumer: Consumer<ScreenController>) : Node
}