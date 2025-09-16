// Global components - Ava big circlie

package com.example.supercast.ui.components.avacirclebig

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



private val colorCornerOut = Colors.AvaCircle
private val colorCornerMediate = Colors.Blocks
private val colorCornerIn = Colors.Black

private const val textPicAvaDescription = "[ava pic]"



@Composable
fun AvaCircleBig (
	modifier: Modifier = Modifier,
	pic: Int,
	size: Float = 124f
) {

	Image (
		painter = painterResource (pic),
		contentDescription = textPicAvaDescription,
		modifier = Modifier
			.then (modifier)

			.scale (size / 124f)

			.clip (RoundedCornerShape (100))
			.background (colorCornerOut)
			.padding (3.dp)

			.clip (RoundedCornerShape (100))
			.background (colorCornerMediate)
			.padding (3.dp)

			.clip (RoundedCornerShape (100))
			.background (colorCornerIn)
			.padding (3.dp)

			.clip (RoundedCornerShape (100))
			.size (124.dp)

	)

}