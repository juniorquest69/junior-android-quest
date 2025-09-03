package com.junior.quest

import android.app.Application
import com.junior.quest.presentation.infrastructure.database.QuestRoom
import dagger.hilt.android.HiltAndroidApp
import javax.inject.Inject

@HiltAndroidApp
class QuestApplication : Application() {

    @Inject lateinit var questRoom: QuestRoom

    override fun onCreate() {
        super.onCreate()

        questRoom.initialize()
    }
}
