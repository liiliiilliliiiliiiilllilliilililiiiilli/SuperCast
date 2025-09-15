// Playlist page - Main layer - Controller block - Ditle

package com.example.supercast.ui.pages.playlist.layers.main.components.controllerblock.ditle

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.size
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp

import com.example.supercast.lib.colors.Colors
import com.example.supercast.lib.fonts.Fonts
import com.example.supercast.lib.pics.Pics

import com.example.supercast.ui.components.common.spaces.Height



private val picDownload = Pics.DownloadGrey

private val colorTitle = Colors.PreWhite
private val colorDot = Colors.Grey
private val colorAuthor = Colors.Olive
private val colorNumPodcasts = Colors.Grey
private val colorDuration = Colors.Grey

private val fontUpper = Fonts.ArchivoSemiBold
private val fontLower = Fonts.ArchivoBold

private const val textPicDownloadDescription = "[download pic]"

private const val textListeners = "слушателей"
private const val textSeconds = "сек."
private const val textDot = "·"



@Composable
fun Ditle (
	title: String,
	author: String,
	numPodcasts: Int,
	duration: Int
) {

	val numPodcasts = "$numPodcasts $textListeners"
	val duration = "$duration $textSeconds"


	Column (
		verticalArrangement = Arrangement.Center,
		horizontalAlignment = Alignment.CenterHorizontally,
		modifier = Modifier
			.fillMaxWidth ()
			.padding (vertical = 16.dp)
	) {

		Text (
			text = title,
			fontSize = 25.sp,
			color = colorTitle,
			fontFamily = fontUpper
		)

		Height (5)

		Row (
			verticalAlignment = Alignment.CenterVertically,
			horizontalArrangement = Arrangement.Center
		) {

			Image (
				painter = painterResource (picDownload),
				contentDescription = textPicDownloadDescription,
				modifier = Modifier.size (14.dp)
			)

			Dot ()

			Text (
				text = author,
				fontSize = 16.sp,
				color = colorAuthor,
				fontFamily = fontLower
			)

			Dot ()

			Text (
				text = numPodcasts,
				fontSize = 16.sp,
				color = colorNumPodcasts,
				fontFamily = fontLower
			)

			Dot ()

			Text (
				text = duration,
				fontSize = 16.sp,
				color = colorDuration,
				fontFamily = fontLower
			)

		}

	}

}



@Composable
private fun Dot () {

	Text (
		text = textDot,
		fontSize = 16.sp,
		color = colorDot,
		fontFamily = fontLower,
		modifier = Modifier.padding (horizontal = 5.dp)
	)

}