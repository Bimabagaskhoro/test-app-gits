package com.bimabagaskhoro.gits

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.bimabagaskhoro.gits.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        val activityMainBinding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(activityMainBinding.root)

        val actionbar = supportActionBar
        actionbar!!.title = getString(R.string.app_name)

        val sectionsPagerAdapter = SectionsPagerAdapter(this, supportFragmentManager)
        activityMainBinding.viewPager.adapter = sectionsPagerAdapter
        activityMainBinding.tabs.setupWithViewPager(activityMainBinding.viewPager)
        supportActionBar?.elevation = 0f
    }
}