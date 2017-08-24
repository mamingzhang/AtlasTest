package com.horsege.secondbundle

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import com.horsege.middleawaylibrary.view.activity.BaseActivity

class SecondBundleActivity : BaseActivity<SecondBundleLayout>() {
    override val ui = SecondBundleLayout()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
    }
}
