package org.algosketch.androidtemplate.data.repository

import android.content.Context
import org.algosketch.androidtemplate.data.model.Memo
import org.algosketch.androidtemplate.global.constant.LocalStorageKeys
import org.algosketch.androidtemplate.global.util.MyApplication

class LocalRepository : Repository {
    override fun getMemo(): Memo {
        val context = MyApplication.applicationContext()
        val sharedPref = context.getSharedPreferences(LocalStorageKeys.default, Context.MODE_PRIVATE)
        return Memo(sharedPref.getString("memo", "null"))
    }

    override fun writeMemo(content: String) {
        val context = MyApplication.applicationContext()
        val sharedPref = context.getSharedPreferences(LocalStorageKeys.default, Context.MODE_PRIVATE)
        with(sharedPref.edit()) {
            putString("memo", content)
            commit()
        }
    }
}