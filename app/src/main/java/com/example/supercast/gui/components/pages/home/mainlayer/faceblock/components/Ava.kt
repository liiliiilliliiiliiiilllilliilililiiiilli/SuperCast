package com.example.supercast.gui.components.pages.home.mainlayer.faceblock.components

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.unit.dp
import com.example.supercast.R
import com.example.supercast.ui.Colors



private val picAvaSample = R.drawable.samples_ava_1

private val colorCornerOut = Colors.AvaCircle
private val colorCornerMediate = Colors.Blocks
private val colorCornerIn = Colors.Black

private const val picDescription = "[ava image]"



@Composable
fun Ava () {

    Image (
        painter = painterResource (picAvaSample),
        contentDescription = picDescription,
        modifier = Modifier
            .padding (start = 17.dp)

            .clip (RoundedCornerShape (100))
            .background (color = colorCornerOut)
            .padding (3.dp)

            .clip (RoundedCornerShape (100))
            .background (color = colorCornerMediate)
            .padding (3.dp)

            .clip (RoundedCornerShape (100))
            .background (color = colorCornerIn)
            .padding (3.dp)

            .clip (RoundedCornerShape (100))
            .width (124.dp)
            .height (124.dp)
    )

}