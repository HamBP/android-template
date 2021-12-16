package org.algosketch.androidtemplate.global.usecase

import android.content.Context
import org.algosketch.androidtemplate.global.constant.LocalStorageKeys

class WriteMemoUseCase() {
    fun run(context: Context, content: String) {
        val sharedPref = context.getSharedPreferences(LocalStorageKeys.default, Context.MODE_PRIVATE)
        with(sharedPref.edit()) {
            putString("memo", content)
            commit()
        }
    }
}