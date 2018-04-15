package pl.olszak.michal.base.logger

import org.slf4j.LoggerFactory

fun <T> getLogger(clazz: Class<T>) = LoggerFactory.getLogger(clazz)