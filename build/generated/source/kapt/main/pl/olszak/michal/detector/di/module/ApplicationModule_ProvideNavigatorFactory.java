package pl.olszak.michal.detector.di.module;

import dagger.internal.Factory;
import dagger.internal.Preconditions;
import javafx.stage.Stage;
import javax.annotation.Generated;
import javax.inject.Provider;
import pl.olszak.michal.detector.navigation.Navigator;
import pl.olszak.michal.detector.navigation.ScreenProvider;

@Generated(
  value = "dagger.internal.codegen.ComponentProcessor",
  comments = "https://google.github.io/dagger"
)
public final class ApplicationModule_ProvideNavigatorFactory implements Factory<Navigator> {
  private final Provider<Stage> stageProvider;

  private final Provider<ScreenProvider> screenProvider;

  public ApplicationModule_ProvideNavigatorFactory(
      Provider<Stage> stageProvider, Provider<ScreenProvider> screenProvider) {
    this.stageProvider = stageProvider;
    this.screenProvider = screenProvider;
  }

  @Override
  public Navigator get() {
    return Preconditions.checkNotNull(
        ApplicationModule.provideNavigator(stageProvider.get(), screenProvider.get()),
        "Cannot return null from a non-@Nullable @Provides method");
  }

  public static ApplicationModule_ProvideNavigatorFactory create(
      Provider<Stage> stageProvider, Provider<ScreenProvider> screenProvider) {
    return new ApplicationModule_ProvideNavigatorFactory(stageProvider, screenProvider);
  }

  public static Navigator proxyProvideNavigator(Stage stage, ScreenProvider screenProvider) {
    return Preconditions.checkNotNull(
        ApplicationModule.provideNavigator(stage, screenProvider),
        "Cannot return null from a non-@Nullable @Provides method");
  }
}
