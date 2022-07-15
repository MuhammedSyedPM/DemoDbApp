package com.technowave.demoapp.di


import com.technowave.demoapp.db.DataDao
import com.technowave.demoapp.repository.MainRepo
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.android.components.ServiceComponent
import javax.inject.Singleton


@Module
@InstallIn(ServiceComponent::class)
object AppModuleService {



    @Singleton
    @Provides
    fun provideMainRepository(
        db: DataDao
    ): MainRepo = MainRepo(db)



}

