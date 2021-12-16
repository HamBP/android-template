package org.algosketch.androidtemplate.global.di

import org.algosketch.androidtemplate.data.repository.LocalRepository
import org.algosketch.androidtemplate.data.repository.Repository
import org.algosketch.androidtemplate.global.usecase.GetMemoUseCase
import org.algosketch.androidtemplate.global.usecase.WriteMemoUseCase
import org.koin.dsl.module

val repositoryModule = module {
    single<Repository> { LocalRepository() }
}