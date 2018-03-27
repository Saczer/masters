package pl.olszak.michal.detector.navigation

import javafx.scene.Node
import javafx.scene.Scene
import javafx.scene.layout.StackPane
import javafx.stage.Stage

class DetectorNavigator constructor(
        stage: Stage,
        private val fxmlProvider: ScreenProvider) : Navigator {

    private val root: StackPane = StackPane()

    init {
        val scene = Scene(root)
        stage.apply {
            title = "Lesion masters"
            setScene(scene)
            height = HEIGHT
            width = WIDTH
            minHeight = HEIGHT
            minWidth = WIDTH
            setOnHiding { System.exit(0) }
        }.show()
    }

    private fun setNode(node: Node) {
        root.children.setAll(node)
    }

    override fun navigateToTestWindow() {
        val node = fxmlProvider.getNode("/fxml/TestWindow.fxml")
        setNode(node)
    }


    companion object {
        private const val WIDTH = 500.0
        private const val HEIGHT = 350.0
    }
}