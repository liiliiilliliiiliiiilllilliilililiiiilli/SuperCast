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
	author: String,
	date: Int,
	content: String,
	numComments: Int,
	numCitates: Int,
	numStars: Int,
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
			author = author,
			date = date,
			content = content,
			numComments = numComments,
			numCitates = numCitates,
			numStars = numStars
		)

	}

}