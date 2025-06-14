// Home page - Main layer

package com.example.supercast.gui.components.pages.home.mainlayer

import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.statusBarsPadding
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.verticalScroll
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp

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
                .fillMaxWidth ()
                .verticalScroll (rememberScrollState ())
                .statusBarsPadding ()
                .padding (top = 65.5.dp, start = 4.dp, end = 4.dp, bottom = 65.5.dp)
        ) {

            FaceBlock ()

//            Spacer (
//                modifier = Modifier.height (25.dp)
//            )
//
//            TiesProvider ()
//
//            Spacer (
//                modifier = Modifier.height (25.dp)
//            )
//
//            Liner ()

        }

    }

}