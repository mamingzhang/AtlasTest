package com.horsege.splashscreen

import android.os.Bundle
import com.horsege.middleawaylibrary.view.activity.BaseActivity

class SplashScreenActivity : BaseActivity<SplashScreenLayout>() {
    override val ui = SplashScreenLayout()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
    }
}
