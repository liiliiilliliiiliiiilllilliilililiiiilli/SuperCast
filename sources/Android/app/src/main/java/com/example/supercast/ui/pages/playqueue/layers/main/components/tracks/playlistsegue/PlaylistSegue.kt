// Play queue page - Main layer - Tracks - Playlist segue

package com.example.supercast.ui.pages.playqueue.layers.main.components.tracks.playlistsegue

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp

import com.example.supercast.ui.components.spaces.Space
import com.example.supercast.ui.components.spaces.Height
import com.example.supercast.ui.components.spaces.Width

import com.example.supercast.lib.colors.Colors
import com.example.supercast.lib.fonts.Fonts
import com.example.supercast.lib.pics.Pics



private val colorTitle = Colors.PreWhite
private val colorStats = Colors.Grey

private val fontTitle = Fonts.ArchivoSemiBold
private val fontStats = Fonts.ArchivoSemiBold

private val picExpand = Pics.ExpandArrowsGrey

private const val textPicLogoDescription = "[logo pic]"
private const val textPicExpandDescription = "[open pic]"



@Composable
fun PlaylistSegue (
	preview: Int,
	title: String,
	numPodcasts: Int,
	duration: Int
) {

	Row (
		verticalAlignment = Alignment.CenterVertically,
		modifier = Modifier
			.fillMaxWidth ()
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

			Height (2*0.95)

			Stats (
				numPodcasts = numPodcasts,
				duration = duration
			)

		}

		Space (modifier = Modifier.weight (1f))

		UnwrapPic ()

	}

}



@Composable
private fun Logo (
	pic: Int
) {

	Image (
		painter = painterResource (pic),
		contentDescription = textPicLogoDescription,
		modifier = Modifier
			.size ((65*0.95).dp)
			.clip (RoundedCornerShape (4.dp))
	)

}



@Composable
private fun Title (
	text: String
) {

	Text (
		text = text,
		fontSize = (20*0.95).sp,
		color = colorTitle,
		fontFamily = fontTitle
	)

}



@Composable
private fun Stats (
	numPodcasts: Int,
	duration: Int
) {

	val text = "$numPodcasts  •  $duration"


	Text (
		text = text,
		fontSize = (14).sp,
		color = colorStats,
		fontFamily = fontStats
	)

}



@Composable
private fun UnwrapPic () {

	Image (
		painter = painterResource (picExpand),
		contentDescription = textPicExpandDescription,
		modifier = Modifier.size ((21*0.95).dp)
	)

}