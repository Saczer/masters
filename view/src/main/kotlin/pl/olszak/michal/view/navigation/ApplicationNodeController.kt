package pl.olszak.michal.view.navigation

import javafx.scene.Node
import javafx.scene.Scene
import javafx.scene.layout.StackPane
import javafx.stage.Stage
import pl.olszak.michal.base.navigation.NodeController
import javax.inject.Inject
import javax.inject.Singleton

@Singleton
class ApplicationNodeController @Inject constructor(stage: Stage) : NodeController {

    companion object {
        private const val WIDTH = 500.0
        private const val HEIGHT = 350.0
    }

    private val root = StackPane()

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

    override fun setNode(node: Node) {
        root.children.setAll(node)
    }
}