package pl.olszak.michal.detector.di.component;

import dagger.internal.DelegateFactory;
import dagger.internal.DoubleCheck;
import dagger.internal.InstanceFactory;
import dagger.internal.MapProviderFactory;
import dagger.internal.Preconditions;
import java.util.Map;
import javafx.stage.Stage;
import javax.annotation.Generated;
import javax.inject.Provider;
import pl.olszak.michal.detector.Detector;
import pl.olszak.michal.detector.Detector_MembersInjector;
import pl.olszak.michal.detector.di.module.ApplicationModule_ProvideNavigatorFactory;
import pl.olszak.michal.detector.navigation.DetectorScreenProvider_Factory;
import pl.olszak.michal.detector.navigation.DetectorViewFactory;
import pl.olszak.michal.detector.navigation.DetectorViewFactory_Factory;
import pl.olszak.michal.detector.navigation.Navigator;
import pl.olszak.michal.detector.navigation.ScreenProvider;
import pl.olszak.michal.detector.view.ScreenController;
import pl.olszak.michal.detector.view.TestScreenController;
import pl.olszak.michal.detector.view.TestScreenController_Factory;

@Generated(
  value = "dagger.internal.codegen.ComponentProcessor",
  comments = "https://google.github.io/dagger"
)
public final class DaggerApplicationComponent implements ApplicationComponent {
  private Provider<Stage> stageProvider;

  private Provider<Navigator> provideNavigatorProvider;

  private TestScreenController_Factory testScreenControllerProvider;

  private Provider<Map<Class<? extends ScreenController>, Provider<ScreenController>>>
      mapOfClassOfAndProviderOfScreenControllerProvider;

  private Provider<DetectorViewFactory> detectorViewFactoryProvider;

  private DetectorScreenProvider_Factory detectorScreenProvider;

  private Provider<ScreenProvider> bindScreenProvider;

  private DaggerApplicationComponent(Builder builder) {
    initialize(builder);
  }

  public static ApplicationComponent.Builder builder() {
    return new Builder();
  }

  @SuppressWarnings("unchecked")
  private void initialize(final Builder builder) {
    this.stageProvider = InstanceFactory.create(builder.stage);
    this.provideNavigatorProvider = new DelegateFactory<>();
    this.testScreenControllerProvider =
        TestScreenController_Factory.create(provideNavigatorProvider);
    this.mapOfClassOfAndProviderOfScreenControllerProvider =
        MapProviderFactory.<Class<? extends ScreenController>, ScreenController>builder(1)
            .put(TestScreenController.class, (Provider) testScreenControllerProvider)
            .build();
    this.detectorViewFactoryProvider =
        DoubleCheck.provider(
            DetectorViewFactory_Factory.create(mapOfClassOfAndProviderOfScreenControllerProvider));
    this.detectorScreenProvider =
        DetectorScreenProvider_Factory.create(detectorViewFactoryProvider);
    this.bindScreenProvider = DoubleCheck.provider((Provider) detectorScreenProvider);
    DelegateFactory provideNavigatorProviderDelegate = (DelegateFactory) provideNavigatorProvider;
    this.provideNavigatorProvider =
        DoubleCheck.provider(
            ApplicationModule_ProvideNavigatorFactory.create(stageProvider, bindScreenProvider));
    provideNavigatorProviderDelegate.setDelegatedProvider(provideNavigatorProvider);
  }

  @Override
  public void inject(Detector detector) {
    injectDetector(detector);
  }

  private Detector injectDetector(Detector instance) {
    Detector_MembersInjector.injectNavigator(instance, provideNavigatorProvider.get());
    return instance;
  }

  private static final class Builder implements ApplicationComponent.Builder {
    private Stage stage;

    @Override
    public ApplicationComponent build() {
      if (stage == null) {
        throw new IllegalStateException(Stage.class.getCanonicalName() + " must be set");
      }
      return new DaggerApplicationComponent(this);
    }

    @Override
    public Builder stage(Stage stage) {
      this.stage = Preconditions.checkNotNull(stage);
      return this;
    }
  }
}
