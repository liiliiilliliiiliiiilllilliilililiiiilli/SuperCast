// Global components - Main layer - Post - MainBlock - ContextPlot

package com.example.supercast.gui.components.global.mainlayer.post.mainblock.contextplot

import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp

import com.example.supercast.gui.components.distinctive.spaces.Height
import com.example.supercast.gui.components.global.mainlayer.post.mainblock.contextplot.oration.Oration
import com.example.supercast.gui.components.global.mainlayer.post.mainblock.contextplot.attachment.Attachment



private const val text = "Па́вел Вале́рьевич Ду́ров — российский предприниматель в  сфере информационных технологий, основатель социальной сети «ВКонтакте» и кроссплатформенного мессенджера Telegram."



@Composable
fun ContextPlot () {

	Row (
		modifier = Modifier
			.fillMaxWidth ()
			.padding (bottom = 12.dp)
	) {

		Oration (
			text = text
		)

		Height (
			12.dp
		)

		Attachment ()

		Height (
			12.dp
		)

	}

}