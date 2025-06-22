// Global components - Main layer - Post - MainBlock - ContextPlot - Attachment

package com.example.supercast.gui.components.global.mainlayer.post.mainblock.contextplot.attachment

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Text
import androidx.compose.ui.Alignment
import androidx.compose.ui.draw.clip
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.unit.sp
import com.example.supercast.projectlib.ProjectLib
import com.example.supercast.ui.colors.Colors
import com.example.supercast.ui.fonts.Fonts
import com.example.supercast.ui.pics.Pics

import com.example.supercast.gui.components.distinctive.spaces.Space
import com.example.supercast.gui.components.distinctive.spaces.Width
import com.example.supercast.gui.components.global.mainlayer.post.Post



private val colorBack = Colors.TieBarBackground

private val colorFarmingCitate = Colors.Citate
private val colorFarmingMedia = Colors.Media

private val colorCitateMiniLabelContext = Colors.Olive
private val colorCitateMiniLabelFrom = Colors.OliveLight
private val colorMediaMiniLabel = Colors.MediaColor
private val colorCommonBigLabel = Colors.PreWhite

private val fontLabels = Fonts.ArimoBold

private val picTriangleGreenClosed = Pics.WrapTriangleGreenDark
private val picTriangleGreenOpened = Pics.WrapTriangleGreenLight
private val picTriangleYellowClosed = Pics.WrapTriangleYellowDark
private val picTriangleYellowOpened = Pics.WrapTriangleYellowLight

private const val picTriangleDescription = "[triangle pic]"

private const val textPublicationFrom = "Публикация от "
private const val textCommentFrom = "Комментарий от "
private const val textSomeMedia = "вложений"
private const val textPublication = "Публикация"
private const val textComment = "Комментарий"
private const val textListingMedia = "из"

private const val picMediaDescription = "[media pic]"



private const val Post_1_InfoBar_left = ""
private const val Post_1_InfoBar_right = "2 днями ранее"
private val Post_1_MainBlock_Top_picAva = Pics.SamplesAva_5
private const val Post_1_MainBlock_Top_textDitleName = "Алина"
private const val Post_1_MainBlock_Top_textDitleTie = "моя жизнь"
private const val Post_1_MainBlock_Top_numStars = 101
private val Post_1_MainBlock_ContextPlot_orationData = arrayOf (
	"Спектральный синий цвет ощущается человеком под действием электромагнитного излучения с длинами волн в диапазоне 440—485 нм[1][2][3][4][5] (иногда диапазон указывают шире — 420—490 нм). Один из основных цветов в системе КЗС (RGB). "
)
private val Post_1_MainBlock_ContextPlot_attachmentData = arrayOf (
	"Media",
	""
)
private const val Post_1_MainBlock_ContextPlot_textPublicationFromWho = "Кто-то"
private val Post_1_MainBlock_ContextPlot_picsMedia = arrayOf (
	Pics.SamplesAva_7,
	Pics.SamplesAva_8
)
private const val Post_1_MainBlock_ContextPlot_isAttachmentOpened = false
private val Post_1_MainBlock_AudioPlot_data = arrayOf (
	"",
	""
)
private const val Post_1_SegueBar_comments = 19
private const val Post_1_SegueBar_citates = 8



//private const val Post_2_InfoBar_left = "Редактировано"
//private const val Post_2_InfoBar_right = "Час назад"
//private val Post_2_MainBlock_Top_picAva = Pics.SamplesAva_3
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
//	Pics.SamplesAva_7,
//	Pics.SamplesAva_8
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

	val modifier = Modifier
		.padding (horizontal = 12.dp)
		.clip (RoundedCornerShape (topEnd = if (isOpened) 12.dp else 6.dp, bottomEnd = if (isOpened) 12.dp else 6.dp))
		.background (color = colorFarmingCitate)
		.padding (start = 5.5.dp)
		.background (color = colorBack)


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
				contentDescription = picTriangleDescription,
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
				InfoBar_left = Post_1_InfoBar_left,
				InfoBar_right = Post_1_InfoBar_right,
				MainBlock_Top_picAva = Post_1_MainBlock_Top_picAva,
				MainBlock_Top_textDitleName = Post_1_MainBlock_Top_textDitleName,
				MainBlock_Top_textDitleTie = Post_1_MainBlock_Top_textDitleTie,
				MainBlock_Top_numStars = Post_1_MainBlock_Top_numStars,
				MainBlock_ContextPlot_orationData = Post_1_MainBlock_ContextPlot_orationData,
				MainBlock_ContextPlot_attachmentData = Post_1_MainBlock_ContextPlot_attachmentData,
				MainBlock_ContextPlot_isAttachmentOpened = Post_1_MainBlock_ContextPlot_isAttachmentOpened,
				MainBlock_ContextPlot_textPublicationFromWho = Post_1_MainBlock_ContextPlot_textPublicationFromWho,
				MainBlock_ContextPlot_picsMedia = Post_1_MainBlock_ContextPlot_picsMedia,
				MainBlock_AudioPlot_data = Post_1_MainBlock_AudioPlot_data,
				SegueBar_comments = Post_1_SegueBar_comments,
				SegueBar_citates = Post_1_SegueBar_citates,

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
	val mediaCountFormatted = ProjectLib.formatStarsNumber (mediaCount)

	val textMediaCount = "$mediaCountFormatted $textSomeMedia"

	val modifier = Modifier
		.padding (horizontal = 12.dp)
		.clip (RoundedCornerShape (topEnd = if (isOpened) 12.dp else 6.dp, bottomEnd = if (isOpened) 12.dp else 6.dp))
		.background (color = colorFarmingMedia)
		.padding (start = 5.5.dp)
		.background (color = colorBack)


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
				contentDescription = picTriangleDescription,
				modifier = Modifier.size (11.dp)
			)

		}

	}

	else {

		Row (
			verticalAlignment = Alignment.CenterVertically,
			horizontalArrangement = Arrangement.Center,
			modifier = modifier
				.padding (10.dp)
				.height (maxPicFieldHeight - heightStep * (mediaCount - 1))
		) {

//			for (i in 1..mediaCount) {

			pics.forEachIndexed {index, pic ->

				Image (
					painter = painterResource (pic),
					contentDescription = picMediaDescription,
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