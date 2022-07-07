package com.technowave.demoapp.di

import android.content.Context
import androidx.room.Room
import com.technowave.demoapp.db.DataDao
import com.technowave.demoapp.db.DataDatabase
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.android.qualifiers.ApplicationContext
import dagger.hilt.components.SingletonComponent
import javax.inject.Singleton

@Module
@InstallIn(SingletonComponent::class)
object AppModule {


    @Singleton
    @Provides
    fun provideYourDatabase(
        @ApplicationContext app: Context
    ) = Room.databaseBuilder(
        app,
        DataDatabase::class.java,
        "Database"
    ).build()

    @Singleton
    @Provides
    fun provideYourDao(db: DataDatabase): DataDao {
        return db.getDataDao()
    }
}

