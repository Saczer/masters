package pl.olszak.michal.detector;

import dagger.MembersInjector;
import javax.annotation.Generated;
import javax.inject.Provider;
import pl.olszak.michal.detector.navigation.Navigator;

@Generated(
  value = "dagger.internal.codegen.ComponentProcessor",
  comments = "https://google.github.io/dagger"
)
public final class Detector_MembersInjector implements MembersInjector<Detector> {
  private final Provider<Navigator> navigatorProvider;

  public Detector_MembersInjector(Provider<Navigator> navigatorProvider) {
    this.navigatorProvider = navigatorProvider;
  }

  public static MembersInjector<Detector> create(Provider<Navigator> navigatorProvider) {
    return new Detector_MembersInjector(navigatorProvider);
  }

  @Override
  public void injectMembers(Detector instance) {
    injectNavigator(instance, navigatorProvider.get());
  }

  public static void injectNavigator(Detector instance, Navigator navigator) {
    instance.navigator = navigator;
  }
}
