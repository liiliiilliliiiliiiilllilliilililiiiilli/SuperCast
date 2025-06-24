// Global components - Main layer - Post - SegueBar

package com.example.supercast.gui.components.global.mainlayer.post.seguebar

import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import com.example.supercast.projectlib.ProjectLib
import com.example.supercast.ui.colors.Colors
import com.example.supercast.ui.pics.Pics

import com.example.supercast.gui.components.distinctive.spaces.Width
import com.example.supercast.gui.components.global.mainlayer.actiontext.ActionText



private const val textSomeComments = "комментариев"
private const val textComment = "Комментировать"
private val colorCommentsLight = Colors.Olive
private val colorCommentsDark = Colors.DarkGrey
private val picComments = Pics.CommentGreenLight

private const val textSomeCitates = "цитат"
private const val textCitate = "Цитировать"
private val colorCitatesLight = Colors.Olive
private val colorCitatesDark = Colors.DarkGrey
private val picCitates = Pics.CitationGreenLight



@Composable
fun SegueBar (
	comments: Int,
	citates: Int,
) {

	val commentsNumFormatted = ProjectLib.formatStarsNumber (comments)
	val citatesNumFormatted = ProjectLib.formatStarsNumber (citates)


	val textComments = if (comments > 0) "$commentsNumFormatted $textSomeComments" else textComment
	val colorTextComments = if (comments > 0) colorCommentsLight else colorCommentsDark
	val picComments = if (comments > 0) picComments else null
 	val pressedComments = {if (comments > 0) {} else {}}

	val textCitates = if (citates > 0) "$citatesNumFormatted $textSomeCitates" else textCitate
	val colorTextCitates = if (citates > 0) colorCitatesLight else colorCitatesDark
	val picCitates = if (citates > 0) picCitates else null
	val pressedCitates = {if (citates > 0) {} else {}}


	Row (
		verticalAlignment = Alignment.CenterVertically,
		modifier = Modifier
			.height (43.dp)
			.fillMaxWidth ()
			.padding (horizontal = 25.dp)
	) {

		ActionText (
			text = textComments,
			color = colorTextComments,
			pic = picComments,
			onPress = pressedComments
		)

		Width (15)

		ActionText (
			text = textCitates,
			color = colorTextCitates,
			pic = picCitates,
			onPress = pressedCitates
		)

	}

}