package com.example.test.data

import androidx.annotation.DrawableRes

data class Data (
    @DrawableRes
    val image: Int,
    val isSelected: Boolean = false,
    val text: String
)