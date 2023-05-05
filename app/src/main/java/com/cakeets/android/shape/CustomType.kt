package com.cakeets.android.shape

import androidx.compose.material3.MaterialTheme
import androidx.compose.runtime.Composable
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.FontStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.sp
import com.cakeets.android.theme.Poppins

@Composable
fun Clickable(): TextStyle =
    TextStyle(
        fontFamily = Poppins,
        fontWeight = FontWeight.Medium,
        fontStyle = FontStyle.Normal,
        color = MaterialTheme.colorScheme.primary,
        fontSize = 14.sp,
        lineHeight = 20.sp,
        letterSpacing = 0.1.sp
    )