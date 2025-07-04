// Comment page - Main layer

package com.example.supercast.gui.components.pages.comment.mainlayer

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

import com.example.supercast.gui.components.global.mainlayer.commentcontext.CommentContext
import com.example.supercast.gui.components.global.mainlayer.liner.Liner as LinerComponent
import com.example.supercast.gui.components.pages.comment.mainlayer.commentslist.CommentsList
import com.example.supercast.gui.components.pages.comment.mainlayer.citateslist.CitatesList

import com.example.supercast.gui.components.global.mainlayer.post._types_.*
import com.example.supercast.gui.components.global.mainlayer.comment._types_.*



private val picFilter = Pics.FilterGreyLight

private const val textButtonList = "Все"

private val _dataContext_ = Comment (
    authorAva = Pics.__image_4__,
    authorName = "Иисус",
    publicationDate = 91234,

    blab = Blab (
        text = "Спасибо! Прекрасный фильм !"
    ),

    commentsNum = 519,
    citatesNum = 1,
    starsNum = 1173980
)

private val _dataComments_ = arrayOf (
    Comment (
        authorAva = Pics.__image_9__,
        authorName = "кто-то",
        publicationDate = 918234,

        blab = Blab (
            text = "Классно всё передали... Не возможно остановить технологии и Дурова П.В.тем более... Цифровой мир не из бежен... Его необходимо изучать... Присоединяюсь к команде Дурова и я- простой обычный пользователь Телеграмм... Сегодня это стало возможно... Благодарю ,Павел,за вашу щедрость.... Всё только начинается"
        ),

        commentsNum = 29,
        citatesNum = 0,
        starsNum = 8635
    ),
    Comment (
        authorAva = Pics.__image_8__,
        authorName = "Павел Дуров",
        publicationDate = 912348,

        voice = Voice (
            audio = "",
            transcription = "Почему я не согласен с тем, что сказано в этом подкасте хоть. Хоть и я был бы не проти того, чтобы очень сильно запустить аппарат",
            duration = 25,
            listensNum = 128
        ),

        commentsNum = 837,
        citatesNum = 3,
        starsNum = 65
    ),
    Comment (
        authorAva = Pics.__image_4__,
        authorName = "Иисус",
        publicationDate = 91234,

        blab = Blab (
            text = "Спасибо! Прекрасный фильм !"
        ),

        commentsNum = 519,
        citatesNum = 1,
        starsNum = 1173980
    ),
    Comment (
        authorAva = Pics.__image_3__,
        authorName = "Анна",
        publicationDate = 9821374,

        blab = Blab (
            text = "Читал книгу 'Код Дурова', Дуров далеко не идеальный персонаж, но тот факт, как он бился за свободу, как он посылал собачек, в официальных ответах фсб, которые требовали удалить группы Навального, или группы Евромайдана, как он спорил c ..."
        ),

        commentsNum = 0,
        citatesNum = 0,
        starsNum = 5
    ),
    Comment (
        authorAva = Pics.__image_7__,
        authorName = "Александра",
        publicationDate = 328764,

        voice = Voice (
            audio = "",
            transcription = "Вау, как красиво] Мне понравилось слушать!",
            duration = 25,
            listensNum = 0
        ),

        commentsNum = 0,
        citatesNum = 0,
        starsNum = 0
    )
)

private val _dataCitates_ = arrayOf (
    Post (
        infoBar = InfoBar (
            right = "2 днями ранее"
        ),
        mainBlock = MainBlock (
            topBar = TopBar (
                pic = Pics.__image_5__,
                textDitleTie = "Алина",
                textDitleName = "моя жизнь",
                numStars = 101
            ),
            contextPlot = ContextPlot (
                orationData = arrayOf ("Спектральный синий цвет ощущается человеком под действием электромагнитного излучения с длинами волн в диапазоне 440—485 нм[1][2][3][4][5] (иногда диапазон указывают шире — 420—490 нм). Один из основных цветов в системе КЗС (RGB)."),
                attachmentData = arrayOf ("Media", ""),
                isAttachmentOpenedState = false,
                textPublicationFromWho = "Кто-то",
                picsMedia = arrayOf (Pics.__image_7__, Pics.__image_8__)
            ),
            audioPlot = AudioPlot (
                data = arrayOf ("", "")
            ),
            isPostInner = true
        ),
        segueBar = SegueBar (
            comments = 19,
            citates = 8
        )
    ),
    Post (
        infoBar = InfoBar (
            right = "2 днями ранее"
        ),
        mainBlock = MainBlock (
            topBar = TopBar (
                pic = Pics.__image_5__,
                textDitleTie = "Алина",
                textDitleName = "моя жизнь",
                numStars = 101
            ),
            contextPlot = ContextPlot (
                orationData = arrayOf ("Спектральный синий цвет ощущается человеком под действием электромагнитного излучения с длинами волн в диапазоне 440—485 нм[1][2][3][4][5] (иногда диапазон указывают шире — 420—490 нм). Один из основных цветов в системе КЗС (RGB)."),
                attachmentData = arrayOf ("Media", ""),
                isAttachmentOpenedState = false,
                textPublicationFromWho = "Кто-то",
                picsMedia = arrayOf (Pics.__image_7__, Pics.__image_8__)
            ),
            audioPlot = AudioPlot (
                data = arrayOf ("", "")
            ),
            isPostInner = true
        ),
        segueBar = SegueBar (
            comments = 19,
            citates = 8
        )
    ),
    Post (
        infoBar = InfoBar (
            right = "2 днями ранее"
        ),
        mainBlock = MainBlock (
            topBar = TopBar (
                pic = Pics.__image_5__,
                textDitleTie = "Алина",
                textDitleName = "моя жизнь",
                numStars = 101
            ),
            contextPlot = ContextPlot (
                orationData = arrayOf ("Спектральный синий цвет ощущается человеком под действием электромагнитного излучения с длинами волн в диапазоне 440—485 нм[1][2][3][4][5] (иногда диапазон указывают шире — 420—490 нм). Один из основных цветов в системе КЗС (RGB)."),
                attachmentData = arrayOf ("Media", ""),
                isAttachmentOpenedState = false,
                textPublicationFromWho = "Кто-то",
                picsMedia = arrayOf (Pics.__image_7__, Pics.__image_8__)
            ),
            audioPlot = AudioPlot (
                data = arrayOf ("", "")
            ),
            isPostInner = true
        ),
        segueBar = SegueBar (
            comments = 19,
            citates = 8
        )
    ),
    Post (
        infoBar = InfoBar (
            right = "2 днями ранее"
        ),
        mainBlock = MainBlock (
            topBar = TopBar (
                pic = Pics.__image_5__,
                textDitleTie = "Алина",
                textDitleName = "моя жизнь",
                numStars = 101
            ),
            contextPlot = ContextPlot (
                orationData = arrayOf ("Спектральный синий цвет ощущается человеком под действием электромагнитного излучения с длинами волн в диапазоне 440—485 нм[1][2][3][4][5] (иногда диапазон указывают шире — 420—490 нм). Один из основных цветов в системе КЗС (RGB)."),
                attachmentData = arrayOf ("Media", ""),
                isAttachmentOpenedState = false,
                textPublicationFromWho = "Кто-то",
                picsMedia = arrayOf (Pics.__image_7__, Pics.__image_8__)
            ),
            audioPlot = AudioPlot (
                data = arrayOf ("", "")
            ),
            isPostInner = true
        ),
        segueBar = SegueBar (
            comments = 19,
            citates = 8
        )
    ),
    Post (
        infoBar = InfoBar (
            right = "2 днями ранее"
        ),
        mainBlock = MainBlock (
            topBar = TopBar (
                pic = Pics.__image_5__,
                textDitleTie = "Алина",
                textDitleName = "моя жизнь",
                numStars = 101
            ),
            contextPlot = ContextPlot (
                orationData = arrayOf ("Спектральный синий цвет ощущается человеком под действием электромагнитного излучения с длинами волн в диапазоне 440—485 нм[1][2][3][4][5] (иногда диапазон указывают шире — 420—490 нм). Один из основных цветов в системе КЗС (RGB)."),
                attachmentData = arrayOf ("Media", ""),
                isAttachmentOpenedState = false,
                textPublicationFromWho = "Кто-то",
                picsMedia = arrayOf (Pics.__image_7__, Pics.__image_8__)
            ),
            audioPlot = AudioPlot (
                data = arrayOf ("", "")
            ),
            isPostInner = true
        ),
        segueBar = SegueBar (
            comments = 19,
            citates = 8
        )
    )
)



@Composable
fun MainLayer () {

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

            CommentContext (
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
                    modifier = Modifier.padding (horizontal = 8.dp)
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