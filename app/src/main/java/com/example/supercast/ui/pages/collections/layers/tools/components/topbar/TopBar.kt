// Collections page - Tools layer - Top bar

package com.example.supercast.ui.pages.collections.layers.tools.components.topbar

import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.Row
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp

import com.example.supercast.lib.pics.Pics

import com.example.supercast.ui.components.common.spaces.Space

import com.example.supercast.ui.components.layers.toolslayer.topbar.TopBar as TopBarComponent
import com.example.supercast.ui.components.layers.toolslayer.topbar.label.Label
import com.example.supercast.ui.components.layers.toolslayer.topbar.button.BarButton



private val picSettings = Pics.SettingsAdjustmentsGrey

private const val textLabel = "Коллекции"



@Composable
fun TopBar () {

    TopBarComponent {

        Row (
            verticalAlignment = Alignment.CenterVertically,
            modifier = Modifier
                .fillMaxSize ()
                .padding (horizontal = 18.5.dp)
        ) {

            Label (
                text = textLabel
            )

            Space (modifier = Modifier.weight (1f))

            BarButton (
                pic = picSettings,
                picSize = 19.dp,
                onPress = {}
            )

        }

    }

}