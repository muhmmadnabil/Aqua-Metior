package com.muhmmad.aqua

class User(
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
) {
    constructor() : this(
        0, "Ahmed", "", "", "",
        0.0f, 0.0f, 1.0f, 0.0f, 0.0f, 0.0f
    )
}
