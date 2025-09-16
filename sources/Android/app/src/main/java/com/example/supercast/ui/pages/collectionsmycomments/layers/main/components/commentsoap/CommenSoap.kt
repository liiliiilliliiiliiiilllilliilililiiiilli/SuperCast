// Collections page - My comments page - Main layer - Comment soap

package com.example.supercast.ui.pages.collectionsmycomments.layers.main.components.commentsoap

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier

import com.example.supercast.ui.pages.collectionsmycomments.layers.main.components.commentsoap.infobar.InfoBar
import com.example.supercast.ui.pages.collectionsmycomments.layers.main.components.commentsoap.mainblock.MainBlock


@Composable
fun CommentSoap (
	citateOf: String,
	ava: Int,
	name: String,
	date: Int,
	content: String,
	comments: Int,
	citates: Int,
	stars: Int,
	modifier: Modifier = Modifier
) {

	Column (
		modifier = modifier.fillMaxWidth ()
	) {

		InfoBar(
			text = citateOf
		)

		MainBlock(
			ava = ava,
			name = name,
			date = date,
			blab = content,
			comments = comments,
			citates = citates,
			stars = stars
		)

	}

}