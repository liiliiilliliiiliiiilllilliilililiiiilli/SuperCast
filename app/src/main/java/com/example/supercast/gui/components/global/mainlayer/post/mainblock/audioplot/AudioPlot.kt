// Global components - Main layer - Post - MainBlock - AudioPlot

package com.example.supercast.gui.components.global.mainlayer.post.mainblock.audioplot

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import com.example.supercast.ui.colors.Colors

import com.example.supercast.gui.components.global.mainlayer.post.mainblock.audioplot.podcast.Podcast
import com.example.supercast.gui.components.global.mainlayer.post.mainblock.audioplot.voice.Voice



private val colorLine = Colors.Line
private val colorBack = Colors.Blocks



@Composable
fun AudioPlot (
	type: String,
	data: String
) {

	Box (
		modifier = Modifier
			.background (color = colorLine)
			.fillMaxWidth ()
			.padding (top = 5.5.dp)
			.background (color = colorBack)
	) {

		when (type) {

			"Podcast" -> Podcast (

				data = data

			)

			"Voice" -> Voice (

				data = data

			)

		}

	}

}