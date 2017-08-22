package com.horsege.firstbundle

import android.os.Bundle
import com.horsege.middleawaylibrary.view.activity.BaseActivity

class FirstBundleActivity : BaseActivity<FirstBundleLayout>() {
    override val ui = FirstBundleLayout()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
    }
}
