package com.zahi.goalscalendar.presentation

import android.view.MenuItem
import com.google.android.material.tabs.TabLayoutMediator
import com.zahi.goalscalendar.R
import com.zahi.goalscalendar.base.BaseActivity
import com.zahi.goalscalendar.databinding.ActivityMainBinding

class MainActivity : BaseActivity<ActivityMainBinding>(R.layout.activity_main) {

    override fun initView() {
        val viewPager = binding.container
        val tabLayout = binding.tabLayout

        viewPager.adapter = MainViewPagerAdapter(supportFragmentManager, lifecycle)

        TabLayoutMediator(tabLayout, viewPager) { tab, position ->
            tab.text = resources.getStringArray(R.array.tab_name)[position]
        }.attach()
    }

    override fun initViewModel() { }


    override fun onOptionsItemSelected(item: MenuItem): Boolean {
        onBackPressed()
        return true
    }

}