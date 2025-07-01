// Global components - Main layer - Ava mini circle

package com.example.supercast.gui.components.global.mainlayer.ava

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.draw.scale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.unit.dp

import com.example.supercast.ui.colors.Colors



private val colorCircleCorner = Colors.AvaCircle
private val colorCircleRest = Colors.BarBorder

private const val textPicAvaDescription = "[ava pic]"



@Composable
fun Ava (
	pic: Int,
	size: Float
) {

	Image (
		painter = painterResource (pic),
		contentDescription = textPicAvaDescription,
		modifier = Modifier
			.clip (RoundedCornerShape (100))
			.background (colorCircleCorner)
			.padding (1.75.dp)

			.clip (RoundedCornerShape (100))
			.background (colorCircleRest)
			.padding (1.75.dp)

			.clip (RoundedCornerShape (100))
			.size (34.dp)

			.scale (size / 34f)
	)

}