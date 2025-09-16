// Main page - Tools layer - Top bar - SuperCast Label

package com.example.supercast.ui.pages.main.layers.tools.components.topbar.supercastlabel

import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.draw.drawBehind
import androidx.compose.ui.geometry.Offset
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp

import com.example.supercast.lib.colors.Colors
import com.example.supercast.lib.fonts.Fonts



private val colorLabel = Colors.PreWhite
private val colorUnderLight = Colors.Olive
private val colorUnderDark = Colors.DarkGrey

private val fontLabel = Fonts.FredokaSemiBold

private const val textSuperCast = "SuperCast"



@Composable
fun SuperCastLabel () {

	Text (
		text = textSuperCast,
		fontSize = 27.sp,
		color = colorLabel,
		fontFamily = fontLabel,
		modifier = Modifier
			.padding (start = 18.5.dp, end = 25.dp)
			.drawBehind {5
				drawLine (
					color = colorUnderLight,
					strokeWidth = 3.5.dp.toPx(),
					start = Offset (0f, size.height + 0.sp.toPx()),
					end = Offset (77f, size.height + 0.sp.toPx())
				)
			}
			.drawBehind {
				drawLine (
					color = colorUnderDark,
					strokeWidth = 3.5.dp.toPx(),
					start = Offset (101f, size.height + 0.sp.toPx()),
					end = Offset (size.width, size.height + 0.sp.toPx())
				)
			}
	)

}