package pl.olszak.michal.detector.navigation

import javafx.fxml.FXMLLoader
import javafx.scene.Node
import javafx.scene.Parent
import pl.olszak.michal.detector.view.ScreenController
import java.io.IOException
import java.util.*
import java.util.function.Consumer
import javax.inject.Inject

class DetectorScreenProvider @Inject constructor(private val detectorViewFactory: DetectorViewFactory) : ScreenProvider {

    override fun getNode(fxml: String): Node = get(FXMLLoader(javaClass.getResource(fxml)))

    override fun getNode(fxml: String, consumer: Consumer<ScreenController>) : Node =
            get(FXMLLoader(javaClass.getResource(fxml)), consumer)

    override fun getNode(fxml: String, resourceBundle: ResourceBundle) : Node  =
            get(FXMLLoader(javaClass.getResource(fxml), resourceBundle))

    override fun getNode(fxml: String, resourceBundle: ResourceBundle, consumer: Consumer<ScreenController>) : Node =
            get(FXMLLoader(javaClass.getResource(fxml), resourceBundle), consumer)

    private fun get(loader: FXMLLoader, consumer: Consumer<ScreenController>? = null): Node {
        loader.setControllerFactory {
            detectorViewFactory.call(it as Class<out ScreenController>?)
        }
        try {
            val parent: Parent = loader.load()
            val controller: ScreenController = loader.getController()
            consumer?.accept(controller)
            return parent
        } catch (e: IOException) {
            throw RuntimeException(e)
        }
    }
}