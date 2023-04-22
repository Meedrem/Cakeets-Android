package com.cakeets.android.app.access.screens

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Button
import androidx.compose.material3.Text
import androidx.compose.material3.TextButton
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.unit.dp
import androidx.navigation.NavHostController
import com.cakeets.android.R
import com.cakeets.android.app.AppScreens
import com.cakeets.android.theme.PoppinsTypography
import com.cakeets.android.theme.YesevaOneTypography

@Composable
fun Access(controller: NavHostController) {
    Screen(controller)
}

@Composable
private fun Screen(controller: NavHostController) {
    
    Column(
        Modifier
            .fillMaxSize()
            .padding(16.dp)
    ) {

        Spacer(Modifier.height(16.dp))

        AppName()

        Spacer(Modifier.height(64.dp))

        Content(
            Modifier
                .fillMaxSize()
                .weight(0.8f)
        )

        AccessOptions(
            {
                controller.navigate(AppScreens.SignIn.route)
            },
            {
                controller.navigate(AppScreens.SignUp.route)
            }
        )

    }
    
}

@Composable
private fun AppName() {

    Column(
        Modifier
            .fillMaxWidth()
    ) {

        Text(
            modifier = Modifier
                .align(Alignment.CenterHorizontally),
            text = stringResource(id = R.string.app_name),
            style = YesevaOneTypography.displaySmall
        )

    }

}

@Composable
private fun Content(modifier: Modifier) {

    Column(modifier) {

        Image(
            modifier = Modifier
                .align(Alignment.CenterHorizontally),
            painter = painterResource(id = R.drawable.illustration_access),
            contentDescription = stringResource(id = R.string.contentdescription_access)
        )

        Spacer(Modifier.height(64.dp))

        Text(
            text = stringResource(id = R.string.access_headline),
            style = YesevaOneTypography.displaySmall
        )

        Spacer(Modifier.height(8.dp))

        Text(
            text = stringResource(id = R.string.access_body),
            style = PoppinsTypography.bodyLarge
        )

    }

}

@Composable
private fun AccessOptions(onSignInClicked: () -> Unit, onSignUpClicked: () -> Unit) {

    Column(
        Modifier
            .fillMaxWidth()
    ) {

        Button(
            modifier = Modifier
                .align(Alignment.CenterHorizontally),
            onClick = onSignInClicked
        ) {

            Text(
                text = stringResource(id = R.string.button_signin),
                style = PoppinsTypography.labelLarge
            )

        }

        Spacer(Modifier.height(8.dp))

        TextButton(
            modifier = Modifier
                .align(Alignment.CenterHorizontally),
            onClick = onSignUpClicked
        ) {

            Text(
                text = stringResource(id = R.string.button_signup),
                style = PoppinsTypography.labelLarge
            )

        }

    }

}