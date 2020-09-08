package com.elite.jettravel.model

import android.graphics.drawable.Drawable
import androidx.annotation.DrawableRes

data class Destination(
    val destination: String,
    val description: String,
    @DrawableRes val image: Int
)