package pl.olszak.michal.detector.di.module;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 9}, bv = {1, 0, 2}, k = 1, d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\'\u0018\u0000 \u00072\u00020\u0001:\u0001\u0007B\u0005\u00a2\u0006\u0002\u0010\u0002J\u0010\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006H\'\u00a8\u0006\b"}, d2 = {"Lpl/olszak/michal/detector/di/module/ApplicationModule;", "", "()V", "bindScreenProvider", "Lpl/olszak/michal/detector/navigation/ScreenProvider;", "detectorScreenProvider", "Lpl/olszak/michal/detector/navigation/DetectorScreenProvider;", "Companion", "kotlin-masters-detector"})
@dagger.Module()
public abstract class ApplicationModule {
    public static final pl.olszak.michal.detector.di.module.ApplicationModule.Companion Companion = null;
    
    @org.jetbrains.annotations.NotNull()
    @javax.inject.Singleton()
    @dagger.Binds()
    public abstract pl.olszak.michal.detector.navigation.ScreenProvider bindScreenProvider(@org.jetbrains.annotations.NotNull()
    pl.olszak.michal.detector.navigation.DetectorScreenProvider detectorScreenProvider);
    
    public ApplicationModule() {
        super();
    }
    
    @org.jetbrains.annotations.NotNull()
    @javax.inject.Singleton()
    @dagger.Provides()
    public static final pl.olszak.michal.detector.navigation.Navigator provideNavigator(@org.jetbrains.annotations.NotNull()
    javafx.stage.Stage stage, @org.jetbrains.annotations.NotNull()
    pl.olszak.michal.detector.navigation.ScreenProvider screenProvider) {
        return null;
    }
    
    @kotlin.Metadata(mv = {1, 1, 9}, bv = {1, 0, 2}, k = 1, d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0087\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002J\u0018\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\bH\u0007\u00a8\u0006\t"}, d2 = {"Lpl/olszak/michal/detector/di/module/ApplicationModule$Companion;", "", "()V", "provideNavigator", "Lpl/olszak/michal/detector/navigation/Navigator;", "stage", "Ljavafx/stage/Stage;", "screenProvider", "Lpl/olszak/michal/detector/navigation/ScreenProvider;", "kotlin-masters-detector"})
    @dagger.Module()
    public static final class Companion {
        
        @org.jetbrains.annotations.NotNull()
        @javax.inject.Singleton()
        @dagger.Provides()
        public final pl.olszak.michal.detector.navigation.Navigator provideNavigator(@org.jetbrains.annotations.NotNull()
        javafx.stage.Stage stage, @org.jetbrains.annotations.NotNull()
        pl.olszak.michal.detector.navigation.ScreenProvider screenProvider) {
            return null;
        }
        
        private Companion() {
            super();
        }
    }
}