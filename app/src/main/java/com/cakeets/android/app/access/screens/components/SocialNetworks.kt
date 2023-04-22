package com.cakeets.android.app.access.screens.components

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.width
import androidx.compose.material3.IconButton
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.unit.dp
import com.cakeets.android.R

@Composable
fun SocialNetworks(
    onFacebookClicked: () -> Unit,
    onGoogleClicked: () -> Unit,
    onTwitterClicked: () -> Unit
) {

    Row(
        modifier = Modifier
            .fillMaxWidth(),
        horizontalArrangement = Arrangement.Center
    ) {

        IconButton(
            modifier = Modifier
                .height(24.dp)
                .width(24.dp),
            onClick = onFacebookClicked
        ) {

            Image(
                painter = painterResource(id = R.drawable.logo_facebook),
                contentDescription = ""
            )

        }

        Spacer(Modifier.width(24.dp))

        IconButton(
            modifier = Modifier
                .height(24.dp)
                .width(24.dp),
            onClick = onGoogleClicked
        ) {

            Image(
                painter = painterResource(id = R.drawable.logo_google),
                contentDescription = ""
            )

        }

        Spacer(Modifier.width(24.dp))

        IconButton(
            modifier = Modifier
                .height(24.dp)
                .width(24.dp),
            onClick = onTwitterClicked
        ) {

            Image(
                painter = painterResource(id = R.drawable.logo_twitter)
                , contentDescription = ""
            )

        }

    }

}