// Global components - Main layer - Post - Main block - Context plot - Attachment

package com.example.supercast.gui.components.global.mainlayer.post.mainblock.contextplot.attachment

import androidx.compose.foundation.background
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.draw.clip
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp

import com.example.supercast.lib.Lib

import com.example.supercast.ui.colors.Colors
import com.example.supercast.ui.fonts.Fonts
import com.example.supercast.ui.pics.Pics

import com.example.supercast.gui.components.distinctive.spaces.Space
import com.example.supercast.gui.components.distinctive.spaces.Width

import com.example.supercast.gui.components.global.mainlayer.post.Post

import com.example.supercast.gui.components.global.mainlayer.post._types_.Post



private val colorBack = Colors.TieBarBackground
private val colorCitateMiniLabelContext = Colors.Olive
private val colorCitateMiniLabelFrom = Colors.OliveLight
private val colorCommonBigLabel = Colors.PreWhite
private val colorFarmingCitate = Colors.Citate
private val colorFarmingMedia = Colors.Media
private val colorMediaMiniLabel = Colors.MediaColor

private val fontLabels = Fonts.ArimoBold

private val picTriangleGreenOpened = Pics.TriangleUnwrapGreenLight
private val picTriangleGreenClosed = Pics.TriangleUnwrapGreenDark
private val picTriangleYellowOpened = Pics.TriangleUnwrapYellowLight
private val picTriangleYellowClosed = Pics.TriangleUnwrapYellowDark

private const val textPicMediaDescription = "[media pic]"
private const val textPicTriangleDescription = "[triangle pic]"
private const val textPublication = "Публикация"
private const val textPublicationFrom = "Публикация от "
private const val textSomeMedia = "вложений"

private const val textComment = "Комментарий"
private const val textCommentFrom = "Комментарий от "
private const val textListingMedia = "из"



private val postData_1 = Post (
	infoBar = Post.InfoBar (
		right = "2 днями ранее"
	),
	mainBlock = Post.MainBlock (
		topBar = Post.MainBlock.TopBar (
			pic = Pics.__image_5__,
			textDitleTie = "Алина",
			textDitleName = "моя жизнь",
			numStars = 101
		),
		contextPlot = Post.MainBlock.ContextPlot (
			orationData = arrayOf ("Спектральный синий цвет ощущается человеком под действием электромагнитного излучения с длинами волн в диапазоне 440—485 нм[1][2][3][4][5] (иногда диапазон указывают шире — 420—490 нм). Один из основных цветов в системе КЗС (RGB)."),
			attachmentData = arrayOf ("Media", ""),
			isAttachmentOpenedState = false,
			textPublicationFromWho = "Кто-то",
			picsMedia = arrayOf (Pics.__image_7__, Pics.__image_8__)
		),
		audioPlot = Post.MainBlock.AudioPlot (
			data = arrayOf ("", "")
		),
		isPostInner = true
	),
	segueBar = Post.SegueBar (
		comments = 19,
		citates = 8
	)
)



//private const val Post_2_InfoBar_left = "Редактировано"
//private const val Post_2_InfoBar_right = "Час назад"
//private val Post_2_MainBlock_Top_picAva = Pics.__image_3__
//private const val Post_2_MainBlock_Top_textDitleName = "Anny"
//private const val Post_2_MainBlock_Top_textDitleTie = "существую"
//private const val Post_2_MainBlock_Top_numStars = 5100
//private val Post_2_MainBlock_ContextPlot_orationData = arrayOf (
//	"Па́вел Вале́рьевич Ду́ров — российский предприниматель в  сфере информационных технологий, основатель социальной сети «ВКонтакте» и кроссплатформенного мессенджера Telegram."
//)
//private val Post_2_MainBlock_ContextPlot_attachmentData = arrayOf (
//	"Media",
//	""
//)
//private const val Post_2_MainBlock_ContextPlot_textPublicationFromWho = "Кто-то"
//private val Post_2_MainBlock_ContextPlot_picsMedia = arrayOf (
//	Pics.__image_7__,
//	Pics.__image_8__
//)
//private const val Post_2_MainBlock_ContextPlot_isAttachmentOpened = true
//private val Post_2_MainBlock_AudioPlot_data = arrayOf (
//	"",
//	""
//)
//private const val Post_2_SegueBar_comments = 144
//private const val Post_2_SegueBar_citates = 15



@Composable
fun Attachment (
	type: String,
	content: String,
	isOpened: Boolean,
	textPublicationFromWho: String,
	picsMedia: Array <Int>
) {

	when (type) {

		"Citate" -> Citate (

			content = content,
			isOpened = isOpened,
			publicationFromWho = textPublicationFromWho

		)

		"Media" -> Media (

			content = content,
			isOpened = isOpened,
			pics = picsMedia

		)

	}

}



@Composable
private fun Citate (
	content: String,
	isOpened: Boolean,
	publicationFromWho: String
) {

	val borderRadiusTopEnd = if (isOpened) 12.dp else 6.dp
	val borderRadiusBottomEnd = if (isOpened) 12.dp else 6.dp

	val modifier = Modifier
		.padding (horizontal = 12.dp)
		.clip (RoundedCornerShape (topEnd = borderRadiusTopEnd, bottomEnd = borderRadiusBottomEnd))
		.background (colorFarmingCitate)
		.padding (start = 5.5.dp)
		.background (colorBack)


	if (!isOpened) {

		Row (
			verticalAlignment = Alignment.CenterVertically,
			modifier = modifier
				.padding (start = 16.dp, end = 21.dp)
				.height (34.dp)
		) {

			Text (
				text = textPublicationFrom,
				fontSize = 14.5.sp,
				color = colorCitateMiniLabelContext,
				fontFamily = fontLabels
			)

			Text (
				text = publicationFromWho,
				fontSize = 14.5.sp,
				color = colorCitateMiniLabelFrom,
				fontFamily = fontLabels
			)

			Space (modifier = Modifier.weight (1f))

			Image (
				painter = painterResource (picTriangleGreenClosed),
				contentDescription = textPicTriangleDescription,
				modifier = Modifier.size (11.dp)
			)

		}

	}

	else {

		Column (
			modifier = modifier
		) {

			Text (
				text = textPublication,
				fontSize = 21.sp,
				color = colorCommonBigLabel,
				fontFamily = fontLabels,
				modifier = Modifier.padding (top = 19.dp, start = (19 + 16).dp)
			)

			Post (
				data = postData_1,
				isInner = true
			)

		}

	}

}



@Composable
private fun Media (
	content: String,
	isOpened: Boolean,
	pics: Array <Int>
) {

	val maxMediaElementsAmount = 5
	val maxPicFieldHeight = 245.dp
	val minPicFieldHeight = 128.dp
	val heightStep = (maxPicFieldHeight - minPicFieldHeight) / (maxMediaElementsAmount - 1)

	val mediaCount = pics.size
	val mediaCountFormatted = Lib.formatStarsNumber (mediaCount)

	val textMediaCount = "$mediaCountFormatted $textSomeMedia"

	val borderRadiusTopEnd = if (isOpened) 12.dp else 6.dp
	val borderRadiusBottomEnd = if (isOpened) 12.dp else 6.dp

	val modifier = Modifier
		.padding (horizontal = 12.dp)
		.clip (RoundedCornerShape (topEnd = borderRadiusTopEnd, bottomEnd = borderRadiusBottomEnd))
		.background (colorFarmingMedia)
		.padding (start = 5.5.dp)
		.background (colorBack)


	if (!isOpened) {

		Row (
			verticalAlignment = Alignment.CenterVertically,
			modifier = modifier
				.padding (start = 16.dp, end = 21.dp)
				.height (34.dp)

		) {

			Text (
				text = textMediaCount,
				fontSize = 14.5.sp,
				color = colorMediaMiniLabel,
				fontFamily = fontLabels
			)

			Space (modifier = Modifier.weight (1f))

			Image (
				painter = painterResource (picTriangleYellowClosed),
				contentDescription = textPicTriangleDescription,
				modifier = Modifier.size (11.dp)
			)

		}

	}

	else {

		val height = maxPicFieldHeight - heightStep * (mediaCount - 1)


		Row (
			verticalAlignment = Alignment.CenterVertically,
			horizontalArrangement = Arrangement.Center,
			modifier = modifier
				.padding (10.dp)
				.height (height)
		) {

//			for (i in 1..mediaCount) {

			pics.forEachIndexed {index, pic ->

				Image (
					painter = painterResource (pic),
					contentDescription = textPicMediaDescription,
					contentScale = ContentScale.Crop,
					modifier = Modifier
						.clip (RoundedCornerShape (6.dp))
						.fillMaxHeight ()
						.weight (1f)
				)

				if (index != pics.size - 1) {

					Width (5)

				}

//			}

			}

		}

	}

}