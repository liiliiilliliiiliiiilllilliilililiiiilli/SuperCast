// Podcast page - Main layer - Player block - Player - Bottom segues

package com.example.supercast.ui.pages.podcast.layers.main.components.playerblock.player.seguesbottom

import androidx.compose.runtime.Composable

import com.example.supercast.ui.components.layers.mainlayer.post.seguebar.SegueBar

import com.example.supercast.ui.components.layers.mainlayer.post._types_.Post



@Composable
fun SeguesBottom () {

	SegueBar (
		data = Post.SegueBar (
			comments = 11101,
			citates = 593
		)
	)

}