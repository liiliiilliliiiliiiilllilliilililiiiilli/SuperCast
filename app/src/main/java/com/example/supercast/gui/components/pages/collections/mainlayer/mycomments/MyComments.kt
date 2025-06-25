// Collections page - Main layer - MyComments

package com.example.supercast.gui.components.pages.collections.mainlayer.mycomments

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.offset
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.draw.scale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.supercast.ui.colors.Colors
import com.example.supercast.ui.fonts.Fonts
import com.example.supercast.ui.pics.Pics

import com.example.supercast.gui.components.distinctive.spaces.Height
import com.example.supercast.gui.components.distinctive.spaces.Width



private val colorLabel = Colors.Grey
private val colorBack = Colors.Blocks
private val colorAvaCircleCorner = Colors.AvaCircle
private val colorAvaCircleRest = Colors.BarBorder
private val colorCommentBack = Colors.Black
private val colorComment = Colors.OliveMonochromic

private val fontLabel = Fonts.ArchivoSemiBold
private val fontComment = Fonts.ArchivoSemiBold

private const val textPicLogoDescription = "[playlist logo pic]"

private const val textLabel = "Мои комментарии"



@Composable
fun MyComments (
	data: String,
	modifier: Modifier = Modifier
) {

	val labelText = textLabel


	Column (
		modifier = modifier
	) {

		Label (
			text = labelText
		)

		Height (12)

		Main (
			data = ""
		)

	}

}



@Composable
private fun Label (
	text: String
) {

	Text (
		text = text,
		fontSize = 14.5.sp,
		color = colorLabel,
		fontFamily = fontLabel,
		modifier = Modifier.offset (x = 37.5.dp)
	)

}



@Composable
private fun Main (
	data: String
) {

	@Composable
	fun CommentSoap (
		logo: Int,
		content: String
	) {

		@Composable
		fun Logo (
			pic: Int
		) {

			Image (
				painter = painterResource (pic),
				contentDescription = textPicLogoDescription,
				modifier = Modifier
					.scale (29f/34f)
					.clip (RoundedCornerShape (100))
					.background (colorAvaCircleCorner)
					.padding (1.75.dp)
					.clip (RoundedCornerShape (100))
					.background (colorAvaCircleRest)
					.padding (1.75.dp)
					.clip (RoundedCornerShape (100))
					.size (34.dp)
			)

		}


		@Composable
		fun Content (
			text: String
		) {

			Text (
				text = text,
				fontSize = 12.5.sp,
				color = colorComment,
				fontFamily = fontComment
			)

		}


		Row (
			verticalAlignment = Alignment.Top,
			modifier = Modifier
				.fillMaxWidth ()
				.clip (RoundedCornerShape (12.dp))
				.background (colorCommentBack)
				.padding (vertical = 12.dp, horizontal = 8.dp)
		) {

			Logo (
				pic = logo
			)

			Width (12)

			Content (
				text = content
			)

		}

	}


	Column (
		modifier = Modifier
			.clip (RoundedCornerShape (8.dp))
			.background (colorBack)
			.padding (12.dp)
	) {

		CommentSoap (
			logo = Pics.__image_9__,
			content = "Классно всё передали... Не возможно остановить технологии и Дурова П.В.тем более... Цифровой мир не из бежен... Его"
		)

		Height (12)

		CommentSoap (
			logo = Pics.__image_8__,
			content = "То есть в печатном  тексте (в газете, журнале или книге) кавычки всегда должны иметь вид  скобок: «». Для того чтобы набрать их на клавиатуре компьютера, нужно  либо выбрать их из таблицы символов, либо набрать код"
		)

		Height (12)

		CommentSoap (
			logo = Pics.__image_7__,
			content = "Мне очень нравятся апельсины]"
		)

	}

}