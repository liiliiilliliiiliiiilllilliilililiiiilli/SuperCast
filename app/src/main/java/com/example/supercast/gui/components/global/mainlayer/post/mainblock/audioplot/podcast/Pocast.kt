// Global components - Main layer - Post - Main block - Audio plot - Podcast

package com.example.supercast.gui.components.global.mainlayer.post.mainblock.audioplot.podcast

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp

import com.example.supercast.lib.Lib
import com.example.supercast.ui.colors.Colors
import com.example.supercast.ui.fonts.Fonts
import com.example.supercast.ui.pics.Pics

import com.example.supercast.gui.components.distinctive.spaces.Height
import com.example.supercast.gui.components.global.mainlayer.playbutton.PlayButton as PlayButtonComponent



private val colorTitle = Colors.PreWhite
private val colorStats = Colors.Grey

private val fontTitle = Fonts.ArchivoSemiBold
private val fontStats = Fonts.ArchivoBold

private val pic = Pics.__image_7__

private const val textSomeListeners = "прослушиваний"

private const val textTitle = "Как побеждать (всегда)."

private const val numDuration = 1
private const val numListeners = 38841



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
			listenes = numListeners
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
	listenes: Int
) {

	val durationFormatted = "1:05"  // ProjectLib.formatTime ()
	val listenesFormatted = Lib.formatStarsNumber (listenes)

	val textStats = "$durationFormatted  •  $listenesFormatted $textSomeListeners"


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