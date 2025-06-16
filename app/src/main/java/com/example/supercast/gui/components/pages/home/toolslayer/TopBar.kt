// Home page - Top bar component

package com.example.supercast.gui.components.pages.home.toolslayer

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.painter.Painter
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.Font
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.supercast.R
import com.example.supercast.ui.Colors

import com.example.supercast.gui.components.distinctive.Width
import com.example.supercast.gui.components.global.toolslayer.TopBar as TopBarComponent



private const val labelText = "Мой профиль"

private val labelFont = FontFamily (Font (R.font.fredoka_semi_bold))
private val labelColor = Colors.PreWhite

private val buttonColorBack = Colors.Black
private val buttonColorCorner = Colors.Button

private val picSearch = R.drawable.search_grey
private val picMenu = R.drawable.burger_grey

private const val picsDescription = "[top bar picture]"



@Composable
fun TopBar () {

    TopBarComponent (someParams = "") {

        Row (
            verticalAlignment = Alignment.CenterVertically,
            horizontalArrangement = Arrangement.SpaceBetween,
            modifier = Modifier
                .fillMaxSize ()
                .padding (horizontal = 18.5.dp)
        ) {

            Label (
                text = labelText
            )

            Row {

                BarButton (
                    pic = painterResource (picSearch),
                    onPress = {}
                )

                Width (
                    12.5.dp
                )

                BarButton (
                    pic = painterResource (picMenu),
                    onPress = {}
                )

            }

        }

    }

}



@Composable
private fun Label (
    text: String
) {

    Text (
        text = text,
        fontSize = 23.sp,
        fontFamily = labelFont,
        color = labelColor,
        modifier = Modifier.padding (start = 18.5.dp, end = 25.dp)
    )

}



@Composable
private fun BarButton (
    pic: Painter,
    onPress: () -> Unit?
) {

    Image (
        painter = pic,
        contentDescription = picsDescription,
        modifier = Modifier
            .clickable (onClick = {onPress ()})
            .clip (RoundedCornerShape (10.dp))
            .background (color = buttonColorCorner)
            .padding (3.dp)
            .clip (RoundedCornerShape (7.dp))
            .background (color = buttonColorBack)
            .padding (7.dp)
            .size (17.dp)
            .background (color = buttonColorBack)
    )

}