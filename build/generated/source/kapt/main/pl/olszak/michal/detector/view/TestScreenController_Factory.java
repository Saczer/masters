package pl.olszak.michal.detector.view;

import dagger.internal.Factory;
import javax.annotation.Generated;
import javax.inject.Provider;
import pl.olszak.michal.detector.navigation.Navigator;

@Generated(
  value = "dagger.internal.codegen.ComponentProcessor",
  comments = "https://google.github.io/dagger"
)
public final class TestScreenController_Factory implements Factory<TestScreenController> {
  private final Provider<Navigator> navigatorProvider;

  public TestScreenController_Factory(Provider<Navigator> navigatorProvider) {
    this.navigatorProvider = navigatorProvider;
  }

  @Override
  public TestScreenController get() {
    return new TestScreenController(navigatorProvider.get());
  }

  public static TestScreenController_Factory create(Provider<Navigator> navigatorProvider) {
    return new TestScreenController_Factory(navigatorProvider);
  }
}
