// Publication page - Main layer - Citates list

package com.example.supercast.gui.components.pages.publication.mainlayer.citateslist

import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier

import com.example.supercast.gui.components.global.mainlayer.post.Post as PostComponent

import com.example.supercast.gui.components.global.mainlayer.post._types_.Post



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