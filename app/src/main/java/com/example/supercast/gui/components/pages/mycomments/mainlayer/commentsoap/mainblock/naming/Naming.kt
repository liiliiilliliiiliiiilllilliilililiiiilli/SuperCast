// My comments page - Main layer - Comment soap - Main content - Naming

package com.example.supercast.gui.components.pages.mycomments.mainlayer.commentsoap.mainblock.naming

import androidx.compose.foundation.layout.Row
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.unit.sp
import com.example.supercast.gui.components.distinctive.spaces.Width
import com.example.supercast.ui.colors.Colors
import com.example.supercast.ui.fonts.Fonts



private val colorAuthor = Colors.PreWhite
private val colorDate = Colors.DarkGrey

private val fontNaming = Fonts.ArchivoBold



@Composable
fun Naming (
	author: String,
	date: Int,
) {

	val textData = "$date"


	Row {

		Text (
			text = author,
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