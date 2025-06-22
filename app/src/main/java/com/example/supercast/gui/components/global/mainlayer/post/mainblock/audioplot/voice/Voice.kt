// Global components - Main layer - Post - MainBlock - AudioPlot - Voice

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
import com.example.supercast.projectlib.ProjectLib
import com.example.supercast.ui.colors.Colors
import com.example.supercast.ui.fonts.Fonts

import com.example.supercast.gui.components.distinctive.spaces.Height
import com.example.supercast.gui.components.distinctive.spaces.Width
import com.example.supercast.gui.components.global.mainlayer.playbutton.PlayButton
import com.example.supercast.gui.components.global.mainlayer.translatebutton.TranslateButton


private const val textMain = "Мне бы не хотелось это больше когда-либо видеть. Я бы хотеля получить тою чего всегда так хотела - свободу творчества и покой. Я бы хотеля этоого больше всего в жизни."
private const val duration = "5:42"
private const val listenes = 1468



@Composable
fun Voice (
	data: String
) {

	Row (
		horizontalArrangement = Arrangement.SpaceBetween,
		modifier = Modifier
			.fillMaxSize ()
			.padding (vertical = 12.5.dp, horizontal = 25.dp)
	) {

		PlayButton (
			onPress = {}
		)

		Width (11)

		Medium (
			speech = textMain,
			duration = duration,
			listenes = listenes,
			modifier = Modifier.weight (1f)
		)

		Width (11)

		TranslateButton (
			onPress = {}
		)

	}

}



@Composable
fun Medium (
	speech: String,
	duration: String,
	listenes: Int,
	modifier: Modifier
) {

	val listenesFormatted = ProjectLib.formatStarsNumber (listenes)
	val textStats = "$duration  ·  $listenesFormatted прослушиваний"


	Column (
		modifier = modifier
	) {

		Text (
			text = speech,
			fontSize = 12.75.sp,
			color = Colors.OliveLight,
			fontFamily = Fonts.ArchivoSemiBold
		)

		Height (2.5)

		Text (
			text = textStats,
			fontSize = 12.75.sp,
			color = Colors.Olive,
			fontFamily = Fonts.ArchivoSemiBold
		)

	}

}