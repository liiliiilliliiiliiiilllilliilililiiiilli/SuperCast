// Publication page - Main layer - Comments list

package com.example.supercast.ui.pages.publication.layers.main.components.commentslist

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier

import com.example.supercast.ui.components.layers.mainlayer.comment.Comment as CommentComponent

import com.example.supercast.ui.components.layers.mainlayer.comment._types_.Comment



@Composable
fun CommentsList (
	comments: Array <Comment>,
	modifier: Modifier = Modifier
) {

	Column (
		modifier = Modifier
			.then (modifier)
			.fillMaxWidth ()
	) {

		comments.forEach {comment ->

			CommentComponent (
				data = comment
			)

		}

	}

}