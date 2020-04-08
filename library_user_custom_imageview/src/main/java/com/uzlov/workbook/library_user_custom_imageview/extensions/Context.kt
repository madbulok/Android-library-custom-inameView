package com.uzlov.workbook.customview.extensions

import android.content.Context

fun Context.dpTpPx(dp:Int): Float {
    return dp.toFloat() * this.resources.displayMetrics.density
}