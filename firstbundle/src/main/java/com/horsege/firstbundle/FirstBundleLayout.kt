package com.horsege.firstbundle

import android.graphics.Color
import android.view.Gravity
import com.horsege.middleawaylibrary.view.component.ActivityAnkoComponent
import com.horsege.middleawaylibrary.view.extensions.singleTxtView
import org.jetbrains.anko.AnkoContext
import org.jetbrains.anko.backgroundColor
import org.jetbrains.anko.verticalLayout

/**
 * Created by mamingzhang on 2017/8/22.
 */
class FirstBundleLayout : ActivityAnkoComponent<FirstBundleActivity> {
    override fun createView(ui: AnkoContext<FirstBundleActivity>) = with(ui) {
        verticalLayout {
            backgroundColor = Color.WHITE

            singleTxtView("FirstBundleActivity").lparams { gravity = Gravity.CENTER_HORIZONTAL }
        }
    }
}