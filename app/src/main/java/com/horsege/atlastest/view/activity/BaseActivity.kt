package com.horsege.atlastest.view.activity

import android.os.Bundle
import android.os.PersistableBundle
import android.support.v4.app.FragmentActivity
import com.horsege.atlastest.view.component.ActivityAnkoComponent
import org.jetbrains.anko.setContentView

/**
 * Created by mamingzhang on 2017/8/16.
 */
abstract class BaseActivity<out UI : ActivityAnkoComponent<out FragmentActivity>> : FragmentActivity() {
    abstract val ui: UI

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        (ui as ActivityAnkoComponent<FragmentActivity>).setContentView(this)
    }
}