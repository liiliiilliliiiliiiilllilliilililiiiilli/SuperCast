// Collections page - My comments page - Main layer - Comment soap

package com.example.supercast.gui.components.pages.collectionsmycomments.mainlayer.commentsoap

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier

import com.example.supercast.gui.components.pages.collectionsmycomments.mainlayer.commentsoap.infobar.InfoBar
import com.example.supercast.gui.components.pages.collectionsmycomments.mainlayer.commentsoap.mainblock.MainBlock



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

		InfoBar (
			text = citateOf
		)

		MainBlock (
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