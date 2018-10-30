package com.beltram

import java.util.function.BiConsumer

typealias KtLogFun = (String, Throwable) -> Unit
typealias JavaLogFun = BiConsumer<String, Throwable>

fun logJava(log: JavaLogFun) {}
fun logKt(log: KtLogFun) {}
fun log(log: KtLogFun) {}
fun log(log: JavaLogFun) {}