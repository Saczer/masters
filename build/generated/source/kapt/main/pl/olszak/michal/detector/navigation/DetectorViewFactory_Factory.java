package pl.olszak.michal.detector.navigation;

import dagger.internal.Factory;
import java.util.Map;
import javax.annotation.Generated;
import javax.inject.Provider;
import pl.olszak.michal.detector.view.ScreenController;

@Generated(
  value = "dagger.internal.codegen.ComponentProcessor",
  comments = "https://google.github.io/dagger"
)
public final class DetectorViewFactory_Factory implements Factory<DetectorViewFactory> {
  private final Provider<Map<Class<? extends ScreenController>, Provider<ScreenController>>>
      creatorsProvider;

  public DetectorViewFactory_Factory(
      Provider<Map<Class<? extends ScreenController>, Provider<ScreenController>>>
          creatorsProvider) {
    this.creatorsProvider = creatorsProvider;
  }

  @Override
  public DetectorViewFactory get() {
    return new DetectorViewFactory(creatorsProvider.get());
  }

  public static DetectorViewFactory_Factory create(
      Provider<Map<Class<? extends ScreenController>, Provider<ScreenController>>>
          creatorsProvider) {
    return new DetectorViewFactory_Factory(creatorsProvider);
  }
}
