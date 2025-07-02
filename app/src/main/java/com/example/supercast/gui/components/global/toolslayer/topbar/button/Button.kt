// Global components - Tools layer - Top bar - Bar button

package com.example.supercast.gui.components.global.toolslayer.topbar.button

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.draw.rotate
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.unit.Dp
import androidx.compose.ui.unit.dp

import com.example.supercast.ui.colors.Colors



private val colorBack = Colors.Black
private val colorCorner = Colors.Button

private const val textPicBarButtonDescription = "[top bar pic]"



@Composable
fun BarButton (
	pic: Int,
	picSize: Dp = 17.dp,
	rotate: Float = 0f,
	isCircle: Boolean = false,
	onPress: () -> Unit,
	modifier: Modifier = Modifier
) {

	val radiusCornerOut = if (isCircle) 100.dp else 10.dp
	val radiusCornerIn = if (isCircle) 100.dp else 7.dp
	val paddingInside = 7.dp + (17.dp - picSize) / 2


	Image (
		painter = painterResource (pic),
		contentDescription = textPicBarButtonDescription,
		modifier = Modifier
			.clickable (onClick = onPress)

			.clip (RoundedCornerShape (radiusCornerOut))
			.background (colorCorner)
			.padding (3.dp)

			.clip (RoundedCornerShape (radiusCornerIn))
			.background (colorBack)
			.padding (paddingInside)

			.size (picSize)
			.rotate (rotate)

			.then (modifier)
	)

}