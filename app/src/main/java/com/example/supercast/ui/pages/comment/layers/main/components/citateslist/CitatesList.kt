// Comment page - Main layer - Citates list

package com.example.supercast.ui.pages.comment.layers.main.components.citateslist

import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier

import com.example.supercast.ui.components.layers.mainlayer.post.Post as PostComponent

import com.example.supercast.ui.components.layers.mainlayer.post._types_.Post



@Composable
fun CitatesList (
	citates: Array <Post>,
	modifier: Modifier = Modifier
) {

	citates.forEach {citate ->

		PostComponent (
			data = citate,
			isInner = false,
			modifier = modifier
		)

	}

}