// My comments page

package com.example.supercast.ui.pages.mycomments

import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier

import com.example.supercast.ui.pages.mycomments.layers.main.Main as MainLayer
import com.example.supercast.ui.pages.mycomments.layers.tools.Tools as ToolsLayer
import com.example.supercast.ui.pages.mycomments.layers.sliders.Sliders as SlidersLayer
import com.example.supercast.ui.pages.mycomments.layers.windows.Windows as WindowsLayer



@Composable
fun MyComments () {

    Box (
        modifier = Modifier.fillMaxSize ()
    ) {

        MainLayer ()
        ToolsLayer ()
        SlidersLayer ()
        WindowsLayer ()

    }

}