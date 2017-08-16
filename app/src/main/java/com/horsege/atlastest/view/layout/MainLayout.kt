package com.horsege.atlastest.view.layout

import com.horsege.atlastest.view.activity.MainActivity
import com.horsege.atlastest.view.component.ActivityAnkoComponent
import com.horsege.atlastest.view.extensions.singleTxtView
import org.jetbrains.anko.AnkoContext
import org.jetbrains.anko.verticalLayout

/**
 * Created by mamingzhang on 2017/8/16.
 */
class MainLayout : ActivityAnkoComponent<MainActivity> {
    override fun createView(ui: AnkoContext<MainActivity>) = with(ui) {
        verticalLayout {
            singleTxtView("MainActivity")
        }
    }

}