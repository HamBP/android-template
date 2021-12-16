package org.algosketch.androidtemplate.feature.home

import org.algosketch.androidtemplate.global.base.BaseViewModel
import org.algosketch.androidtemplate.global.util.SingleLiveEvent

class HomeViewModel : BaseViewModel() {
    val startNextFragment = SingleLiveEvent<Any>()

    fun startNextWithLocalData() {
        startNextFragment.call()
    }

    fun startNextWithServerData() {
        startNextFragment.call()
    }
}