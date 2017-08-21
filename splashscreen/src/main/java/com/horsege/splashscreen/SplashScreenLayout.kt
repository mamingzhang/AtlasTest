package com.horsege.splashscreen

import android.graphics.Color
import com.horsege.middleawaylibrary.view.component.ActivityAnkoComponent
import com.horsege.middleawaylibrary.view.extensions.singleTxtView
import org.jetbrains.anko.AnkoContext
import org.jetbrains.anko.backgroundColor
import org.jetbrains.anko.verticalLayout

/**
 * Created by mamingzhang on 2017/8/21.
 */
class SplashScreenLayout : ActivityAnkoComponent<SplashScreenActivity> {
    override fun createView(ui: AnkoContext<SplashScreenActivity>) = with(ui) {
        verticalLayout {
            backgroundColor = Color.WHITE

            singleTxtView("SplashScreen")
        }
    }
}