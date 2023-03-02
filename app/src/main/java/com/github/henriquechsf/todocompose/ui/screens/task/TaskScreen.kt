package com.github.henriquechsf.todocompose.ui.screens.task

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.padding
import androidx.compose.material.Scaffold
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import com.github.henriquechsf.todocompose.util.Action

@Composable
fun TaskScreen(
    navigateToListScreen: (Action) -> Unit
) {
    Scaffold(
        topBar = {
            TaskAppBar(navigateToListScreen = navigateToListScreen)
        },
        content = {
            Column(modifier = Modifier.padding(it)) {

            }
        }
    )
}