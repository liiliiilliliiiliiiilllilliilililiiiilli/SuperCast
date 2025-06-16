// Main page - Main layer - FaceBlock

package com.example.supercast.gui.components.pages.home.mainlayer.tiesprovider

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.runtime.Composable
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp

import com.example.supercast.gui.components.distinctive.Height
import com.example.supercast.gui.components.pages.home.mainlayer.tiesprovider.components.Settings
import com.example.supercast.gui.components.pages.home.mainlayer.tiesprovider.components.Blobs
import com.example.supercast.gui.components.pages.home.mainlayer.tiesprovider.components.Strick



@Composable
fun TiesProvider (
    modifier: Modifier = Modifier
) {

    val tiesList = arrayOf ("Все", "Изобретения", "Экстренное", "Происшествия", "Остальное")

    val (chosenTie, setChosenTie) = remember {mutableStateOf ("Изобретения")}


    Column (
        modifier = Modifier
            .fillMaxWidth ()
            .then (modifier)
    ) {

        Settings ()

        Height (
            5.dp
        )

        Blobs (
            tiesList = tiesList,
            chosenTie = chosenTie,
            setChosenTie = setChosenTie
        )

        Height (
            5.dp
        )

        Strick ()

    }

}