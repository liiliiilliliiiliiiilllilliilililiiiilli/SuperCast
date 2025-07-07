// Global components - MainLayer - Comment - Voice

package com.example.supercast.gui.components.global.mainlayer.comment.voice

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.width
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp

import com.example.supercast.ui.colors.Colors
import com.example.supercast.ui.fonts.Fonts

import com.example.supercast.gui.components.distinctive.spaces.Height
import com.example.supercast.gui.components.distinctive.spaces.Width

import com.example.supercast.gui.components.global.mainlayer.playbutton.PlayButton as PlayButtonComponent
import com.example.supercast.gui.components.global.mainlayer.translatebutton.TranslateButton as TranslateButtonComponent

import com.example.supercast.gui.components.global.mainlayer.comment._types_.Comment



private val colorBlab = Colors.OliveLight
private val colorInfo = Colors.Olive

private val fontBlab = Fonts.ArchivoBold
private val fontInfo = Fonts.FiraSansSemiBold

private const val textListens = "прослушиваний"



@Composable
fun Voice (
	data: Comment.Voice
) {

	val audio = data.audio
	val transcription = data.transcription
	val duration = data.duration
	val listesNum = data.listens

	val textInfo = "$duration  ·  $listesNum $textListens"


	Row (
		modifier = Modifier
			.padding (top = 2.5.dp)
			.width (275.dp)
	) {

		PlayButton ()

		Width (8)

		Column (
			modifier = Modifier.padding (top = 1.75.dp)
		) {

			Text (
				text = transcription,
				fontSize = 14.sp,
				color = colorBlab,
				fontFamily = fontBlab
			)

			Height (4)

			Text (
				text = textInfo,
				fontSize = 14.sp,
				color = colorInfo,
				fontFamily = fontInfo
			)

		}

		Width (16)

		TranslateButton ()

	}

}



@Composable
private fun PlayButton () {

	val onPress = {}


	PlayButtonComponent (
		onPress = onPress
	)

}



@Composable
private fun TranslateButton () {

	val onPress = {}


	TranslateButtonComponent (
		onPress = onPress
	)

}