// Playlist page

package com.example.supercast.ui.pages.playlist

import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier

import com.example.supercast.ui.pages.playlist.layers.main.Main as MainLayer
import com.example.supercast.ui.pages.playlist.layers.tools.Tools as ToolsLayer
import com.example.supercast.ui.pages.playlist.layers.sliders.Sliders as SlidersLayer
import com.example.supercast.ui.pages.playlist.layers.windows.Windows as WindowsLayer



@Composable
fun Playlist () {

	Box (
		modifier = Modifier.fillMaxSize ()
	) {

		MainLayer ()
		ToolsLayer ()
		SlidersLayer ()
		WindowsLayer ()

	}

}