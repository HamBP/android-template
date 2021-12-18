package org.algosketch.androidtemplate.global.di

import org.algosketch.androidtemplate.data.model.Memo
import org.algosketch.androidtemplate.data.repository.LocalRepository
import org.algosketch.androidtemplate.data.repository.RemoteRepository
import org.algosketch.androidtemplate.data.repository.Repository
import org.algosketch.androidtemplate.global.configs.ServerConfigs
import org.algosketch.androidtemplate.global.usecase.GetMemoUseCase
import org.algosketch.androidtemplate.global.usecase.WriteMemoUseCase
import org.koin.dsl.module
import retrofit2.Call
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory
import retrofit2.create
import retrofit2.http.*

val repositoryModule = module {
    single { LocalRepository() }
    single { RemoteRepository() }
    single<MemoService> { Retrofit.Builder()
        .baseUrl(ServerConfigs.baseUrl)
        .addConverterFactory(GsonConverterFactory.create())
        .build()
        .create(MemoService::class.java)
    }
}
