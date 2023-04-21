package com.cakeets.android.app

sealed class AppScreens(val route: String) {

    object Splash: AppScreens("Splash")
    object OnBoarding: AppScreens("OnBoarding")
    object Access: AppScreens("Access")
    object SignIn: AppScreens("SignIn")
    object SignUp: AppScreens("SignUp")
    object Home: AppScreens("Home")

}