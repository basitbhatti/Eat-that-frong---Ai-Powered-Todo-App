package com.basitbhatti.todoproject

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import com.basitbhatti.todoproject.presentation.theme.ToDoProjectCollaborationTheme
import com.basitbhatti.todoproject.presentation.ui.screens.HomeScreen
import com.basitbhatti.todoproject.presentation.ui.screens.PersonTypeScreen

class MainActivity : ComponentActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        setContent {
            ToDoProjectCollaborationTheme {
//                PersonTypeScreen(context = this@MainActivity, onButtonClick = {
//
//                })
                HomeScreen()
            }
        }
    }
}
