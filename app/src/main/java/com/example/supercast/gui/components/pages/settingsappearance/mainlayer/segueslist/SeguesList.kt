// Settings page - Appearance page - Main layer - Segues list

package com.example.supercast.gui.components.pages.settingsappearance.mainlayer.segueslist

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.draw.rotate
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp

import com.example.supercast.ui.colors.Colors
import com.example.supercast.ui.fonts.Fonts
import com.example.supercast.ui.pics.Pics

import com.example.supercast.gui.components.distinctive.spaces.Space
import com.example.supercast.gui.components.distinctive.spaces.Height
import com.example.supercast.gui.components.distinctive.spaces.Width

import com.example.supercast.gui.components.pages.settingsappearance._types_.Segue



private val colorBack = Colors.BarBorder
private val colorSegue = Colors.PreWhite
private val colorSegueValue = Colors.Grey
private val colorSeparator = Colors.BarSeparator

private val fontSegue = Fonts.ArchivoSemiBold

private val picArrow = Pics.ArrowCompactDownGreyLight

private const val textPicSegueIconDescription = "[pic]"
private const val textPicArrowDescription = "[pic]"



@Composable
fun SeguesList (
	vararg segues: Segue
) {

	Column (
		modifier = Modifier
			.padding (vertical = (11/2).dp, horizontal = 8.dp)
			.fillMaxWidth ()
			.clip (RoundedCornerShape (8.dp))
			.background (colorBack)
			.padding (vertical = 20.dp, horizontal = 20.dp)
	) {

		segues.forEachIndexed {index, segue ->

			val pic = segue.pic
			val text = segue.text
			val textValue = segue.textValue
			val onPress = segue.onPress


			Row (
				verticalAlignment = Alignment.CenterVertically,
				modifier = Modifier
					.height (32.dp)
					.fillMaxWidth ()
					.clickable (onClick = {onPress ()})
			) {

				Width (8)

				if (pic != null) {

					Image (
						painter = painterResource (pic),
						contentDescription = textPicSegueIconDescription,
						modifier = Modifier.size (21.dp)
					)

					Width (16)

				}

				Text (
					text = text,
					fontSize = 18.sp,
					color = colorSegue,
					fontFamily = fontSegue
				)

				Space (modifier = Modifier.weight (1f))

				if (textValue != null) {

					Text (
						text = textValue,
						fontSize = 18.sp,
						color = colorSegueValue,
						fontFamily = fontSegue
					)

				}

				else {

					Image (
						painter = painterResource (picArrow),
						contentDescription = textPicArrowDescription,
						modifier = Modifier
							.size (15.dp)
							.rotate (-90f)
					)

				}

				Width (21)

			}

			if (index != segues.size - 1) {

				Separator ()

			}

		}

	}

}



@Composable
private fun Separator () {

	Height (17)

	Box (
		modifier = Modifier
			.height (2.dp)
			.fillMaxWidth ()
			.clip (RoundedCornerShape (100))
			.background (colorSeparator)
	)

	Height (17)

}