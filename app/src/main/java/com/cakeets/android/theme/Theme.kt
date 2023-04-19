package com.cakeets.android.theme

import android.app.Activity
import android.os.Build
import androidx.compose.foundation.isSystemInDarkTheme
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.darkColorScheme
import androidx.compose.material3.dynamicDarkColorScheme
import androidx.compose.material3.dynamicLightColorScheme
import androidx.compose.material3.lightColorScheme
import androidx.compose.runtime.Composable
import androidx.compose.runtime.SideEffect
import androidx.compose.ui.graphics.toArgb
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.platform.LocalView
import androidx.core.view.WindowCompat

private val LightColors = lightColorScheme(
    primary = cakeets_theme_light_primary,
    onPrimary = cakeets_theme_light_onPrimary,
    primaryContainer = cakeets_theme_light_primaryContainer,
    onPrimaryContainer = cakeets_theme_light_onPrimaryContainer,
    secondary = cakeets_theme_light_secondary,
    onSecondary = cakeets_theme_light_onSecondary,
    secondaryContainer = cakeets_theme_light_secondaryContainer,
    onSecondaryContainer = cakeets_theme_light_onSecondaryContainer,
    tertiary = cakeets_theme_light_tertiary,
    onTertiary = cakeets_theme_light_onTertiary,
    tertiaryContainer = cakeets_theme_light_tertiaryContainer,
    onTertiaryContainer = cakeets_theme_light_onTertiaryContainer,
    error = cakeets_theme_light_error,
    errorContainer = cakeets_theme_light_errorContainer,
    onError = cakeets_theme_light_onError,
    onErrorContainer = cakeets_theme_light_onErrorContainer,
    background = cakeets_theme_light_background,
    onBackground = cakeets_theme_light_onBackground,
    surface = cakeets_theme_light_surface,
    onSurface = cakeets_theme_light_onSurface,
    surfaceVariant = cakeets_theme_light_surfaceVariant,
    onSurfaceVariant = cakeets_theme_light_onSurfaceVariant,
    outline = cakeets_theme_light_outline,
    inverseOnSurface = cakeets_theme_light_inverseOnSurface,
    inverseSurface = cakeets_theme_light_inverseSurface,
    inversePrimary = cakeets_theme_light_inversePrimary,
    surfaceTint = cakeets_theme_light_surfaceTint,
    outlineVariant = cakeets_theme_light_outlineVariant,
    scrim = cakeets_theme_light_scrim,
)

private val DarkColors = darkColorScheme(
    primary = cakeets_theme_dark_primary,
    onPrimary = cakeets_theme_dark_onPrimary,
    primaryContainer = cakeets_theme_dark_primaryContainer,
    onPrimaryContainer = cakeets_theme_dark_onPrimaryContainer,
    secondary = cakeets_theme_dark_secondary,
    onSecondary = cakeets_theme_dark_onSecondary,
    secondaryContainer = cakeets_theme_dark_secondaryContainer,
    onSecondaryContainer = cakeets_theme_dark_onSecondaryContainer,
    tertiary = cakeets_theme_dark_tertiary,
    onTertiary = cakeets_theme_dark_onTertiary,
    tertiaryContainer = cakeets_theme_dark_tertiaryContainer,
    onTertiaryContainer = cakeets_theme_dark_onTertiaryContainer,
    error = cakeets_theme_dark_error,
    errorContainer = cakeets_theme_dark_errorContainer,
    onError = cakeets_theme_dark_onError,
    onErrorContainer = cakeets_theme_dark_onErrorContainer,
    background = cakeets_theme_dark_background,
    onBackground = cakeets_theme_dark_onBackground,
    surface = cakeets_theme_dark_surface,
    onSurface = cakeets_theme_dark_onSurface,
    surfaceVariant = cakeets_theme_dark_surfaceVariant,
    onSurfaceVariant = cakeets_theme_dark_onSurfaceVariant,
    outline = cakeets_theme_dark_outline,
    inverseOnSurface = cakeets_theme_dark_inverseOnSurface,
    inverseSurface = cakeets_theme_dark_inverseSurface,
    inversePrimary = cakeets_theme_dark_inversePrimary,
    surfaceTint = cakeets_theme_dark_surfaceTint,
    outlineVariant = cakeets_theme_dark_outlineVariant,
    scrim = cakeets_theme_dark_scrim,
)

@Composable
fun CakeetsTheme(
    darkTheme: Boolean = isSystemInDarkTheme(),
    // Dynamic color is available on Android 12+
    dynamicColor: Boolean = true,
    content: @Composable () -> Unit
) {
    val colorScheme = when {
        //dynamicColor && Build.VERSION.SDK_INT >= Build.VERSION_CODES.S -> {
        //    val context = LocalContext.current
        //    if (darkTheme) dynamicDarkColorScheme(context) else dynamicLightColorScheme(context)
        //}

        darkTheme -> DarkColors
        else -> LightColors
    }
    val view = LocalView.current
    if (!view.isInEditMode) {
        SideEffect {
            val window = (view.context as Activity).window
            window.statusBarColor = colorScheme.primary.toArgb()
            WindowCompat.getInsetsController(window, view).isAppearanceLightStatusBars = darkTheme
        }
    }

    MaterialTheme(
        colorScheme = colorScheme,
        typography = Typography,
        content = content
    )
}