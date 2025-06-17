// Global components - Main layer - Post - MainBlock - AudioPlot - Podcast

package com.example.supercast.gui.components.global.mainlayer.post.mainblock.audioplot.podcast

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.padding
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import com.example.supercast.ui.pics.Pics



private const val textTitle = "Как побеждать (всегда)."
private val pic = Pics.SamplesAva_7
private const val numDuration = 1
private const val numListeners = 1



@Composable
fun Podcast () {

	Row (
		horizontalArrangement = Arrangement.SpaceBetween,
		modifier = Modifier.padding (vertical = 12.5.dp, horizontal = 25.dp)
	) {

		Ditle (
			title = textTitle,
			duration = numDuration,
			listenes = numListeners
		)

		PlayButton (
			preview = pic,
			onPress = {}
		)

	}

}



@Composable
fun Ditle (
	title: String,
	duration: Int,
	listenes: Int
) {}



@Composable
fun PlayButton (
	preview: Int,
	onPress: () -> Unit
) {}