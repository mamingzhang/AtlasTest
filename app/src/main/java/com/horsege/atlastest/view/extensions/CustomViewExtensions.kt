package com.horsege.atlastest.view.extensions

import android.graphics.Color
import android.view.ViewManager
import org.jetbrains.anko.px2sp
import org.jetbrains.anko.singleLine
import org.jetbrains.anko.textColor
import org.jetbrains.anko.textView

/**
 * Created by mamingzhang on 2017/8/16.
 */
fun ViewManager.singleTxtView(displayTxt : String) = textView(displayTxt) {
    textSize = px2sp(30)
    textColor = Color.WHITE
    singleLine = true
}