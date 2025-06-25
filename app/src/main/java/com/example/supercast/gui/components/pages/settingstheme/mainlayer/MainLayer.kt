// Settings theme page - Main layer

package com.example.supercast.gui.components.pages.settingstheme.mainlayer

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
import com.example.supercast.gui.components.pages.settingstheme.mainlayer._types_.Segue
import com.example.supercast.ui.pics.Pics

import com.example.supercast.gui.components.distinctive.spaces.Height
import com.example.supercast.gui.components.pages.settingstheme.mainlayer.label.Label
import com.example.supercast.gui.components.pages.settingstheme.mainlayer.segueslist.SeguesList



private val picColorTheme = Pics.BrushBigGreyLight
private val picColorPalette = Pics.BrushSmallGreyLight

private const val textColorTheme = "Тема приложения"
private const val textColorThemeValue = "Темная"
private const val textColorPalette = "Цветовое оформление"
private const val textColorPaletteValue = "Лайм"



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

            Height (14)

            SeguesBlock (
                segues = arrayOf (
                    Segue (
                        pic = picColorTheme,
                        text = textColorTheme,
                        textValue = textColorThemeValue,
                        onPress = {}
                    ),
                    Segue (
                        pic = picColorPalette,
                        text = textColorPalette,
                        textValue = textColorPaletteValue,
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

            Label (
                text = label
            )

        }

        SeguesList (
            segues = segues
        )

    }

}