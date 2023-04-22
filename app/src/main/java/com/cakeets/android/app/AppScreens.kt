package com.cakeets.android.app

sealed class AppScreens(val route: String) {

    object Splash: AppScreens("Splash")
    object OnBoarding: AppScreens("OnBoarding")

    object Access: AppScreens("Access")
    object SignIn: AppScreens("SignIn")
    object SignUp: AppScreens("SignUp")
    object GetPersonalData: AppScreens("GetPersonalData")
    object GetBusinessData: AppScreens("GetBusinessData")
    object TermsSection: AppScreens("TermsSection")
    object Home: AppScreens("Home")

}