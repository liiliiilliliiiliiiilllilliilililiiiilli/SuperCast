// Play queue page

package com.example.supercast.ui.pages.playqueue

import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier

import com.example.supercast.ui.pages.playqueue.layers.main.Main as MainLayer
import com.example.supercast.ui.pages.playqueue.layers.tools.Tools as ToolsLayer
import com.example.supercast.ui.pages.playqueue.layers.sliders.Sliders as SlidersLayer
import com.example.supercast.ui.pages.playqueue.layers.windows.Windows as WindowsLayer



@Composable
fun PlayQueue () {

	Box (
		modifier = Modifier.fillMaxSize ()
	) {

		MainLayer ()
		ToolsLayer ()
		SlidersLayer ()
		WindowsLayer ()

	}

}