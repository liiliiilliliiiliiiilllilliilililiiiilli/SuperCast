// Global components - Main layer - Post - Segue bar

package com.example.supercast.ui.components.layers.mainlayer.post.seguebar

import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.Row
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp

import com.example.supercast.lib.methods.Methods

import com.example.supercast.lib.colors.Colors
import com.example.supercast.lib.pics.Pics

import com.example.supercast.ui.components.common.spaces.Width

import com.example.supercast.ui.components.layers.mainlayer.actiontext.ActionText

import com.example.supercast.ui.components.layers.mainlayer.post._types_.Post



private val colorCommentsLight = Colors.Olive
private val colorCommentsDark = Colors.DarkGrey
private val colorCitatesLight = Colors.Olive
private val colorCitatesDark = Colors.DarkGrey

private val picComments = Pics.CommentGreenLight
private val picCitates = Pics.CitationGreenLight

private const val textComments = "комментариев"
private const val textComment = "Комментировать"
private const val textCitates = "цитат"
private const val textCitate = "Цитировать"



@Composable
fun SegueBar (
	data: Post.SegueBar
) {

	val comments = data.comments
	val citates = data.citates


	val commentsFormatted = Methods.formatStarsNumber (comments)
	val citatesFormatted = Methods.formatStarsNumber (citates)


	val textComments = if (comments > 0) "$commentsFormatted $textComments" else textComment
	val colorTextComments = if (comments > 0) colorCommentsLight else colorCommentsDark
	val picComments = if (comments > 0) picComments else null
	val actionComments = {if (comments > 0) {print("")} else {print("")}}

	val textCitates = if (citates > 0) "$citatesFormatted $textCitates" else textCitate
	val colorTextCitates = if (citates > 0) colorCitatesLight else colorCitatesDark
	val picCitates = if (citates > 0) picCitates else null
	val actionCitates = {if (citates > 0) {print("")} else {print("")}}


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
			onPress = actionComments
		)

		Width (15)

		ActionText (
			text = textCitates,
			color = colorTextCitates,
			pic = picCitates,
			onPress = actionCitates
		)

	}

}