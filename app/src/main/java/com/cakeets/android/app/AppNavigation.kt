package com.cakeets.android.app

import androidx.compose.runtime.Composable
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import com.cakeets.android.app.access.screens.Access
import com.cakeets.android.app.access.screens.SignIn
import com.cakeets.android.app.launch.screens.OnBoarding
import com.cakeets.android.app.launch.screens.Splash
import com.google.accompanist.systemuicontroller.rememberSystemUiController

@Composable
fun AppNavigation() {

    val controller = rememberNavController()
    val ui = rememberSystemUiController()

    NavHost(
        navController = controller,
        startDestination = AppScreens.Splash.route
    ) {

        composable(AppScreens.Splash.route) { Splash(controller, ui) }
        composable(AppScreens.OnBoarding.route) { OnBoarding(controller, ui) }

        composable(AppScreens.Access.route) { Access(controller) }
        composable(AppScreens.SignIn.route) { SignIn(controller) }
        composable(AppScreens.SignUp.route) {}

        composable(AppScreens.Home.route) { }

    }

}