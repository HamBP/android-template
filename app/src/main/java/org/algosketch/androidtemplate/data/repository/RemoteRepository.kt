package org.algosketch.androidtemplate.data.repository

import android.util.Log
import org.algosketch.androidtemplate.data.model.Memo
import org.algosketch.androidtemplate.global.di.MemoService
import org.koin.core.component.KoinComponent
import org.koin.core.component.inject
import java.lang.Exception

class RemoteRepository : Repository, KoinComponent {
    private val service: MemoService by inject()

    override suspend fun getMemo(): Memo {
        val result = service.getMemo()

        return if(result.isSuccessful) result.body()!! else throw Exception("UNKNOWN ERROR")
    }

    override suspend fun writeMemo(content: String) {
        val requestBody = Memo(content)
        val result = service.writeMemo(requestBody)

        if(!result.isSuccessful) {
            throw Exception("UNKNOWN ERROR")
        }
    }
}