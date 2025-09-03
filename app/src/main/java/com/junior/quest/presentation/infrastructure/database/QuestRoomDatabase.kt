package com.junior.quest.presentation.infrastructure.database

import androidx.room.Database
import androidx.room.RoomDatabase

@Database(
    entities = [
        // to remove when some real entity is created
        SampleRoomData::class
    ],
    version = 1
)
abstract class QuestRoomDatabase : RoomDatabase() {}
