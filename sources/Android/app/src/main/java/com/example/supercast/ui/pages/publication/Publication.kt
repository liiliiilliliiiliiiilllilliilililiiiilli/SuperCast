// Publication page

package com.example.supercast.ui.pages.publication

import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier

import com.example.supercast.ui.pages.publication.layers.main.Main as MainLayer
import com.example.supercast.ui.pages.publication.layers.tools.Tools as ToolsLayer
import com.example.supercast.ui.pages.publication.layers.sliders.Sliders as SlidersLayer
import com.example.supercast.ui.pages.publication.layers.windows.Windows as WindowsLayer



@Composable
fun Publication () {

	Box (
		modifier = Modifier.fillMaxSize ()
	) {

		MainLayer ()
		ToolsLayer ()
		SlidersLayer ()
		WindowsLayer ()

	}

}