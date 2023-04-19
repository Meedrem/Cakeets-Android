package com.cakeets.android.app.launch.screens

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.MaterialTheme
import androidx.compose.runtime.Composable
import androidx.compose.runtime.LaunchedEffect
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.navigation.NavHostController
import com.cakeets.android.app.AppScreens
import com.cakeets.android.app.launch.screens.components.LogoComponent
import com.google.accompanist.systemuicontroller.SystemUiController
import kotlinx.coroutines.delay

@Composable
fun Splash(controller: NavHostController, ui: SystemUiController) {

    Setup(ui)

    LaunchedEffect(key1 = true) {
        delay(3000)
        controller.popBackStack()
        controller.navigate(AppScreens.OnBoarding.route)
    }

    LaunchScreen()

}

@Composable
private fun Setup(ui: SystemUiController) {
    ui.setNavigationBarColor(
        color = MaterialTheme.colorScheme.primaryContainer,
        darkIcons = false
    )
    ui.setStatusBarColor(
        color = MaterialTheme.colorScheme.primaryContainer,
        darkIcons = false
    )
}

@Composable
fun LaunchScreen() {

    Column(
        modifier = Modifier
            .fillMaxSize()
            .background(color = MaterialTheme.colorScheme.primaryContainer),
        verticalArrangement = Arrangement.Center,
        horizontalAlignment = Alignment.CenterHorizontally
    ) {

        LogoComponent()

    }

}