// Podcast page - Main layer - Player block - Reactions - List

package com.example.supercast.gui.components.pages.podcast.mainlayer.playerblock.reactions.list

import androidx.compose.foundation.horizontalScroll
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.rememberScrollState
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp

import com.example.supercast.gui.components.distinctive.spaces.Width

import com.example.supercast.gui.components.global.mainlayer.comment.Comment
import com.example.supercast.gui.components.global.mainlayer.post.Post

import com.example.supercast.gui.components.global.mainlayer.comment._types_.Comment
import com.example.supercast.gui.components.global.mainlayer.post._types_.Post



@Composable
fun List (
	whichOpened: String,
	comments: (Array <Comment>)?,
	citates: (Array <Post>)?
) {

	Row (
		modifier = Modifier
			.horizontalScroll (rememberScrollState ())
			.fillMaxWidth ()
			.padding (horizontal = 14.dp)
	) {

		if (whichOpened == "comments" && comments != null) {

			comments.forEachIndexed {index, comment ->

				Comment (

					isContext = true,
					data = comment

				)

				if (index != comments.size - 1) {

					Width (16)

				}

			}

		}

		else if (whichOpened == "citates" && citates != null) {

			citates.forEachIndexed {index, citate ->

				Post (

					data = citate,
					isInner = true

				)

				if (index != citates.size - 1) {

					Width (16)

				}

			}

		}

	}

}