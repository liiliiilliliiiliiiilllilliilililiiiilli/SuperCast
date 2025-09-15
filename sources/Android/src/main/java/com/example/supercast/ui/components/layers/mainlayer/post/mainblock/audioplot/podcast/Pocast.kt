// Global components - Main layer - Post - Main block - Audio plot - Podcast

package com.example.supercast.ui.components.layers.mainlayer.post.mainblock.audioplot.podcast

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.Row
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp

import com.example.supercast.lib.methods.Methods

import com.example.supercast.lib.colors.Colors
import com.example.supercast.lib.fonts.Fonts
import com.example.supercast.lib.pics.Pics

import com.example.supercast.ui.components.common.spaces.Height

import com.example.supercast.ui.components.layers.mainlayer.playbutton.PlayButton as PlayButtonComponent



private val colorTitle = Colors.PreWhite
private val colorStats = Colors.Grey

private val fontTitle = Fonts.ArchivoSemiBold
private val fontStats = Fonts.ArchivoBold

private val pic = Pics.__image_7__

private const val textListens = "прослушиваний"

private const val textTitle = "Как побеждать (всегда)."

private const val numDuration = 1
private const val numAudience = 38841



@Composable
fun Podcast (
	data: String
) {

	Row (
		verticalAlignment = Alignment.CenterVertically,
		horizontalArrangement = Arrangement.SpaceBetween,
		modifier = Modifier
			.fillMaxSize ()
			.padding (vertical = 12.5.dp, horizontal = 25.dp)
	) {

		Ditle (
			title = textTitle,
			duration = numDuration,
			listens = numAudience
		)

		PlayButton (
			pic = pic,
			onPress = {}
		)

	}

}



@Composable
private fun Ditle (
	title: String,
	duration: Int,
	listens: Int
) {

	val durationFormatted = "1:05"  // ProjectLib.formatTime ()
	val listensFormatted = Methods.formatStarsNumber (listens)

	val textStats = "$durationFormatted  •  $listensFormatted $textListens"


	Column {

		Text (
			text = title,
			fontSize = 19.sp,
			color = colorTitle,
			fontFamily = fontTitle
		)

		Height (5)

		Text (
			text = textStats,
			fontSize = 12.75.sp,
			color = colorStats,
			fontFamily = fontStats,
			modifier = Modifier.padding (start = 11.dp)
		)

	}

}



@Composable
private fun PlayButton (
	pic: Int,
	onPress: () -> Unit
) {

	val scale = 45f/37f


	PlayButtonComponent (
		scale = scale,
		isLight = true,
		pic = pic,
		onPress = onPress
	)

}