package com.horsege.middleawaylibrary.view.component

import android.view.View
import android.view.ViewGroup
import org.jetbrains.anko.AnkoComponent
import org.jetbrains.anko.AnkoContext

/**
 * Created by mamingzhang on 2017/8/16.
 */
interface ViewGroupComponent<T: ViewGroup> : AnkoComponent<T> {
    val view: T

    fun inflate() : View {
        val ctx = AnkoContext.Companion.create(view.context, view)
        return createView(ctx)
    }
}