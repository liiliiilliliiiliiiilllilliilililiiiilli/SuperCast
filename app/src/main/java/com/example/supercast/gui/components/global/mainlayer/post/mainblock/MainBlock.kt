// Global components - Main layer - Post - MainBlock

package com.example.supercast.gui.components.global.mainlayer.post.mainblock

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.unit.dp
import com.example.supercast.ui.colors.Colors

import com.example.supercast.gui.components.global.mainlayer.post.mainblock.top.Top
import com.example.supercast.gui.components.global.mainlayer.post.mainblock.contextplot.ContextPlot
import com.example.supercast.gui.components.global.mainlayer.post.mainblock.audioplot.AudioPlot



private val colorBack = Colors.BarBorder



@Composable
fun MainBlock () {

	Column (
		modifier = Modifier
			.padding (bottom = if (true) 4.dp else 0.dp)
			.clip (RoundedCornerShape (12.dp))
			.background (color = colorBack)
			.fillMaxWidth ()
	) {

		Top ()
		ContextPlot ()
		AudioPlot ()

	}

}