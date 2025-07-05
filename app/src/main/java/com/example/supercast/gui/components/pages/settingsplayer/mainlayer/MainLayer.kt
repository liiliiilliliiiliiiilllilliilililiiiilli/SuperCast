// Settings page - Player page - Main layer

package com.example.supercast.gui.components.pages.settingsplayer.mainlayer

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

import com.example.supercast.gui.components.distinctive.spaces.Height

import com.example.supercast.gui.components.pages.settingsplayer.mainlayer.label.Label
import com.example.supercast.gui.components.pages.settingsplayer.mainlayer.segueslist.SeguesList

import com.example.supercast.gui.components.pages.settingsplayer._types_.Segue



private const val textLabelPlaybackParameters = "Параметры воспроизведения"
private const val textSegueDefaultBitrate = "Битрейт воспроизведения по умолчанию"
private const val textSegueChoose_kbs_1 = "80kb/s"
private const val textSegueChoose_kbs_2 = "160kb/s"
private const val textSegueChoose_kbs_3 = "320kb/s"
private const val textSegueDefaultPlayerType = "Вид плеера по умолчанию"
private const val textSegueChoose_PlayerType_1 = "Упрощенный"
private const val textSegueChoose_PlayerType_2 = "Переписка"
private const val textSegueChoose_PlayerType_3 = "Аватары"
private const val textSeguePlayWithTurnedOffScreen = "Воспроизводить при выключенном экране"
private const val textSeguePlayNextPodcastAfterEndOfPrevious = "Проигрывать следующий подкаст по завершении"



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
                label = textLabelPlaybackParameters,
                segues = arrayOf (
                    Segue (
                        title = textSegueDefaultBitrate,
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
                        )
                    ),
                    Segue (
                        title = textSegueDefaultPlayerType,
                        scrollChooseList = Segue.ScrollChooseList (
                            chooses = arrayOf (
                               Segue.ScrollChooseList.ScrollChooseListVariant (
                                    text = textSegueChoose_PlayerType_1,
                                    isChosen = true
                                ),
                               Segue.ScrollChooseList.ScrollChooseListVariant (
                                    text = textSegueChoose_PlayerType_2,
                                    isChosen = false
                                ),
                               Segue.ScrollChooseList.ScrollChooseListVariant (
                                    text = textSegueChoose_PlayerType_3,
                                    isChosen = false
                                )
                            ),
                            onChoose = {}
                        )
                    ),
                    Segue (
                        isDivider = true
                    ),
                    Segue (
                        title = textSeguePlayWithTurnedOffScreen,
                        switcher = Segue.Switcher (
                            state = false,
                            onPress = {}
                        )
                    ),
                    Segue (
                        title = textSeguePlayNextPodcastAfterEndOfPrevious,
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

        SeguesList (
            segues = segues
        )

    }

}