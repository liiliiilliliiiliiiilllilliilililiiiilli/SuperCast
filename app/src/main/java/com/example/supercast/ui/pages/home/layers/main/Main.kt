// Home page - Main layer

package com.example.supercast.ui.pages.home.layers.main

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

import com.example.supercast.ui.components.common.spaces.Height

import com.example.supercast.ui.pages.home.layers.main.components.faceblock.FaceBlock
import com.example.supercast.ui.pages.home.layers.main.components.tiesprovider.TiesProvider
import com.example.supercast.ui.pages.home.layers.main.components.liner.Liner
import com.example.supercast.ui.pages.home.layers.main.components.content.Content



@Composable
fun Main () {

    // • sample data

    val data = mapOf (

        "data_1" to mapOf (

            "info_bar" to mapOf (

                 "left" to "Редактировано",

                 "right" to "Час назад"

            ),

            "main_block" to mapOf (

                 "top" to mapOf (
                     "" to ""
                 ),

                 "context_plot" to mapOf (
                     "" to ""
                 ),

                 "audio_plot" to mapOf (
                     "" to ""
                 )

            ),

             "segue_bar" to mapOf (

                 "comments" to 144,

                 "citates" to 15

            )

        ),

        "data_2" to mapOf (

            "info_bar" to mapOf (

                "left" to "Редактировано",

                "right" to "Час назад"

            ),

            "main_block" to mapOf (

                "top" to mapOf (
                    "" to ""
                ),

                "context_plot" to mapOf (
                    "" to ""
                ),

                "audio_plot" to mapOf (
                    "" to ""
                )

            ),

            "segue_bar" to mapOf (

                "comments" to 144,

                "citates" to 15

            )

        ),

        "data_3" to mapOf (

            "info_bar" to mapOf (

                "left" to "Редактировано",

                "right" to "Час назад"

            ),

            "main_block" to mapOf (

                "top" to mapOf (
                    "" to ""
                ),

                "context_plot" to mapOf (
                    "" to ""
                ),

                "audio_plot" to mapOf (
                    "" to ""
                )

            ),

            "segue_bar" to mapOf (

                "comments" to 144,

                "citates" to 15

            )

        ),

        "data_4" to mapOf (

            "info_bar" to mapOf (

                "left" to "Редактировано",

                "right" to "Час назад"

            ),

            "main_block" to mapOf (

                "top" to mapOf (
                    "" to ""
                ),

                "context_plot" to mapOf (
                    "" to ""
                ),

                "audio_plot" to mapOf (
                    "" to ""
                )

            ),

            "segue_bar" to mapOf (

                "comments" to 144,

                "citates" to 15

            )

        ),

        "data_5" to mapOf (

            "info_bar" to mapOf (

                "left" to "Редактировано",

                "right" to "Час назад"

            ),

            "main_block" to mapOf (

                "top" to mapOf (
                    "" to ""
                ),

                "context_plot" to mapOf (
                    "" to ""
                ),

                "audio_plot" to mapOf (
                    "" to ""
                )

            ),

            "segue_bar" to mapOf (

                "comments" to 144,

                "citates" to 15

            )

        )

    )

    val posts = arrayOf (

        "",

        "",

        "",

        "",

        ""

    )

    // • sample data


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

            FaceBlock(
                modifier = Modifier.padding(horizontal = 4.dp)
            )

            Height (25)

            TiesProvider()

            Height (25)

            Liner()

            Height (23)

            Content (
                posts = posts,
                modifier = Modifier.padding (horizontal = 4.dp)  // 8?
            )

            Height (50)

        }

    }

}