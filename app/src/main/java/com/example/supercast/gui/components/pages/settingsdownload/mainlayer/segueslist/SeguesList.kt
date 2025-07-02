// Settings page - Download page - Main layer - Segues list

package com.example.supercast.gui.components.pages.settingsdownload.mainlayer.segueslist

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
import androidx.compose.ui.draw.rotate
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp

import com.example.supercast.ui.colors.Colors
import com.example.supercast.ui.fonts.Fonts
import com.example.supercast.ui.pics.Pics

import com.example.supercast.gui.components.distinctive.spaces.Height
import com.example.supercast.gui.components.distinctive.spaces.Width

import com.example.supercast.gui.components.pages.settingsdownload._types_.Segue



private val colorBack = Colors.BarBorder
private val colorSeparator = Colors.BarSeparator
private val colorDivider = Colors.Divider
private val colorTitle = Colors.PreWhite
private val colorDescription = Colors.Grey
private val colorChoose = Colors.Grey
private val colorSwitcherBackChecked = Colors.Olive
private val colorSwitcherBackNotChecked = Colors.SwitcherNotPressedBack
private val colorSwitcherPinChecked = Colors.PreWhite
private val colorSwitcherPinNotChecked = Colors.PreWhite

private val fontTitle = Fonts.ArchivoSemiBold
private val fontDescription = Fonts.ArchivoSemiBold
private val fontChoose = Fonts.ArchivoSemiBold

private val picTriangle = Pics.TriangleUnwrapGrey

private const val textPicTriangleDescription = "[triangle pic]"



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
				.height (2.dp)
				.fillMaxWidth ()
				.padding (horizontal = 20.dp)
				.clip (RoundedCornerShape (100))
				.background (colorSeparator)
		)

		Height (17)

	}


	val title = params.title
	val description = params.description
	val rightPic = params.rightPic
	val editText = params.editText
	val switcher = params.switcher
	val scrollChooseList = params.scrollChooseList

	var onPress = {}
	if (switcher != null) onPress = {}
	if (scrollChooseList != null) onPress = scrollChooseList.onChoose


	Row (
		verticalAlignment = Alignment.CenterVertically,
		modifier = Modifier
			.padding (horizontal = 20.dp)
			.fillMaxWidth ()
			.clickable (onClick = onPress)
	) {

		Width (8)

		Column (
			modifier = Modifier.weight (1f)
		) {

			Text (
				text = title,
				fontSize = 18.sp,
				color = colorTitle,
				fontFamily = fontTitle
			)

			if (description != null) {

				Height (8)

				Text (
					text = description,
					fontSize = 15.sp,
					color = colorDescription,
					fontFamily = fontDescription,
					modifier = Modifier.padding (start = 8.dp)
				)

			}

		}

//		Width (8)

		if (rightPic != null) {

			Image (
				painter = painterResource (rightPic),
				contentDescription = "[some pic]",
				modifier = Modifier
					.size (18.dp)
					.rotate (if (rightPic == Pics.ArrowCompactDownGreyLight) {-90f} else {0f})
			)

		}

		else if (editText != null) {

			Text (
				text = editText.text,
				fontSize = 18.sp,
				color = Colors.Text,
				fontFamily = Fonts.ArchivoSemiBold
			)

			Width (8)

			Image (
				painter = painterResource (editText.pic),
				contentDescription = "[pen pic]",
				modifier = Modifier.size (15.dp)
			)

		}

		else if (switcher != null) {

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

		if (scrollChooseList != null) {

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