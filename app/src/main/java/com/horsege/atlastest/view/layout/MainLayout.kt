package com.horsege.atlastest.view.layout

import android.support.design.widget.BottomNavigationView
import com.horsege.atlastest.view.activity.MainActivity
import com.horsege.middleawaylibrary.view.component.ActivityAnkoComponent
import com.horsege.middleawaylibrary.view.extensions.bottomNavigationView
import org.jetbrains.anko.*

/**
 * Created by mamingzhang on 2017/8/16.
 */
class MainLayout : ActivityAnkoComponent<MainActivity> {
    lateinit var bottomNavigationView : BottomNavigationView

    override fun createView(ui: AnkoContext<MainActivity>) = with(ui) {
        verticalLayout {
            frameLayout {}.lparams { weight = 1.0f }

            bottomNavigationView = bottomNavigationView {
                itemMenu = R.menu.bottom_navigation
            }.lparams(width = matchParent, height = wrapContent)
        }
    }

}