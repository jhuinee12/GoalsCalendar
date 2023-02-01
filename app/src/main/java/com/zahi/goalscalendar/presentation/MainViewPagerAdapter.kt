package com.zahi.goalscalendar.presentation

import androidx.fragment.app.Fragment
import androidx.fragment.app.FragmentManager
import androidx.lifecycle.Lifecycle
import androidx.viewpager2.adapter.FragmentStateAdapter
import com.zahi.goalscalendar.presentation.daily.DailyFragment
import com.zahi.goalscalendar.presentation.monthly.MonthlyFragment
import com.zahi.goalscalendar.presentation.weekly.WeeklyFragment

private const val NUM_TABS = 3

class MainViewPagerAdapter(fragmentManager: FragmentManager, lifecycle: Lifecycle) :
    FragmentStateAdapter(fragmentManager, lifecycle) {

    override fun getItemCount(): Int {
        return NUM_TABS
    }

    override fun createFragment(position: Int): Fragment {
        when (position) {
            0 -> return MonthlyFragment()
            1 -> return WeeklyFragment()
            2 -> return DailyFragment()
        }
        return MonthlyFragment()
    }
}