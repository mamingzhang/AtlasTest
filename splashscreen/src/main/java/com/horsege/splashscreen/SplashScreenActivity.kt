package com.horsege.splashscreen

import android.content.Intent
import android.os.Bundle
import android.os.PersistableBundle
import com.horsege.middleawaylibrary.view.activity.BaseActivity
import org.jetbrains.anko.contentView
import org.jetbrains.anko.startActivity

class SplashScreenActivity : BaseActivity<SplashScreenLayout>() {
    override val ui = SplashScreenLayout()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
    }

    override fun onPostCreate(savedInstanceState: Bundle?) {
        super.onPostCreate(savedInstanceState)

        contentView?.postDelayed({
            try {
                val intent = Intent()
                intent.setClassName(baseContext, "com.horsege.atlastest.view.activity.MainActivity")
                startActivity(intent)
            } catch (e : Exception) {
                e.printStackTrace()
            }


            finish()
        },3 * 1000 )
    }
}
