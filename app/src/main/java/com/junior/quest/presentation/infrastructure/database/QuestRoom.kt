package com.junior.quest.presentation.infrastructure.database

import android.content.Context
import androidx.room.Room
import dagger.hilt.android.qualifiers.ApplicationContext
import javax.inject.Inject
import javax.inject.Singleton

@Singleton
class QuestRoom @Inject constructor(
    @param:ApplicationContext private val context: Context
) {

    private var instance: QuestRoomDatabase? = null

    fun initialize() {
        instance = Room.databaseBuilder(context, QuestRoomDatabase::class.java, "quest_database")
            .fallbackToDestructiveMigration()
            .build()
    }
}
