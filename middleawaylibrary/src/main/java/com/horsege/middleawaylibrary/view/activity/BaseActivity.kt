package com.horsege.middleawaylibrary.view.activity

import android.os.Bundle
import android.support.v4.app.FragmentActivity
import com.horsege.middleawaylibrary.view.component.ActivityAnkoComponent
import org.jetbrains.anko.setContentView

/**
 * Created by mamingzhang on 2017/8/16.
 */
abstract class BaseActivity<out UI : ActivityAnkoComponent<out FragmentActivity>> : RBaseActivity() {
    abstract val ui: UI

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        (ui as ActivityAnkoComponent<FragmentActivity>).setContentView(this)
    }
}