// Podcast page

package com.example.supercast.ui.pages.podcast

import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier

import com.example.supercast.ui.pages.podcast.layers.main.Main as MainLayer
import com.example.supercast.ui.pages.podcast.layers.tools.Tools as ToolsLayer
import com.example.supercast.ui.pages.podcast.layers.sliders.Sliders as SlidersLayer
import com.example.supercast.ui.pages.podcast.layers.windows.Windows as WindowsLayer



@Composable
fun Podcast () {

	Box (
		modifier = Modifier.fillMaxSize ()
	) {

		MainLayer ()
		ToolsLayer ()
		SlidersLayer ()
		WindowsLayer ()

	}

}