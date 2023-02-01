package com.zahi.goalscalendar.presentation.monthly

import com.zahi.goalscalendar.R
import com.zahi.goalscalendar.base.BaseFragment
import com.zahi.goalscalendar.databinding.FragmentMonthlyBinding
import com.zahi.goalscalendar.presentation.MainActivity

class MonthlyFragment : BaseFragment<FragmentMonthlyBinding>(R.layout.fragment_monthly) {

    private val activity: MainActivity by lazy { requireActivity() as MainActivity }

    override fun initView() {
        binding.apply {
            fragment = this@MonthlyFragment
        }
    }

    companion object {
        @JvmStatic
        fun newInstance() = MonthlyFragment().apply {}
    }
}