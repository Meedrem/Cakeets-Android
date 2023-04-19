package com.cakeets.android.app

sealed class AppScreens(val route: String) {
    object Splash: AppScreens("Splash")
    object OnBoarding: AppScreens("OnBoarding")
    object Home: AppScreens("Home")
}