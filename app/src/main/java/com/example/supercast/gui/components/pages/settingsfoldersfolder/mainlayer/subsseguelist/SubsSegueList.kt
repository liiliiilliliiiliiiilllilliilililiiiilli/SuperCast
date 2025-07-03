// Settings page - Subscriptions folder page - Main layer - Folder segue list

package com.example.supercast.gui.components.pages.settingsfoldersfolder.mainlayer.subsseguelist

import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.mutableIntStateOf
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

import com.example.supercast.gui.components.distinctive.spaces.Space
import com.example.supercast.gui.components.distinctive.spaces.Height
import com.example.supercast.gui.components.distinctive.spaces.Width

import com.example.supercast.gui.components.global.mainlayer.actiontext.ActionText
import com.example.supercast.gui.components.global.mainlayer.avacirclemini.AvaCircleMini as Ava

import com.example.supercast.gui.components.pages.settingsfoldersfolder._types_.SubSegue
import com.example.supercast.gui.components.pages.settingsfoldersfolder._types_.Tie



private val colorActionChoose = Colors.ActionText
private val colorActionCreate = Colors.Olive
private val colorSegueBack = Colors.Blocks
private val colorSegueName = Colors.PreWhite
private val colorSegueTiesNum = Colors.Text

private val fontSegue = Fonts.ArchivoSemiBold

//private val picActionChoose = Pics.TrashGreyLight
private val picActionChoose = Pics.PenOrdinaryGreyLight
private val picActionCreate = Pics.PlusSharpOlive
private val picArrow = Pics.ArrowCompactDownGreyLight

private const val textPicArrowDescription = "[arrow pic]"

private const val textActionChoose = "Выбрать"
private const val textActionCreate = "Создать"



@Composable
fun SubsSegueList (
	vararg subs: SubSegue
) {

	Column (
		modifier = Modifier
			.padding (horizontal = 8.dp)
			.fillMaxWidth ()
	) {

		ActionsPanel ()

		Subs (
			subs = subs
		)

	}

}



@Composable
private fun ActionsPanel () {

	Row (
		verticalAlignment = Alignment.CenterVertically,
		modifier = Modifier
			.fillMaxWidth ()
			.padding (horizontal = 32.dp, vertical = 14.dp)
	) {

		ActionText (
			isReversed = true,
			text = textActionChoose,
			color = colorActionChoose,
			pic = picActionChoose,
			onPress = {}
		)

		Space (modifier = Modifier.weight (1f))

		ActionText (
			isReversed = true,
			text = textActionCreate,
			color = colorActionCreate,
			pic = picActionCreate,
			onPress = {}
		)

	}

}



@Composable
private fun Subs (
	vararg subs: SubSegue
) {

	@Composable
	fun Sub (
		ava: Int,
		name: String,
		ties: Array <Tie>,
		isOpened: Boolean,
		toggleOpened: () -> Unit
	) {

		val tiesNum = "(${ties.size})"


		@Composable
		fun Tie (
			title: String
		) {

			Text (
				text = title,
				fontSize = 17.sp,
				color = Colors.PreWhite,
				fontFamily = Fonts.ArchivoSemiBold,
				modifier = Modifier
					.fillMaxWidth ()
					.padding (top = 5.dp, bottom = 5.dp, start = 25.dp, end = 25.dp)
					.clip (RoundedCornerShape (11.dp))
					.background (color = Colors.FaqBack)
					.padding (horizontal = 20.dp, vertical = 14.5.dp)
			)

		}


		Column (
			modifier = Modifier.fillMaxWidth ()
		) {

			Row (
				verticalAlignment = Alignment.CenterVertically,
				modifier = Modifier
					.clickable (onClick = {toggleOpened ()})
					.padding (vertical = 5.dp)
					.fillMaxWidth ()
					.clip (RoundedCornerShape (14.dp))
					.background (colorSegueBack)
					.padding (vertical = 11.dp, horizontal = 20.dp)
			) {

				Ava (
					pic = ava,
					size = 47f
				)

				Width (11)

				Text (
					text = name,
					fontSize = 17.sp,
					color = colorSegueName,
					fontFamily = fontSegue
				)

				Space (modifier = Modifier.weight (1f))

				Text (
					text = tiesNum,
					fontSize = 17.sp,
					color = colorSegueTiesNum,
					fontFamily = fontSegue
				)

				Width (11)

				Image (
					painter = painterResource (picArrow),
					contentDescription = textPicArrowDescription,
					modifier = Modifier
						.padding (horizontal = 8.dp)
						.size (15.dp)
						.rotate (if (isOpened) 180f else 0f)
				)

			}

			if (isOpened) {

				ties.forEachIndexed {index, tie ->

					val title = tie.title


					if (index == 0) {

						Height (2.5)

					}

					Tie (
						title = title
					)

					if (index == ties.size - 1) {

						Height (7.5)

					}

				}

			}

		}

		ties

	}


	Column (
		modifier = Modifier.fillMaxWidth ()
	) {

		val (openedSub, setOpenedSub) = remember {mutableIntStateOf (-1)}


		subs.forEachIndexed {index, sub ->

			val ava = sub.ava
			val name = sub.name
			val ties = sub.ties

			val isOpened = openedSub == index
			val toggleOpened = {setOpenedSub (if (openedSub != index) index else -1)}


			Sub (
				ava = ava,
				name = name,
				ties = ties,
				isOpened = isOpened,
				toggleOpened = toggleOpened
			)

		}

	}

}