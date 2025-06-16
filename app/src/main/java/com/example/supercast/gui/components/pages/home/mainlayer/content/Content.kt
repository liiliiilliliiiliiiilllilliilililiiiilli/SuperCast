// Main page - Main layer - Content

package com.example.supercast.gui.components.pages.home.mainlayer.content

import androidx.compose.foundation.layout.Box
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier

import com.example.supercast.gui.components.global.mainlayer.post.Post



@Composable
fun Content (
    posts: Array <String>,
    modifier: Modifier = Modifier
) {

    Box (
        modifier = modifier
    ) {

        posts.forEach {data ->

            Post (
//                data = data
            )

        }

    }

}