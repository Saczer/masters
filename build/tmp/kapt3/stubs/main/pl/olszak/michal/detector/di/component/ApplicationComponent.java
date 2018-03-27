package pl.olszak.michal.detector.di.component;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 9}, bv = {1, 0, 2}, k = 1, d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\bg\u0018\u00002\u00020\u0001:\u0001\u0006J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H&\u00a8\u0006\u0007"}, d2 = {"Lpl/olszak/michal/detector/di/component/ApplicationComponent;", "", "inject", "", "detector", "Lpl/olszak/michal/detector/Detector;", "Builder", "kotlin-masters-detector"})
@dagger.Component(modules = {pl.olszak.michal.detector.di.module.ApplicationModule.class, pl.olszak.michal.detector.di.module.ViewFactoryModule.class})
@javax.inject.Singleton()
public abstract interface ApplicationComponent {
    
    public abstract void inject(@org.jetbrains.annotations.NotNull()
    pl.olszak.michal.detector.Detector detector);
    
    @kotlin.Metadata(mv = {1, 1, 9}, bv = {1, 0, 2}, k = 1, d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\bg\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H&J\u0010\u0010\u0004\u001a\u00020\u00002\u0006\u0010\u0004\u001a\u00020\u0005H\'\u00a8\u0006\u0006"}, d2 = {"Lpl/olszak/michal/detector/di/component/ApplicationComponent$Builder;", "", "build", "Lpl/olszak/michal/detector/di/component/ApplicationComponent;", "stage", "Ljavafx/stage/Stage;", "kotlin-masters-detector"})
    @dagger.Component.Builder()
    public static abstract interface Builder {
        
        @org.jetbrains.annotations.NotNull()
        @dagger.BindsInstance()
        public abstract pl.olszak.michal.detector.di.component.ApplicationComponent.Builder stage(@org.jetbrains.annotations.NotNull()
        javafx.stage.Stage stage);
        
        @org.jetbrains.annotations.NotNull()
        public abstract pl.olszak.michal.detector.di.component.ApplicationComponent build();
    }
}