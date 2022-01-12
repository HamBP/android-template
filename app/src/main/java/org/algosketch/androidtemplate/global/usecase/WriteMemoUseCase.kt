package org.algosketch.androidtemplate.global.usecase

import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.withContext
import org.algosketch.androidtemplate.data.repository.Repository

class WriteMemoUseCase(private val repository: Repository) {
    suspend fun run(content: String) {
        return withContext(Dispatchers.IO) {
            repository.writeMemo(content)
        }
    }
}