// Collections page - Main layer - My history

package com.example.supercast.gui.components.pages.collections.mainlayer.myhistory

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.offset
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp

import com.example.supercast.ui.colors.Colors
import com.example.supercast.ui.fonts.Fonts
import com.example.supercast.ui.pics.Pics

import com.example.supercast.gui.components.distinctive.spaces.Height
import com.example.supercast.gui.components.distinctive.spaces.Width



private val colorLabel = Colors.Grey
private val colorBack = Colors.Blocks
private val colorTitle = Colors.PreWhite
private val colorStats = Colors.Grey

private val fontLabel = Fonts.ArchivoSemiBold
private val fontTitle = Fonts.ArchivoSemiBold
private val fontStats = Fonts.ArchivoSemiBold

private const val textPicLogoDescription = "[playlist logo pic]"

private const val textLabel = "История прослушивания"
private const val textSomeTracks = "треков"



@Composable
fun MyHistory (
	data: String,
	modifier: Modifier = Modifier
) {

	val labelText = textLabel


	Column (
		modifier = modifier
	) {

		Label (
			text = labelText
		)

		Height (12)

		Main (
			data = ""
		)

	}

}



@Composable
private fun Label (
	text: String
) {

	Text (
		text = text,
		fontSize = 14.5.sp,
		color = colorLabel,
		fontFamily = fontLabel,
		modifier = Modifier.offset (x = 37.5.dp)
	)

}



@Composable
private fun Main (
	data: String
) {

	@Composable
	fun ListenedSoap (
		logo: Int,
		title: String,
		data: String,
		duration: Int
	) {

		@Composable
		fun Logo (
			pic: Int
		) {

			Image (
				painter = painterResource (pic),
				contentDescription = textPicLogoDescription,
				modifier = Modifier
					.size (44.dp)
					.clip (RoundedCornerShape (100))
			)

		}


		@Composable
		fun Title (
			text: String
		) {

			Text (
				text = text,
				fontSize = 14.5.sp,
				color = colorTitle,
				fontFamily = fontTitle
			)

		}


		@Composable
		fun Stats (
			listens: String,
			duration: Int
		) {

			val text = "$listens $textSomeTracks  •  $duration"


			Text (
				text = text,
				fontSize = 12.sp,
				color = colorStats,
				fontFamily = fontStats,
				modifier = Modifier.offset (x = 10.dp)
			)

		}


		Row (
			verticalAlignment = Alignment.CenterVertically,
			modifier = Modifier.fillMaxWidth ()
		) {

			Logo (
				pic = logo
			)

			Width (17)

			Column {

				Title (
					text = title
				)

				Height (3.75)

				Stats (
					listens = data,
					duration = duration
				)

			}

		}

	}


	Column (
		modifier = Modifier
			.clip (RoundedCornerShape (8.dp))
			.background (colorBack)
			.padding (16.dp)
//			.heightIn (0.dp, 150.dp)
	) {

		ListenedSoap (
			logo = Pics.__image_4__,
			title = "Как я обокрал гробницу",
			data = "Cake of neon",
			duration = 471
		)

		Height (17)

		ListenedSoap (
			logo = Pics.__image_9__,
			title = "My Shit",
			data = "Приведение",
			duration = 4
		)

		Height (17)

		ListenedSoap (
			logo = Pics.__image_2__,
			title = "Свобода",
			data = "Goodbye",
			duration = 5
		)

	}

}