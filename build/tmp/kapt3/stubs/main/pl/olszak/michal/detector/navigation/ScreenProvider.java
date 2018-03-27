package pl.olszak.michal.detector.navigation;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 9}, bv = {1, 0, 2}, k = 1, d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bf\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H&J\u0018\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0007H&J&\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00072\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\n0\tH&J\u001e\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\n0\tH&\u00a8\u0006\u000b"}, d2 = {"Lpl/olszak/michal/detector/navigation/ScreenProvider;", "", "getNode", "Ljavafx/scene/Node;", "fxml", "", "resourceBundle", "Ljava/util/ResourceBundle;", "consumer", "Ljava/util/function/Consumer;", "Lpl/olszak/michal/detector/view/ScreenController;", "kotlin-masters-detector"})
public abstract interface ScreenProvider {
    
    @org.jetbrains.annotations.NotNull()
    public abstract javafx.scene.Node getNode(@org.jetbrains.annotations.NotNull()
    java.lang.String fxml);
    
    @org.jetbrains.annotations.NotNull()
    public abstract javafx.scene.Node getNode(@org.jetbrains.annotations.NotNull()
    java.lang.String fxml, @org.jetbrains.annotations.NotNull()
    java.util.function.Consumer<pl.olszak.michal.detector.view.ScreenController> consumer);
    
    @org.jetbrains.annotations.NotNull()
    public abstract javafx.scene.Node getNode(@org.jetbrains.annotations.NotNull()
    java.lang.String fxml, @org.jetbrains.annotations.NotNull()
    java.util.ResourceBundle resourceBundle);
    
    @org.jetbrains.annotations.NotNull()
    public abstract javafx.scene.Node getNode(@org.jetbrains.annotations.NotNull()
    java.lang.String fxml, @org.jetbrains.annotations.NotNull()
    java.util.ResourceBundle resourceBundle, @org.jetbrains.annotations.NotNull()
    java.util.function.Consumer<pl.olszak.michal.detector.view.ScreenController> consumer);
}