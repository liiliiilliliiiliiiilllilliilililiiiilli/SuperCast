// Settings page - Main layer

package com.example.supercast.gui.components.pages.settings.mainlayer

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
import com.example.supercast.gui.components.pages.settings.mainlayer.label.Label
import com.example.supercast.gui.components.pages.settings.mainlayer.segueslist.SeguesList

import com.example.supercast.gui.components.pages.settings._types_.Segue



private val picSegueAccount = Pics.UserGrey
private val picSeguePayments = Pics.DollarGrey
private val picSegueTheme = Pics.PaletteGrey
private val picSegueNotifications = Pics.BellGrey
private val picSegueLanguage = Pics.PlanetGrey
private val picSegueAbout = Pics.InfoGrey
private val picSegueFolders = Pics.FolderGrey
private val picSegueRecommendations = Pics.RobotGgrey
private val picSeguePlayer = Pics.TrianglePlayGrey
private val picSegueDownload = Pics.DownloadGrey

private const val textLabelCommon = "Общее"
private const val textLabelApp = "Приложение"
private const val textLabelContent = "Контент"
private const val textLabelPlayWork = "Воспроизведение"

private const val textSegueAccount = "Аккаунт"
private const val textSeguePayments = "Платежи и подписки"
private const val textSegueTheme = "Тема и оформление"
private const val textSegueNotifications = "Уведомления"
private const val textSegueLanguage = "Язык"
private const val textSegueLanguageValue = "Русский"
private const val textSegueAbout = "О сервисе"
private const val textSegueFolders = "Папки подписок"
private const val textSegueRecommendations = "Система рекомендаций"
private const val textSeguePlayer = "Плеер"
private const val textSegueDownload = "Загрузка на устройство"



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

            SeguesBlock (
                label = textLabelCommon,
                segues = arrayOf (
                    Segue (
                        pic = picSegueAccount,
                        text = textSegueAccount,
                        onPress = {}
                    ),
                    Segue (
                        pic = picSeguePayments,
                        text = textSeguePayments,
                        onPress = {}
                    )
                )
            )

            SeguesBlock (
                label = textLabelApp,
                segues = arrayOf (
                    Segue (
                        pic = picSegueTheme,
                        text = textSegueTheme,
                        onPress = {}
                    ),
                    Segue (
                        pic = picSegueNotifications,
                        text = textSegueNotifications,
                        onPress = {}
                    ),
                    Segue (
                        pic = picSegueLanguage,
                        text = textSegueLanguage,
                        textValue = textSegueLanguageValue,
                        onPress = {}
                    ),
                    Segue (
                        pic = picSegueAbout,
                        text = textSegueAbout,
                        onPress = {}
                    )
                )
            )

            SeguesBlock (
                label = textLabelContent,
                segues = arrayOf (
                    Segue (
                        pic = picSegueFolders,
                        text = textSegueFolders,
                        onPress = {}
                    ),
                    Segue (
                        pic = picSegueRecommendations,
                        text = textSegueRecommendations,
                        onPress = {}
                    )
                )
            )

            SeguesBlock (
                label = textLabelPlayWork,
                segues = arrayOf (
                    Segue (
                        pic = picSeguePlayer,
                        text = textSeguePlayer,
                        onPress = {}
                    ),
                    Segue (
                        pic = picSegueDownload,
                        text = textSegueDownload,
                        onPress = {}
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

        SeguesList (
            segues = segues
        )

    }

}