package org.algosketch.androidtemplate.data.repository

import org.algosketch.androidtemplate.data.model.Memo

interface Repository {
    fun getMemo(): Memo
    fun writeMemo(content: String)
}