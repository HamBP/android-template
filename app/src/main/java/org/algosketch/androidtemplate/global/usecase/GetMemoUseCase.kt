package org.algosketch.androidtemplate.global.usecase

import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.withContext
import org.algosketch.androidtemplate.data.model.Memo
import org.algosketch.androidtemplate.data.repository.Repository

class GetMemoUseCase(private val repository: Repository) {
    suspend fun run(): Memo {
        return withContext(Dispatchers.IO) {
            repository.getMemo()
        }
    }
}