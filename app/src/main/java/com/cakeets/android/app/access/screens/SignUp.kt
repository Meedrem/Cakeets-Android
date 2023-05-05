package com.cakeets.android.app.access.screens

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.absolutePadding
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.selection.selectable
import androidx.compose.foundation.text.ClickableText
import androidx.compose.material3.Button
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.OutlinedTextField
import androidx.compose.material3.RadioButton
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
import androidx.navigation.NavHostController
import com.cakeets.android.R
import com.cakeets.android.app.AppScreens
import com.cakeets.android.app.access.screens.components.Navbar
import com.cakeets.android.theme.PoppinsTypography
import com.cakeets.android.shape.Clickable

@Composable
fun SignUp(controller: NavHostController) {
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

        }
        Spacer(Modifier.height(32.dp))
        Content(controller)
    }
}

@Composable
private fun Content(controller: NavHostController) {
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
            Modifier.weight(0.8f),
            onClientSelected = { controller.navigate(AppScreens.GetPersonalData.route) },
            onProviderSelected = { controller.navigate(AppScreens.GetPersonalData.route) }
        )
        Spacer(Modifier.height(64.dp))
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
                text = AnnotatedString(stringResource(id = R.string.signin_signup)),
                style = Clickable(),
                onClick = {}
            )
        }
    }
}

@OptIn(ExperimentalMaterial3Api::class)
@Composable
private fun Form(modifier: Modifier, onClientSelected: () -> Unit, onProviderSelected: () -> Unit) {
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
        Spacer(Modifier.height(16.dp))
        var repeatPasswordState by remember { mutableStateOf("") }
        OutlinedTextField(
            modifier = Modifier
                .fillMaxWidth(),
            value = repeatPasswordState,
            onValueChange = { repeatPasswordState = it },
            label = { Text("Repeat Password") },
            placeholder = { Text("1223456") },
            singleLine = true,
            maxLines = 1
        )
        Spacer(Modifier.height(16.dp))
        val radioOptions = listOf("Client", "Provider")
        val (selectedOption, onOptionSelected) = remember { mutableStateOf(radioOptions[0]) }
        Text(
            text = "Type of Account",
            style = PoppinsTypography.labelLarge,
            modifier = Modifier.
                    fillMaxWidth()
        )
        Spacer(Modifier.height(8.dp))
        Column {
            radioOptions.forEach { text ->
                Row(
                    Modifier
                        .fillMaxWidth()
                        .selectable(
                            selected = (text == selectedOption),
                            onClick = {
                                onOptionSelected(text)
                            }
                        ),
                    verticalAlignment = Alignment.CenterVertically
                ) {
                    RadioButton(
                        selected = (text == selectedOption),
                        onClick = { onOptionSelected(text) }
                    )
                    Text(
                        text = text,
                        style = PoppinsTypography.labelLarge
                    )
                }
            }
        }
        Spacer(Modifier.height(8.dp))
        Button(
            modifier = Modifier
                .fillMaxWidth(),
            onClick = if (selectedOption == "Client") onClientSelected else onProviderSelected
        ) {
            Text(
                stringResource(id = R.string.signin_noaccount),
                style = PoppinsTypography.labelLarge
            )
        }
    }
}