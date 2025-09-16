// Podcast page - Main layer

package com.example.supercast.ui.pages.podcast.layers.main

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

import com.example.supercast.ui.pages.podcast.layers.main.components.playerblock.PlayerBlock
import com.example.supercast.ui.pages.podcast.layers.main.components.liner.Liner
import com.example.supercast.ui.pages.podcast.layers.main.components.similarposts.SimilarPosts

import com.example.supercast.ui.components.comment._types_.Comment
import com.example.supercast.ui.components.post._types_.Post
import com.example.supercast.ui.pages.podcast._types_.Player
import com.example.supercast.ui.pages.podcast._types_.Reactions


private val _dataPlayer_ = Player(
	content = Player.Content(
		ditle = Player.Content.Ditle(
			title = "Как побеждать (всегда).",
			stage = "Предисловие"
		),
		preview = Player.Content.Preview(
			bubbles = arrayOf(
				Player.Content.Preview.Bubble(
					speaker = "Георгий Долгих",
					speakerRole = "интервьюер",
					speech = "Why do wte use it? It is a long established fact that a reader will be distracted by the readable content of a page when looking at ..s layout. The point of  using Lorem Ipsum is that it has a more-or-less normal distribution of  letters, as opposed to using 'Content here, content here', making it  look like readable English. Many desktop publishing packages and web  page editors now use Lorem Ipsum as their default model text, and a  search for 'lorem ipsum' will uncover many web sites still in their  infancy. Various versions have evolved over the years, times by  accident, times on purpose (injected humour and the like)."
				),
				Player.Content.Preview.Bubble(
					speaker = "Павел Дуров",
					speakerRole = "приглашенный",
					speech = "Why do we use it?\nIt is a long established fact that a reader will be distracted"
				)
			)
		),
		track = Player.Content.Track(
			duration = 34501,
			current = 5901
		)
	),
	credits = Player.Credits(
		creator = Player.Credits.Creator(
			ava = Pics.__image_8__,
			tie = "подкасты",
			name = "Юрий Дудь",
			audience = 57,
			isSubscribed = false
		),
		chatters = Player.Credits.Chatters(
			num = 4,
			avas = arrayOf(
				Pics.__image_1__,
				Pics.__image_2__,
				Pics.__image_3__
			)
		),
		stats = Player.Credits.Stats(
			stars = 57525,
			listens = 30491
		),
		description = Player.Credits.Description(
			text = ""
		)
	)
)

private val _dataReactions_ = Reactions(
	whichOpened = "comments",
	comments = arrayOf(
		Comment(
			ava = Pics.__image_9__,
			name = "кто-то",
			date = 918234,

			blab = Comment.Blab(
				text = "Классно всё передали... Не возможно остановить технологии и Дурова П.В.тем более... Цифровой мир не из бежен... Его необходимо изучать... Присоединяюсь к команде Дурова и я- простой обычный пользователь Телеграмм... Сегодня это стало возможно... Благодарю ,Павел,за вашу щедрость.... Всё только начинается"
			),

			comments = 29,
			citates = 0,
			stars = 8635
		),
		Comment(
			ava = Pics.__image_8__,
			name = "Павел Дуров",
			date = 912348,

			voice = Comment.Voice(
				audio = "",
				transcription = "Почему я не согласен с тем, что сказано в этом подкасте хоть. Хоть и я был бы не проти того, чтобы очень сильно запустить аппарат",
				duration = 25,
				listens = 128
			),

			comments = 837,
			citates = 3,
			stars = 65
		),
		Comment(
			ava = Pics.__image_4__,
			name = "Иисус",
			date = 91234,

			blab = Comment.Blab(
				text = "Спасибо! Прекрасный фильм !"
			),

			comments = 519,
			citates = 1,
			stars = 1173980
		),
		Comment(
			ava = Pics.__image_3__,
			name = "Анна",
			date = 9821374,

			blab = Comment.Blab(
				text = "Читал книгу 'Код Дурова', Дуров далеко не идеальный персонаж, но тот факт, как он бился за свободу, как он посылал собачек, в официальных ответах фсб, которые требовали удалить группы Навального, или группы Евромайдана, как он спорил c ..."
			),

			comments = 0,
			citates = 0,
			stars = 5
		),
		Comment(
			ava = Pics.__image_7__,
			name = "Александра",
			date = 328764,

			voice = Comment.Voice(
				audio = "",
				transcription = "Вау, как красиво] Мне понравилось слушать!",
				duration = 25,
				listens = 0
			),

			comments = 0,
			citates = 0,
			stars = 0
		)
	),
	citates = arrayOf(
		Post(
			infoBar = Post.InfoBar(
				right = "2 днями ранее"
			),
			mainBlock = Post.MainBlock(
				topBar = Post.MainBlock.TopBar(
					pic = Pics.__image_5__,
					name = "Алина",
					tie = "моя жизнь",
					stars = 101
				),
				contextPlot = Post.MainBlock.ContextPlot(
					orationData = arrayOf("Спектральный синий цвет ощущается человеком под действием электромагнитного излучения с длинами волн в диапазоне 440—485 нм[1][2][3][4][5] (иногда диапазон указывают шире — 420—490 нм). Один из основных цветов в системе КЗС (RGB)."),
					attachmentData = arrayOf("Media", ""),
					isAttachmentOpenedState = false,
					textPublicationFromWho = "Кто-то",
					picsMedia = arrayOf(Pics.__image_7__, Pics.__image_8__)
				),
				audioPlot = Post.MainBlock.AudioPlot(
					data = arrayOf("", "")
				),
				isPostInner = true
			),
			segueBar = Post.SegueBar(
				comments = 19,
				citates = 8
			)
		),
		Post(
			infoBar = Post.InfoBar(
				right = "2 днями ранее"
			),
			mainBlock = Post.MainBlock(
				topBar = Post.MainBlock.TopBar(
					pic = Pics.__image_5__,
					name = "Алина",
					tie = "моя жизнь",
					stars = 101
				),
				contextPlot = Post.MainBlock.ContextPlot(
					orationData = arrayOf("Спектральный синий цвет ощущается человеком под действием электромагнитного излучения с длинами волн в диапазоне 440—485 нм[1][2][3][4][5] (иногда диапазон указывают шире — 420—490 нм). Один из основных цветов в системе КЗС (RGB)."),
					attachmentData = arrayOf("Media", ""),
					isAttachmentOpenedState = false,
					textPublicationFromWho = "Кто-то",
					picsMedia = arrayOf(Pics.__image_7__, Pics.__image_8__)
				),
				audioPlot = Post.MainBlock.AudioPlot(
					data = arrayOf("", "")
				),
				isPostInner = true
			),
			segueBar = Post.SegueBar(
				comments = 19,
				citates = 8
			)
		),
		Post(
			infoBar = Post.InfoBar(
				right = "2 днями ранее"
			),
			mainBlock = Post.MainBlock(
				topBar = Post.MainBlock.TopBar(
					pic = Pics.__image_5__,
					name = "Алина",
					tie = "моя жизнь",
					stars = 101
				),
				contextPlot = Post.MainBlock.ContextPlot(
					orationData = arrayOf("Спектральный синий цвет ощущается человеком под действием электромагнитного излучения с длинами волн в диапазоне 440—485 нм[1][2][3][4][5] (иногда диапазон указывают шире — 420—490 нм). Один из основных цветов в системе КЗС (RGB)."),
					attachmentData = arrayOf("Media", ""),
					isAttachmentOpenedState = false,
					textPublicationFromWho = "Кто-то",
					picsMedia = arrayOf(Pics.__image_7__, Pics.__image_8__)
				),
				audioPlot = Post.MainBlock.AudioPlot(
					data = arrayOf("", "")
				),
				isPostInner = true
			),
			segueBar = Post.SegueBar(
				comments = 19,
				citates = 8
			)
		),
		Post(
			infoBar = Post.InfoBar(
				right = "2 днями ранее"
			),
			mainBlock = Post.MainBlock(
				topBar = Post.MainBlock.TopBar(
					pic = Pics.__image_5__,
					name = "Алина",
					tie = "моя жизнь",
					stars = 101
				),
				contextPlot = Post.MainBlock.ContextPlot(
					orationData = arrayOf("Спектральный синий цвет ощущается человеком под действием электромагнитного излучения с длинами волн в диапазоне 440—485 нм[1][2][3][4][5] (иногда диапазон указывают шире — 420—490 нм). Один из основных цветов в системе КЗС (RGB)."),
					attachmentData = arrayOf("Media", ""),
					isAttachmentOpenedState = false,
					textPublicationFromWho = "Кто-то",
					picsMedia = arrayOf(Pics.__image_7__, Pics.__image_8__)
				),
				audioPlot = Post.MainBlock.AudioPlot(
					data = arrayOf("", "")
				),
				isPostInner = true
			),
			segueBar = Post.SegueBar(
				comments = 19,
				citates = 8
			)
		),
		Post(
			infoBar = Post.InfoBar(
				right = "2 днями ранее"
			),
			mainBlock = Post.MainBlock(
				topBar = Post.MainBlock.TopBar(
					pic = Pics.__image_5__,
					name = "Алина",
					tie = "моя жизнь",
					stars = 101
				),
				contextPlot = Post.MainBlock.ContextPlot(
					orationData = arrayOf("Спектральный синий цвет ощущается человеком под действием электромагнитного излучения с длинами волн в диапазоне 440—485 нм[1][2][3][4][5] (иногда диапазон указывают шире — 420—490 нм). Один из основных цветов в системе КЗС (RGB)."),
					attachmentData = arrayOf("Media", ""),
					isAttachmentOpenedState = false,
					textPublicationFromWho = "Кто-то",
					picsMedia = arrayOf(Pics.__image_7__, Pics.__image_8__)
				),
				audioPlot = Post.MainBlock.AudioPlot(
					data = arrayOf("", "")
				),
				isPostInner = true
			),
			segueBar = Post.SegueBar(
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

			PlayerBlock(
				player = _dataPlayer_,
				reactions = _dataReactions_
			)

            Height (25)

			Liner()

            Height (25)

			SimilarPosts(
				posts = _dataSimilarPosts_
			)

            Height (25)

            Height (11/2)

        }

    }

}