// Settings page - Notifications page - Main layer

package com.example.supercast.ui.pages.settingsnotifications.layers.main

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

import com.example.supercast.ui.components.spaces.Height

import com.example.supercast.ui.pages.settingsnotifications.layers.main.components.label.Label
import com.example.supercast.ui.pages.settingsnotifications.layers.main.components.segueslist.SeguesList

import com.example.supercast.ui.pages.settingsnotifications._types_.Segue


private const val textLabelFunctions = "Функции"
private const val textLabelMain = "Основное"

private const val textSegueRegularConclusion = "Регулярная сводка"
private const val textSegueRegularConclusionDescription = "Получать разов все уведомления в определенное время суток"
private const val textSegueRegularConclusionMoment = "Время регулярной сводки"
private const val textSegueServiceNotifications = "Уведомления сервиса"
private const val textSegueServiceNotificationsDescription = "Информация о ключевых нововведениях и событиях сервиса"
private const val textSegueMyChannel = "Мой канал"
private const val textSegueMyChannelDescription = "Появление новых подписчиков, комментарие, лайков и пр."
private const val textSegueMyChannelSpecialEvents = "Особые события моего канала"
private const val textSegueMyChannelSpecialEventsDescription = "Резкое изменение количества подпискиков, реакций на публикациях или их цитируемости"
private const val textSegueMyCommentsSpecialEvents = "События моих комментариев"
private const val textSegueMyCommentsSpecialEventsDescription = "Ответы, лайки и другие события оставленных вами коммментариев"
private const val textSegueSubscriptions = "Подписки"
private const val textSegueSubscriptionsDescription = "Выход новых пубикаций или их изменение"
private const val textSegueSubscriptionsSpecialEvents = "Особые события одписок"
private const val textSegueSubscriptionsSpecialEventsDescription = "Пики популярности авторов и их долгожданные публикации"

private var dataScrollChooseList = arrayOf (
    Segue.ScrollChooseList.ScrollChooseListVariant (
        text = "00:00",
        isChosen = false
    ),
    Segue.ScrollChooseList.ScrollChooseListVariant (
        text = "00:30",
        isChosen = false
    ),
    Segue.ScrollChooseList.ScrollChooseListVariant (
        text = "01:00",
        isChosen = false
    ),
    Segue.ScrollChooseList.ScrollChooseListVariant (
        text = "01:30",
        isChosen = false
    ),
    Segue.ScrollChooseList.ScrollChooseListVariant (
        text = "02:00",
        isChosen = false
    ),
    Segue.ScrollChooseList.ScrollChooseListVariant (
        text = "02:30",
        isChosen = false
    ),
    Segue.ScrollChooseList.ScrollChooseListVariant (
        text = "03:00",
        isChosen = false
    ),
    Segue.ScrollChooseList.ScrollChooseListVariant (
        text = "03:30",
        isChosen = false
    ),
    Segue.ScrollChooseList.ScrollChooseListVariant (
        text = "04:00",
        isChosen = false
    ),
    Segue.ScrollChooseList.ScrollChooseListVariant (
        text = "04:30",
        isChosen = false
    ),
    Segue.ScrollChooseList.ScrollChooseListVariant (
        text = "05:00",
        isChosen = false
    ),
    Segue.ScrollChooseList.ScrollChooseListVariant (
        text = "05:30",
        isChosen = false
    ),
    Segue.ScrollChooseList.ScrollChooseListVariant (
        text = "06:00",
        isChosen = false
    ),
    Segue.ScrollChooseList.ScrollChooseListVariant (
        text = "06:30",
        isChosen = false
    ),
    Segue.ScrollChooseList.ScrollChooseListVariant (
        text = "07:00",
        isChosen = false
    ),
    Segue.ScrollChooseList.ScrollChooseListVariant (
        text = "07:30",
        isChosen = false
    ),
    Segue.ScrollChooseList.ScrollChooseListVariant (
        text = "08:00",
        isChosen = false
    ),
    Segue.ScrollChooseList.ScrollChooseListVariant (
        text = "08:30",
        isChosen = false
    ),
    Segue.ScrollChooseList.ScrollChooseListVariant (
        text = "09:00",
        isChosen = false
    ),
    Segue.ScrollChooseList.ScrollChooseListVariant (
        text = "09:30",
        isChosen = false
    ),
    Segue.ScrollChooseList.ScrollChooseListVariant (
        text = "10:00",
        isChosen = false
    ),
    Segue.ScrollChooseList.ScrollChooseListVariant (
        text = "10:30",
        isChosen = false
    ),
    Segue.ScrollChooseList.ScrollChooseListVariant (
        text = "11:00",
        isChosen = false
    ),
    Segue.ScrollChooseList.ScrollChooseListVariant (
        text = "11:30",
        isChosen = false
    ),
    Segue.ScrollChooseList.ScrollChooseListVariant (
        text = "12:00",
        isChosen = false
    ),
    Segue.ScrollChooseList.ScrollChooseListVariant (
        text = "12:30",
        isChosen = false
    ),
    Segue.ScrollChooseList.ScrollChooseListVariant (
        text = "13:00",
        isChosen = false
    ),
    Segue.ScrollChooseList.ScrollChooseListVariant (
        text = "13:30",
        isChosen = false
    ),
    Segue.ScrollChooseList.ScrollChooseListVariant (
        text = "14:00",
        isChosen = false
    ),
    Segue.ScrollChooseList.ScrollChooseListVariant (
        text = "14:30",
        isChosen = false
    ),
    Segue.ScrollChooseList.ScrollChooseListVariant (
        text = "15:00",
        isChosen = false
    ),
    Segue.ScrollChooseList.ScrollChooseListVariant (
        text = "15:30",
        isChosen = false
    ),
    Segue.ScrollChooseList.ScrollChooseListVariant (
        text = "16:00",
        isChosen = false
    ),
    Segue.ScrollChooseList.ScrollChooseListVariant (
        text = "16:30",
        isChosen = false
    ),
    Segue.ScrollChooseList.ScrollChooseListVariant (
        text = "17:00",
        isChosen = false
    ),
    Segue.ScrollChooseList.ScrollChooseListVariant (
        text = "17:30",
        isChosen = false
    ),
    Segue.ScrollChooseList.ScrollChooseListVariant (
        text = "18:00",
        isChosen = false
    ),
    Segue.ScrollChooseList.ScrollChooseListVariant (
        text = "18:30",
        isChosen = false
    ),
    Segue.ScrollChooseList.ScrollChooseListVariant (
        text = "19:00",
        isChosen = false
    ),
    Segue.ScrollChooseList.ScrollChooseListVariant (
        text = "19:30",
        isChosen = false
    ),
    Segue.ScrollChooseList.ScrollChooseListVariant (
        text = "20:00",
        isChosen = false
    ),
    Segue.ScrollChooseList.ScrollChooseListVariant (
        text = "20:30",
        isChosen = false
    ),
    Segue.ScrollChooseList.ScrollChooseListVariant (
        text = "21:00",
        isChosen = true
    ),
    Segue.ScrollChooseList.ScrollChooseListVariant (
        text = "21:30",
        isChosen = false
    ),
    Segue.ScrollChooseList.ScrollChooseListVariant (
        text = "22:00",
        isChosen = false
    ),
    Segue.ScrollChooseList.ScrollChooseListVariant (
        text = "22:30",
        isChosen = false
    ),
    Segue.ScrollChooseList.ScrollChooseListVariant (
        text = "23:00",
        isChosen = false
    ),
    Segue.ScrollChooseList.ScrollChooseListVariant (
        text = "23:30",
        isChosen = false
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

            SeguesBlock (
                label = textLabelFunctions,
                segues = arrayOf (
                    Segue (
                        title = textSegueRegularConclusion,
                        description = textSegueRegularConclusionDescription,
                        switcher = Segue.Switcher (
                            state = false,
                            onPress = {}
                        )
                    ),
                    Segue (
                        title = textSegueRegularConclusionMoment,
                        scrollChooseList = Segue.ScrollChooseList (
                            chooses = dataScrollChooseList,
                            onChoose = {}
                        )
                    )
                )
            )

            SeguesBlock (
                label = textLabelMain,
                segues = arrayOf (
                    Segue (
                        title = textSegueServiceNotifications,
                        description = textSegueServiceNotificationsDescription,
                        switcher = Segue.Switcher (
                            state = false,
                            onPress = {}
                        )
                    ),
                    Segue (
                        title = textSegueMyChannel,
                        description = textSegueMyChannelDescription,
                        switcher = Segue.Switcher (
                            state = false,
                            onPress = {}
                        )
                    ),
                    Segue (
                        title = textSegueMyChannelSpecialEvents,
                        description = textSegueMyChannelSpecialEventsDescription,
                        switcher = Segue.Switcher (
                            state = false,
                            onPress = {}
                        )
                    ),
                    Segue (
                        title = textSegueMyCommentsSpecialEvents,
                        description = textSegueMyCommentsSpecialEventsDescription,
                        switcher = Segue.Switcher (
                            state = false,
                            onPress = {}
                        )
                    ),
                    Segue (
                        title = textSegueSubscriptions,
                        description = textSegueSubscriptionsDescription,
                        switcher = Segue.Switcher (
                            state = false,
                            onPress = {}
                        )
                    ),
                    Segue (
                        title = textSegueSubscriptionsSpecialEvents,
                        description = textSegueSubscriptionsSpecialEventsDescription,
                        switcher = Segue.Switcher (
                            state = false,
                            onPress = {}
                        )
                    )
                )
            )

            Height (11/2)

        }

    }

}



@Composable
private fun SeguesBlock (
    label: String,
    vararg segues: Segue
) {

    Column (
        modifier = Modifier.fillMaxWidth ()
    ) {

        Label (
            text = label
        )

        SeguesList(
            segues = segues
        )

    }

}