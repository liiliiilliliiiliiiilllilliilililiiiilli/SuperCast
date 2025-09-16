// Playlist page - Main layer - Controller block - Controller buttons

package com.example.supercast.ui.pages.playlist.layers.main.components.controllerblock.controllerbuttons

import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.offset
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.draw.clip
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.unit.dp

import com.example.supercast.lib.colors.Colors
import com.example.supercast.lib.pics.Pics

import com.example.supercast.ui.components.spaces.Width



private val colorButtonBackSaved = Colors.PreBlack
private val colorButtonBackNotSaved = Colors.Olive
private val colorButtonCornerSaved = Colors.Olive
private val colorButtonCornerNotSaved = Colors.Olive
private val colorButtonPlay = Colors.Olive
private val colorButtonShare = Colors.Olive

private val picSaveSaved = Pics.BookmarkSavedOlive
private val picSaveNotSaved = Pics.BookmarkSavedOlive
private val picTriangleDark = Pics.TrianglePlayDark
private val picShare = Pics.ArrowGoBlack

private const val textPicSaveDescription = "[save pic]"
private const val textPicTriangleDescription = "[triangle pic]"
private const val textPicShareDescription = "[share pic]"



@Composable
fun ControllerButtons (
	isSaved: Boolean,
	isPlaying: Boolean
) {

	Row (
		verticalAlignment = Alignment.CenterVertically,
		horizontalArrangement = Arrangement.Center,
		modifier = Modifier
			.height (75.dp)
			.fillMaxWidth ()
	) {

		SaveButton (
			isSaved = isSaved
		)

		Width (21)

		PlayButton (
			isPlaying = isPlaying
		)

		Width (21)

		ShareButton ()

	}

}



@Composable
private fun SaveButton (
	isSaved: Boolean
) {

	val pic = if (isSaved) picSaveSaved else picSaveNotSaved
	val colorBack = if (isSaved) colorButtonBackSaved else colorButtonBackNotSaved
	val colorCorner = if (isSaved) colorButtonCornerSaved else colorButtonCornerNotSaved


	Image (
		painter = painterResource (pic),
		contentDescription = textPicSaveDescription,
		modifier = Modifier
			.clip (RoundedCornerShape (100))
			.background (color = colorCorner)
			.padding (2.dp)
			.clip (RoundedCornerShape (100))
			.background (color = colorBack)
			.padding (((37.5 - 19 - 2) / 2).dp)
			.size (19.dp)
	)

}



@Composable
private fun PlayButton (
	isPlaying: Boolean
) {

	val q = if (isPlaying) {} else {}

	val onPress = {}


	Image (
		painter = painterResource (picTriangleDark),
		contentDescription = textPicTriangleDescription,
		modifier = Modifier
			.clickable (onClick = {onPress ()})
			.clip (RoundedCornerShape (100))
			.background (colorButtonPlay)
			.padding (((55 - 25) / 2).dp)
			.offset (x = 1.625.dp)
			.size (25.dp)
	)

}



@Composable
private fun ShareButton () {

	Image (
		painter = painterResource (picShare),
		contentDescription = textPicShareDescription,
		modifier = Modifier
			.clip (RoundedCornerShape (100))
			.background (color = colorButtonShare)
			.padding (((37.5 - 19 - 2 + 4) / 2).dp)
			.size (19.dp)
	)

}