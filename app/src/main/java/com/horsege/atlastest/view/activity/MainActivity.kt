package com.horsege.atlastest.view.activity

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import com.horsege.atlastest.view.layout.MainLayout

class MainActivity : BaseActivity<MainLayout>() {
    override val ui = MainLayout()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
    }
}
