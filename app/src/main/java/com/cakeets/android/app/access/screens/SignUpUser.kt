package com.cakeets.android.app.access.screens

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.absolutePadding
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Button
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.OutlinedTextField
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.navigation.NavHostController
import com.cakeets.android.R
import com.cakeets.android.app.AppScreens
import com.cakeets.android.app.access.screens.components.Navbar
import com.cakeets.android.theme.PoppinsTypography

@Composable
fun PersonalData(controller: NavHostController) {
    Screen(controller = controller)
}

@Composable
private fun Screen(controller: NavHostController) {
    Column(
        Modifier
            .fillMaxSize()
            .padding(16.dp)
    ) {
        Navbar {
            controller.navigate(AppScreens.SignUp.route) {
                popUpTo(AppScreens.SignUp.route) {
                    inclusive = true
                }
            }
        }
        Spacer(Modifier.height(32.dp))
        Content()
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
        Text(
            text = stringResource(id = R.string.signin_body),
            style = PoppinsTypography.bodyLarge
        )
        Spacer(Modifier.height(64.dp))
        Form(
            Modifier.weight(0.8f)
        )
    }
}

@OptIn(ExperimentalMaterial3Api::class)
@Composable
private fun Form(modifier: Modifier) {
    Column(
        modifier = modifier
            .fillMaxSize()
            .absolutePadding(
                left = 48.dp,
                right = 48.dp
            ),
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        var name by remember { mutableStateOf("") }
        OutlinedTextField(
            modifier = Modifier
                .fillMaxWidth(),
            value = name,
            onValueChange = { name = it },
            label = { Text("Name") },
            placeholder = { Text("jcgmeedrem@gmail.com") },
            singleLine = true,
            maxLines = 1
        )
        Spacer(Modifier.height(16.dp))
        var lastName by remember { mutableStateOf("") }
        OutlinedTextField(
            modifier = Modifier
                .fillMaxWidth(),
            value = lastName,
            onValueChange = { lastName = it },
            label = { Text("Last Name") },
            placeholder = { Text("1223456") },
            singleLine = true,
            maxLines = 1
        )
        Spacer(Modifier.height(16.dp))
        var age by remember { mutableStateOf("") }
        OutlinedTextField(
            modifier = Modifier
                .fillMaxWidth(),
            value = age,
            onValueChange = { age = it },
            label = { Text("Age") },
            placeholder = { Text("1223456") },
            singleLine = true,
            maxLines = 1
        )
        Spacer(Modifier.height(16.dp))
        Button(
            modifier = Modifier
                .fillMaxWidth(),
            onClick = { /*TODO*/ }
        ) {
            Text(
                stringResource(id = R.string.signin_noaccount),
                style = PoppinsTypography.labelLarge
            )
        }
    }
}