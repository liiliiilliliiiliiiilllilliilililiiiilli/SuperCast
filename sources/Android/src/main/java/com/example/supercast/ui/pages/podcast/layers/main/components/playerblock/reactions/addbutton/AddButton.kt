// Podcast page - Main layer - Player block - Reactions - Add button

package com.example.supercast.ui.pages.podcast.layers.main.components.playerblock.reactions.addbutton

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp

import com.example.supercast.lib.colors.Colors
import com.example.supercast.lib.fonts.Fonts
import com.example.supercast.lib.pics.Pics

import com.example.supercast.ui.components.common.spaces.Width



private val colorBack = Colors.Olive
private val colorAddButton = Colors.Black

private val fontAddButton = Fonts.ArchivoBold

private val picPen = Pics.PenOrdinaryBlack

private const val textPicPenDescription = "[pen pic]"

private const val textAdd = "Добавить"



@Composable
fun AddButton () {

	Row (
		verticalAlignment = Alignment.CenterVertically,
		modifier = Modifier
			.clip (RoundedCornerShape (11.dp))
			.background (color = colorBack)
			.padding (vertical = 9.dp, horizontal = 15.dp)
	) {

		Text (
			text = textAdd,
			fontSize = 15.sp,
			color = colorAddButton,
			fontFamily = fontAddButton
		)

		Width (11)

		Image (
			painter = painterResource (picPen),
			contentDescription = textPicPenDescription,
			modifier = Modifier.size (16.dp)
		)

	}

}