// Podcast page - Main layer - Player block - Player - Credits - Chatters

package com.example.supercast.gui.components.pages.podcast.mainlayer.playerblock.player.credits.chatters

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.absoluteOffset
import androidx.compose.foundation.layout.offset
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.compose.ui.zIndex

import com.example.supercast.ui.colors.Colors
import com.example.supercast.ui.fonts.Fonts

import com.example.supercast.gui.components.distinctive.spaces.Height
import com.example.supercast.gui.components.distinctive.spaces.Width

import com.example.supercast.gui.components.global.mainlayer.avacirclemini.AvaCircleMini

import com.example.supercast.gui.components.pages.podcast._types_.Player



private val colorCreatorDark = Colors.Grey
private val colorEctDots = Colors.EctDots

private val fontChatters = Fonts.ArchivoSemiBold

private const val textChatters = "Собеседники"



@Composable
fun Chatters (
	data: Player.Credits.Chatters
) {

	val num = data.num
	val avas = data.avas

	val textNum = "$textChatters $num"


	Column {

		Text (
			text = textNum,
			fontSize = 16.sp,
			color = colorCreatorDark,
			fontFamily = fontChatters,
			modifier = Modifier.offset (x = (-14).dp)
		)

		Height (8)

		Row (
			verticalAlignment = Alignment.Bottom
		) {

			avas.forEachIndexed {index, ava ->

				AvaCircleMini (
					pic = ava,
					size = 37f - index * 5,
					modifier = Modifier
						.absoluteOffset (x = (-index * 16).dp)
						.zIndex (-index.toFloat())
				)

			}

			if (num > 3) {

				EctDots ()

			}

		}

	}

}



@Composable
private fun EctDots () {

	Row (
		modifier = Modifier.offset (x = (-38).dp, y = (-1).dp)
	) {

		Box (
			modifier = Modifier
				.size (4.25.dp)
				.clip (RoundedCornerShape (100))
				.background (colorEctDots)
		)

		Width (3.75)

		Box (
			modifier = Modifier
				.size (4.25.dp)
				.clip (RoundedCornerShape (100))
				.background (colorEctDots)
		)

	}

}