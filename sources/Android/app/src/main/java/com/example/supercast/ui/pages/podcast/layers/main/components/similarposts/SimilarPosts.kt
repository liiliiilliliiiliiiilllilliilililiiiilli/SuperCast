// Podcast page - Main layer - Similar posts

package com.example.supercast.ui.pages.podcast.layers.main.components.similarposts

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.padding
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp

import com.example.supercast.ui.components.post.Post

import com.example.supercast.ui.components.post._types_.Post



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