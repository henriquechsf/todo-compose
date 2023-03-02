package com.github.henriquechsf.todocompose.ui.screens.task

import androidx.compose.foundation.layout.padding
import androidx.compose.material.Scaffold
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.ui.Modifier
import com.github.henriquechsf.todocompose.data.models.Priority
import com.github.henriquechsf.todocompose.data.models.TodoTask
import com.github.henriquechsf.todocompose.ui.viewmodels.SharedViewModel
import com.github.henriquechsf.todocompose.util.Action

@Composable
fun TaskScreen(
    sharedViewModel: SharedViewModel,
    selectedTask: TodoTask?,
    navigateToListScreen: (Action) -> Unit,
) {

    val title: String by sharedViewModel.title
    val description: String by sharedViewModel.description
    val priority: Priority by sharedViewModel.priority

    Scaffold(
        topBar = {
            TaskAppBar(
                selectedTask = selectedTask,
                navigateToListScreen = navigateToListScreen
            )
        },
        content = { it ->
            TaskContent(
                modifier = Modifier.padding(it),
                title = title,
                onTitleChange = {
                    sharedViewModel.updateTitle(it)
                },
                description = description,
                onDescriptionChange = {
                    sharedViewModel.description.value = it
                },
                priority = priority,
                onPrioritySelected = {
                    sharedViewModel.priority.value = it
                }
            )
        }
    )
}