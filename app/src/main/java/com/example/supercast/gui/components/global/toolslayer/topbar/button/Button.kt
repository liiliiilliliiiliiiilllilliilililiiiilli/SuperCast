// Global components - Tools layer - Top bar - Bar button

package com.example.supercast.gui.components.global.toolslayer.topbar.button

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.unit.dp
import com.example.supercast.ui.colors.Colors



private val buttonColorBack = Colors.Black
private val buttonColorCorner = Colors.Button

private const val picsDescription = "[top bar pic]"



@Composable
fun BarButton (
	pic: Int,
	onPress: () -> Unit
) {

	Image (
		painter = painterResource (pic),
		contentDescription = picsDescription,
		modifier = Modifier
			.clickable (onClick = onPress)
			.clip (RoundedCornerShape (10.dp))
			.background (color = buttonColorCorner)
			.padding (3.dp)
			.clip (RoundedCornerShape (7.dp))
			.background (color = buttonColorBack)
			.padding (7.dp)
			.size (17.dp)
			.background (color = buttonColorBack)
	)

}