// Graphical interface

package com.example.supercast.gui

import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.runtime.Composable

import com.example.supercast.gui.components.distinctive.guibackground.GuiBackground
//import com.example.supercast.gui.pages.collections.Collections as CollectionsPage
//import com.example.supercast.gui.pages.main.Main as MainPage
import com.example.supercast.gui.pages.home.Home as HomePage



@Preview (
    showSystemUi = true,
    showBackground = true
)
@Composable
fun Gui () {

    GuiBackground {

//        CollectionsPage ()
//        MainPage ()
        HomePage ()

    }

}