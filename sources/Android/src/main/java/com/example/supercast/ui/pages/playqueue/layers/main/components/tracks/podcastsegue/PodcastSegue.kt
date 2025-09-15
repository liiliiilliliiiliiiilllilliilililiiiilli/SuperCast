// Play queue page - Main layer - Tracks - Podcast segue

package com.example.supercast.ui.pages.playqueue.layers.main.components.tracks.podcastsegue

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.draw.rotate
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp

import com.example.supercast.lib.colors.Colors
import com.example.supercast.lib.fonts.Fonts
import com.example.supercast.lib.pics.Pics

import com.example.supercast.ui.components.common.spaces.Space
import com.example.supercast.ui.components.common.spaces.Height
import com.example.supercast.ui.components.common.spaces.Width



private val colorTitle = Colors.PreWhite
private val colorStats = Colors.Grey

private val fontTitle = Fonts.ArchivoSemiBold
private val fontStats = Fonts.ArchivoSemiBold

private val picArrow = Pics.ArrowCompactDownGrey

private const val textPicPreviewDescription = "[preview pic]"
private const val textPicArrowDescription = "[arrow pic]"



@Composable
fun PodcastSegue (
	preview: Int,
	title: String,
	author: String,
	duration: Int
) {

	Row (
		verticalAlignment = Alignment.CenterVertically,
		modifier = Modifier
			.fillMaxWidth ()
			.height (80.dp)
			.padding (start = (20*0.95).dp, end = (29*0.95).dp, top = (12.5*0.95).dp, bottom = (12.5*0.95).dp)
	) {

		Logo (
			pic = preview
		)

		Width (14*0.95)

		Column {

			Title (
				text = title
			)

			Height (5)

			Stats (
				author = author,
				duration = duration
			)

		}

		Space (modifier = Modifier.weight (1f))

		GoPic ()

	}

}




@Composable
private fun Logo (
	pic: Int
) {

	Image (
		painter = painterResource (pic),
		contentDescription = textPicPreviewDescription,
		modifier = Modifier
			.size ((55).dp)
			.clip (RoundedCornerShape (100))
	)

}



@Composable
private fun Title (
	text: String
) {

	Text (
		text = text,
		fontSize = 19.sp,
		color = colorTitle,
		fontFamily = fontTitle
	)

}



@Composable
private fun Stats (
	author: String,
	duration: Int
) {

	val text = "$author  •  $duration"


	Text (
		text = text,
		fontSize = (14).sp,
		color = colorStats,
		fontFamily = fontStats
	)

}



@Composable
private fun GoPic () {

	Image (
		painter = painterResource (picArrow),
		contentDescription = textPicArrowDescription,
		modifier = Modifier
			.size (19.dp)
			.rotate (-90f)
	)

}