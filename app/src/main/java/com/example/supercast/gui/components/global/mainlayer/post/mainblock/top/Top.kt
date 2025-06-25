// Global components - Main layer - Post - MainBlock - Top

package com.example.supercast.gui.components.global.mainlayer.post.mainblock.top

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.supercast.ui.colors.Colors
import com.example.supercast.ui.fonts.Fonts

import com.example.supercast.gui.components.distinctive.spaces.Height
import com.example.supercast.gui.components.distinctive.spaces.Width
import com.example.supercast.gui.components.global.mainlayer.starsbutton.StarsButton
import com.example.supercast.gui.components.global.mainlayer.actionsbutton.ActionsButton




private val colorAvaCircleCorner = Colors.AvaCircle
private val colorAvaCircleRest = Colors.BarBorder
private val colorDitleName = Colors.PreWhite
private val colorDitleTie = Colors.Grey

private val fontDitleName = Fonts.ArimoSemiBold
private val fontDitleTie = Fonts.ArimoSemiBold

private const val textPicAvaDescription = "[ava pic]"



@Composable
fun Top (
	picAva: Int,
	textDitleName: String,
	textDitleTie: String,
	numStars: Int
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
			pic = picAva,
			name = textDitleName,
			tie = textDitleTie,
		)

		StarsButton (
			value = numStars,
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
	fun Ava (
		pic: Int
	) {

		Image (
			painter = painterResource (pic),
			contentDescription = textPicAvaDescription,
			modifier = Modifier
				.clip (RoundedCornerShape (100))
				.background (colorAvaCircleCorner)
				.padding (1.75.dp)
				.clip (RoundedCornerShape (100))
				.background (colorAvaCircleRest)
				.padding (1.75.dp)
				.clip (RoundedCornerShape (100))
				.size (34.dp)
		)

	}


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