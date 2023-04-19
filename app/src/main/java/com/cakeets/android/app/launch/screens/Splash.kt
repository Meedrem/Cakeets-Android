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
import androidx.compose.ui.tooling.preview.Preview
import androidx.navigation.NavHostController
import com.cakeets.android.app.AppScreens
import com.cakeets.android.app.launch.screens.components.LogoComponent
import com.cakeets.android.theme.CakeetsTheme
import com.google.accompanist.systemuicontroller.SystemUiController
import kotlinx.coroutines.delay

@Composable
fun Splash(controller: NavHostController, iuController: SystemUiController) {
    LaunchedEffect(key1 = true) {
        delay(3000)
        controller.popBackStack()
        controller.navigate(AppScreens.OnBoarding.route)
    }
    iuController.setNavigationBarColor(
        color = MaterialTheme.colorScheme.primaryContainer,
        darkIcons = false
    )
    iuController.setStatusBarColor(
        color = MaterialTheme.colorScheme.primaryContainer,
        darkIcons = false
    )
    LaunchScreen()
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

@Preview(showBackground = true)
@Composable
fun SplashPreview() {
    CakeetsTheme {
        LaunchScreen()
    }
}