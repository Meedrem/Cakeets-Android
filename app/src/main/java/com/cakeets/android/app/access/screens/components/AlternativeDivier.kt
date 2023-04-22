package com.cakeets.android.app.access.screens.components

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.material3.Divider
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.unit.dp
import com.cakeets.android.theme.PoppinsTypography

@Composable
fun AlternativeDiver(text: String) {

    Row(
        modifier = Modifier
            .fillMaxWidth(),
        verticalAlignment = Alignment.CenterVertically,
        horizontalArrangement = Arrangement.Center
    ){

        Divider(
            modifier = Modifier
                .weight(0.8f)
                .clip(CircleShape),
            thickness = 4.dp
        )

        Text(
            modifier = Modifier
                .padding(8.dp),
            text = text,
            color = MaterialTheme.colorScheme.onBackground,
            style = PoppinsTypography.labelLarge
        )

        Divider(
            modifier = Modifier
                .weight(0.8f)
                .clip(CircleShape),
            thickness = 4.dp
        )

    }

}
