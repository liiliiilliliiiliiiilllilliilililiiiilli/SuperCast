// Common components - Bottom bar component

package com.example.supercast.gui.components.global.toolslayer

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.runtime.Composable
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.navigationBarsPadding
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.painter.Painter
import androidx.compose.ui.platform.LocalConfiguration
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.unit.dp
import com.example.supercast.R
import com.example.supercast.ui.Colors



private val barColorBack = Colors.BarBackground
private val barColorCorner = Colors.BarBorder

private val separatorColor = Colors.Button

private val picCollectionsLight = R.drawable.collections_light
private val picCollectionsDark = R.drawable.collections_dark
private val picPieLight = R.drawable.pie_light
private val picPieDark = R.drawable.pie_dark
private val picHomeLight = R.drawable.home_light
private val picHomeDark = R.drawable.home_dark

private const val picsDescription = "[navigation picture]"



@Composable
fun BottomBar (destination: String) {

    Bar {

        SeparatorsLayer ()
        ButtonsLayer (destination)

    }

}



@Composable
private fun Bar (
    content: @Composable () -> Unit = @Composable {Box {}}
) {

    Box (
        modifier = Modifier
            .fillMaxWidth ()
            .background (barColorBack)
            .navigationBarsPadding ()
            .height (65.5.dp)
            .background (barColorCorner)
            .padding (top = 2.dp)
            .background (barColorBack)
    ) {

        content ()

    }

}



@Composable
private fun SeparatorsLayer () {

    @Composable
    fun Separator () {

        Box (
            modifier = Modifier
                .size (2.dp, 25.dp)
                .background (color = separatorColor)
                .clip (RoundedCornerShape (25.dp))
        )

    }


    Row (
        verticalAlignment = Alignment.CenterVertically,
        horizontalArrangement = Arrangement.SpaceEvenly,
        modifier = Modifier
            .fillMaxSize ()
    ) {

        Separator ()
        Separator ()

    }

}



@Composable
private fun ButtonsLayer (destination: String) {

    @Composable
    fun NavButton (
        picture: Painter,
        onClick: () -> Unit?
    ) {

        val screenWidth = (LocalConfiguration.current.screenWidthDp + 1).dp
        val buttonWidth = screenWidth / 3


        Box (
            contentAlignment = Alignment.Center,
            modifier = Modifier
                .clickable {onClick ()}
                .fillMaxHeight ()
                .width (buttonWidth)
        ) {

            Image (
                painter = picture,
                contentDescription = picsDescription,
                modifier = Modifier
                    .size (30.dp)
            )

        }

    }


    Row (
        modifier = Modifier
            .fillMaxSize ()
    ) {

        NavButton (
            picture = painterResource (if (destination == "collections") picCollectionsLight else picCollectionsDark),
            onClick = {}
        )
        NavButton (
            picture = painterResource (if (destination == "main") picPieLight else picPieDark),
            onClick = {}
        )
        NavButton (
            picture = painterResource (if (destination == "home") picHomeLight else picHomeDark),
            onClick = {}
        )

    }

}