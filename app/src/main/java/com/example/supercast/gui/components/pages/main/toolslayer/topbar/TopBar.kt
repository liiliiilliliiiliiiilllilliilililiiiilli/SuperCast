// Main page - Tools layer - Top bar

package com.example.supercast.gui.components.pages.main.toolslayer.topbar

import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp

import com.example.supercast.gui.components.distinctive.spaces.Space
import com.example.supercast.gui.components.distinctive.spaces.Width

import com.example.supercast.gui.components.global.toolslayer.topbar.TopBar as TopBarComponent
import com.example.supercast.gui.components.pages.main.toolslayer.topbar.supercastlabel.SuperCastLabel
import com.example.supercast.gui.components.pages.main.toolslayer.topbar.searchfieldbutton.SearchFieldButton
import com.example.supercast.gui.components.pages.main.toolslayer.topbar.notificationsbutton.NotificationsButton



@Composable
fun TopBar () {

    TopBarComponent {

        Row (
            verticalAlignment = Alignment.CenterVertically,
            modifier = Modifier
                .fillMaxSize ()
                .padding (horizontal = 18.5.dp)
        ) {

            SuperCastLabel ()

            Space (modifier = Modifier.weight (1f))

            SearchFieldButton (
                onPress = {}
            )

            Width (12.5)

            NotificationsButton (
                notificationsNum = 1,
                onPress = {}
            )

        }

    }

}