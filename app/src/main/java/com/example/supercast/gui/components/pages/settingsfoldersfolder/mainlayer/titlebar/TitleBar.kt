// Settings page - Subscriptions folders folder page - Main layer - TitleBar

package com.example.supercast.gui.components.pages.settingsfoldersfolder.mainlayer.titlebar

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp

import com.example.supercast.ui.colors.Colors
import com.example.supercast.ui.fonts.Fonts
import com.example.supercast.ui.pics.Pics

import com.example.supercast.gui.components.distinctive.spaces.Space
import com.example.supercast.gui.components.distinctive.spaces.Width



private val colorTitle = Colors.PreWhite

private val fontTitle = Fonts.ArchivoSemiBold

private val picFolder = Pics.FolderGrey
private val picEdit = Pics.PenOrdinaryGrey
private val picDelete = Pics.TrashGreyLight

private const val textpicFolderDescription = "[folder pic]"
private const val textpicEditDescription = "[pen pic]"
private const val textpicDeleteDescription = "[trash pic]"



@Composable
fun TitleBar (
	text: String
) {

	Row (
		verticalAlignment = Alignment.CenterVertically,
		modifier = Modifier
			.fillMaxWidth ()
			.padding (horizontal = 25.dp, vertical = 8.dp)
	) {

		Image (
			painter = painterResource (picFolder),
			contentDescription = textpicFolderDescription,
			modifier = Modifier.size (29.dp)
		)

		Width (14)

		Text (
			text = text,
			fontSize = 25.sp,
			color = colorTitle,
			fontFamily = fontTitle
		)

		Width (14)

		Image (
			painter = painterResource (picEdit),
			contentDescription = textpicEditDescription,
			modifier = Modifier.size (14.dp)
		)

		Space (modifier = Modifier.weight (1f))

		Image (
			painter = painterResource (picDelete),
			contentDescription = textpicDeleteDescription,
			modifier = Modifier.size (21.dp)
		)

	}

}