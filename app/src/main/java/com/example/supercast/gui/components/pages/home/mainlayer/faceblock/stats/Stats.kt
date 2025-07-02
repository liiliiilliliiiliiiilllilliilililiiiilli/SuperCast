// Home page - Main layer - Face block - Stats

package com.example.supercast.gui.components.pages.home.mainlayer.faceblock.stats

import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp

import com.example.supercast.ui.colors.Colors
import com.example.supercast.ui.fonts.Fonts

import com.example.supercast.gui.components.distinctive.spaces.Width



private val colorStats = Colors.PreWhite

private val fontStatNum = Fonts.GadugiBold
private val fontStatOf = Fonts.ArchivoRegular

private const val textNum_1 = "2.1k"
private const val textOf_1 = "слушателей"
private const val textNum_2 = "83"
private const val textOf_2 = "слушает"



@Composable
fun Stats () {

    Row (
        verticalAlignment = Alignment.CenterVertically,
        horizontalArrangement = Arrangement.Center,
        modifier = Modifier
            .fillMaxSize ()
            .padding (end = 8.dp)
            .padding (top = 6.dp, end = 2.5.dp)
    ) {

        Stat (
            num = textNum_1,
            of = textOf_1,
            onPress = {}
        )

        Width (25)

        Stat (
            num = textNum_2,
            of = textOf_2,
            onPress = {}
        )

    }

}



@Composable
private fun Stat (
    num: String,
    of: String,
    onPress: () -> Unit
) {

    Column (
        verticalArrangement = Arrangement.Center,
        horizontalAlignment = Alignment.CenterHorizontally,
        modifier = Modifier.clickable (onClick = onPress)
    ) {

        Text (
            text = num,
            fontSize = 25.sp,
            color = colorStats,
            fontFamily = fontStatNum
        )

        Text (
            text = of,
            fontSize = 15.sp,
            color = colorStats,
            fontFamily = fontStatOf
        )

    }

}