// Subscribers page - Main layer - Soap

package com.example.supercast.gui.components.pages.subscribers.mainlayer.soap

import androidx.compose.foundation.background
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.draw.clip
import androidx.compose.ui.draw.rotate
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp

import com.example.supercast.ui.colors.Colors
import com.example.supercast.ui.fonts.Fonts
import com.example.supercast.ui.pics.Pics

import com.example.supercast.gui.components.distinctive.spaces.Space
import com.example.supercast.gui.components.distinctive.spaces.Height

import com.example.supercast.gui.components.global.mainlayer.avacirclemini.AvaCircleMini as Ava



private val colorBack = Colors.Blocks
private val colorTextAuthorName = Colors.PreWhite
private val colorTextAuthorShortName = Colors.OliveMonochromic
private val colorTextListeners = Colors.OliveMonochromic

private val picArrow = Pics.ArrowCompactDownGreyLight

private val fontCommon = Fonts.ArchivoSemiBold

private const val textPicArrowDescription = "[arrow pic]"

private const val textSomeListen = "слушают"



@Composable
fun Soap (
	pic: Int,
	name: String,
	shortName: String,
	listenersNum: Int
) {

	Row (
		verticalAlignment = Alignment.CenterVertically,
		modifier = Modifier
			.clip (RoundedCornerShape (14.dp))
			.background (colorBack)
			.padding (vertical = 6.dp, horizontal = 14.dp)
			.height (50.dp)
			.fillMaxWidth ()
	) {

		Author (
			pic = pic,
			name = name,
			shortName = shortName,
		)

		Space (modifier = Modifier.weight (1f))

		Listeners (
			num = listenersNum
		)

		Arrow ()

	}

}



@Composable
private fun Author (
	pic: Int,
	name: String,
	shortName: String,
) {

	Row (
		verticalAlignment = Alignment.CenterVertically
	) {

		Ava (
			pic = pic
		)

		Column (
			modifier = Modifier.padding (horizontal = 8.dp)
		) {

			Text (
				text = name,
				fontSize = 14.sp,
				color = colorTextAuthorName,
				fontFamily = fontCommon
			)

			Height (1.75)

			Text (
				text = shortName,
				fontSize = 14.sp,
				color = colorTextAuthorShortName,
				fontFamily = fontCommon
			)

		}

	}

}



@Composable
private fun Listeners (
	num: Int
) {

	val text = "$num $textSomeListen"


	Text (
		text = text,
		fontSize = 14.sp,
		color = colorTextListeners,
		fontFamily = fontCommon,
		modifier = Modifier.padding (horizontal = 8.dp)
	)

}



@Composable
private fun Arrow () {

	Image (
		painter = painterResource (picArrow),
		contentDescription = textPicArrowDescription,
		modifier = Modifier
			.padding (horizontal = 18.5.dp)
			.size (16.dp)
			.rotate (-90f)
	)

}