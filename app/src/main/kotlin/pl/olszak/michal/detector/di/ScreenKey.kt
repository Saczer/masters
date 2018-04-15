package pl.olszak.michal.detector.di

import dagger.MapKey
import pl.olszak.michal.base.navigation.ScreenController
import kotlin.reflect.KClass

@Target(AnnotationTarget.FUNCTION)
@Retention(AnnotationRetention.RUNTIME)
@MapKey
annotation class ScreenKey(val value: KClass<out ScreenController>)