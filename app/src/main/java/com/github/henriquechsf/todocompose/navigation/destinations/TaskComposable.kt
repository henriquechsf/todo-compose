package com.github.henriquechsf.todocompose.navigation.destinations

import androidx.navigation.NavGraphBuilder
import androidx.navigation.NavType
import androidx.navigation.compose.composable
import androidx.navigation.navArgument
import com.github.henriquechsf.todocompose.ui.screens.task.TaskScreen
import com.github.henriquechsf.todocompose.util.Action
import com.github.henriquechsf.todocompose.util.Constants.TASK_ARGUMENT_KEY
import com.github.henriquechsf.todocompose.util.Constants.TASK_SCREEN

fun NavGraphBuilder.taskComposable(
    navigateToListScreen: (Action) -> Unit,
) {

    composable(
        route = TASK_SCREEN,
        arguments = listOf(navArgument(TASK_ARGUMENT_KEY) {
            type = NavType.IntType
        })
    ) { navBackStackEntry ->
        val taskId = navBackStackEntry.arguments!!.getInt(TASK_ARGUMENT_KEY)

        TaskScreen(navigateToListScreen = navigateToListScreen)
    }
}