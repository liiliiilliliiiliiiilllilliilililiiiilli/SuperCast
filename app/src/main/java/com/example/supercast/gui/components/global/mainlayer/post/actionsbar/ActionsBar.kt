// Global components - Main layer - Post - ActionsBar

package com.example.supercast.gui.components.global.mainlayer.post.actionsbar

import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.unit.dp
import com.example.supercast.R
import com.example.supercast.gui.components.distinctive.spaces.Width
import com.example.supercast.gui.components.global.mainlayer.actiontext.ActionText
import com.example.supercast.ui.colors.Colors



@Composable
fun ActionsBar () {

	Row (
		modifier = Modifier
			.height (43.dp)
			.padding (horizontal = 25.dp)
	) {

		ActionText (
			picture = painterResource (R.drawable.comments_green),
			text = "144 комментариев",
			color = Colors.Olive
		)

		Width (15.dp)

		ActionText (
			picture = painterResource (R.drawable.citates_green),
			text = "16 ответов",
			color = Colors.DarkGrey
		)

	}

}