package org.algosketch.androidtemplate.feature.home

import androidx.lifecycle.ViewModel
import org.algosketch.androidtemplate.global.util.SingleLiveEvent

class HomeViewModel : ViewModel() {
    val startNextFragment = SingleLiveEvent<Any>()

    fun startNextWithLocalData() {
        startNextFragment.call()
    }

    fun startNextWithServerData() {
        startNextFragment.call()
    }
}