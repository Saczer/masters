package pl.olszak.michal.detector;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 9}, bv = {1, 0, 2}, k = 1, d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\u0018\u0000 \u00102\u00020\u0001:\u0001\u0010B\u0005\u00a2\u0006\u0002\u0010\u0002J\u0010\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\fH\u0002J\u0010\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\fH\u0016R\u001e\u0010\u0003\u001a\u00020\u00048\u0006@\u0006X\u0087.\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0005\u0010\u0006\"\u0004\b\u0007\u0010\b\u00a8\u0006\u0011"}, d2 = {"Lpl/olszak/michal/detector/Detector;", "Ljavafx/application/Application;", "()V", "navigator", "Lpl/olszak/michal/detector/navigation/Navigator;", "getNavigator", "()Lpl/olszak/michal/detector/navigation/Navigator;", "setNavigator", "(Lpl/olszak/michal/detector/navigation/Navigator;)V", "component", "Lpl/olszak/michal/detector/di/component/ApplicationComponent;", "stage", "Ljavafx/stage/Stage;", "start", "", "primaryStage", "Companion", "kotlin-masters-detector"})
public final class Detector extends javafx.application.Application {
    @org.jetbrains.annotations.NotNull()
    @javax.inject.Inject()
    public pl.olszak.michal.detector.navigation.Navigator navigator;
    public static final pl.olszak.michal.detector.Detector.Companion Companion = null;
    
    @org.jetbrains.annotations.NotNull()
    public final pl.olszak.michal.detector.navigation.Navigator getNavigator() {
        return null;
    }
    
    public final void setNavigator(@org.jetbrains.annotations.NotNull()
    pl.olszak.michal.detector.navigation.Navigator p0) {
    }
    
    private final pl.olszak.michal.detector.di.component.ApplicationComponent component(javafx.stage.Stage stage) {
        return null;
    }
    
    @java.lang.Override()
    public void start(@org.jetbrains.annotations.NotNull()
    javafx.stage.Stage primaryStage) {
    }
    
    public Detector() {
        super();
    }
    
    public static final void main(@org.jetbrains.annotations.NotNull()
    java.lang.String[] args) {
    }
    
    @kotlin.Metadata(mv = {1, 1, 9}, bv = {1, 0, 2}, k = 1, d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u0011\n\u0002\u0010\u000e\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002J\u001b\u0010\u0003\u001a\u00020\u00042\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006H\u0007\u00a2\u0006\u0002\u0010\b\u00a8\u0006\t"}, d2 = {"Lpl/olszak/michal/detector/Detector$Companion;", "", "()V", "main", "", "args", "", "", "([Ljava/lang/String;)V", "kotlin-masters-detector"})
    public static final class Companion {
        
        public final void main(@org.jetbrains.annotations.NotNull()
        java.lang.String[] args) {
        }
        
        private Companion() {
            super();
        }
    }
}