// Podcast page - Main layer - Player block - Player - Credits - Creator

package com.example.supercast.ui.pages.podcast.layers.main.components.playerblock.player.credits.creator

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

import com.example.supercast.lib.methods.Methods

import com.example.supercast.lib.colors.Colors
import com.example.supercast.lib.fonts.Fonts
import com.example.supercast.lib.pics.Pics

import com.example.supercast.ui.components.common.spaces.Height
import com.example.supercast.ui.components.common.spaces.Width

import com.example.supercast.ui.components.layers.mainlayer.avacirclemini.AvaCircleMini

import com.example.supercast.ui.pages.podcast.types.Player



private val colorCreatorSecondary = Colors.Grey
private val colorCreatorPrimary = Colors.PreWhite
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
	val audience = Methods.formatStarsNumber (data.audience)
	val isSubscribed = data.isSubscribed


	Row (
		verticalAlignment = Alignment.CenterVertically,
		modifier = Modifier.padding (top = 1.dp, bottom = 8.dp, start = 32.dp)
	) {

		Ava (
			ava = ava
		)

		Width (25)

		Ditle (
			tie = tie,
			name = name,
			audience = audience
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
	audience: String
) {

	Column (
		horizontalAlignment = Alignment.CenterHorizontally
	) {

		Text (
			text = tie,
			fontSize = 14.5.sp,
			color = colorCreatorSecondary,
			fontFamily = fontCreator
		)

		Height (5)

		Text (
			text = name,
			fontSize = 20.sp,
			color = colorCreatorPrimary,
			fontFamily = fontCreator
		)

		Height (5)

		Text (
			text = audience,
			fontSize = 14.5.sp,
			color = colorCreatorSecondary,
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