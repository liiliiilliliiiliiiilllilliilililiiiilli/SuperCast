// Podcast page - Main layer - Player block - Player - Content - Controller

package com.example.supercast.ui.pages.podcast.layers.main.components.playerblock.player.content.controller

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp

import com.example.supercast.lib.colors.Colors
import com.example.supercast.lib.fonts.Fonts
import com.example.supercast.lib.pics.Pics

import com.example.supercast.ui.components.spaces.Space
import com.example.supercast.ui.components.spaces.Height

import com.example.supercast.ui.components.actionsbutton.ActionsButton as ActionsButtonComponent
import com.example.supercast.ui.components.playbutton.PlayButton as PlayButtonComponent

import com.example.supercast.ui.pages.podcast._types_.Player



private val colorTrackTimeTo = Colors.Grey
private val colorTrackDotGrey = Colors.OliveMonochromic
private val colorTrackDark = Colors.TrackDark
private val colorTrackDotGreen = Colors.Olive
private val colorTrackTimeNow = Colors.Olive

private val fontTrackTimeTo = Fonts.ArchivoBold
private val fontTrackTimeNow = Fonts.ArchivoBold

private val picSettings = Pics.SettingsWheelLight

private const val textPicSettingsDescription = "[settings pic]"



@Composable
fun Controller (
	track: Player.Content.Track
) {

	val totalDuration = track.duration
	val currentPosition = track.current


	Column (
		horizontalAlignment = Alignment.CenterHorizontally,
		modifier = Modifier
			.fillMaxHeight ()
			.width (65.dp)
			.padding (top = 19.5.dp, bottom = 11.dp, start = 6.dp, end = 6.dp)
	) {

		Actions ()

		Height (28)

		Space (modifier = Modifier.weight (1f))

		Track (
			totalDuration = totalDuration,
			currentPosition = currentPosition
		)

	}

}



@Composable
private fun Actions () {

	ActionsButtonComponent (
		onPress = {}
	)

}



@Composable
private fun Track (
	totalDuration: Int,
	currentPosition: Int
) {

	@Composable
	fun SettingsButton () {

		Image (
			painter = painterResource (picSettings),
			contentDescription = textPicSettingsDescription,
			modifier = Modifier.size (32.dp)
		)

	}


	@Composable
	fun TimeTo (
		time: Int
	) {

		val time = "$time"


		Text (
			text = time,
			fontSize = 15.sp,
			color = colorTrackTimeTo,
			fontFamily = fontTrackTimeTo
		)

	}


	@Composable
	fun Track (
		modifier: Modifier
	) {

		Column (
			horizontalAlignment = Alignment.CenterHorizontally,
			modifier = Modifier.then (modifier)
		) {

			Box (
				modifier = Modifier
					.size (11.dp)
					.clip (RoundedCornerShape (100))
					.background (color = colorTrackDotGrey)
			)

			Height (2.5)

			Box (
				modifier = Modifier
					.weight (1f)
					.width (2.5.dp)
					.clip (RoundedCornerShape (100))
					.background (color = colorTrackDark)
			)

			Height (2.5)

			Box (
				modifier = Modifier
					.size (11.dp)
					.clip (RoundedCornerShape (100))
					.background (color = colorTrackDotGreen)
			)

		}

	}


	@Composable
	fun TimeNow (
		time: Int
	) {

		val time = "$time"


		Text (
			text = time,
			fontSize = 15.sp,
			color = colorTrackTimeNow,
			fontFamily = fontTrackTimeNow
		)

	}


	@Composable
	fun PlayButton () {

		PlayButtonComponent (
			size = 47f
		)

	}


	Column (
		horizontalAlignment = Alignment.CenterHorizontally,
		modifier = Modifier.fillMaxHeight ()
	) {

		SettingsButton ()

		Height (14)

		TimeTo (
			time = totalDuration
		)

		Height (14)

		Track (
			modifier = Modifier.weight (1f)
		)

		Height (14)

		TimeNow (
			time = currentPosition
		)

		Height (14)

		PlayButton ()

		Height (5)

	}

}