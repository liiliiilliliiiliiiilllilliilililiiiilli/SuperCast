// Podcast page - Main layer

package com.example.supercast.gui.components.pages.podcast.mainlayer

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

import com.example.supercast.gui.components.pages.podcast.mainlayer.playerblock.PlayerBlock
import com.example.supercast.gui.components.pages.podcast.mainlayer.liner.Liner
import com.example.supercast.gui.components.pages.podcast.mainlayer.similarposts.SimilarPosts

import com.example.supercast.gui.components.pages.podcast._types_.*
import com.example.supercast.gui.components.global.mainlayer.commentcontext._types_.Comment
import com.example.supercast.gui.components.global.mainlayer.post._types_.Post



private val _dataPlayer_ = Player (
    content = Player.Content (
        ditle = Player.Content.Ditle (
            title = "",
            stage = ""
        ),
        track = Player.Content.Track (
            totalDuration = 5,
            currentPosition = 25
        ),
        preview = Player.Content.Preview (
            data = ""
        )
    ),
    credits = Player.Credits (
        creator = Player.Credits.Creator (
            ava = Pics.__image_8__,
            tie = "",
            name = "",
            listeners = 368101,
            isSubscribed = false
        ),
        chaatters = Player.Credits.Chatters (
            num = 8,
            avas = arrayOf (
                Pics.__image_1__,
                Pics.__image_2__,
                Pics.__image_3__,
                Pics.__image_4__,
                Pics.__image_5__,
            )
        ),
        stats = Player.Credits.Stats (
            stars = 128,
            listenes = 101
        ),
        description = Player.Credits.Description (
            text = ""
        )
    )
)

private val _dataReactions_ = Reactions (
    whichOpened = "comments",
    comments = arrayOf (
        Comment (
            authorAva = Pics.__image_9__,
            authorName = "кто-то",
            publicationDate = 918234,

            blab = Comment.Blab (
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

            voice = Comment.Voice (
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

            blab = Comment.Blab (
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

            blab = Comment.Blab (
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

            voice = Comment.Voice (
                audio = "",
                transcription = "Вау, как красиво] Мне понравилось слушать!",
                duration = 25,
                listensNum = 0
            ),

            commentsNum = 0,
            citatesNum = 0,
            starsNum = 0
        )
    ),
    citates = arrayOf (
        Post (
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
        ),
        Post (
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
        ),
        Post (
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
        ),
        Post (
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
        ),
        Post (
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
    )
)

private val _dataSimilarPosts_ = arrayOf (
    Post (
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
    ),
    Post (
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
    ),
    Post (
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
    ),
    Post (
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
    ),
    Post (
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
)



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

            Height (11/2)

            Height (25)

            PlayerBlock (
                player = _dataPlayer_,
                reactions = _dataReactions_
            )

            Height (25)

            Liner ()

            Height (25)

            SimilarPosts (
                posts = _dataSimilarPosts_
            )

            Height (25)

            Height (11/2)

        }

    }

}