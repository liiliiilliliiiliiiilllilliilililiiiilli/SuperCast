// Podcast page - Main layer - Player block - Player - Credits - Stats

package com.example.supercast.ui.pages.podcast.layers.main.components.playerblock.player.credits.stats

import androidx.compose.foundation.layout.Row
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.ui.Alignment
import androidx.compose.ui.unit.sp

import com.example.supercast.lib.methods.Methods

import com.example.supercast.lib.colors.Colors
import com.example.supercast.lib.fonts.Fonts

import com.example.supercast.ui.components.spaces.Width

import com.example.supercast.ui.components.starsbutton.StarsButton

import com.example.supercast.ui.pages.podcast._types_.Player



private val colorListens = Colors.DitleDark

private val fontListens = Fonts.ArchivoBold

private const val textListens = "прослушиваний"



@Composable
fun Stats (
	data: Player.Credits.Stats
) {

	val (isPressed, setPressed) = remember {mutableStateOf (false)}


	val stars = data.stars
	var listens = "${Methods.formatStarsNumber(data.listens)} $textListens"


	Row (
		verticalAlignment = Alignment.CenterVertically
	) {

		StarsButton (
			value = stars,
			isPressed = isPressed,
			setIsPressed = {setPressed (!isPressed)}
		)

		Width (15)

		Text (
			text = listens,
			fontSize = 15.5.sp,
			color = colorListens,
			fontFamily = fontListens
		)

	}

}