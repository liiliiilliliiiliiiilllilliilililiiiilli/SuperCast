// Global components - Main layer - Stars button

package com.example.supercast.gui.components.global.mainlayer.starsbutton

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.draw.scale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.supercast.projectlib.ProjectLib
import com.example.supercast.ui.colors.Colors
import com.example.supercast.ui.fonts.Fonts
import com.example.supercast.ui.pics.Pics

import com.example.supercast.gui.components.distinctive.spaces.Width



private const val textPicStarDescription = "[star pic]"
private val picStarPressed = Pics.StarDark
private val picStarNotPressed = Pics.StarLight
private val colorStarButtonBackPressed = Colors.CircleButton
private val colorStarButtonBackUnPressed = Colors.Button

private val fontStars = Fonts.ArimoBold
private val colorStarButtonTextPressed = Colors.Blocks
private val colorStarButtonTextUnPressed = Colors.CircleButton



@Composable
fun StarsButton (
	value: Int,
	isPressed: Boolean,
	setIsPressed: (Boolean) -> Unit,
	scale: Float = 1f
) {

	val text = ProjectLib.formatStarsNumber (value)

	val colorBack = if (isPressed) colorStarButtonBackPressed else colorStarButtonBackUnPressed
	val colorText = if (isPressed) colorStarButtonTextPressed else colorStarButtonTextUnPressed
	val picStar = if (isPressed) picStarPressed else picStarNotPressed

	val switchStarState = {setIsPressed (!isPressed)}


	Row (
		verticalAlignment = Alignment.CenterVertically,
		modifier = Modifier
			.scale (scale)
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

		Width (6)

		Image (
			painter = painterResource (picStar),
			contentDescription = textPicStarDescription,
			modifier = Modifier.size (14.dp)
		)

	}

}