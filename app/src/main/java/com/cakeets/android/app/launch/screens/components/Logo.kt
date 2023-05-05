package com.cakeets.android.app.launch.screens.components

import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.sp
import com.cakeets.android.theme.YesevaOne

@Composable
fun Logo() {
    Text(
        text = "C",
        style = LogoTypography,
        color = MaterialTheme.colorScheme.onPrimaryContainer
    )
}

val LogoTypography = TextStyle(
    fontFamily = YesevaOne,
    fontWeight = FontWeight.W400,
    fontSize = 96.sp,
    lineHeight = 64.sp,
    letterSpacing = -0.25.sp,
)