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
            .background (Colors.BarBackground)
            .navigationBarsPadding ()
//            .safeGesturesPadding ()
            .height (65.5.dp)
            .background (Colors.BarBorder)
            .padding (top = 2.dp)
            .background (Colors.BarBackground)
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
                .height (25.dp)
                .width (2.dp)
                .background (color = Colors.Button)
                .clip (RoundedCornerShape (25.dp))
        )

    }


    Row (
        horizontalArrangement = Arrangement.SpaceEvenly,
        modifier = Modifier
            .fillMaxSize (),
        verticalAlignment = Alignment.CenterVertically
    ) {

        Separator ()
        Separator ()

    }

}



@Composable
private fun ButtonsLayer (destination: String) {

    var configuration = LocalConfiguration.current

    var screenWidth = (configuration.screenWidthDp + 1).dp
    var buttonWidth = screenWidth / 3


    @Composable
    fun NavButton (
        picture: Painter
    ) {

        Box (
            modifier = Modifier
                .fillMaxHeight ()
                .width (buttonWidth)
                .clickable {},
            contentAlignment = Alignment.Center
        ) {

            Image (
                modifier = Modifier
                    .width (30.dp)
                    .height (30.dp),
                painter = picture,
                contentDescription = "[navigation picture]"
            )

        }

    }


    Row (
        modifier = Modifier
            .fillMaxSize ()
    ) {

        NavButton (
            picture = painterResource (if (destination == "collections") R.drawable.collections_light else R.drawable.collections_dark)
        )
        NavButton (
            picture = painterResource (if (destination == "main") R.drawable.pie_light else R.drawable.pie_dark)
        )
        NavButton (
            picture = painterResource (if (destination == "me") R.drawable.home_light else R.drawable.home_dark)
        )

    }

}