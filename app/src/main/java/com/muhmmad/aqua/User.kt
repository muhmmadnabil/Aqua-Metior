package com.muhmmad.aqua

data class User(
    val id: Int,
    val firstName: String,
    val secondName: String,
    val email: String,
    val password: String,
    val phValue: Float,
    val rgbValue: Float,
    val saltValue: Float,
    val ironValue: Float,
    val nitrateValue: Float,
    val manganeseValue: Float
)
