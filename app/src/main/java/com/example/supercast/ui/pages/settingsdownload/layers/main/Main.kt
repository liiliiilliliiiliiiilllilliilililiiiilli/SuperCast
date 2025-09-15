// Settings page - Download page - Main layer

package com.example.supercast.ui.pages.settingsdownload.layers.main

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

import com.example.supercast.ui.components.common.spaces.Height

import com.example.supercast.ui.pages.settingsdownload.layers.main.components.label.Label
import com.example.supercast.ui.pages.settingsdownload.layers.main.components.segueslist.SeguesList

import com.example.supercast.ui.pages.settingsdownload._types_.Segue


private const val textLabelDownloadParameters = "Параметры скачивания"
private const val textLabelStorage = "Хранилище"
private const val textLabelOther = "Прочее"
private const val textSegueTitleDefaultDownloadBitrate = "Битрейт скачивания по умолчанию"
private const val textSegueChoose_kbs_1 = "80kb/s"
private const val textSegueChoose_kbs_2 = "160kb/s"
private const val textSegueChoose_kbs_3 = "320kb/s"
private const val textSegueTitleDownloadOnlyThroughWhat = "Скачивать только через"
private const val textSegueChoose_net_1 = "WiFi"
private const val textSegueChoose_net_2 = "Моб. сеть"
private const val textSegueChoose_net_3 = "Любая сеть"
private const val textSegueTitleOpenDownloadsFolder = "Открыть папку загрузок"
private const val textSegueDescriptionOpenDownloadsFolder = "\"Для каждого подкаста создается отдельная папка со вложенным аудиофайлом, его текстовой расшифровкой и методанными\""
private const val textSegueTitleChangeDowloadsFolderPlace = "\"Изменить путь папки загрузки\""
private const val textSegueDescriptionChangeDowloadsFolderPlace = "\"/Android/Program Data/Supercas/Audiofile Downloads\""
private const val textSegueTitleDeleteAllDownloads = "Очистить все загрузки"
private const val textSegueDescriptionDeleteAllDownloads = "Используется:  5.4Gb"
private const val textSegueTitleMaxCacheAmount = "Максимальный размер кэша"
private const val textSegueEditTextMaxCacheAmount = "5Gb"
private const val textSegueTitleSmartPreload = "Умная предзагрузки видео"
private const val textSegueDescriptionSmartPreload = "Временно предзагружать отображаемые в ленте аудиофайлы в зависимости от использования"

private val picEdit = Pics.PenOrdinaryGreyLight
private val picArrowGo = Pics.ArrowGoGreyLight
private val picArrowRight = Pics.ArrowCompactDownGrey



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
                label = textLabelDownloadParameters,
                segues = arrayOf (
                    Segue (
                        title = textSegueTitleDefaultDownloadBitrate,
                        scrollChooseList = Segue.ScrollChooseList (
                            chooses = arrayOf (
                                Segue.ScrollChooseList.ScrollChooseListVariant (
                                    text = textSegueChoose_kbs_1,
                                    isChosen = false
                                ),
                                Segue.ScrollChooseList.ScrollChooseListVariant (
                                    text = textSegueChoose_kbs_2,
                                    isChosen = false
                                ),
                                Segue.ScrollChooseList.ScrollChooseListVariant (
                                    text = textSegueChoose_kbs_3,
                                    isChosen = true
                                )
                            ),
                            onChoose = {}
                        ),
                        onPress = {}
                    ),
                    Segue (
                        title = textSegueTitleDownloadOnlyThroughWhat,
                        scrollChooseList = Segue.ScrollChooseList (
                            chooses = arrayOf (
                                Segue.ScrollChooseList.ScrollChooseListVariant (
                                    text = textSegueChoose_net_1,
                                    isChosen = true
                                ),
                                Segue.ScrollChooseList.ScrollChooseListVariant (
                                    text = textSegueChoose_net_2,
                                    isChosen = false
                                ),
                                Segue.ScrollChooseList.ScrollChooseListVariant (
                                    text = textSegueChoose_net_3,
                                    isChosen = false
                                )
                            ),
                            onChoose = {}
                        ),
                        onPress = {}
                    )
                )
            )

            SeguesBlock (
                label = textLabelStorage,
                segues = arrayOf (
                    Segue (
                        title = textSegueTitleOpenDownloadsFolder,
                        description = textSegueDescriptionOpenDownloadsFolder,
                        rightPic = picArrowGo,
                        onPress = {}
                    ),
                    Segue (
                        isDivider = true
                    ),
                    Segue (
                        title = textSegueTitleChangeDowloadsFolderPlace,
                        description = textSegueDescriptionChangeDowloadsFolderPlace,
                        rightPic = picArrowGo,
                        onPress = {}
                    ),
                    Segue (
                        title = textSegueTitleDeleteAllDownloads,
                        description = textSegueDescriptionDeleteAllDownloads,
                        rightPic = picArrowRight,
                        onPress = {}
                    ),
                    Segue (
                        isDivider = true
                    ),
                    Segue (
                        title = textSegueTitleMaxCacheAmount,
                        editText = Segue.EditText (
                            text = textSegueEditTextMaxCacheAmount,
                            pic = picEdit
                        ),
                        onPress = {}
                    )
                )
            )

            SeguesBlock (
                label = textLabelOther,
                segues = arrayOf (
                    Segue (
                        title = textSegueTitleSmartPreload,
                        description = textSegueDescriptionSmartPreload,
                        switcher = Segue.Switcher (
                            state = false
                        ),
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

        Label(
            text = label
        )

        SeguesList(
            segues = segues
        )

    }

}