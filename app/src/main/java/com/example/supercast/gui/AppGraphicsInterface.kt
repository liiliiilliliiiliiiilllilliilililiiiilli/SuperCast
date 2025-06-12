// App's graphic interface

package com.example.supercast.gui

import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.runtime.Composable

import com.example.supercast.gui.components.distinctive.AppBackground
import com.example.supercast.gui.pages.Collections
import com.example.supercast.gui.pages.Main
import com.example.supercast.gui.pages.Home



@Preview (
    showSystemUi = true,
    showBackground = true
)
@Composable
fun AppGraphicsInterface () {

    AppBackground {

        Collections ()
        Main ()
        Home ()

    }

}