package org.algosketch.androidtemplate.feature.memo

import androidx.fragment.app.viewModels
import org.algosketch.androidtemplate.R
import org.algosketch.androidtemplate.databinding.FragmentMemoBinding
import org.algosketch.androidtemplate.global.base.BaseFragment

class MemoFragment : BaseFragment<FragmentMemoBinding>() {
    override val layoutResourceId = R.layout.fragment_memo
    private val viewModel: MemoViewModel by viewModels()

    override fun initDataBinding() {
        binding.viewModel = viewModel
    }
}