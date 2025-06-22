// My comments page - Main layer - Comment soap - Main block

package com.example.supercast.gui.components.pages.mycomments.mainlayer.commentsoap.mainblock

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.unit.dp
import com.example.supercast.ui.colors.Colors

import com.example.supercast.gui.components.distinctive.spaces.Height
import com.example.supercast.gui.components.distinctive.spaces.Width
import com.example.supercast.gui.components.pages.mycomments.mainlayer.commentsoap.mainblock.ava.Ava
import com.example.supercast.gui.components.pages.mycomments.mainlayer.commentsoap.mainblock.naming.Naming
import com.example.supercast.gui.components.pages.mycomments.mainlayer.commentsoap.mainblock.content.Content
import com.example.supercast.gui.components.pages.mycomments.mainlayer.commentsoap.mainblock.actions.Actions



private val colorBack = Colors.Blocks



@Composable
fun MainBlock (
	ava: Int,
	author: String,
	date: Int,
	content: String,
	numComments: Int,
	numCitates: Int,
	numStars: Int
) {

	Row (
		modifier = Modifier
			.clip (RoundedCornerShape (16.dp))
			.background (color = colorBack)
			.fillMaxWidth ()
			.padding (11.dp)
	) {

		Ava (
			pic = ava
		)

		Width (9)

		Column (
			modifier = Modifier
				.weight (1f)
				.padding (top = 5.dp)
		) {

			Naming (
				author = author,
				date = date
			)

			Height (8)

			Content (
				text = content
			)

			Height (8)

			Actions (
				numComments = numComments,
				numCitates = numCitates,
				numStars = numStars
			)

		}

	}

}