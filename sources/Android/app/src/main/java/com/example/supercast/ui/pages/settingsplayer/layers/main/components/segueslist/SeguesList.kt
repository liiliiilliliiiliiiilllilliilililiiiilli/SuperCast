// Settings page - Player page - Main layer - Segues list

package com.example.supercast.ui.pages.settingsplayer.layers.main.components.segueslist

import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Switch
import androidx.compose.material3.SwitchDefaults
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.ui.Alignment
import androidx.compose.ui.draw.clip
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp

import com.example.supercast.lib.colors.Colors
import com.example.supercast.lib.fonts.Fonts
import com.example.supercast.lib.pics.Pics

import com.example.supercast.ui.components.spaces.Height
import com.example.supercast.ui.components.spaces.Width

import com.example.supercast.ui.pages.settingsplayer._types_.Segue



private val colorBack = Colors.BarBorder
private val colorSeparator = Colors.BarSeparator
private val colorDivider = Colors.Divider
private val colorTitle = Colors.PreWhite
private val colorChoose = Colors.Grey
private val colorSwitcherBackChecked = Colors.Olive
private val colorSwitcherBackNotChecked = Colors.SwitcherNotPressedBack
private val colorSwitcherPinChecked = Colors.PreWhite
private val colorSwitcherPinNotChecked = Colors.PreWhite

private val fontTitle = Fonts.ArchivoSemiBold
private val fontChoose = Fonts.ArchivoSemiBold

private val picTriangle = Pics.TriangleUnwrapGrey

private const val textPicTriangleDescription = "[triangle pic]"



@Composable
fun SeguesList (
	vararg segues: Segue
) {

	Column (
		modifier = Modifier
			.padding (vertical = (11 / 2).dp, horizontal = 8.dp)
			.fillMaxWidth ()
			.clip (RoundedCornerShape (8.dp))
			.background (colorBack)
			.padding (vertical = 20.dp)
	) {

		segues.forEachIndexed {index, segueParams ->

			val isDivider = segueParams.isDivider


			when (isDivider) {

				true -> Divider ()

				false -> SegueComponent (
					params = segueParams,
					isLast = index == segues.size - 1,
					notNeededUnderSeparator = if (index != segues.size - 1) segues[index+1].isDivider == true else false
				)

				null -> {}

			}

		}

	}

}



@Composable
private fun Divider () {

	Height (17)

	Box (
		modifier = Modifier
			.height (6.dp)
			.fillMaxWidth ()
			.background (colorDivider)
	)

	Height (17)

}



@Composable
private fun SegueComponent (
	params: Segue,
	isLast: Boolean,
	notNeededUnderSeparator: Boolean
) {

	@Composable
	fun Separator () {

		Height (17)

		Box (
			modifier = Modifier
				.padding (horizontal = 20.dp)
				.height (2.dp)
				.fillMaxWidth ()
				.clip (RoundedCornerShape (100))
				.background (colorSeparator)
		)

		Height (17)

	}


	val title = params.title
	val switcher = params.switcher
	val scrollChooseList = params.scrollChooseList

	var onPress = {}
	if (switcher != null) onPress = switcher.onPress
	if (scrollChooseList != null) onPress = scrollChooseList.onChoose


	Row (
		verticalAlignment = Alignment.CenterVertically,
		modifier = Modifier
			.padding (horizontal = 20.dp)
			.fillMaxWidth ()
			.clickable (onClick = onPress)
	) {

		Width (8)

		Text (
			text = title,
			fontSize = 18.sp,
			color = colorTitle,
			fontFamily = fontTitle,
			modifier = Modifier.weight (1f)
		)

		if (switcher != null) {

			val (isToggledState, seIsToggledState) = remember {mutableStateOf (switcher.state)}


			Switch (
				checked = isToggledState,
				onCheckedChange = {seIsToggledState (it)},
				colors = SwitchDefaults.colors (
					checkedThumbColor = colorSwitcherPinChecked,
					uncheckedThumbColor = colorSwitcherPinNotChecked,
					checkedTrackColor = colorSwitcherBackChecked,
					uncheckedTrackColor = colorSwitcherBackNotChecked
				)
			)

		}

		else if (scrollChooseList != null) {

			var chooseText = ""

			for (choose in scrollChooseList.chooses) {

				if (choose.isChosen == true) {

					chooseText = choose.text

				}

			}


			Text (
				text = chooseText,
				fontSize = 18.sp,
				color = colorChoose,
				fontFamily = fontChoose
			)

			Image (
				painter = painterResource (picTriangle),
				contentDescription = textPicTriangleDescription,
				modifier = Modifier
					.padding (start = 5.dp, bottom = 2.5.dp)
					.size (14.dp)
			)

		}

		Width (8)

	}

	if (!notNeededUnderSeparator && !isLast) {

		Separator ()

	}

}