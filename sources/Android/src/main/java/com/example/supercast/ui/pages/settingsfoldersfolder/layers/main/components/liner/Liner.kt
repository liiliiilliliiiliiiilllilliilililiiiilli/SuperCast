// Settings page - Subscriptions folder page - Main layer - Liner

package com.example.supercast.ui.pages.settingsfoldersfolder.layers.main.components.liner

import androidx.compose.runtime.Composable

import com.example.supercast.ui.components.layers.mainlayer.liner.Liner as LinerComponent



private const val textLinerLeft = "Разделы ("
private const val textLinerRight = " всего)"



@Composable
fun Liner (
	sectionsNum: Int
) {

	val text = textLinerLeft + "$sectionsNum" + textLinerRight


	LinerComponent (
		text = text,
		fontSize = 23
	)

}