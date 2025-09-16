// Other user page - Tools layer - Top bar

package com.example.supercast.ui.pages.otheruser.layers.tools.components.topbar

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.Row
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp

import com.example.supercast.lib.pics.Pics

import com.example.supercast.ui.components.spaces.Width

import com.example.supercast.ui.components.topbar.TopBar as TopBarComponent
import com.example.supercast.ui.components.topbar.label.Label
import com.example.supercast.ui.components.topbar.button.BarButton



private val picSearch = Pics.SearchGrey
private val picMenu = Pics.BurgerGrey

private const val textLabel = "Автор"



@Composable
fun TopBar () {

    TopBarComponent {

        Row (
            verticalAlignment = Alignment.CenterVertically,
            horizontalArrangement = Arrangement.SpaceBetween,
            modifier = Modifier
                .fillMaxSize ()
                .padding (horizontal = 18.5.dp)
        ) {

            Label (
                text = textLabel
            )

            Row {

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

}