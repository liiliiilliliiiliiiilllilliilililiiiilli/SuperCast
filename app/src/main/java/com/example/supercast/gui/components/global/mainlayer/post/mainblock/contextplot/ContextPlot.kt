// Global components - Main layer - Post - MainBlock - ContextPlot

package com.example.supercast.gui.components.global.mainlayer.post.mainblock.contextplot

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp

import com.example.supercast.gui.components.distinctive.spaces.Height
import com.example.supercast.gui.components.global.mainlayer.post.mainblock.contextplot.oration.Oration
import com.example.supercast.gui.components.global.mainlayer.post.mainblock.contextplot.attachment.Attachment



@Composable
fun ContextPlot (
	orationData: Array <String>,
	attachmentData: Array <String>,
	isAttachmentOpened: Boolean,
	textPublicationFromWho: String,
	picsMedia: Array <Int>
) {

	Column (
		modifier = Modifier
			.fillMaxWidth ()
			.padding (bottom = 12.dp)
	) {

		Oration (
			text = orationData [0]
		)

		Height (12)

		Attachment (
			type = attachmentData [0],
			content = attachmentData [1],
			isOpened = isAttachmentOpened,
			textPublicationFromWho = textPublicationFromWho,
			picsMedia = picsMedia
		)

	}

}