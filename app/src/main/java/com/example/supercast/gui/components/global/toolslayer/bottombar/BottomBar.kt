// Global components - Tools layer - Bottom bar

package com.example.supercast.gui.components.global.toolslayer.bottombar

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
import androidx.compose.ui.platform.LocalConfiguration
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.unit.dp

import com.example.supercast.ui.colors.Colors
import com.example.supercast.ui.pics.Pics



private val colorBarBack = Colors.BarBackground
private val colorBarCorner = Colors.BarBorder
private val colorSeparator = Colors.Button

private val picCollectionsLight = Pics.CollectionsLight
private val picCollectionsDark = Pics.CollectionsDark
private val picPieLight = Pics.PieLight
private val picPieDark = Pics.PieDark
private val picHomeLight = Pics.HomeLight
private val picHomeDark = Pics.HomeDark

private const val textPicNavButtonDescription = "[navigation pic]"



@Composable
fun BottomBar (destination: String) {

    Bar {

        SeparatorsLayer ()

        ButtonsLayer (
            destination = destination
        )

    }

}



@Composable
private fun Bar (
    content: @Composable () -> Unit = @Composable {Box {}}
) {

    Box (
        modifier = Modifier
            .fillMaxWidth ()
            .background (colorBarBack)
            .navigationBarsPadding ()
            .height (65.5.dp)
            .background (colorBarCorner)
            .padding (top = 2.dp)
            .background (colorBarBack)
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
                .background (colorSeparator)
                .clip (RoundedCornerShape (25.dp))
        )

    }


    Row (
        verticalAlignment = Alignment.CenterVertically,
        horizontalArrangement = Arrangement.SpaceEvenly,
        modifier = Modifier.fillMaxSize ()
    ) {

        Separator ()
        Separator ()

    }

}



@Composable
private fun ButtonsLayer (destination: String) {

    @Composable
    fun NavButton (
        pic: Int,
        onPress: () -> Unit
    ) {

        val screenWidth = (LocalConfiguration.current.screenWidthDp + 1).dp
        val buttonWidth = screenWidth / 3


        Box (
            contentAlignment = Alignment.Center,
            modifier = Modifier
                .clickable {onPress}
                .fillMaxHeight ()
                .width (buttonWidth)
        ) {

            Image (
                painter = painterResource (pic),
                contentDescription = textPicNavButtonDescription,
                modifier = Modifier.size (30.dp)
            )

        }

    }


    Row (
        modifier = Modifier.fillMaxSize ()
    ) {

        val picCollections = if (destination == "collections") picCollectionsLight else picCollectionsDark
        val picMain = if (destination == "main") picPieLight else picPieDark
        val picHome = if (destination == "home") picHomeLight else picHomeDark


        NavButton (
            pic = picCollections,
            onPress = {}
        )

        NavButton (
            pic = picMain,
            onPress = {}
        )

        NavButton (
            pic = picHome,
            onPress = {}
        )

    }

}