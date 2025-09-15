// Comment page

package com.example.supercast.ui.pages.comment

import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier

import com.example.supercast.ui.pages.comment.layers.main.Main as MainLayer
import com.example.supercast.ui.pages.comment.layers.tools.Tools as ToolsLayer
import com.example.supercast.ui.pages.comment.layers.sliders.Sliders as SlidersLayer
import com.example.supercast.ui.pages.comment.layers.windows.Windows as WindowsLayer



@Composable
fun Comment () {

	Box (
		modifier = Modifier.fillMaxSize ()
	) {

		MainLayer ()
		ToolsLayer ()
		SlidersLayer ()
		WindowsLayer ()

	}

}