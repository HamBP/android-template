package org.algosketch.androidtemplate.feature.memo

import android.util.Log
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import org.algosketch.androidtemplate.global.usecase.GetMemoUseCase
import org.algosketch.androidtemplate.global.usecase.WriteMemoUseCase
import org.algosketch.androidtemplate.global.util.MyApplication

class MemoViewModel : ViewModel() {
    val getMemoUseCase = GetMemoUseCase()
    val writeMemoUseCase = WriteMemoUseCase()

    private val _storedMemo = MutableLiveData<String>()
    val storedMemo = _storedMemo
    var inputMemo = MutableLiveData<String?>()

    fun getMemo() {
        storedMemo.postValue(getMemoUseCase.run(MyApplication.applicationContext()))
    }

    fun writeMemo() {
        writeMemoUseCase.run(MyApplication.applicationContext(), inputMemo.value.toString())
    }
}