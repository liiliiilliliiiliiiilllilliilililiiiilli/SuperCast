// Other user page - Main layer

package com.example.supercast.gui.components.pages.otheruser.mainlayer

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

import com.example.supercast.gui.components.distinctive.spaces.Height

import com.example.supercast.gui.components.pages.otheruser.mainlayer.faceblock.FaceBlock
import com.example.supercast.gui.components.pages.otheruser.mainlayer.tiesprovider.TiesProvider
import com.example.supercast.gui.components.pages.otheruser.mainlayer.liner.Liner
import com.example.supercast.gui.components.pages.otheruser.mainlayer.content.Content



@Composable
fun MainLayer () {

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

            Height (25)

            TiesProvider ()

            Height (25)

            Liner ()

            Height (23)

            Content (
                posts = posts,
                modifier = Modifier.padding (horizontal = 4.dp)  // 8?
            )

            Height (50)

        }

    }

}