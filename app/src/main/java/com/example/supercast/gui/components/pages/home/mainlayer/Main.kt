// Home page - Main layer

package com.example.supercast.gui.components.pages.home.mainlayer

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

import com.example.supercast.gui.components.distinctive.Height
import com.example.supercast.gui.components.pages.home.mainlayer.faceblock.FaceBlock
import com.example.supercast.gui.components.pages.home.mainlayer.tiesprovider.TiesProvider
import com.example.supercast.gui.components.pages.home.mainlayer.liner.Liner



@Composable
fun Main () {

    Box (
        modifier = Modifier.fillMaxSize ()
    ) {

        Column (
            modifier = Modifier
                .verticalScroll (rememberScrollState ())
                .fillMaxWidth ()
                .statusBarsPadding ()
                .padding (vertical = 65.5.dp)
        ) {

            FaceBlock (
                modifier = Modifier.padding (horizontal = 4.dp)
            )

            Height (
                25.dp
            )

            TiesProvider ()

            Height (
                25.dp
            )

            Liner ()

        }

    }

}