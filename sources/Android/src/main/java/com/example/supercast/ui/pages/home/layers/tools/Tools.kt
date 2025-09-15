// Home page - Tools layer

package com.example.supercast.ui.pages.home.layers.tools

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier

import com.example.supercast.ui.components.common.spaces.Space

import com.example.supercast.ui.pages.home.layers.tools.components.bottombar.BottomBar
import com.example.supercast.ui.pages.home.layers.tools.components.topbar.TopBar



@Composable
fun Tools () {

	Column (
		modifier = Modifier.fillMaxSize ()
	) {

		TopBar ()

		Space (modifier = Modifier.weight (1f))

		BottomBar ()

	}

}