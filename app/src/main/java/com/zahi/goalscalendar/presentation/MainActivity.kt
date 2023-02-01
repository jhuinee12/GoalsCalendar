package com.zahi.goalscalendar.presentation

import android.view.MenuItem
import com.zahi.goalscalendar.R
import com.zahi.goalscalendar.base.BaseActivity
import com.zahi.goalscalendar.databinding.ActivityMainBinding

class MainActivity : BaseActivity<ActivityMainBinding>(R.layout.activity_main) {

    override fun initView() { }

    override fun initViewModel() { }


    override fun onOptionsItemSelected(item: MenuItem): Boolean {
        onBackPressed()
        return true
    }

}