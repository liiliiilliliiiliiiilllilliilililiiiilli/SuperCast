// Settings page - Subscriptions folders folder page - Main layer - Liner

package com.example.supercast.gui.components.pages.settingsfoldersfolder.mainlayer.liner

import androidx.compose.runtime.Composable

import com.example.supercast.gui.components.global.mainlayer.liner.Liner as LinerComponent



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