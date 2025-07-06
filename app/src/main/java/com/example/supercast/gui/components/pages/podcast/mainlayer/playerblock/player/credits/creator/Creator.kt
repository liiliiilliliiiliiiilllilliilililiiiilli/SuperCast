// Podcast page - Main layer - Player block - Player - Credits - Creator

package com.example.supercast.gui.components.pages.podcast.mainlayer.playerblock.player.credits.creator

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
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

import com.example.supercast.lib.Lib

import com.example.supercast.ui.colors.Colors
import com.example.supercast.ui.fonts.Fonts
import com.example.supercast.ui.pics.Pics

import com.example.supercast.gui.components.distinctive.spaces.Height
import com.example.supercast.gui.components.distinctive.spaces.Width

import com.example.supercast.gui.components.global.mainlayer.avacirclemini.AvaCircleMini

import com.example.supercast.gui.components.pages.podcast._types_.Player



private val colorCreatorDark = Colors.Grey
private val colorCreatorLight = Colors.PreWhite
private val colorSubscribeButtonBack = Colors.Button

private val fontCreator = Fonts.ArchivoBold

private val picPlus = Pics.PlusSharpGreyLight
private val picCheck = Pics.CheckLight

private const val textPicSubscribeButtonDescription = "[subscribe button pic]"



@Composable
fun Creator (
	data: Player.Credits.Creator
) {

	val ava = data.ava
	val tie = data.tie
	val name = data.name
	val listeners = Lib.formatStarsNumber (data.listeners)
	val isSubscribed = data.isSubscribed


	Row (
		verticalAlignment = Alignment.CenterVertically,
		modifier = Modifier.padding (start = 32.dp, top = 1.dp, bottom = 8.dp)
	) {

		Ava (
			ava = ava
		)

		Width (25)

		Ditle (
			tie = tie,
			name = name,
			listeners = listeners
		)

		Width (11)

		SubscribeCircleButton (
			isSubscribed = isSubscribed
		)

	}

}



@Composable
private fun Ava (
	ava: Int
) {

	AvaCircleMini (
		pic = ava,
		size = 59f
	)

}



@Composable
private fun Ditle (
	tie: String,
	name: String,
	listeners: String
) {

	Column (
		horizontalAlignment = Alignment.CenterHorizontally
	) {

		Text (
			text = tie,
			fontSize = 14.5.sp,
			color = colorCreatorDark,
			fontFamily = fontCreator
		)

		Height (5)

		Text (
			text = name,
			fontSize = 20.sp,
			color = colorCreatorLight,
			fontFamily = fontCreator
		)

		Height (5)

		Text (
			text = listeners,
			fontSize = 14.5.sp,
			color = colorCreatorDark,
			fontFamily = fontCreator
		)

	}

}



@Composable
private fun SubscribeCircleButton (
	isSubscribed: Boolean
) {

	val pic = if (!isSubscribed) picPlus else picCheck


	Image (
		painter = painterResource (pic),
		contentDescription = textPicSubscribeButtonDescription,
		modifier = Modifier
			.clip (RoundedCornerShape (100))
			.background (color = colorSubscribeButtonBack)
			.padding (7.5.dp)
			.size (10.dp)
	)

}