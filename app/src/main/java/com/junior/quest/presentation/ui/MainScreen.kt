package com.junior.quest.presentation.ui

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Button
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import com.junior.quest.presentation.ui.theme.JuniorQuestTheme

@Preview
@Composable
fun MainScreenPreview() {
    JuniorQuestTheme {
        MainScreenContent(viewModelTest = {})
    }
}

@Composable
fun MainScreen(viewModel: MainViewModel) {
    MainScreenContent(viewModel::test)
}

@Composable
fun MainScreenContent(
    viewModelTest: () -> Unit
) {
    Scaffold(modifier = Modifier.fillMaxSize()) { innerPadding ->
        Column {
            Greeting(
                name = "Android",
                modifier = Modifier.padding(innerPadding)
            )
            Button(onClick = viewModelTest) {
                Text("View model test")
            }
        }
    }
}

@Composable
fun Greeting(name: String, modifier: Modifier = Modifier) {
    Text(
        text = "Hello $name!",
        modifier = modifier
    )
}
