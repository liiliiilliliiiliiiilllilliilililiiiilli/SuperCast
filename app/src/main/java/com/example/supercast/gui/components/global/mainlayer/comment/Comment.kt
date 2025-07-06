// Global components - MainLayer - Comment

package com.example.supercast.gui.components.global.mainlayer.comment

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.unit.dp

import com.example.supercast.ui.colors.Colors

import com.example.supercast.gui.components.distinctive.spaces.Height
import com.example.supercast.gui.components.distinctive.spaces.Width

import com.example.supercast.gui.components.global.mainlayer.comment.ava.Ava
import com.example.supercast.gui.components.global.mainlayer.comment.ditle.Ditle
import com.example.supercast.gui.components.global.mainlayer.comment.blab.Blab
import com.example.supercast.gui.components.global.mainlayer.comment.voice.Voice
import com.example.supercast.gui.components.global.mainlayer.comment.segues.Segues

import com.example.supercast.gui.components.global.mainlayer.comment._types_.Comment



@Composable
fun Comment (
    isContext: Boolean = false,
    data: Comment,
    modifier: Modifier = Modifier
) {

    val modifierIsContext =

        if (isContext) {

            Modifier
                .clip (RoundedCornerShape (14.dp))
                .background (color = Colors.Blocks)
        }

        else

            Modifier


    val ava = data.authorAva
    val name = data.authorName
    val date = data.publicationDate
    val blab = data.blab
    val voice = data.voice
    val comments = data.commentsNum
    val citates = data.citatesNum
    val stars = data.starsNum


    Row (
        modifier = Modifier
            .then (modifier)
            .fillMaxWidth ()

            .then (modifierIsContext)

            .padding (top = 11.dp, bottom = 11.dp, start = 14.dp, end = 5.dp)
    ) {

        Ava (
            pic = ava
        )

        Width (9)

        Column (
            modifier = Modifier
                .fillMaxWidth ()
                .padding (top = 1.25.dp)
        ) {

            Ditle (
                name = name,
                date = date
            )

            Height (8)

            if (blab != null) {

                Blab (
                    data = blab
                )

            }
//
//            else if (voice != null) {
//
//                Voice (
//                    data = voice
//                )
//
//            }

            Height (8)

            Segues (
                comments = comments,
                citates = citates,
                stars = stars
            )

        }

    }

}