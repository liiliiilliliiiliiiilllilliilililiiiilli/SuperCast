// Collections page - My comments page - Main layer - Comment soap - Main content - Actions

package com.example.supercast.gui.components.pages.mycomments.mainlayer.commentsoap.mainblock.actions

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.sp

import com.example.supercast.lib.Lib
import com.example.supercast.ui.colors.Colors
import com.example.supercast.ui.fonts.Fonts

import com.example.supercast.gui.components.distinctive.spaces.Space
import com.example.supercast.gui.components.distinctive.spaces.Width
import com.example.supercast.gui.components.global.mainlayer.starsbutton.StarsButton



private val colorCommentsLight = Colors.Olive
private val colorCommentsDark = Colors.DarkGrey
private val colorCitatesLight = Colors.Olive
private val colorCitatesDark = Colors.DarkGrey

private val fontActions = Fonts.ArchivoBold

private const val textSomeComments = "комментариев"
private const val textComment = "Комментировать"
private const val textSomeCitates = "цитат"
private const val textCitate = "Цитировать"



@Composable
fun Actions (
	numComments: Int,
	numCitates: Int,
	numStars: Int
) {

	val (isStarsButtonPressed, setStarsButtonPressed) = remember {mutableStateOf (false)}


	val commentsNumFormatted = Lib.formatStarsNumber (numComments)
	val citatesNumFormatted = Lib.formatStarsNumber (numCitates)

	val textComments = if (numComments > 0) "$commentsNumFormatted ${textSomeComments}" else textComment
	val colorTextComments = if (numComments > 0) colorCommentsLight else colorCommentsDark

	val textCitates = if (numCitates > 0) "$citatesNumFormatted $textSomeCitates" else textCitate
	val colorTextCitates = if (numCitates > 0) colorCitatesLight else colorCitatesDark


	Row (
		verticalAlignment = Alignment.CenterVertically,
		horizontalArrangement = Arrangement.SpaceEvenly,
		modifier = Modifier.fillMaxWidth ()
	) {

		Text (
			text = textComments,
			fontSize = 14.5.sp,
			color = colorTextComments,
			fontFamily = fontActions,
		)

		Width (14)

		Text (
			text = textCitates,
			fontSize = 14.5.sp,
			color = colorTextCitates,
			fontFamily = fontActions,
		)

		Space (modifier = Modifier.weight (1f))

		StarsButton (
			scale = 0.92f,
			value = numStars,
			isPressed = isStarsButtonPressed,
			setIsPressed = setStarsButtonPressed
		)

	}

}