// Playlist page - Main layer - Controller block - Preview

package com.example.supercast.gui.components.pages.playlist.mainlayer.controllerblock.preview

import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.runtime.Composable
import androidx.compose.ui.draw.clip
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.unit.dp

import com.example.supercast.ui.colors.Colors



private val colorBack = Colors.Blocks

private const val textPicTriangleDescription = "[preview pic]"



@Composable
fun Preview (
	pic: Int
) {

	val onPress = {}


	Image (
		painter = painterResource (pic),
		contentDescription = textPicTriangleDescription,
		modifier = Modifier
			.clickable (onClick = {onPress ()})
			.clip (RoundedCornerShape (8.dp))
			.background (colorBack)
			.size (137.dp)
	)

}