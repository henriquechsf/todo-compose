package com.github.henriquechsf.todocompose.navigation

import androidx.compose.runtime.Composable
import androidx.compose.runtime.remember
import androidx.navigation.NavHostController
import androidx.navigation.compose.NavHost
import com.github.henriquechsf.todocompose.navigation.destinations.listComposable
import com.github.henriquechsf.todocompose.navigation.destinations.splashComposable
import com.github.henriquechsf.todocompose.navigation.destinations.taskComposable
import com.github.henriquechsf.todocompose.ui.viewmodels.SharedViewModel
import com.github.henriquechsf.todocompose.util.Constants.SPLASH_SCREEN

@Composable
fun SetupNavigation(
    navController: NavHostController,
    sharedViewModel: SharedViewModel,
) {
    val screen = remember(navController) {
        Screens(navController = navController)
    }

    NavHost(
        navController = navController,
        startDestination = SPLASH_SCREEN
    ) {
        splashComposable(
            navigateToListScreen = screen.splash
        )

        listComposable(
            navigateToTaskScreen = screen.list,
            sharedViewModel = sharedViewModel
        )

        taskComposable(
            navigateToListScreen = screen.task,
            sharedViewModel = sharedViewModel
        )
    }
}