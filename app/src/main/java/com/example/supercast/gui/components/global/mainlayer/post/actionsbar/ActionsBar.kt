// Global components - Main layer - Post - ActionsBar

package com.example.supercast.gui.components.global.mainlayer.post.actionsbar

import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import com.example.supercast.ui.colors.Colors
import com.example.supercast.ui.pics.Pics

import com.example.supercast.gui.components.distinctive.spaces.Width
import com.example.supercast.gui.components.global.mainlayer.actiontext.ActionText



private const val textComments = "144 комментариев"
private val colorComments = Colors.Olive
private val picComments = Pics.CommentsGreen

private const val textReplies = "16 ответов"
private val colorReplies = Colors.DarkGrey
private val picReplies = Pics.CitatesGreen



@Composable
fun ActionsBar () {

	Row (
		modifier = Modifier
			.height (43.dp)
			.padding (horizontal = 25.dp)
	) {

		ActionText (
			text = textComments,
			color = colorComments,
			pic = picComments
		)

		Width (15.dp)

		ActionText (
			text = textReplies,
			color = colorReplies,
			pic = picReplies
		)

	}

}