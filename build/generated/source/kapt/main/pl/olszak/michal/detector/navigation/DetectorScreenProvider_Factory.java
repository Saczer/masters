package pl.olszak.michal.detector.navigation;

import dagger.internal.Factory;
import javax.annotation.Generated;
import javax.inject.Provider;

@Generated(
  value = "dagger.internal.codegen.ComponentProcessor",
  comments = "https://google.github.io/dagger"
)
public final class DetectorScreenProvider_Factory implements Factory<DetectorScreenProvider> {
  private final Provider<DetectorViewFactory> detectorViewFactoryProvider;

  public DetectorScreenProvider_Factory(Provider<DetectorViewFactory> detectorViewFactoryProvider) {
    this.detectorViewFactoryProvider = detectorViewFactoryProvider;
  }

  @Override
  public DetectorScreenProvider get() {
    return new DetectorScreenProvider(detectorViewFactoryProvider.get());
  }

  public static DetectorScreenProvider_Factory create(
      Provider<DetectorViewFactory> detectorViewFactoryProvider) {
    return new DetectorScreenProvider_Factory(detectorViewFactoryProvider);
  }
}
