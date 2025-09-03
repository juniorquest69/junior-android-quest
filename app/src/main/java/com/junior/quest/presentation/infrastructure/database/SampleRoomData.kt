package com.junior.quest.presentation.infrastructure.database

import androidx.room.ColumnInfo
import androidx.room.Entity

// to remove when some real entity is created
@Entity(tableName = "sample_table", primaryKeys = ["name"])
data class SampleRoomData(
    @ColumnInfo("name") val name: String
)
