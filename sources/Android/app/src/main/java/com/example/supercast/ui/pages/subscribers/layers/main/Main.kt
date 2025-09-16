// Subscribers page - Main layer

package com.example.supercast.ui.pages.subscribers.layers.main

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

import com.example.supercast.ui.components.spaces.Height

import com.example.supercast.ui.pages.subscribers.layers.main.components.liner.Liner
import com.example.supercast.ui.pages.subscribers.layers.main.components.soap.Soap



@Composable
fun Main () {

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

			Liner ()

            Height (17)

            Column (
                modifier = Modifier.padding (horizontal = 4.dp)
            ) {

                Soap (
                    pic = Pics.__image_1__,
                    name = "li",
                    shortName = "liiliiilliliiiliiiilllillililil",
                    audience = 101
                )

                Height (10)

                Soap (
                    pic = Pics.__image_8__,
                    name = "София",
                    shortName = "sohy_yi",
                    audience = 0
                )

                Height (10)

                Soap (
                    pic = Pics.__image_5__,
                    name = "растворяюсь",
                    shortName = "rainbow.water",
                    audience = 1431
                )

                Height (10)

                Soap (
                    pic = Pics.__image_9__,
                    name = "аниме-тян",
                    shortName = "iuw-acjwui",
                    audience = 94590
                )

                Height (10)

                Soap (
                    pic = Pics.__image_4__,
                    name = "Привеееет!!!!!!",
                    shortName = "hi_i_am_here",
                    audience = 505
                )

            }

            Height (50)

        }

    }

}