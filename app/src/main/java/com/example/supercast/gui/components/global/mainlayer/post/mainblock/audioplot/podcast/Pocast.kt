// Global components - Main layer - Post - MainBlock - AudioPlot - Podcast

package com.example.supercast.gui.components.global.mainlayer.post.mainblock.audioplot.podcast

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.padding
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.unit.dp
import com.example.supercast.R



private val pic = R.drawable.samples_ava_7
private const val textTitle = "Как побеждать (всегда)."
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
			onPress = {},
			preview = pic
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
	onPress: () -> Unit,
	preview: Int
) {

//	painterResource

}