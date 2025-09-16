// Collections page - My comments page - Tools layer

package com.example.supercast.ui.pages.collectionsmycomments.layers.tools

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier

import com.example.supercast.ui.components.spaces.Space

import com.example.supercast.ui.pages.collections.layers.tools.components.topbar.TopBar
import com.example.supercast.ui.pages.collections.layers.tools.components.bottombar.BottomBar



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