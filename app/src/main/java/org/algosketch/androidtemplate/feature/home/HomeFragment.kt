package org.algosketch.androidtemplate.feature.home

import androidx.fragment.app.viewModels
import org.algosketch.androidtemplate.R
import org.algosketch.androidtemplate.databinding.FragmentHomeBinding
import org.algosketch.androidtemplate.global.base.BaseFragment

class HomeFragment : BaseFragment<FragmentHomeBinding>() {
    override val layoutResourceId = R.layout.fragment_home
    private val viewModel: HomeViewModel by viewModels()

    override fun initDataBinding() {
        binding.viewModel = viewModel
    }
}