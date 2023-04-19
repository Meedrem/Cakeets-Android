package com.cakeets.android.app.launch.screens.animations

import androidx.compose.animation.core.Spring
import androidx.compose.animation.core.animateDpAsState
import androidx.compose.animation.core.spring
import androidx.compose.runtime.Composable
import androidx.compose.ui.unit.Dp
import androidx.compose.ui.unit.dp

@Composable
fun getWidth(isVisible: Boolean): Dp =
    animateDpAsState(if (isVisible) 24.dp else 8.dp, spring(Spring.DampingRatioLowBouncy))
        .value