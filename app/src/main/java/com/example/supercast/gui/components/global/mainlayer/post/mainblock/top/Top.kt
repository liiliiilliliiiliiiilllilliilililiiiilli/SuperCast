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
import androidx.compose.ui.text.font.Font
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.supercast.R
import com.example.supercast.ui.colors.Colors

import com.example.supercast.gui.components.distinctive.spaces.Width
import com.example.supercast.gui.components.global.mainlayer.actionsbutton.ActionsButton



private val picAva = R.drawable.samples_ava_3
private const val avaDescription = "[ava pic]"
private val colorAvaCircleCorner = Colors.AvaCircle
private val colorAvaCircleRest = Colors.BarBorder

private const val textDitleName = "Anny"
private const val textDitleTie = "существую"
private val fontDitleName = FontFamily (Font (R.font.arimo_semi_bold))
private val fontDitleTie = FontFamily (Font (R.font.arimo_semi_bold))
private val colorDitleName = Colors.PreWhite
private val colorDitleTie = Colors.Grey

private val picStarPressed = R.drawable.star_dark
private val picStarNotPressed = R.drawable.star_light
private const val starDescription = "[star pic]"
private val colorStarButtonBackPressed = Colors.CircleButton
private val colorStarButtonBackUnPressed = Colors.Button
private const val numStars = 5100
private val fontStars = FontFamily (Font (R.font.arimo_bold))
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
				fontFamily = fontDitleName,
				color = colorDitleName
			)

			Text (
				text = tie,
				fontSize = 14.sp,
				fontFamily = fontDitleTie,
				color = colorDitleTie
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

	fun formatStarsNumber (q: Int): String {

		var r = "$q"

		return when (q) {

			in 0..999 -> r
			in 1000..9999 -> r.substring(0, 1) + "." + r.substring(1, 2) + "k"
			in 10000..999999 -> r.dropLast(3) + "k"
			in 1000000..9999999 -> r.substring(0, 1) + "." + r.substring(1, 2) + "m"
			in 10000000..999999999 -> r.dropLast(6) + "m"
			in 1000000000..9999999999 -> r.substring(0, 1) + "." + r.substring(1, 2) + "b"
			else -> r.dropLast(9) + "b"

		}

	}

	val text = formatStarsNumber (value)



	val colorBack = if (isStarButtonPressed) colorStarButtonBackPressed else colorStarButtonBackUnPressed
	val colorText = if (isStarButtonPressed) colorStarButtonTextPressed else colorStarButtonTextUnPressed
	val picStar = if (isStarButtonPressed) picStarPressed else picStarNotPressed


	Row (
		verticalAlignment = Alignment.CenterVertically,
		modifier = Modifier
			.clickable (onClick = {setIsStarButtonPressed (!isStarButtonPressed)})
			.clip (RoundedCornerShape (100))
			.background (color = colorBack)
			.padding (top = 8.dp, bottom = 8.dp, end = 13.dp, start = 14.dp)
	) {

		Text (
			text = text,
			fontSize = 14.sp,
			fontFamily = fontStars,
			color = colorText
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

	ActionsButton (
		onPress = {setIsActionsButtonressed (!isActionsButtonressed)}
	)

}