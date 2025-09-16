// Main page - Tools layer - Top bar - Notifications button

package com.example.supercast.ui.pages.main.layers.tools.components.topbar.notificationsbutton

import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.absoluteOffset
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.draw.clip
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp

import com.example.supercast.lib.colors.Colors
import com.example.supercast.lib.fonts.Fonts
import com.example.supercast.lib.pics.Pics



private val colorBack = Colors.Black
private val colorCorner = Colors.Button
private val colorCounterBack = Colors.Olive
private val colorCounter = Colors.PreBlack

private val fontCounter = Fonts.FiraSansSemiBold

private val picBell = Pics.BellGrey

private const val textPicBellDescription = "[bell pic]"



@Composable
fun NotificationsButton (
	notificationsNum: Int,
	onPress: () -> Unit
) {

	val num = "$notificationsNum"


	Box {

		Image (
			painter = painterResource (picBell),
			contentDescription = textPicBellDescription,
			modifier = Modifier
				.clickable (onClick = onPress)

				.clip (RoundedCornerShape (10.dp))
				.background (colorCorner)
				.padding (3.dp)

				.clip (RoundedCornerShape (7.dp))
				.background (colorBack)
				.padding (7.dp)

				.size (17.dp)
		)

		Text (
			text = num,
			color = colorCounter,
			fontSize = 11.sp,
			fontFamily = fontCounter,
			textAlign = TextAlign.Center,
			modifier = Modifier
				.absoluteOffset (x = 24.5.dp, y = (-5).dp)
				.size (16.5.dp)
				.clip (RoundedCornerShape (100))
				.background (color = colorCounterBack)
				.padding (top = 1.75.dp)
		)

	}

}