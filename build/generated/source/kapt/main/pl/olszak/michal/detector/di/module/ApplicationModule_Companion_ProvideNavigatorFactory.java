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
public final class ApplicationModule_Companion_ProvideNavigatorFactory
    implements Factory<Navigator> {
  private final ApplicationModule.Companion module;

  private final Provider<Stage> stageProvider;

  private final Provider<ScreenProvider> screenProvider;

  public ApplicationModule_Companion_ProvideNavigatorFactory(
      ApplicationModule.Companion module,
      Provider<Stage> stageProvider,
      Provider<ScreenProvider> screenProvider) {
    this.module = module;
    this.stageProvider = stageProvider;
    this.screenProvider = screenProvider;
  }

  @Override
  public Navigator get() {
    return Preconditions.checkNotNull(
        module.provideNavigator(stageProvider.get(), screenProvider.get()),
        "Cannot return null from a non-@Nullable @Provides method");
  }

  public static ApplicationModule_Companion_ProvideNavigatorFactory create(
      ApplicationModule.Companion module,
      Provider<Stage> stageProvider,
      Provider<ScreenProvider> screenProvider) {
    return new ApplicationModule_Companion_ProvideNavigatorFactory(
        module, stageProvider, screenProvider);
  }

  public static Navigator proxyProvideNavigator(
      ApplicationModule.Companion instance, Stage stage, ScreenProvider screenProvider) {
    return Preconditions.checkNotNull(
        instance.provideNavigator(stage, screenProvider),
        "Cannot return null from a non-@Nullable @Provides method");
  }
}
