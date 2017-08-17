package com.horsege.middleawaylibrary.view.extensions

import android.content.Context
import android.support.design.widget.BottomNavigationView
import android.view.ViewManager
import org.jetbrains.anko.AnkoViewDslMarker
import org.jetbrains.anko.custom.ankoView
import org.jetbrains.anko.internals.AnkoInternals

/**
 * Created by mamingzhang on 2017/8/16.
 */
inline fun ViewManager.bottomNavigationView(init: (@AnkoViewDslMarker BottomNavigationView).() -> Unit): BottomNavigationView {
    return ankoView({ ctx: Context -> BottomNavigationView(ctx) }, theme = 0) {
        init()
    }
}

var BottomNavigationView.itemMenu: Int
    @Deprecated(AnkoInternals.NO_GETTER, level = DeprecationLevel.ERROR) get() = AnkoInternals.noGetter()
    set(value) = inflateMenu(value)