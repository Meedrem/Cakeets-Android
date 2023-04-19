package com.cakeets.android.app

import androidx.compose.runtime.Composable
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import com.cakeets.android.app.launch.screens.OnBoarding
import com.google.accompanist.systemuicontroller.rememberSystemUiController
import com.cakeets.android.app.launch.screens.Splash

@Composable
fun AppNavigation() {

    val controller = rememberNavController()
    val ui = rememberSystemUiController()

    NavHost(
        navController = controller,
        startDestination = AppScreens.Splash.route
    ) {

        composable(AppScreens.Splash.route) { Splash(controller, ui) }
        composable(AppScreens.OnBoarding.route) { OnBoarding(ui) }

        composable(AppScreens.Home.route) {  }

    }

}