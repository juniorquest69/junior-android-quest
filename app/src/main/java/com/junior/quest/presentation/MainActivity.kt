package com.junior.quest.presentation

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.activity.viewModels
import androidx.core.view.WindowCompat.enableEdgeToEdge
import com.junior.quest.presentation.ui.MainScreen
import com.junior.quest.presentation.ui.MainViewModel
import com.junior.quest.presentation.ui.theme.JuniorQuestTheme
import dagger.hilt.android.AndroidEntryPoint

@AndroidEntryPoint
class MainActivity : ComponentActivity() {

    private val viewModel: MainViewModel by viewModels()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            JuniorQuestTheme {
                MainScreen(viewModel)
            }
        }
    }
}
