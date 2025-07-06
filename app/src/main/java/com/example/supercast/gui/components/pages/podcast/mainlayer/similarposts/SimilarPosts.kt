// Podcast page - Main layer - Similar posts

package com.example.supercast.gui.components.pages.podcast.mainlayer.similarposts

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.padding
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp

import com.example.supercast.gui.components.global.mainlayer.post.Post

import com.example.supercast.gui.components.global.mainlayer.post._types_.Post



@Composable
fun SimilarPosts (
	posts: Array <Post>
) {

	Column {

		posts.forEach {post ->

			Post (
				data = post,
				isInner = false,
				modifier = Modifier.padding (4.dp)
			)

		}

	}

}