// Podcast page - Main layer - Player block - Player - Credits - Description

package com.example.supercast.gui.components.pages.podcast.mainlayer.playerblock.player.credits.descriptionbutton

import androidx.compose.runtime.Composable
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember

import com.example.supercast.gui.components.global.mainlayer.descriptionbutton.DescriptionButton

import com.example.supercast.gui.components.pages.podcast._types_.Player



@Composable
fun DescriptionButton (
	data: Player.Credits.Description
) {

	val (isPressed, setPressed) = remember {mutableStateOf (false)}


	DescriptionButton (
		isOpened = isPressed,
		setIsOpened = {setPressed (!isPressed)}
	)

}