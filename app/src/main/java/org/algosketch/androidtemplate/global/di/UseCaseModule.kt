package org.algosketch.androidtemplate.global.di

import org.algosketch.androidtemplate.global.usecase.GetMemoUseCase
import org.algosketch.androidtemplate.global.usecase.WriteMemoUseCase
import org.koin.dsl.module

val useCaseModule = module {
    single { GetMemoUseCase(get()) }
    single { WriteMemoUseCase(get()) }
}