// Global components - Post - Main block - Top bar

package com.example.supercast.ui.components.post.mainblock.topbar

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.Row
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp

import com.example.supercast.lib.colors.Colors
import com.example.supercast.lib.fonts.Fonts

import com.example.supercast.ui.components.spaces.Height
import com.example.supercast.ui.components.spaces.Width

import com.example.supercast.ui.components.avacirclemini.AvaCircleMini as Ava
import com.example.supercast.ui.components.starsbutton.StarsButton
import com.example.supercast.ui.components.actionsbutton.ActionsButton



private val colorDitleName = Colors.PreWhite
private val colorDitleTie = Colors.Grey

private val fontDitleName = Fonts.ArimoSemiBold
private val fontDitleTie = Fonts.ArimoSemiBold



@Composable
fun TopBar (
	ava: Int,
	name: String,
	tie: String,
	stars: Int
) {

	val (isStarsButtonPressed, setIsStarsButtonPressed) = remember {mutableStateOf (false)}
	val (isActionsButtonressed, setIsActionsButtonressed) = remember {mutableStateOf (false)}


	Row (
		verticalAlignment = Alignment.CenterVertically,
		horizontalArrangement = Arrangement.SpaceBetween,
		modifier = Modifier
			.fillMaxWidth ()
			.padding (top = 12.dp, bottom = 12.dp, start = 12.dp, end = (11+((43-25)/2)/2).dp)
	) {

		Author (
			pic = ava,
			name = name,
			tie = tie,
		)

		StarsButton (
			value = stars,
			isPressed = isStarsButtonPressed,
			setIsPressed = setIsStarsButtonPressed
		)

		ActionsButton (
			onPress = {setIsActionsButtonressed (!isActionsButtonressed)}
		)

	}

}



@Composable
private fun Author (
	pic: Int,
	name: String,
	tie: String
) {

	@Composable
	fun Ditle (
		name: String,
		tie: String
	) {

		Column {

			Text (
				text = name,
				fontSize = 14.sp,
				color = colorDitleName,
				fontFamily = fontDitleName
			)

			Height (1.75)

			Text (
				text = tie,
				fontSize = 14.sp,
				color = colorDitleTie,
				fontFamily = fontDitleTie
			)

		}

	}


	Row (
		verticalAlignment = Alignment.CenterVertically,
		horizontalArrangement = Arrangement.SpaceBetween
	) {

		Ava (
			pic = pic
		)

		Width (8)

		Ditle (
			name = name,
			tie = tie
		)

	}

}