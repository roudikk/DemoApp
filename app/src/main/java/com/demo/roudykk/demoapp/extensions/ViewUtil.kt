package com.demo.roudykk.demoapp.extensions

import android.graphics.PorterDuff
import android.graphics.drawable.LayerDrawable
import android.support.v4.content.ContextCompat
import android.widget.RatingBar
import com.demo.roudykk.demoapp.R

fun RatingBar.applyTheme() {
    val stars = progressDrawable as LayerDrawable
    stars.getDrawable(0).setColorFilter(ContextCompat.getColor(context, R.color.colorLight), PorterDuff.Mode.SRC_ATOP)
}