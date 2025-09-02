package com.junior.quest

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import com.junior.quest.ui.MainScreen
import com.junior.quest.ui.theme.JuniorQuestTheme

class MainActivity : ComponentActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            JuniorQuestTheme {
                MainScreen()
            }
        }
    }
}
