// Global components - Main layer - Post - Main block - Audio plot - Voice

package com.example.supercast.gui.components.global.mainlayer.post.mainblock.audioplot.voice

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp

import com.example.supercast.lib.Lib
import com.example.supercast.ui.colors.Colors
import com.example.supercast.ui.fonts.Fonts

import com.example.supercast.gui.components.distinctive.spaces.Height
import com.example.supercast.gui.components.distinctive.spaces.Width
import com.example.supercast.gui.components.global.mainlayer.playbutton.PlayButton
import com.example.supercast.gui.components.global.mainlayer.translatebutton.TranslateButton



private val colorSpeech = Colors.OliveLight
private val colorStats = Colors.Olive

private val fontSpeech = Fonts.ArchivoSemiBold
private val fontStats = Fonts.ArchivoSemiBold

private const val textSomeListeners = "прослушиваний"

private const val textMain = "Мне бы не хотелось это больше когда-либо видеть. Я бы хотеля получить тою чего всегда так хотела - свободу творчества и покой. Я бы хотеля этоого больше всего в жизни."
private const val textDuration = "5:42"
private const val numListenes = 1468



@Composable
fun Voice (
	data: String
) {

	Row (
		horizontalArrangement = Arrangement.SpaceBetween,
		modifier = Modifier
			.fillMaxSize()
			.padding(vertical = 12.5.dp, horizontal = 25.dp)
	) {

		PlayButton (
			onPress = {}
		)

		Width (11)

		Medium (
			speech = textMain,
			duration = textDuration,
			listenes = numListenes,
			modifier = Modifier.weight (1f)
		)

		Width (11)

		TranslateButton (
			onPress = {}
		)

	}

}



@Composable
private fun Medium (
	speech: String,
	duration: String,
	listenes: Int,
	modifier: Modifier
) {

	val stats = "$duration  ·  ${Lib.formatStarsNumber(listenes)} $textSomeListeners"


	Column (
		modifier = modifier
	) {

		Text (
			text = speech,
			fontSize = 12.75.sp,
			color = colorSpeech,
			fontFamily = fontSpeech
		)

		Height (2.5)

		Text (
			text = stats,
			fontSize = 12.75.sp,
			color = colorStats,
			fontFamily = fontStats
		)

	}

}