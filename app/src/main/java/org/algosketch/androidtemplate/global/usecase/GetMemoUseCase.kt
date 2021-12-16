package org.algosketch.androidtemplate.global.usecase

import android.content.Context
import org.algosketch.androidtemplate.data.repository.Repository
import org.algosketch.androidtemplate.global.constant.LocalStorageKeys

class GetMemoUseCase() {
    fun run(context: Context): String? {
        val sharedPref = context.getSharedPreferences(LocalStorageKeys.default, Context.MODE_PRIVATE)
        return sharedPref.getString("memo", "null")
    }
}