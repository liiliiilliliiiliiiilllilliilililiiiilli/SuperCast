// Other user page

package com.example.supercast.ui.pages.otheruser

import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier

import com.example.supercast.ui.pages.otheruser.layers.main.Main as MainLayer
import com.example.supercast.ui.pages.otheruser.layers.tools.Tools as ToolsLayer
import com.example.supercast.ui.pages.otheruser.layers.sliders.Sliders as SlidersLayer
import com.example.supercast.ui.pages.otheruser.layers.windows.Windows as WindowsLayer



@Composable
fun OtherUser () {

    Box (
        modifier = Modifier.fillMaxSize ()
    ) {

        MainLayer ()
        ToolsLayer ()
        SlidersLayer ()
        WindowsLayer ()

    }

}