// Settings page - Subscriptions folder page - Tools layer

package com.example.supercast.ui.pages.settingsfoldersfolder.layers.tools

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier

import com.example.supercast.ui.components.common.spaces.Space

import com.example.supercast.ui.pages.playlist.layers.tools.components.topbar.TopBar



@Composable
fun Tools () {

	Column (
		modifier = Modifier.fillMaxSize ()
	) {

		TopBar ()

		Space (modifier = Modifier.weight (1f))

	}

}