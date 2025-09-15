// Settings page - Account page - Main layer

package com.example.supercast.ui.pages.settingsaccount.layers.main

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

import com.example.supercast.ui.pages.settingsaccount.layers.main.components.label.Label
import com.example.supercast.ui.pages.settingsaccount.layers.main.components.segueslist.SeguesList

import com.example.supercast.ui.pages.settingsaccount._types_.Segue


private val picPen = Pics.PenOrdinaryGrey
private val picSegueSwitchSessionPicValue = Pics.__image_4__

private const val textLabelCommon = "Общее"
private const val textLabelSecurity = "Безопасность и вход"
private const val textLabelSessions = "Сеансы"

private const val textSegueProfileName = "Имя в профиле"
private const val textSegueProfileNameValue = "Jelley Beam"
private const val textSegueShortName = "Короткое имя"
private const val textSegueShortNameValue = "@jelly_li"
private const val textSegueSwitchSession = "Сменить аккаунт"
private const val textSegueChangeStretchedMail = "Сменить привязанную почту"
private const val textSegueChangePassword = "Сменить пароль"
private const val textSegueActiveSessions = "Активные сеансы"
private const val textSegueExit = "Выйти"
private const val textSegueDeleteAccount = "Удаление аккаунта"



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
                label = textLabelCommon,
                segues = arrayOf (
                    Segue (
                        text = textSegueProfileName,
                        textValue = textSegueProfileNameValue,
                        rightPic = picPen,
                        onPress = {}
                    ),
                    Segue (
                        text = textSegueShortName,
                        textValue = textSegueShortNameValue,
                        rightPic = picPen,
                        onPress = {}
                    )
                )
            )

            SeguesBlock (
                segues = arrayOf (
                    Segue (
                        text = textSegueSwitchSession,
                        picValue = picSegueSwitchSessionPicValue,
                        onPress = {}
                    )
                )
            )

            SeguesBlock (
                label = textLabelSecurity,
                segues = arrayOf (
                    Segue (
                        text = textSegueChangeStretchedMail,
                        onPress = {}
                    ),
                    Segue (
                        text = textSegueChangePassword,
                        onPress = {}
                    )
                )
            )

            SeguesBlock (
                label = textLabelSessions,
                segues = arrayOf (
                    Segue (
                        text = textSegueActiveSessions,
                        onPress = {}
                    ),
                    Segue (
                        text = textSegueExit,
                        onPress = {}
                    )
                )
            )

            SeguesBlock (
                segues = arrayOf (
                    Segue (
                        text = textSegueDeleteAccount,
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
    label: String? = null,
    vararg segues: Segue
) {

    Column (
        modifier = Modifier.fillMaxWidth ()
    ) {

        if (label != null) {

            Label(
                text = label
            )

        }

        SeguesList(
            segues = segues
        )

    }

}