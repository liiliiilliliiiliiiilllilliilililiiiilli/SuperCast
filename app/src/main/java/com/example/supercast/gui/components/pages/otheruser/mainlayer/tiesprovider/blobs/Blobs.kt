// Home page - Main layer - Ties provider - Blobs

package com.example.supercast.gui.components.pages.otheruser.mainlayer.tiesprovider.blobs

import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.horizontalScroll
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.supercast.ui.colors.Colors
import com.example.supercast.ui.fonts.Fonts

import com.example.supercast.gui.components.distinctive.spaces.Width



private val colorBlobBackChosen = Colors.Black
private val colorBlobBackNotChosen = Colors.BarBackground
private val colorBlobCornerChosen = Colors.ChosenFrame
private val colorBlobCornerNotChosen = Colors.Button
private val colorBlobTextChosen = Colors.ChosenText
private val colorBlobTextNotChosen = Colors.PreWhite
private val colorSeparator = Colors.DarkGrey

private val fontBlob = Fonts.FiraSansSemiBold



@Composable
fun Blobs (
    tiesList: Array <String>,
    chosenTie: String,
    setChosenTie: (String) -> Unit
) {

    Box (
        contentAlignment = Alignment.Center,
        modifier = Modifier.fillMaxWidth ()
    ) {

        Row (
            verticalAlignment = Alignment.CenterVertically,
            horizontalArrangement = Arrangement.Center,
            modifier = Modifier
                .horizontalScroll (state = rememberScrollState ())
                .height (50.dp)
        ) {

            Width (14)

            tiesList.forEachIndexed {index, tieName ->

                if (tieName == "Остальное") Separator ()

                Blob (
                    text = tieName,
                    isChosen = tieName == chosenTie,
                    onPress = {setChosenTie (tieName)}
                )

                if (tieName == "Все") Separator ()

            }

            Width (14)

        }

    }

}



@Composable
private fun Blob (
    text: String,
    isChosen: Boolean,
    onPress: () -> Unit
) {

    val colorBack = if (isChosen) colorBlobBackChosen else colorBlobBackNotChosen
    val colorCorner = if (isChosen) colorBlobCornerChosen else colorBlobCornerNotChosen
    val colorText = if (isChosen) colorBlobTextChosen else colorBlobTextNotChosen


    Text (
        text = text,
        fontSize = 14.sp,
        color = colorText,
        fontFamily = fontBlob,
        modifier = Modifier
            .clickable (onClick = onPress)
            .padding (horizontal = 5.dp)

            .clip (RoundedCornerShape (10.dp))
            .background (colorCorner)

            .padding (vertical = 2.5.dp, horizontal = 2.5.dp)
            .clip (RoundedCornerShape (7.5f.dp))
            .background (colorBack)

            .padding (vertical = 3.dp, horizontal = 10.dp)
    )

}



@Composable
private fun Separator () {

    Box (
        modifier = Modifier
            .padding (horizontal = 5.dp)
            .clip (RoundedCornerShape (100))
            .background (color = colorSeparator)
            .height (19.dp)
            .width (2.dp)
    )

}