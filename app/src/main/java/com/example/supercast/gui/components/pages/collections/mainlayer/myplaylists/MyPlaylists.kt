// Collections page - Main layer - My playlists block

package com.example.supercast.gui.components.pages.collections.mainlayer.myplaylists

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
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



private val colorBack = Colors.Blocks
private val colorLabel = Colors.Grey
private val colorTitle = Colors.PreWhite
private val colorStats = Colors.Grey
private val colorActions = Colors.Olive

private val fontLabel = Fonts.ArchivoSemiBold
private val fontTitle = Fonts.ArchivoSemiBold
private val fontStats = Fonts.ArchivoSemiBold
private val fontActions = Fonts.ArchivoSemiBold

private const val textPicLogoDescription = "[logo pic]"

private const val textLabel = "Мои плейлисты"
private const val textSomeTracks = "треков"
private const val textCreate = "+ Создать"



@Composable
fun MyPlaylists (
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

		Height (12)

		Actions (
			onPress = {}
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
	fun PlaylistSoap (
		logo: Int,
		title: String,
		count: Int,
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
					.clip (RoundedCornerShape (4.dp))
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
			listens: Int,
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
					listens = count,
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
	) {

		PlaylistSoap (
			logo = Pics.__image_6__,
			title = "Для путешествий",
			count = 8,
			duration = 50
		)

		Height (17)

		PlaylistSoap (
			logo = Pics.__image_5__,
			title = "Вселенная",
			count = 25,
			duration = 501
		)

		Height (17)

		PlaylistSoap (
			logo = Pics.__image_3__,
			title = "Свобода",
			count = 14,
			duration = 921
		)

	}

}



@Composable
private fun Actions (
	onPress: () -> Unit
) {

	Box (
		contentAlignment = Alignment.CenterEnd,
		modifier = Modifier.fillMaxWidth ()
	) {

		Text (
			text = textCreate,
			fontSize = 14.5.sp,
			color = colorActions,
			fontFamily = fontActions,
			modifier = Modifier.offset (x = -37.5.dp)
		)

	}

}