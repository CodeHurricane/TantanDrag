package com.example.administrator.drawerlayoutdemo

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.support.v7.app.ActionBarDrawerToggle
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        setSupportActionBar(toolbar)
        supportActionBar?.setDisplayHomeAsUpEnabled(true)
        val actionBarDrawerToggle=ActionBarDrawerToggle(this,drawer_layout,toolbar,R.string.abc_action_bar_home_description,R.string.abc_action_bar_home_description)
        actionBarDrawerToggle.syncState()
        drawer_layout.setDrawerListener(actionBarDrawerToggle)
        nav_view.setNavigationItemSelectedListener {

            true
        }
    }
}
