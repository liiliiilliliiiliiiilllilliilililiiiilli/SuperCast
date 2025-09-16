// Collections page - My comments page - Main layer

package com.example.supercast.ui.pages.collectionsmycomments.layers.main

import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.statusBarsPadding
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.verticalScroll
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp

import com.example.supercast.lib.pics.Pics

import com.example.supercast.ui.components.spaces.Height

import com.example.supercast.ui.pages.collectionsmycomments.layers.main.components.liner.Liner
import com.example.supercast.ui.pages.collectionsmycomments.layers.main.components.commentsoap.CommentSoap


// • sample data

private const val citateOf_1 = "Лягушка"
private val pic__Ava_1__ = Pics.__image_1__
private const val author_1 = "аквамарин"
private const val date_1 = 9845
private const val content_1 = "То есть в печатном  тексте (в газете, журнtале или книге) кавычки всегда должны иметь вид  скобок: «». Для того чтобы набрать их на клавиатуре компьютера, нужно  либо выбрать их из таблицы символов, либо набрать код"
private const val numComments_1 = 91
private const val numCitates_1 = 0
private const val numStars_1 = 137

private const val citateOf_2 = "Кто-то"
private val pic__Ava_2__ = Pics.__image_7__
private const val author_2 = "lina_li"
private const val date_2 = 3745
private const val content_2 = "Кря"
private const val numComments_2 = 0
private const val numCitates_2 = 0
private const val numStars_2 = 0

private const val citateOf_3 = "Пузырик"
private val pic__Ava_3__ = Pics.__image_3__
private const val author_3 = "li"
private const val date_3 = 101827
private const val content_3 = "Raiden, Иногда в тексте встречаются кавычки в виде елочек — «елочки», а  иногда — в виде лапок — “лапки”. Чем они отличаются и какие из них  предпочтительнее?"
private const val numComments_3 = 14
private const val numCitates_3 = 5
private const val numStars_3 = 109

// • sample data



@Composable
fun MainLayer () {

    Box (
        modifier = Modifier.fillMaxSize ()
    ) {

        Column (
            modifier = Modifier
                .verticalScroll (rememberScrollState ())
                .statusBarsPadding ()
                .padding (vertical = 65.5.dp)
                .fillMaxWidth ()
        ) {

            Height (25)

			Liner(
				num = 17
			)

            Height (11)

			CommentSoap(
				citateOf = citateOf_1,
				ava = pic__Ava_1__,
				name = author_1,
				date = date_1,
				content = content_1,
				comments = numComments_1,
				citates = numCitates_1,
				stars = numStars_1,
				modifier = Modifier.padding(horizontal = 4.dp)
			)

            Height (11)

			CommentSoap(
				citateOf = citateOf_2,
				ava = pic__Ava_2__,
				name = author_2,
				date = date_2,
				content = content_2,
				comments = numComments_2,
				citates = numCitates_2,
				stars = numStars_2,
				modifier = Modifier.padding(horizontal = 4.dp)
			)

            Height (11)

			CommentSoap(
				citateOf = citateOf_3,
				ava = pic__Ava_3__,
				name = author_3,
				date = date_3,
				content = content_3,
				comments = numComments_3,
				citates = numCitates_3,
				stars = numStars_3,
				modifier = Modifier.padding(horizontal = 4.dp)
			)

            Height (25)

        }

    }

}