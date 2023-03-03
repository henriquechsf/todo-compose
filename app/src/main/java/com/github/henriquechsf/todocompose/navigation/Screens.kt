package com.github.henriquechsf.todocompose.navigation

import androidx.navigation.NavHostController
import com.github.henriquechsf.todocompose.util.Action
import com.github.henriquechsf.todocompose.util.Constants.LIST_SCREEN
import com.github.henriquechsf.todocompose.util.Constants.SPLASH_SCREEN

class Screens(navController: NavHostController) {

    val splash: () -> Unit = {
        navController.navigate(route = "list/${Action.NO_ACTION.name}") {
            popUpTo(SPLASH_SCREEN) { inclusive = true }
        }
    }

    val list: (Int) -> Unit = { taskId ->
        navController.navigate("task/$taskId")
    }

    val task: (Action) -> Unit = { action ->
        navController.navigate("list/${action.name}") {
            popUpTo(LIST_SCREEN) { inclusive = true }
        }
    }
}