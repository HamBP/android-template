package org.algosketch.androidtemplate.global.usecase

import android.content.Context
import org.algosketch.androidtemplate.data.repository.Repository

class GetMemoUseCase() {
    fun run(context: Context): String? {
        val sharedPref = context.getSharedPreferences("MY_MEMO", Context.MODE_PRIVATE)
        return sharedPref.getString("memo", "null")
    }
}