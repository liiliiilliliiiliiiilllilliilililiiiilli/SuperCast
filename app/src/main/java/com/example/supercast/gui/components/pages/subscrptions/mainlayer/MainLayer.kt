// Subscriptions page - Main layer

package com.example.supercast.gui.components.pages.subscrptions.mainlayer

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
import com.example.supercast.gui.components.pages.subscribers.mainlayer.liner.Liner
import com.example.supercast.gui.components.pages.subscribers.mainlayer.soap.Soap



@Composable
fun MainLayer () {

    val posts = arrayOf (

        "",

        "",

        "",

        "",

        ""

    )


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

            Height (25)

            Liner (
                isWrapped = false
            )

            Height (17)

            Column (
                modifier = Modifier.padding (horizontal = 4.dp)
            ) {

                Soap (
                    pic = Pics.__image_5__,
                    name = "растворяюсь",
                    shortName = "rainbow.water",
                    listenersNum = 1431
                )

                Height (10)

                Soap (
                    pic = Pics.__image_9__,
                    name = "аниме-тян",
                    shortName = "iuw-acjwui",
                    listenersNum = 94590
                )

                Height (10)

                Soap (
                    pic = Pics.__image_8__,
                    name = "София",
                    shortName = "sohy_yi",
                    listenersNum = 0
                )

                Height (10)

                Soap (
                    pic = Pics.__image_4__,
                    name = "Привеееет!!!!!!",
                    shortName = "hi_i_am_here",
                    listenersNum = 505
                )

                Height (10)

                Soap (
                    pic = Pics.__image_1__,
                    name = "li",
                    shortName = "liiliiilliliiiliiiilllillililil",
                    listenersNum = 101
                )

            }

            Height (50)

        }

    }

}