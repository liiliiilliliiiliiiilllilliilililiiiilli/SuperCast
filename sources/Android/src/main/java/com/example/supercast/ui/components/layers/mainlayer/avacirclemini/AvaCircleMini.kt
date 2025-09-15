// Global components - Main layer - Ava mini circle

package com.example.supercast.ui.components.layers.mainlayer.avacirclemini

import androidx.compose.foundation.background
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.runtime.Composable
import androidx.compose.ui.draw.clip
import androidx.compose.ui.draw.scale
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.unit.dp

import com.example.supercast.lib.colors.Colors



private val colorCircleCorner = Colors.AvaCircle
private val colorCircleRest = Colors.BarBorder

private const val textPicAvaDescription = "[ava pic]"



@Composable
fun AvaCircleMini (
	modifier: Modifier = Modifier,
	pic: Int,
	size: Float = 34f
) {

	Image (
		painter = painterResource (pic),
		contentDescription = textPicAvaDescription,
		modifier = Modifier
			.then (modifier)

			.scale (size / 34f)

			.clip (RoundedCornerShape (100))
			.background (colorCircleCorner)
			.padding (1.75.dp)

			.clip (RoundedCornerShape (100))
			.background (colorCircleRest)
			.padding (1.75.dp)

			.clip (RoundedCornerShape (100))
			.size (34.dp)

	)

}