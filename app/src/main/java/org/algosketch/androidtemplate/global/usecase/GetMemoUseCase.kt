package org.algosketch.androidtemplate.global.usecase

import org.algosketch.androidtemplate.data.model.Memo
import org.algosketch.androidtemplate.data.repository.Repository

class GetMemoUseCase(private val repository: Repository) {
    fun run(): Memo {
        return repository.getMemo()
    }
}