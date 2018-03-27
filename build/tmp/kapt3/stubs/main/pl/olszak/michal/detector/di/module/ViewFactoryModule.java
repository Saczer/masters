package pl.olszak.michal.detector.di.module;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 9}, bv = {1, 0, 2}, k = 1, d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\'\u0018\u00002\u00020\u0001B\u0005\u00a2\u0006\u0002\u0010\u0002J\u0010\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006H\'\u00a8\u0006\u0007"}, d2 = {"Lpl/olszak/michal/detector/di/module/ViewFactoryModule;", "", "()V", "bindTestScreenController", "Lpl/olszak/michal/detector/view/ScreenController;", "testScreenController", "Lpl/olszak/michal/detector/view/TestScreenController;", "kotlin-masters-detector"})
@dagger.Module()
public abstract class ViewFactoryModule {
    
    @org.jetbrains.annotations.NotNull()
    @pl.olszak.michal.detector.di.ScreenKey(value = pl.olszak.michal.detector.view.TestScreenController.class)
    @dagger.multibindings.IntoMap()
    @dagger.Binds()
    public abstract pl.olszak.michal.detector.view.ScreenController bindTestScreenController(@org.jetbrains.annotations.NotNull()
    pl.olszak.michal.detector.view.TestScreenController testScreenController);
    
    public ViewFactoryModule() {
        super();
    }
}