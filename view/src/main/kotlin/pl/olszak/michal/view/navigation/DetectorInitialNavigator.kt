package pl.olszak.michal.view.navigation

import pl.olszak.michal.base.navigation.InitialNavigator
import pl.olszak.michal.base.navigation.NodeController
import pl.olszak.michal.base.navigation.ScreenProvider
import javax.inject.Inject

class DetectorInitialNavigator @Inject constructor(private val nodeController: NodeController,
                                                   private val fxmlProvider: ScreenProvider) : InitialNavigator {

    companion object {
        private const val TEST_WINDOW = "/fxml/TestWindow.fxml"
    }

    override fun navigateToTestWindow() {
        val node = fxmlProvider.getNode(TEST_WINDOW)
        nodeController.setNode(node)
    }
}