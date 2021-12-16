package org.algosketch.androidtemplate.global.usecase

import android.content.Context
import org.algosketch.androidtemplate.data.repository.Repository

class WriteMemoUseCase() {
    fun run(context: Context, content: String) {
        val sharedPref = context.getSharedPreferences("MY_MEMO", Context.MODE_PRIVATE)
        with(sharedPref.edit()) {
            putString("memo", content)
            commit()
        }
    }
}