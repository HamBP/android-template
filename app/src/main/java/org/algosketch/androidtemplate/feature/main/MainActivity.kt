package org.algosketch.androidtemplate.feature.main

import android.content.Intent
import android.os.Bundle
import androidx.activity.viewModels
import org.algosketch.androidtemplate.R
import org.algosketch.androidtemplate.databinding.ActivityMainBinding
import org.algosketch.androidtemplate.global.base.BaseActivity

class MainActivity : BaseActivity<ActivityMainBinding>() {
    override val layoutResourceId = R.layout.activity_main
    private val viewModel: MainViewModel by viewModels()

    override fun initDataBinding() {
        binding.viewModel = viewModel
    }
}