// Main page - Main layer - Content

package com.example.supercast.gui.components.pages.home.mainlayer.content

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier

import com.example.supercast.gui.components.global.mainlayer.post.Post



@Composable
fun Content (
    posts: Array <String>,
    modifier: Modifier = Modifier
) {

    Column (
        modifier = Modifier
            .fillMaxWidth ()
            .then (modifier)
    ) {

        posts.forEach {data ->

            Post (
                data = data
            )

        }

    }

}