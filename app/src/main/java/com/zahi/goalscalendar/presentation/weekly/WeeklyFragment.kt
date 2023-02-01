package com.zahi.goalscalendar.presentation.weekly

import com.zahi.goalscalendar.R
import com.zahi.goalscalendar.base.BaseFragment
import com.zahi.goalscalendar.databinding.FragmentWeeklyBinding
import com.zahi.goalscalendar.presentation.MainActivity
import com.zahi.goalscalendar.presentation.monthly.MonthlyFragment

class WeeklyFragment : BaseFragment<FragmentWeeklyBinding>(R.layout.fragment_weekly) {

    private val activity: MainActivity by lazy { requireActivity() as MainActivity }

    override fun initView() {
        binding.apply {
            fragment = this@WeeklyFragment
        }
    }

    companion object {
        @JvmStatic
        fun newInstance() = MonthlyFragment().apply {}
    }
}