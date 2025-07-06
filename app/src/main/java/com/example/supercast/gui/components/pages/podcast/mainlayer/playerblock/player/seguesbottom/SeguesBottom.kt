// Podcast page - Main layer - Player block - Player - Bottom segues

package com.example.supercast.gui.components.pages.podcast.mainlayer.playerblock.player.seguesbottom

import androidx.compose.runtime.Composable

import com.example.supercast.gui.components.global.mainlayer.post.seguebar.SegueBar

import com.example.supercast.gui.components.global.mainlayer.post._types_.Post



@Composable
fun SeguesBottom () {

	SegueBar (
		data = Post.SegueBar (
			comments = 11101,
			citates = 593
		)
	)

}