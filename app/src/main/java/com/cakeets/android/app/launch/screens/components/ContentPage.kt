package com.cakeets.android.app.launch.screens.components

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.unit.dp
import com.cakeets.android.R
import com.cakeets.android.app.launch.domain.model.Feature
import com.cakeets.android.theme.PoppinsTypography
import com.cakeets.android.theme.YesevaOneTypography

@Composable
fun ContentPage(content: Feature) {

    Column(
        Modifier
            .fillMaxSize()
    ) {

        Spacer(Modifier.height(16.dp))

        Image(
            modifier = Modifier
                .align(Alignment.CenterHorizontally),
            painter = painterResource(content.illustration),
            contentDescription = stringResource(id = R.string.contentdescription_onboarding_illustrations)
        )

        Spacer(Modifier.height(64.dp))

        Text(
            text = stringResource(content.headline),
            style = YesevaOneTypography.displaySmall
        )

        Spacer(Modifier.height(8.dp))

        Text(
            text = stringResource(content.body),
            style = PoppinsTypography.bodyLarge
        )

    }

}