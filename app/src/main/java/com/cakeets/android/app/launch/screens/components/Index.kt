package com.cakeets.android.app.launch.screens.components

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.BoxScope
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.material3.MaterialTheme
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.unit.dp
import com.cakeets.android.app.launch.screens.animations.getWidth

@Composable
fun BoxScope.Index(size: Int, currentPage: Int){
    Row(
        modifier = Modifier
            .align(Alignment.CenterStart),
        verticalAlignment = Alignment.CenterVertically,
        horizontalArrangement = Arrangement.spacedBy(8.dp)
    ) {
        repeat(size) { page ->
            IndexComponent(isShowing = page == currentPage)
        }
    }
}

@Composable
private fun IndexComponent(isShowing: Boolean){
    Box(
        Modifier
            .height(8.dp)
            .width(getWidth(isShowing))
            .clip(CircleShape)
            .background(getBackground(isShowing))
    )
}

@Composable
private fun getBackground(isShowing: Boolean) =
    if (isShowing)
        MaterialTheme.colorScheme.inversePrimary
    else
        MaterialTheme.colorScheme.primaryContainer