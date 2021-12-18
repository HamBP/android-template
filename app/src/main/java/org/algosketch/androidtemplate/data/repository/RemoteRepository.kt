package org.algosketch.androidtemplate.data.repository

import org.algosketch.androidtemplate.data.model.Memo
import org.algosketch.androidtemplate.global.di.MemoService
import org.koin.core.component.KoinComponent
import org.koin.core.component.inject

class RemoteRepository : Repository, KoinComponent {
    private val service: MemoService by inject()

    override suspend fun getMemo(): Memo {
        return service.getMemo()
    }

    override suspend fun writeMemo(content: String) {
        val requestBody = Memo(content)
        service.writeMemo(requestBody)
    }
}