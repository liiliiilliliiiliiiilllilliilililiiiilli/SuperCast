// Home page - Tools layer - Top bar

package com.example.supercast.gui.components.pages.home.toolslayer.topbar

import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp

import com.example.supercast.ui.pics.Pics

import com.example.supercast.gui.components.distinctive.spaces.Space
import com.example.supercast.gui.components.distinctive.spaces.Width
import com.example.supercast.gui.components.global.toolslayer.topbar.TopBar as TopBarComponent
import com.example.supercast.gui.components.global.toolslayer.topbar.label.Label
import com.example.supercast.gui.components.global.toolslayer.topbar.button.BarButton



private val picSearch = Pics.SearchGrey
private val picMenu = Pics.BurgerGrey

private const val textLabel = "Мой профиль"



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
                pic = picSearch,
                onPress = {}
            )

            Width (12.5)

            BarButton (
                pic = picMenu,
                onPress = {}
            )

        }

    }

}