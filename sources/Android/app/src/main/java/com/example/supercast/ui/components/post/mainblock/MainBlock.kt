// Global components - Post - Main block

package com.example.supercast.ui.components.post.mainblock

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.runtime.Composable
import androidx.compose.ui.draw.clip
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp

import com.example.supercast.lib.colors.Colors

import com.example.supercast.ui.components.post.mainblock.topbar.TopBar
import com.example.supercast.ui.components.post.mainblock.contextplot.ContextPlot
import com.example.supercast.ui.components.post.mainblock.audioplot.AudioPlot

import com.example.supercast.ui.components.post._types_.Post



private const val postHasAttachments = false

private val colorBack = Colors.BarBorder



@Composable
fun MainBlock (
	data: Post.MainBlock
) {

	val topBar = data.topBar
	val contextPlot = data.contextPlot
	val audioPlot = data.audioPlot
	val isPostInner = data.isPostInner

	val paddingBottom = if (postHasAttachments) 4.dp else 0.dp


	Column (
		modifier = Modifier
			.clip (RoundedCornerShape (12.dp))
			.background (colorBack)
			.fillMaxWidth ()
			.padding (bottom = paddingBottom)
	) {

		TopBar (
			ava = topBar.pic,
			name = topBar.name,
			tie = topBar.tie,
			stars = topBar.stars
		)

		ContextPlot (
			orationData = contextPlot.orationData,
			attachmentData = contextPlot.attachmentData,
			isAttachmentOpened = !isPostInner && contextPlot.isAttachmentOpenedState,
			textPublicationFromWho = contextPlot.textPublicationFromWho,
			picsMedia = contextPlot.picsMedia
		)

		if (false) {

			AudioPlot (
				type = audioPlot.data[0],
				data = audioPlot.data[1]
			)

		}

	}

}