package com.paramvir.kotlinsample

fun String.lastChar(): Char = get(length - 1)


fun Person.fullName(): String = "$name $surname"