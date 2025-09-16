// Settings page - Subscriptions folder page - Main layer

package com.example.supercast.ui.pages.settingsfoldersfolder.layers.main

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

import com.example.supercast.ui.pages.settingsfoldersfolder.layers.main.components.titlebar.TitleBar
import com.example.supercast.ui.pages.settingsfoldersfolder.layers.main.components.faqcomment.FaqComment
import com.example.supercast.ui.pages.settingsfoldersfolder.layers.main.components.liner.Liner
import com.example.supercast.ui.pages.settingsfoldersfolder.layers.main.components.subsseguelist.SubsSegueList

import com.example.supercast.ui.pages.settingsfoldersfolder._types_.SubSegue



private const val textTitleBar = "Для прогулок"
private const val textFaqComment = "Добавьте или удалите интересующие разделы публикаций авторов."

private const val numSections = 28

private val dataSubsSegueList = arrayOf (
    SubSegue (
        ava = Pics.__image_1__,
        name = "Anny",
        ties = arrayOf (
            SubSegue.Tie (
                title = "Все"
            )
        )
    ),
    SubSegue (
        ava = Pics.__image_2__,
        name = "Леви",
        ties = arrayOf (
            SubSegue.Tie (
                title = "Путешествия"
            ),
            SubSegue.Tie (
                title = "Идеи"
            ),
            SubSegue.Tie (
                title = "Основное"
            ),
            SubSegue.Tie (
                title = "Пузыри"
            ),
            SubSegue.Tie (
                title = "Голубой"
            )
        )
    ),
    SubSegue (
        ava = Pics.__image_3__,
        name = "аниме-тян",
        ties = arrayOf (
            SubSegue.Tie (
                title = "Основное"
            ),
            SubSegue.Tie (
                title = "Тесты"
            ),
            SubSegue.Tie (
                title = "Треки"
            ),
            SubSegue.Tie (
                title = "Желе"
            ),
            SubSegue.Tie (
                title = "Свобода"
            ),
            SubSegue.Tie (
                title = "Фильмы"
            ),
            SubSegue.Tie (
                title = "Цвета"
            ),
            SubSegue.Tie (
                title = "Мое любимое"
            )
        )
    ),
    SubSegue (
        ava = Pics.__image_4__,
        name = "медуза",
        ties = arrayOf (
            SubSegue.Tie (
                title = "Что-то"
            )
        )
    ),
    SubSegue (
        ava = Pics.__image_5__,
        name = "li",
        ties = arrayOf (
            SubSegue.Tie (
                title = "Все"
            ),
            SubSegue.Tie (
                title = "Изобретения"
            ),
            SubSegue.Tie (
                title = "Идеи"
            ),
            SubSegue.Tie (
                title = "Жидкости"
            ),
            SubSegue.Tie (
                title = "Синий цвет"
            ),
            SubSegue.Tie (
                title = "Пришельцы"
            ),
            SubSegue.Tie (
                title = "Вода"
            ),
            SubSegue.Tie (
                title = "Космос"
            ),
            SubSegue.Tie (
                title = "Океан"
            )
        )
    ),
    SubSegue (
        ava = Pics.__image_6__,
        name = "рыбка",
        ties = arrayOf (
            SubSegue.Tie (
                title = "Океан"
            ),
            SubSegue.Tie (
                title = "Потоки"
            ),
            SubSegue.Tie (
                title = "Капли"
            ),
            SubSegue.Tie (
                title = "Лимны"
            ),
            SubSegue.Tie (
                title = "Космос"
            ),
            SubSegue.Tie (
                title = "Сокровища"
            ),
            SubSegue.Tie (
                title = "Магия"
            ),
            SubSegue.Tie (
                title = "Цели"
            )
        )
    ),
    SubSegue (
        ava = Pics.__image_7__,
        name = "космический котик",
        ties = arrayOf (
            SubSegue.Tie (
                title = "Синий"
            ),
            SubSegue.Tie (
                title = "Вода"
            ),
            SubSegue.Tie (
                title = "Космос"
            )
        )
    ),
    SubSegue (
        ava = Pics.__image_8__,
        name = "кто-то",
        ties = arrayOf (
            SubSegue.Tie (
                title = "Космический корабль"
            ),
            SubSegue.Tie (
                title = "Путешествия"
            ),
            SubSegue.Tie (
                title = "Осьминоги"
            ),
            SubSegue.Tie (
                title = "Космос"
            )
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

            Height (28)

            TitleBar (
                text = textTitleBar
            )

            Height (28)

            FaqComment (
                text = textFaqComment
            )

            Height (28)

            Liner (
                sectionsNum = numSections
            )

            Height (14)

            SubsSegueList (
                subs = dataSubsSegueList
            )

            Height (11/2)

        }

    }

}