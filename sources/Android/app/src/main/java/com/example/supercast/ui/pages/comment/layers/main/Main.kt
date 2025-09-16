// Comment page - Main layer

package com.example.supercast.ui.pages.comment.layers.main

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

import com.example.supercast.ui.components.comment.Comment
import com.example.supercast.ui.components.liner.Liner as LinerComponent
import com.example.supercast.ui.pages.comment.layers.main.components.commentslist.CommentsList
import com.example.supercast.ui.pages.comment.layers.main.components.citateslist.CitatesList

import com.example.supercast.ui.components.post._types_.Post
import com.example.supercast.ui.components.comment._types_.Comment



private val picFilter = Pics.FilterGreyLight

private const val textButtonList = "Все"

private val _dataContext_ = Comment (
    ava = Pics.__image_4__,
    name = "Иисус",
    date = 91234,

    blab = Comment.Blab (
        text = "Спасибо! Прекрасный фильм !"
    ),

    comments = 519,
    citates = 1,
    stars = 1173980
)

private val _dataComments_ = arrayOf (
    Comment (
        ava = Pics.__image_9__,
        name = "кто-то",
        date = 918234,

        blab = Comment.Blab (
            text = "Классно всё передали... Не возможно остановить технологии и Дурова П.В.тем более... Цифровой мир не из бежен... Его необходимо изучать... Присоединяюсь к команде Дурова и я- простой обычный пользователь Телеграмм... Сегодня это стало возможно... Благодарю ,Павел,за вашу щедрость.... Всё только начинается"
        ),

        comments = 29,
        citates = 0,
        stars = 8635
    ),
    Comment (
        ava = Pics.__image_8__,
        name = "Павел Дуров",
        date = 912348,

        voice = Comment.Voice (
            audio = "",
            transcription = "Почему я не согласен с тем, что сказано в этом подкасте хоть. Хоть и я был бы не проти того, чтобы очень сильно запустить аппарат",
            duration = 25,
            listens = 128
        ),

        comments = 837,
        citates = 3,
        stars = 65
    ),
    Comment (
        ava = Pics.__image_4__,
        name = "Иисус",
        date = 91234,

        blab = Comment.Blab (
            text = "Спасибо! Прекрасный фильм !"
        ),

        comments = 519,
        citates = 1,
        stars = 1173980
    ),
    Comment (
        ava = Pics.__image_3__,
        name = "Анна",
        date = 9821374,

        blab = Comment.Blab (
            text = "Читал книгу 'Код Дурова', Дуров далеко не идеальный персонаж, но тот факт, как он бился за свободу, как он посылал собачек, в официальных ответах фсб, которые требовали удалить группы Навального, или группы Евромайдана, как он спорил c ..."
        ),

        comments = 0,
        citates = 0,
        stars = 5
    ),
    Comment (
        ava = Pics.__image_7__,
        name = "Александра",
        date = 328764,

        voice = Comment.Voice (
            audio = "",
            transcription = "Вау, как красиво] Мне понравилось слушать!",
            duration = 25,
            listens = 0
        ),

        comments = 0,
        citates = 0,
        stars = 0
    )
)

private val _dataCitates_ = arrayOf (
    Post (
        infoBar = Post.InfoBar (
            right = "2 днями ранее"
        ),
        mainBlock = Post.MainBlock (
            topBar = Post.MainBlock.TopBar (
                pic = Pics.__image_5__,
                name = "Алина",
                tie = "моя жизнь",
                stars = 101
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
    ),
    Post (
        infoBar = Post.InfoBar (
            right = "2 днями ранее"
        ),
        mainBlock = Post.MainBlock (
            topBar = Post.MainBlock.TopBar (
                pic = Pics.__image_5__,
                name = "Алина",
                tie = "моя жизнь",
                stars = 101
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
    ),
    Post (
        infoBar = Post.InfoBar (
            right = "2 днями ранее"
        ),
        mainBlock = Post.MainBlock (
            topBar = Post.MainBlock.TopBar (
                pic = Pics.__image_5__,
                name = "Алина",
                tie = "моя жизнь",
                stars = 101
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
    ),
    Post (
        infoBar = Post.InfoBar (
            right = "2 днями ранее"
        ),
        mainBlock = Post.MainBlock (
            topBar = Post.MainBlock.TopBar (
                pic = Pics.__image_5__,
                name = "Алина",
                tie = "моя жизнь",
                stars = 101
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
    ),
    Post (
        infoBar = Post.InfoBar (
            right = "2 днями ранее"
        ),
        mainBlock = Post.MainBlock (
            topBar = Post.MainBlock.TopBar (
                pic = Pics.__image_5__,
                name = "Алина",
                tie = "моя жизнь",
                stars = 101
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
)



@Composable
fun Main () {

    val commentsOpened = true
    val citatesOpened = false


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

            Height (11/2)

            Height (14)

            Comment (
                isContext = true,
                data = _dataContext_,
                modifier = Modifier.padding (horizontal = 8.dp)
            )

            Height (25)

            LinerComponent (
                textWrap = textButtonList,
                buttonPicRight = arrayOf (picFilter),
                buttonPicRightOnPress = {}
            )

            Height (12)

            if (commentsOpened) {

                CommentsList (
                    comments = _dataComments_,
                    modifier = Modifier.padding(horizontal = 8.dp)
                )

            }

            else if (citatesOpened) {

                CitatesList (
                    citates = _dataCitates_,
                    modifier = Modifier.padding (horizontal = 8.dp)
                )

            }

            Height (25)

            Height (11/2)

        }

    }

}