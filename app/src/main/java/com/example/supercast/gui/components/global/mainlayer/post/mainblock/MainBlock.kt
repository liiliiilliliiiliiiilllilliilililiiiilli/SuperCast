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
import kotlin.Int
import com.example.supercast.ui.colors.Colors

import com.example.supercast.gui.components.global.mainlayer.post.mainblock.top.Top
import com.example.supercast.gui.components.global.mainlayer.post.mainblock.contextplot.ContextPlot
import com.example.supercast.gui.components.global.mainlayer.post.mainblock.audioplot.AudioPlot



private const val postHasAttachments = false

private val colorBack = Colors.BarBorder



@Composable
fun MainBlock (
	Top_picAva: Int,
	Top_textDitleName: String,
	Top_textDitleTie: String,
	Top_numStars: Int,
	ContextPlot_orationData: Array <String>,
	ContextPlot_attachmentData: Array <String>,
	ContextPlot_isAttachmentOpenedState: Boolean,
	ContextPlot_textPublicationFromWho: String,
	ContextPlot_picsMedia: Array <Int>,
	AudioPlot_data: Array <String>,
	isPostInner: Boolean
) {

	val paddingBottom = if (postHasAttachments) 4.dp else 0.dp


	Column (
		modifier = Modifier
			.clip (RoundedCornerShape (12.dp))
			.background (color = colorBack)
			.fillMaxWidth ()
			.padding (bottom = paddingBottom)
	) {

		Top (
			picAva = Top_picAva,
			textDitleName = Top_textDitleName,
			textDitleTie = Top_textDitleTie,
			numStars = Top_numStars
		)

		ContextPlot (
			orationData = ContextPlot_orationData,
			attachmentData = ContextPlot_attachmentData,
			isAttachmentOpened = !isPostInner && ContextPlot_isAttachmentOpenedState,
			textPublicationFromWho = ContextPlot_textPublicationFromWho,
			picsMedia = ContextPlot_picsMedia
		)

		AudioPlot (
			type = AudioPlot_data [0],
			data = AudioPlot_data [1]
		)

	}

}