package com.cakeets.android.ui

import android.graphics.Matrix
import androidx.compose.ui.geometry.Size
import androidx.compose.ui.graphics.Outline
import androidx.compose.ui.graphics.Path
import androidx.compose.ui.graphics.Shape
import androidx.compose.ui.graphics.asAndroidPath
import androidx.compose.ui.graphics.asComposePath
import androidx.compose.ui.unit.Density
import androidx.compose.ui.unit.LayoutDirection

val LittleWorm: Shape = object: Shape {

    override fun createOutline(
        size: Size,
        layoutDirection: LayoutDirection,
        density: Density
    ): Outline {

        val baseWidth = 110f
        val baseHeight = 4f

        val path = Path().apply {
            moveTo(0f, 2f)
            cubicTo(3.6667f, -0.6667f, 7.3333f, -0.6667f, 11f, 2f)
            cubicTo(14.6667f, 4.6667f, 18.3333f, 4.6667f, 22f, 2f)
            cubicTo(25.6667f, -0.6667f, 29.3333f, -0.6667f, 33f, 2f)
            cubicTo(36.6667f, 4.6667f, 40.3333f, 4.6667f, 44f, 2f)
            cubicTo(47.6667f, -0.6667f, 51.3333f, -0.6667f, 55f, 2f)
            cubicTo(58.6667f, 4.6667f, 62.3333f, 4.6667f, 66f, 2f)
            cubicTo(69.6667f, -0.6667f, 73.3333f, -0.6667f, 77f, 2f)
            cubicTo(80.6667f, 4.6667f, 84.3333f, 4.6667f, 88f, 2f)
            cubicTo(91.6667f, -0.6667f, 95.3333f, -0.6667f, 99f, 2f)
            cubicTo(102.6667f, 4.6667f, 106.3333f, 4.6667f, 110f, 2f)
        }

        return Outline.Generic(
            path
                .asAndroidPath()
                .apply {
                    transform(Matrix().apply {
                        setScale(size.width / baseWidth, size.height / baseHeight)
                    })
                }
                .asComposePath()
        )

    }

}