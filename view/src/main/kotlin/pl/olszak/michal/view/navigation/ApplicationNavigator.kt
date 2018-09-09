package pl.olszak.michal.view.navigation

import pl.olszak.michal.base.navigation.Navigator
import pl.olszak.michal.base.navigation.NodeController
import pl.olszak.michal.base.navigation.ScreenProvider
import javax.inject.Inject
import javax.inject.Singleton

@Singleton
class ApplicationNavigator @Inject constructor(private val nodeController: NodeController,
                                               private val fxmlProvider: ScreenProvider) : Navigator {

    companion object {
        private const val TEST_WINDOW = "/fxml/SegmentationWindow.fxml"
        private const val MAIN_WINDOW = "/fxml/MainWindow.fxml"
        private const val DATABASE_WINDOW = "/fxml/DatabaseWindow.fxml"
    }

    override fun navigateToTestWindow() {
        navigate(TEST_WINDOW)
    }

    override fun navigateToMainWindow() {
        navigate(MAIN_WINDOW)
    }

    override fun navigateToDatabseWindow() {
        navigate(DATABASE_WINDOW)
    }

    private fun navigate(windowPath: String){
        val node = fxmlProvider.getNode(windowPath)
        nodeController.setNode(node)
    }
}