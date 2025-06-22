// My comments page - Main layer

package com.example.supercast.gui.components.pages.mycomments.mainlayer

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
import com.example.supercast.ui.pics.Pics

import com.example.supercast.gui.components.distinctive.spaces.Height
import com.example.supercast.gui.components.pages.mycomments.mainlayer.liner.Liner
import com.example.supercast.gui.components.pages.mycomments.mainlayer.commentsoap.CommentSoap



// • sample data

private const val citateOf_1 = "Лягушка"
private val ava_1 = Pics.SamplesAva_1
private const val author_1 = "аквамарин"
private const val date_1 = 9845
private const val content_1 = "То есть в печатном  тексте (в газете, журнtале или книге) кавычки всегда должны иметь вид  скобок: «». Для того чтобы набрать их на клавиатуре компьютера, нужно  либо выбрать их из таблицы символов, либо набрать код"
private const val numComments_1 = 91
private const val numCitates_1 = 0
private const val numStars_1 = 137

private const val citateOf_2 = "Кто-то"
private val ava_2 = Pics.SamplesAva_7
private const val author_2 = "lina_li"
private const val date_2 = 3745
private const val content_2 = "Кря"
private const val numComments_2 = 0
private const val numCitates_2 = 0
private const val numStars_2 = 0

private const val citateOf_3 = "Пузырик"
private val ava_3 = Pics.SamplesAva_3
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

            Liner (
                num = 17
            )

            Height (11)

            CommentSoap (
                citateOf = citateOf_1,
                ava = ava_1,
                author = author_1,
                date = date_1,
                content = content_1,
                numComments = numComments_1,
                numCitates = numCitates_1,
                numStars = numStars_1,
                modifier = Modifier.padding (horizontal = 4.dp)
            )

            Height (11)

            CommentSoap (
                citateOf = citateOf_2,
                ava = ava_2,
                author = author_2,
                date = date_2,
                content = content_2,
                numComments = numComments_2,
                numCitates = numCitates_2,
                numStars = numStars_2,
                modifier = Modifier.padding (horizontal = 4.dp)
            )

            Height (11)

            CommentSoap (
                citateOf = citateOf_3,
                ava = ava_3,
                author = author_3,
                date = date_3,
                content = content_3,
                numComments = numComments_3,
                numCitates = numCitates_3,
                numStars = numStars_3,
                modifier = Modifier.padding (horizontal = 4.dp)
            )

            Height (25)

        }

    }

}