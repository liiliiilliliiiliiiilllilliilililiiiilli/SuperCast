// Settings page - Subscriptions folders page - Main layer - Folder segue list

package com.example.supercast.ui.pages.settingsfolders.layers.main.components.foldersseguelist

import androidx.compose.foundation.background
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.draw.clip
import androidx.compose.ui.draw.rotate
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp

import com.example.supercast.lib.colors.Colors
import com.example.supercast.lib.fonts.Fonts
import com.example.supercast.lib.pics.Pics

import com.example.supercast.ui.components.common.spaces.Space
import com.example.supercast.ui.components.common.spaces.Width

import com.example.supercast.ui.components.layers.mainlayer.actiontext.ActionText

import com.example.supercast.ui.pages.settingsfolders._types_.FolderSegue



private val colorBack = Colors.Blocks
private val colorActionChange = Colors.ActionText
private val colorActionCreate = Colors.Olive
private val colorSegueTitleLight = Colors.PreWhite
private val colorSegueSubsNumLight = Colors.Grey
private val colorSegueTitleDark = Colors.FaqText
private val colorSegueSubsNumDark = Colors.FaqText

private val fontSegue = Fonts.ArchivoSemiBold

//private val picActionChange = Pics.TrashGreyLight
private val picActionChange = Pics.PenOrdinaryGreyLight
private val picActionCreate = Pics.PlusSharpOlive
private val picFolderDark = Pics.FolderGrey
private val picFolderLight = Pics.FolderWhite
private val picArrow = Pics.ArrowCompactDownGrey

private const val textPicFolderDescription = "[folder pic]"
private const val textPicArrowDescription = "[arrow pic]"

private const val textActionChange = "Изменить"
private const val textActionCreate = "Создать"



@Composable
fun FoldersSegueList (
	vararg folders: FolderSegue
) {

	Column (
		modifier = Modifier
			.padding (horizontal = 8.dp)
			.fillMaxWidth ()
	) {

		ActionsPanel ()

		Folders (
			folders = folders
		)

	}

}



@Composable
private fun ActionsPanel () {

	Row (
		verticalAlignment = Alignment.CenterVertically,
		modifier = Modifier
			.fillMaxWidth ()
			.padding (horizontal = 31.dp, vertical = 17.dp)
	) {

		ActionText (
			isReversed = true,
			text = textActionChange,
			color = colorActionChange,
			pic = picActionChange,
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
private fun Folders (
	vararg folders: FolderSegue
) {

	@Composable
	fun Folder (
		title: String,
		subsNum: String,
		mode: String
	) {

		val picFolder = when (mode) {

			"dark" -> picFolderDark
			"light" -> picFolderLight

			else -> 80085

		}

		val colorSegueTitle = when (mode) {

			"dark" -> colorSegueTitleDark
			"light" -> colorSegueTitleLight

			else -> Color (0x80085555)

		}

		val colorSegueSubsNum = when (mode) {

			"dark" -> colorSegueSubsNumDark
			"light" -> colorSegueSubsNumLight

			else -> Color (0x80085555)

		}


		Row (
			verticalAlignment = Alignment.CenterVertically,
			modifier = Modifier
				.fillMaxWidth ()
				.padding (16.dp)
		) {

			Image (
				painter = painterResource (picFolder),
				contentDescription = textPicFolderDescription,
				modifier = Modifier.size (25.dp)
			)

			Width (11)

			Text (
				text = title,
				fontSize = 19.sp,
				color = colorSegueTitle,
				fontFamily = fontSegue
			)

			Width (8)

			Text (
				text = subsNum,
				fontSize = 19.sp,
				color = colorSegueSubsNum,
				fontFamily = fontSegue
			)

			Space (modifier = Modifier.weight (1f))

			Image (
				painter = painterResource (picArrow),
				contentDescription = textPicArrowDescription,
				modifier = Modifier
					.size (15.dp)
					.rotate (-90f)
			)

		}

	}


	Column (
		modifier = Modifier
			.fillMaxWidth ()
			.clip (RoundedCornerShape (14.dp))
			.background (color = colorBack)
			.padding (16.dp)
	) {

		folders.forEachIndexed {index, folder ->

			val title = folder.title
			val subsNum = "(${folder.subsNum})"
			val mode = if (index == 0 || index == folders.size - 1) "dark" else "light"


			Folder (
				title = title,
				subsNum = subsNum,
				mode = mode
			)

		}

	}

}