package com.horsege.atlastest.view.activity

import android.content.Intent
import android.os.Bundle
import android.support.design.widget.BottomNavigationView
import android.support.design.widget.NavigationView
import android.support.v4.view.GravityCompat
import android.support.v4.widget.DrawerLayout
import android.support.v7.app.ActionBarDrawerToggle
import android.support.v7.widget.Toolbar
import android.view.ViewGroup
import com.horsege.atlastest.R
import com.horsege.middleawaylibrary.view.activity.RBaseActivity
import com.taobao.android.ActivityGroupDelegate
import org.jetbrains.anko.find
import org.jetbrains.anko.toast

class MainActivity : RBaseActivity() {

    private lateinit var toolbar: Toolbar

    private lateinit var drawer: DrawerLayout
    private lateinit var toggle: ActionBarDrawerToggle

    private lateinit var actContainer: ViewGroup

    private lateinit var actGroupCompat: ActivityGroupDelegate

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        initToolBar()
        initDrawerLayout()
        initBottomNavView()
        initNavView()

        actContainer = find(R.id.content)

        actGroupCompat = ActivityGroupDelegate(this, savedInstanceState)

        switchToActivity("FirstBundle", "com.horsege.firstbundle.FirstBundleActivity")
//        switchToActivity("SecondBundle", "com.horsege.secondbundle.SecondBundleActivity")
    }

    override fun onBackPressed() {
        if (drawer.isDrawerOpen(GravityCompat.START)) {
            drawer.closeDrawer(GravityCompat.START)
        } else {
            super.onBackPressed()
        }
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

    private fun initBottomNavView(): Unit {
        find<BottomNavigationView>(R.id.bottomNavView).setOnNavigationItemSelectedListener {
            when (it.itemId) {
                R.id.first_tab -> {
                    toast("First Tab")
                    switchToActivity("FirstBundle", "com.horsege.firstbundle.FirstBundleActivity")
                }
                R.id.second_tab -> {
                    toast("Second Tab")
                    switchToActivity("SecondBundle", "com.horsege.secondbundle.SecondBundleActivity")
                }
            }

            return@setOnNavigationItemSelectedListener true
        }
    }

    private fun initNavView(): Unit {
        find<NavigationView>(R.id.navigationView).setNavigationItemSelectedListener {
            when (it.itemId) {
                R.id.title1 -> toast("Title1")
                else -> toast("Else")
            }

            drawer.closeDrawer(GravityCompat.START)

            return@setNavigationItemSelectedListener true
        }
    }

    fun switchToActivity(key: String, activityName: String) {
        val intent = Intent()
        intent.setClassName(baseContext, activityName)
        actGroupCompat.startChildActivity(actContainer, key, intent)
    }
}
