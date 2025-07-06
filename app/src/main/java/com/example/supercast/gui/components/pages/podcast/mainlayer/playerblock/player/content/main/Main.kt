// Podcast page - Main layer - Player block - Player - Content - Main

package com.example.supercast.gui.components.pages.podcast.mainlayer.playerblock.player.content.main

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.offset
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
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp

import com.example.supercast.ui.colors.Colors
import com.example.supercast.ui.fonts.Fonts
import com.example.supercast.ui.pics.Pics

import com.example.supercast.gui.components.distinctive.spaces.Height

import com.example.supercast.gui.components.pages.podcast._types_.Player



private val colorTitle = Colors.PreWhite
private val colorStage = Colors.Olive
private val colorBubbleBackLight = Colors.PreWhite
private val colorBubbleBackDark = Colors.Grey
private val colorBubbleSpeakerLight = Colors.PodcastBubbleSpeakerRoleLight
private val colorBubbleSpeakerDark = Colors.PodcastBubbleSpeakerRoleLight
private val colorBubbleSpeakerRoleLight = Colors.PodcastBubbleSpeakerRoleLight
private val colorBubbleSpeakerRoleDark = Colors.PodcastBubbleSpeakerRoleDark
private val colorBubbleSpeechLight = Colors.PodcastBubbleSpeechLight
private val colorBubbleSpeechDark = Colors.PodcastBubbleSpeechDark

private val fontTitle = Fonts.ArchivoSemiBold
private val fontStage = Fonts.ArchivoBold
private val fontBubbleSpeaker = Fonts.ArchivoBold
private val fontBubbleSpeakerRole = Fonts.ArchivoBold
private val fontBubbleSpeech = Fonts.ArchivoRegular

private val picArrowsExpand = Pics.ArrowsExpandOlive

private const val textPicArrowsExpandDescription = "[expand arrows pic]"



@Composable
fun Main (
	ditle: Player.Content.Ditle,
	preview: Player.Content.Preview
) {

	val title = ditle.title
	val stage = ditle.stage

	val preview = preview.data


	Column (
		verticalArrangement = Arrangement.Center,
		horizontalAlignment = Alignment.Start
	) {

		Ditle (
			title = title,
			stage = stage
		)

		Bubbles (
			bubble_1 = preview[0],
			bubble_2 = preview[1],
			modifier = Modifier.weight (1f)
		)

		ExpaddButton (
//			modifier = Modifier.weight (1f)
		)

	}

}



@Composable
private fun Ditle (
	title: String,
	stage: String
) {

	Column (
		modifier = Modifier.padding (top = 16.dp, bottom = 16.dp, start = 26.dp)
	) {

		Text (
			text = title,
			fontSize = 26.sp,
			color = colorTitle,
			fontFamily = fontTitle
		)

		Height (2)

		Text (
			text = stage,
			fontSize = 16.sp,
			color = colorStage,
			fontFamily = fontStage
		)

	}

}



@Composable
private fun Bubbles (
	bubble_1: Player.Content.Bubble,
	bubble_2: Player.Content.Bubble,
	modifier: Modifier
) {

	@Composable
	fun Bubble (
		speaker: String,
		speakerRole: String,
		speech: String,
		isLight: Boolean,
		modifier: Modifier = Modifier
	) {

		val colorBubbleBack = if (isLight) colorBubbleBackLight else colorBubbleBackDark

		val colorBubbleSpeaker = if (isLight) colorBubbleSpeakerLight else colorBubbleSpeakerDark
		val colorBubbleSpeakerRole = if (isLight) colorBubbleSpeakerRoleLight else colorBubbleSpeakerRoleDark
		val colorBubbleSpeach = if (isLight) colorBubbleSpeechLight else colorBubbleSpeechDark


		Column (
			horizontalAlignment = Alignment.CenterHorizontally,
			modifier = Modifier
				.then (modifier)
				.clip (RoundedCornerShape (14.dp))
				.background (color = colorBubbleBack)
				.padding (top = 9.dp, bottom = 6.dp, start = 15.dp, end = 15.dp)
		) {

			Text (
				text = speaker,
				fontSize = 15.5.sp,
				color = colorBubbleSpeaker,
				fontFamily = fontBubbleSpeaker,
				textAlign = TextAlign.Center
			)

			Height (1)

			Text (
				text = speakerRole,
				fontSize = 13.sp,
				color = colorBubbleSpeakerRole,
				fontFamily = fontBubbleSpeakerRole,
				textAlign = TextAlign.Center
			)

			Height (5.5)

			Text (
				text = speech,
				maxLines = 6,
				fontSize = 17.5.sp,
				color = colorBubbleSpeach,
				fontFamily = fontBubbleSpeech,
				textAlign = TextAlign.Center,
				modifier = Modifier.width (266.dp)
			)

		}

	}

//		if (preview == preview) {} else {}

	Column (
		verticalArrangement = Arrangement.Center,
		horizontalAlignment = Alignment.CenterHorizontally,
		modifier = modifier.padding (start = 8.dp)
	) {

		Bubble (
			speaker = bubble_1.speaker,
			speakerRole = bubble_1.speakerRole,
			speech = bubble_1.speech,
			isLight = true,
			modifier = Modifier.offset (x = 29.dp)
		)

		Height (51)

		Bubble (
			speaker = bubble_2.speaker,
			speakerRole = bubble_2.speakerRole,
			speech = bubble_2.speech,
			isLight = false
		)

	}

}



@Composable
private fun ExpaddButton () {

	Box (
		modifier = Modifier.padding (bottom = 14.dp, start = 21.dp)
	) {

		Image (
			painter = painterResource (picArrowsExpand),
			contentDescription = textPicArrowsExpandDescription,
			modifier = Modifier
				.padding (11.dp)
				.size (19.dp)
		)

	}

}