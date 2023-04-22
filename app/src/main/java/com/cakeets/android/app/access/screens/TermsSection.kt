package com.cakeets.android.app.access.screens

import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.rounded.KeyboardArrowLeft
import androidx.compose.material3.Button
import androidx.compose.material3.Checkbox
import androidx.compose.material3.Icon
import androidx.compose.material3.IconButton
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.navigation.NavHostController
import com.cakeets.android.R
import com.cakeets.android.theme.PoppinsTypography

@Composable
fun TermsSection(controller: NavHostController) {

}

@Composable
private fun Screen(controller: NavHostController) {

    Column(
        Modifier
            .fillMaxSize()
            .padding(16.dp)
    ) {

        Navbar {

        }

        Spacer(Modifier.height(32.dp))

        Content()

    }

}

@Composable
private fun Navbar(onBackClicked: () -> Unit) {

    Box(
        Modifier
            .fillMaxWidth()
    ) {

        IconButton(
            modifier = Modifier
                .align(Alignment.CenterStart),
            onClick = onBackClicked
        ) {

            Icon(Icons.Rounded.KeyboardArrowLeft, null)

        }

    }

}

@Composable
private fun Content() {

    Column(
        modifier = Modifier
            .fillMaxSize()
    ) {

        Text(
            text = stringResource(id = R.string.signin_headline),
            style = PoppinsTypography.displaySmall,
            fontWeight = FontWeight.Bold
        )

        Spacer(Modifier.height(8.dp))

        Text(
            text = stringResource(id = R.string.signin_body),
            style = PoppinsTypography.bodyLarge
        )

        Spacer(Modifier.height(64.dp))

        Terms()

        Row {
            Checkbox(checked = false, onCheckedChange = {})

            Text(
                stringResource(id = R.string.signin_noaccount),
                style = PoppinsTypography.labelLarge
            )
        }

        Button(
            onClick = { /*TODO*/ }
        ) {

            Text(
                stringResource(id = R.string.signin_noaccount),
                style = PoppinsTypography.labelLarge
            )

        }

    }

}

@Composable
private fun Terms() {



}