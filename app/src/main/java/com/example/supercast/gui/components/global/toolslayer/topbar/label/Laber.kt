// Global components - Tools layer - Top bar - Label

package com.example.supercast.gui.components.global.toolslayer.topbar.label

import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.supercast.ui.colors.Colors
import com.example.supercast.ui.fonts.Fonts



private val labelFont = Fonts.FredokaSemiBold
private val labelColor = Colors.PreWhite



@Composable
fun Label (
	text: String,
	fontSize: Int = 23
) {

	Text (
		text = text,
		fontSize = fontSize.sp,
		color = labelColor,
		fontFamily = labelFont,
		modifier = Modifier.padding (start = 18.5.dp, end = 25.dp)
	)

}
//
//
//
//@Composable
//fun Label (
//	text: String,
//	fontSize: Double = 23.0
//) {
//
//	Text (
//		text = text,
//		fontSize = fontSize.sp,
//		color = labelColor,
//		fontFamily = labelFont,
//		modifier = Modifier.padding (start = 18.5.dp, end = 25.dp)
//	)
//
//}
//
//
//
//@Composable
//fun Label (
//	text: String,
//	fontSize: Float = 23f
//) {
//
//	Text (
//		text = text,
//		fontSize = fontSize.sp,
//		color = labelColor,
//		fontFamily = labelFont,
//		modifier = Modifier.padding (start = 18.5.dp, end = 25.dp)
//	)
//
//}