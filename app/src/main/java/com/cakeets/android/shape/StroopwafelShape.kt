package com.cakeets.android.shape

import android.graphics.Matrix
import androidx.compose.ui.geometry.Size
import androidx.compose.ui.graphics.Outline
import androidx.compose.ui.graphics.Path
import androidx.compose.ui.graphics.Shape
import androidx.compose.ui.graphics.asAndroidPath
import androidx.compose.ui.graphics.asComposePath
import androidx.compose.ui.unit.Density
import androidx.compose.ui.unit.LayoutDirection

val StroopwafelShape: Shape = object: Shape {

    override fun createOutline(
        size: Size,
        layoutDirection: LayoutDirection,
        density: Density
    ): Outline {

        val path = Path()
        path.moveTo(53.8268f, 2.0456f)
        path.cubicTo(58.6889f, -0.6819f, 64.6202f, -0.6819f, 69.4823f, 2.0456f)
        path.lineTo(73.0081f, 4.0234f)
        path.cubicTo(75.3405f, 5.3317f, 77.9636f, 6.0346f, 80.6377f, 6.0677f)
        path.lineTo(84.68f, 6.1178f)
        path.cubicTo(90.2545f, 6.1868f, 95.3911f, 9.1524f, 98.2381f, 13.9455f)
        path.lineTo(100.3026f, 17.4212f)
        path.cubicTo(101.6683f, 19.7205f, 103.5886f, 21.6408f, 105.8879f, 23.0065f)
        path.lineTo(109.3636f, 25.071f)
        path.cubicTo(114.1567f, 27.918f, 117.1223f, 33.0547f, 117.1914f, 38.6291f)
        path.lineTo(117.2414f, 42.6714f)
        path.cubicTo(117.2745f, 45.3455f, 117.9774f, 47.9686f, 119.2858f, 50.301f)
        path.lineTo(121.2635f, 53.8268f)
        path.cubicTo(123.991f, 58.6889f, 123.991f, 64.6202f, 121.2635f, 69.4823f)
        path.lineTo(119.2858f, 73.0081f)
        path.cubicTo(117.9774f, 75.3405f, 117.2745f, 77.9636f, 117.2414f, 80.6377f)
        path.lineTo(117.1914f, 84.68f)
        path.cubicTo(117.1223f, 90.2545f, 114.1567f, 95.3911f, 109.3636f, 98.2381f)
        path.lineTo(105.8879f, 100.3026f)
        path.cubicTo(103.5886f, 101.6683f, 101.6683f, 103.5886f, 100.3026f, 105.8879f)
        path.lineTo(98.2381f, 109.3636f)
        path.cubicTo(95.3911f, 114.1567f, 90.2545f, 117.1223f, 84.68f, 117.1914f)
        path.lineTo(80.6377f, 117.2414f)
        path.cubicTo(77.9636f, 117.2745f, 75.3405f, 117.9774f, 73.0081f, 119.2858f)
        path.lineTo(69.4823f, 121.2635f)
        path.cubicTo(64.6202f, 123.991f, 58.6889f, 123.991f, 53.8268f, 121.2635f)
        path.lineTo(50.301f, 119.2858f)
        path.cubicTo(47.9686f, 117.9774f, 45.3455f, 117.2745f, 42.6714f, 117.2414f)
        path.lineTo(38.6291f, 117.1914f)
        path.cubicTo(33.0547f, 117.1223f, 27.918f, 114.1567f, 25.071f, 109.3636f)
        path.lineTo(23.0065f, 105.8879f)
        path.cubicTo(21.6408f, 103.5886f, 19.7205f, 101.6683f, 17.4212f, 100.3026f)
        path.lineTo(13.9456f, 98.2381f)
        path.cubicTo(9.1525f, 95.3911f, 6.1868f, 90.2545f, 6.1178f, 84.68f)
        path.lineTo(6.0677f, 80.6377f)
        path.cubicTo(6.0346f, 77.9636f, 5.3317f, 75.3405f, 4.0234f, 73.0081f)
        path.lineTo(2.0456f, 69.4823f)
        path.cubicTo(-0.6819f, 64.6202f, -0.6819f, 58.6889f, 2.0456f, 53.8268f)
        path.lineTo(4.0234f, 50.301f)
        path.cubicTo(5.3317f, 47.9686f, 6.0346f, 45.3455f, 6.0677f, 42.6714f)
        path.lineTo(6.1178f, 38.6291f)
        path.cubicTo(6.1868f, 33.0547f, 9.1525f, 27.918f, 13.9456f, 25.071f)
        path.lineTo(17.4212f, 23.0065f)
        path.cubicTo(19.7205f, 21.6408f, 21.6408f, 19.7205f, 23.0065f, 17.4212f)
        path.lineTo(25.071f, 13.9456f)
        path.cubicTo(27.918f, 9.1525f, 33.0547f, 6.1868f, 38.6291f, 6.1178f)
        path.lineTo(42.6714f, 6.0677f)
        path.cubicTo(45.3455f, 6.0346f, 47.9686f, 5.3317f, 50.301f, 4.0234f)
        path.lineTo(53.8268f, 2.0456f)
        path.close()

        return Outline.Generic(
            path
                .asAndroidPath()
                .apply {
                    transform(Matrix().apply {
                        setScale(size.width / 123.3091f, size.height / 123.3091f)
                    })
                }
                .asComposePath()
        )

    }

}