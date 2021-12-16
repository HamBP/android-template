package org.algosketch.androidtemplate.feature.memo

import android.util.Log
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import org.algosketch.androidtemplate.data.repository.LocalRepository
import org.algosketch.androidtemplate.global.base.BaseViewModel
import org.algosketch.androidtemplate.global.usecase.GetMemoUseCase
import org.algosketch.androidtemplate.global.usecase.WriteMemoUseCase
import org.koin.core.component.inject

class MemoViewModel : BaseViewModel() {
    val getMemoUseCase: GetMemoUseCase by inject()
    val writeMemoUseCase: WriteMemoUseCase by inject()

    private val _storedMemo = MutableLiveData<String>()
    val storedMemo = _storedMemo
    var inputMemo = MutableLiveData<String?>()

    fun getMemo() {
        val memo = getMemoUseCase.run().content
        storedMemo.postValue(memo)
    }

    fun writeMemo() {
        writeMemoUseCase.run(inputMemo.value.toString())
    }
}