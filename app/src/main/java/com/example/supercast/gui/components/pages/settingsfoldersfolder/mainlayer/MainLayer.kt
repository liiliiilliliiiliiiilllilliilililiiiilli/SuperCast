// Settings page - Subscriptions folders folder page - Main layer

package com.example.supercast.gui.components.pages.settingsfoldersfolder.mainlayer

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

import com.example.supercast.gui.components.pages.settingsfoldersfolder.mainlayer.titlebar.TitleBar
import com.example.supercast.gui.components.pages.settingsfoldersfolder.mainlayer.faqcomment.FaqComment
import com.example.supercast.gui.components.pages.settingsfoldersfolder.mainlayer.liner.Liner
import com.example.supercast.gui.components.pages.settingsfoldersfolder.mainlayer.subsseguelist.SubsSegueList

import com.example.supercast.gui.components.pages.settingsfoldersfolder._types_.SubSegue
import com.example.supercast.gui.components.pages.settingsfoldersfolder._types_.Tie



private const val textTitleBar = "Для прогулок"
private const val textFaqComment = "Добавьте или удалите интересующие разделы публикаций авторов."

private const val numSections = 28

private val dataSubsSegueList = arrayOf (
    SubSegue (
        ava = Pics.__image_1__,
        name = "Anny",
        ties = arrayOf (
            Tie (
                title = "Все"
            )
        )
    ),
    SubSegue (
        ava = Pics.__image_2__,
        name = "Леви",
        ties = arrayOf (
            Tie (
                title = "Путешествия"
            ),
            Tie (
                title = "Идеи"
            ),
            Tie (
                title = "Основное"
            ),
            Tie (
                title = "Пузыри"
            ),
            Tie (
                title = "Голубой"
            )
        )
    ),
    SubSegue (
        ava = Pics.__image_3__,
        name = "аниме-тян",
        ties = arrayOf (
            Tie (
                title = "Основное"
            ),
            Tie (
                title = "Тесты"
            ),
            Tie (
                title = "Треки"
            ),
            Tie (
                title = "Желе"
            ),
            Tie (
                title = "Свобода"
            ),
            Tie (
                title = "Фильмы"
            ),
            Tie (
                title = "Цвета"
            ),
            Tie (
                title = "Мое любимое"
            )
        )
    ),
    SubSegue (
        ava = Pics.__image_4__,
        name = "медуза",
        ties = arrayOf (
            Tie (
                title = "Что-то"
            )
        )
    ),
    SubSegue (
        ava = Pics.__image_5__,
        name = "li",
        ties = arrayOf (
            Tie (
                title = "Все"
            ),
            Tie (
                title = "Изобретения"
            ),
            Tie (
                title = "Идеи"
            ),
            Tie (
                title = "Жидкости"
            ),
            Tie (
                title = "Синий цвет"
            ),
            Tie (
                title = "Пришельцы"
            ),
            Tie (
                title = "Вода"
            ),
            Tie (
                title = "Космос"
            ),
            Tie (
                title = "Океан"
            )
        )
    ),
    SubSegue (
        ava = Pics.__image_6__,
        name = "рыбка",
        ties = arrayOf (
            Tie (
                title = "Океан"
            ),
            Tie (
                title = "Потоки"
            ),
            Tie (
                title = "Капли"
            ),
            Tie (
                title = "Лимны"
            ),
            Tie (
                title = "Космос"
            ),
            Tie (
                title = "Сокровища"
            ),
            Tie (
                title = "Магия"
            ),
            Tie (
                title = "Цели"
            )
        )
    ),
    SubSegue (
        ava = Pics.__image_7__,
        name = "космический котик",
        ties = arrayOf (
            Tie (
                title = "Синий"
            ),
            Tie (
                title = "Вода"
            ),
            Tie (
                title = "Космос"
            )
        )
    ),
    SubSegue (
        ava = Pics.__image_8__,
        name = "кто-то",
        ties = arrayOf (
            Tie (
                title = "Космический корабль"
            ),
            Tie (
                title = "Путешествия"
            ),
            Tie (
                title = "Осьминоги"
            ),
            Tie (
                title = "Космос"
            )
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