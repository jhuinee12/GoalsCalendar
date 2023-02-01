package com.zahi.goalscalendar.presentation.daily

import com.zahi.goalscalendar.R
import com.zahi.goalscalendar.base.BaseFragment
import com.zahi.goalscalendar.databinding.FragmentDailyBinding
import com.zahi.goalscalendar.presentation.MainActivity
import com.zahi.goalscalendar.presentation.monthly.MonthlyFragment

class DailyFragment : BaseFragment<FragmentDailyBinding>(R.layout.fragment_daily) {

    private val activity: MainActivity by lazy { requireActivity() as MainActivity }

    override fun initView() {
        binding.apply {
            fragment = this@DailyFragment
        }
    }

    companion object {
        @JvmStatic
        fun newInstance() = MonthlyFragment().apply {}
    }
}