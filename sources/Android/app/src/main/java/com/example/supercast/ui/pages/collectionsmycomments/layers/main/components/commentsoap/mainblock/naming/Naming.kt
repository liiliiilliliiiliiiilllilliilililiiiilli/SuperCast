// Collections page - My comments page - Main layer - Comment soap - Main content - Naming

package com.example.supercast.ui.pages.collectionsmycomments.layers.main.components.commentsoap.mainblock.naming

import androidx.compose.foundation.layout.Row
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.unit.sp

import com.example.supercast.lib.colors.Colors
import com.example.supercast.lib.fonts.Fonts

import com.example.supercast.ui.components.spaces.Width



private val colorAuthor = Colors.PreWhite
private val colorDate = Colors.DarkGrey

private val fontNaming = Fonts.ArchivoBold



@Composable
fun Naming (
	name: String,
	date: Int
) {

	val textData = "$date"


	Row {

		Text (
			text = name,
			fontSize = 14.5.sp,
			color = colorAuthor,
			fontFamily = fontNaming
		)

		Width (8)

		Text (
			text = textData,
			fontSize = 14.5.sp,
			color = colorDate,
			fontFamily = fontNaming
		)

	}

}