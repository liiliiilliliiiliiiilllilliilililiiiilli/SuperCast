// Collections page - My listening history page - Tools layer - Top bar

package com.example.supercast.ui.pages.collectionsmyhistory.layers.tools.components.topbar

import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.offset
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.Row
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp

import com.example.supercast.lib.pics.Pics

import com.example.supercast.ui.components.spaces.Space

import com.example.supercast.ui.components.topbar.TopBar as TopBarComponent
import com.example.supercast.ui.components.topbar.label.Label
import com.example.supercast.ui.components.topbar.button.BarButton



private val picArrow = Pics.ArrowCompactDownGrey
private val picSearch = Pics.SearchGrey

private const val textLabel = "История прослушивания"



@Composable
fun TopBar () {

    TopBarComponent {

        Row (
            verticalAlignment = Alignment.CenterVertically,
            modifier = Modifier
                .fillMaxSize ()
                .padding (horizontal = 18.5.dp)
        ) {

            BarButton (
                pic = picArrow,
                picSize = 14.75.dp,
                isCircle = true,
                rotate = 90f,
                onPress = {},
                modifier = Modifier.offset (y = 0.75.dp)
            )

            Label (
                text = textLabel,
                fontSize = 20
            )

            Space (modifier = Modifier.weight (1f))

            BarButton (
                pic = picSearch,
                onPress = {}
            )

        }

    }

}