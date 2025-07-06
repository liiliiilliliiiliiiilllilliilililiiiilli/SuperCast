// Podcast page - Main layer - Player block - Reactions - Expand tip

package com.example.supercast.gui.components.pages.podcast.mainlayer.playerblock.reactions.expandtip

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.size
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp

import com.example.supercast.gui.components.distinctive.spaces.Width

import com.example.supercast.ui.colors.Colors
import com.example.supercast.ui.fonts.Fonts
import com.example.supercast.ui.pics.Pics



private val colorExpandTip = Colors.DarkGrey

private val fontExpandTip = Fonts.ArchivoBold

private val picTapFinger = Pics.TapGreySark

private const val textPicTapFingerDescription = "[tap finger pic]"

private const val textExpand = "Раскрыть"



@Composable
fun ExpandTip () {

	Row (
		verticalAlignment = Alignment.CenterVertically
	) {

		Image (
			painter = painterResource (picTapFinger),
			contentDescription = textPicTapFingerDescription,
			modifier = Modifier.size (15.dp)
		)

		Width (10)

		Text (
			text = textExpand,
			fontSize = 14.sp,
			color = colorExpandTip,
			fontFamily = fontExpandTip
		)

	}

}