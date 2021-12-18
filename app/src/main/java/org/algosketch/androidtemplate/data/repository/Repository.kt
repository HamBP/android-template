package org.algosketch.androidtemplate.data.repository

import org.algosketch.androidtemplate.data.model.Memo

interface Repository {
    suspend fun getMemo(): Memo
    suspend fun writeMemo(content: String)
}