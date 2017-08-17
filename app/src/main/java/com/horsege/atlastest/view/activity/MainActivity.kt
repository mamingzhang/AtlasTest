package com.horsege.atlastest.view.activity

import android.os.Bundle
import com.horsege.atlastest.view.layout.MainLayout
import com.horsege.middleawaylibrary.view.activity.BaseActivity

class MainActivity : BaseActivity<MainLayout>() {
    override val ui = MainLayout()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
    }
}
