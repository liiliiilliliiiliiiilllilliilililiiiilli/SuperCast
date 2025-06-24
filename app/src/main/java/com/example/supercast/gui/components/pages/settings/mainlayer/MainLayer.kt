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

import com.example.supercast.gui.components.pages.settings.mainlayer.label.Label
import com.example.supercast.gui.components.pages.settings.mainlayer.segueslist.SeguesList



val seguesListData = object {

    val q = ""
    val r = 5
    val e = ""
    val s = {}
    val i = 25

}



class Segue (val q: String, val r: String, val i: String)

class SegueList (vararg segues: Segue)

val q = SegueList (Segue (q = "", r = "", i = ""))



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

            Label (
                text = ""
            )

            SeguesList (
                data = q
            )

        }

    }

}