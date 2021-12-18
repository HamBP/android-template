package org.algosketch.androidtemplate.global.di

import org.algosketch.androidtemplate.global.store.Store
import org.algosketch.androidtemplate.global.usecase.GetMemoUseCase
import org.algosketch.androidtemplate.global.usecase.WriteMemoUseCase
import org.koin.dsl.module

val useCaseModule = module {
    factory { GetMemoUseCase(Store.repository.value) }
    factory { WriteMemoUseCase(Store.repository.value) }
}