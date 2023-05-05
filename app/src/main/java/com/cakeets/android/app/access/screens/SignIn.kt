package com.cakeets.android.app.access.screens

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.absolutePadding
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.text.ClickableText
import androidx.compose.material3.Button
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.MaterialTheme
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
import androidx.compose.ui.text.AnnotatedString
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.hilt.navigation.compose.hiltViewModel
import androidx.navigation.NavHostController
import com.cakeets.android.R
import com.cakeets.android.app.AppScreens
import com.cakeets.android.app.access.screens.components.AlternativeDiver
import com.cakeets.android.app.access.screens.components.Navbar
import com.cakeets.android.app.access.screens.components.SocialNetworks
import com.cakeets.android.shape.Clickable
import com.cakeets.android.theme.PoppinsTypography

@Composable
fun SignIn(
    controller: NavHostController,
    viewModel: SignInViewModel = hiltViewModel()
) {
    Screen(controller)
}

@Composable
private fun Screen(controller: NavHostController) {
    Column(
        Modifier
            .fillMaxSize()
            .padding(16.dp)
    ) {
        Navbar {
            controller.popBackStack(AppScreens.Access.route, true)
            controller.navigate(AppScreens.Access.route)
        }
        Spacer(Modifier.height(32.dp))
        Content()
    }
}

@Composable
private fun Content() {
    Column(
        Modifier
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
        Spacer(Modifier.height(64.dp))
        AlternativeDiver(text = stringResource(id = R.string.signin_alternative))
        Spacer(Modifier.height(32.dp))
        SocialNetworks(
            {},
            {},
            {}
        )
        Spacer(Modifier.height(32.dp))
        Row(
            modifier = Modifier
                .fillMaxWidth(),
            horizontalArrangement = Arrangement.Center
        ) {
            Text(
                stringResource(id = R.string.signin_noaccount),
                color = MaterialTheme.colorScheme.onBackground,
                style = PoppinsTypography.labelLarge
            )
            Spacer(Modifier.width(8.dp))
            ClickableText(
                text = AnnotatedString(stringResource(id = R.string.button_signup)),
                style = Clickable(),
                onClick = {}
            )
        }
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
        var emailState by remember { mutableStateOf("") }
        OutlinedTextField(
            modifier = Modifier
                .fillMaxWidth(),
            value = emailState,
            onValueChange = { emailState = it },
            label = { Text("Email") },
            placeholder = { Text("jcgmeedrem@gmail.com") },
            singleLine = true,
            maxLines = 1
        )
        Spacer(Modifier.height(16.dp))
        var passwordState by remember { mutableStateOf("") }
        OutlinedTextField(
            modifier = Modifier
                .fillMaxWidth(),
            value = passwordState,
            onValueChange = { passwordState = it },
            label = { Text("Password") },
            placeholder = { Text("1223456") },
            singleLine = true,
            maxLines = 1
        )
        Spacer(Modifier.height(8.dp))
        Box(
            Modifier
                .fillMaxWidth(),
            contentAlignment = Alignment.CenterEnd
        ) {
            ClickableText(
                text = AnnotatedString(stringResource(id = R.string.button_forgotpassword)),
                style = Clickable(),
                onClick = {}
            )
        }
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