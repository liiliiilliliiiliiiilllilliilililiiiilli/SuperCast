// Global components - Main layer - Post - MainBlock - Top

package com.example.supercast.gui.components.global.mainlayer.post.mainblock.top

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
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
import com.example.supercast.projectlib.ProjectLib
import com.example.supercast.ui.colors.Colors
import com.example.supercast.ui.fonts.Fonts
import com.example.supercast.ui.pics.Pics

import com.example.supercast.gui.components.distinctive.spaces.Width
import com.example.supercast.gui.components.global.mainlayer.actionsbutton.ActionsButton



private val picAva = Pics.SamplesAva_3
private const val avaDescription = "[ava pic]"
private val colorAvaCircleCorner = Colors.AvaCircle
private val colorAvaCircleRest = Colors.BarBorder

private const val textDitleName = "Anny"
private const val textDitleTie = "существую"
private val fontDitleName = Fonts.ArimoSemiBold
private val fontDitleTie = Fonts.ArimoSemiBold
private val colorDitleName = Colors.PreWhite
private val colorDitleTie = Colors.Grey

private val picStarPressed = Pics.StarDark
private val picStarNotPressed = Pics.StarLight
private const val starDescription = "[star pic]"
private val colorStarButtonBackPressed = Colors.CircleButton
private val colorStarButtonBackUnPressed = Colors.Button
private const val numStars = 5100
private val fontStars = Fonts.ArimoBold
private val colorStarButtonTextPressed = Colors.Blocks
private val colorStarButtonTextUnPressed = Colors.CircleButton



@Composable
fun Top () {

	val (isStarButtonPressed, setIsStarButtonPressed) = remember {mutableStateOf (false)}
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

		StarButton (
			value = numStars,
			isStarButtonPressed = isStarButtonPressed,
			setIsStarButtonPressed = setIsStarButtonPressed
		)

		ActionsButton (
			isActionsButtonressed = isActionsButtonressed,
			setIsActionsButtonressed = setIsActionsButtonressed
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
			contentDescription = avaDescription,
			modifier = Modifier
				.clip (RoundedCornerShape (100))
				.background (color = colorAvaCircleCorner)
				.padding (1.75.dp)
				.clip (RoundedCornerShape (100))
				.background (color = colorAvaCircleRest)
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

		Width (
			8.dp
		)

		Ditle (
			name = name,
			tie = tie
		)

	}

}



@Composable
private fun StarButton (
	value: Int,
	isStarButtonPressed: Boolean,
	setIsStarButtonPressed: (Boolean) -> Unit
) {

	val text = ProjectLib.formatStarsNumber (value)

	val colorBack = if (isStarButtonPressed) colorStarButtonBackPressed else colorStarButtonBackUnPressed
	val colorText = if (isStarButtonPressed) colorStarButtonTextPressed else colorStarButtonTextUnPressed
	val picStar = if (isStarButtonPressed) picStarPressed else picStarNotPressed

	val switchStarState = {setIsStarButtonPressed (!isStarButtonPressed)}


	Row (
		verticalAlignment = Alignment.CenterVertically,
		modifier = Modifier
			.clickable (onClick = switchStarState)
			.clip (RoundedCornerShape (100))
			.background (color = colorBack)
			.padding (top = 8.dp, bottom = 8.dp, end = 13.dp, start = 14.dp)
	) {

		Text (
			text = text,
			fontSize = 14.sp,
			color = colorText,
			fontFamily = fontStars
		)

		Width (
			6.dp
		)

		Image (
			painter = painterResource (picStar),
			contentDescription = starDescription,
			modifier = Modifier.size (14.dp)
		)

	}

}



@Composable
private fun ActionsButton (
	isActionsButtonressed: Boolean,
	setIsActionsButtonressed: (Boolean) -> Unit
) {

	val switchActionsButtonState = {setIsActionsButtonressed (!isActionsButtonressed)}


	ActionsButton (
		onPress = switchActionsButtonState
	)

}