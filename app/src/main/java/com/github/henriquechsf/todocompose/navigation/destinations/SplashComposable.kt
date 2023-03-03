package com.github.henriquechsf.todocompose.navigation.destinations

import androidx.navigation.NavGraphBuilder
import androidx.navigation.compose.composable
import com.github.henriquechsf.todocompose.ui.screens.splash.SplashScreen
import com.github.henriquechsf.todocompose.util.Constants.SPLASH_SCREEN

fun NavGraphBuilder.splashComposable(
    navigateToListScreen: () -> Unit,
) {
    composable(
        route = SPLASH_SCREEN
    ) {
        SplashScreen(
            navigateToListScreen = navigateToListScreen
        )
    }
}