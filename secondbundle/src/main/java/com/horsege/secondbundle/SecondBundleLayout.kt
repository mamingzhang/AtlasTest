package com.horsege.secondbundle

import android.graphics.Color
import android.view.Gravity
import com.horsege.middleawaylibrary.view.component.ActivityAnkoComponent
import com.horsege.middleawaylibrary.view.extensions.singleTxtView
import org.jetbrains.anko.AnkoContext
import org.jetbrains.anko.backgroundColor
import org.jetbrains.anko.verticalLayout

/**
 * Created by mamingzhang on 2017/8/24.
 */
class SecondBundleLayout : ActivityAnkoComponent<SecondBundleActivity> {
    override fun createView(ui: AnkoContext<SecondBundleActivity>) = with(ui) {
        verticalLayout {
            backgroundColor = Color.WHITE

            singleTxtView("SecondBundleActivity").lparams { gravity = Gravity.CENTER_HORIZONTAL }
        }
    }
}