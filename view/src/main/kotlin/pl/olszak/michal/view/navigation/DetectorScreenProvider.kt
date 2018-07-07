package pl.olszak.michal.view.navigation

import javafx.fxml.FXMLLoader
import javafx.scene.Node
import javafx.scene.Parent
import pl.olszak.michal.base.logger.logger
import pl.olszak.michal.base.navigation.ScreenController
import pl.olszak.michal.base.navigation.ScreenProvider
import java.io.IOException
import java.util.function.Consumer
import javax.inject.Inject

class DetectorScreenProvider @Inject constructor(private val detectorViewFactory: DetectorViewFactory) : ScreenProvider {

    companion object {
        private val logger by logger()
    }

    override fun getNode(fxml: String): Node = get(FXMLLoader(javaClass.getResource(fxml)))

    override fun getNode(fxml: String, consumer: Consumer<ScreenController>): Node =
            get(FXMLLoader(javaClass.getResource(fxml)), consumer)

    @Suppress("UNCHECKED_CAST")
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
            logger.error("Could not load controller", e)
            throw RuntimeException(e)
        }
    }
}