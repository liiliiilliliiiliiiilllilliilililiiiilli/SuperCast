// My comments page - Main layer - Comment soap - Main content - Ava

package com.example.supercast.gui.components.pages.mycomments.mainlayer.commentsoap.mainblock.ava

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.unit.dp
import com.example.supercast.ui.colors.Colors



private const val picAvaDescription = "[ava pic]"

private val colorAvaCircleCorner = Colors.AvaCircle
private val colorAvaCircleRest = Colors.BarBorder



@Composable
fun Ava (
	pic: Int
) {

	Image (
		painter = painterResource (pic),
		contentDescription = picAvaDescription,
		modifier = Modifier
			.clip (RoundedCornerShape (100))
			.background (color = colorAvaCircleCorner)
			.padding (1.75.dp)
			.clip (RoundedCornerShape (100))
			.background (color = colorAvaCircleRest)
			.padding (1.75.dp)
			.clip (RoundedCornerShape (100))
			.size (34.dp)
	)

}