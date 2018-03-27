package pl.olszak.michal.detector.di;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 9}, bv = {1, 0, 2}, k = 1, d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u001b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\u0002\u0018\u00002\u00020\u0001B\u0010\u0012\u000e\u0010\u0002\u001a\n\u0012\u0006\b\u0001\u0012\u00020\u00040\u0003R\u0011\u0010\u0002\u001a\n\u0012\u0006\b\u0001\u0012\u00020\u00040\u0003\u00a2\u0006\u0000\u00a8\u0006\u0005"}, d2 = {"Lpl/olszak/michal/detector/di/ScreenKey;", "", "value", "Lkotlin/reflect/KClass;", "Lpl/olszak/michal/detector/view/ScreenController;", "kotlin-masters-detector"})
@java.lang.annotation.Target(value = {java.lang.annotation.ElementType.METHOD})
@java.lang.annotation.Retention(value = java.lang.annotation.RetentionPolicy.RUNTIME)
@dagger.MapKey()
@kotlin.annotation.Retention(value = kotlin.annotation.AnnotationRetention.RUNTIME)
@kotlin.annotation.Target(allowedTargets = {kotlin.annotation.AnnotationTarget.FUNCTION})
public abstract @interface ScreenKey {
    
    public abstract java.lang.Class<? extends pl.olszak.michal.detector.view.ScreenController> value();
}