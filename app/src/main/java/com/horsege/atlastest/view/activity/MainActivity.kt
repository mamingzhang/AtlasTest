package com.horsege.atlastest.view.activity

import android.os.Bundle
import android.support.v4.widget.DrawerLayout
import android.support.v7.app.ActionBarDrawerToggle
import android.support.v7.widget.Toolbar
import com.horsege.atlastest.R
import com.horsege.middleawaylibrary.view.activity.RBaseActivity
import org.jetbrains.anko.find

class MainActivity : RBaseActivity() {

    private lateinit var toolbar: Toolbar

    private lateinit var drawer: DrawerLayout
    private lateinit var toggle: ActionBarDrawerToggle

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        initToolBar()
        initDrawerLayout()
    }

    override fun onDestroy() {
        super.onDestroy()

        drawer.removeDrawerListener(toggle)
    }

    private fun initToolBar(): Unit {
        toolbar = find(R.id.toolBar)
        setSupportActionBar(toolbar)
    }

    private fun initDrawerLayout(): Unit {
        drawer = find(R.id.drawerLayout)
        toggle = ActionBarDrawerToggle(
                this, drawer, toolbar, R.string.drawerlayout_open, R.string.drawerlayout_close)
        drawer.addDrawerListener(toggle)
        toggle.syncState()
    }
}
