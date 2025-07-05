// Podcast page

package com.example.supercast.gui.pages.podcast

import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier

import com.example.supercast.gui.components.distinctive.spaces.Space

import com.example.supercast.gui.components.pages.podcast.toolslayer.topbar.TopBar
import com.example.supercast.gui.components.pages.podcast.mainlayer.MainLayer as MainLayerComponent



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



//  Layers:



@Composable
private fun MainLayer () {

	MainLayerComponent ()

}



@Composable
private fun ToolsLayer () {

	Column (
		modifier = Modifier.fillMaxSize ()
	) {

		TopBar ()

		Space (modifier = Modifier.weight (1f))

	}

}



@Composable
private fun SlidersLayer () {

	Box {}

}



@Composable
private fun WindowsLayer () {

	Box {}

}