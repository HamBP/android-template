package org.algosketch.androidtemplate.global.usecase

import org.algosketch.androidtemplate.data.repository.Repository

class WriteMemoUseCase(val repository: Repository) {
    fun run(content: String) {
        repository.writeMemo(content)
    }
}