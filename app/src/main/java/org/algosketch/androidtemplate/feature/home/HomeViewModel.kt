package org.algosketch.androidtemplate.feature.home

import android.util.Log
import kotlinx.coroutines.CoroutineScope
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.launch
import org.algosketch.androidtemplate.data.repository.LocalRepository
import org.algosketch.androidtemplate.data.repository.RemoteRepository
import org.algosketch.androidtemplate.global.base.BaseViewModel
import org.algosketch.androidtemplate.global.store.Store
import org.algosketch.androidtemplate.global.util.SingleLiveEvent
import org.koin.core.component.inject

class HomeViewModel : BaseViewModel() {
    val startNextFragment = SingleLiveEvent<Any>()

    fun startNextWithLocalData() {
        Store.repository = inject<LocalRepository>()
        startNextFragment.call()
    }

    fun startNextWithServerData() {
        Store.repository = inject<RemoteRepository>()
        startNextFragment.call()
    }
}