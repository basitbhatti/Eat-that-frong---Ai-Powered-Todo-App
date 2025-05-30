package com.basitbhatti.todoproject

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.navigation.compose.rememberNavController
import com.basitbhatti.todoproject.presentation.navigation.NavGraph
import com.basitbhatti.todoproject.presentation.theme.ToDoProjectCollaborationTheme
import com.basitbhatti.todoproject.presentation.ui.screens.HomeScreen
import dagger.hilt.android.AndroidEntryPoint

@AndroidEntryPoint
class MainActivity : ComponentActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        setContent {
            ToDoProjectCollaborationTheme {
                NavGraph(this@MainActivity, rememberNavController())
            }
        }
    }
}
