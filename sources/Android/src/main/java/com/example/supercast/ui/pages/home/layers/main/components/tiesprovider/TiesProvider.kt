// Home page - Main layer - Ties provider

package com.example.supercast.ui.pages.home.layers.main.components.tiesprovider

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.runtime.Composable
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.ui.Modifier

import com.example.supercast.ui.components.common.spaces.Height

import com.example.supercast.ui.pages.home.layers.main.components.tiesprovider.settings.Settings
import com.example.supercast.ui.pages.home.layers.main.components.tiesprovider.blobs.Blobs
import com.example.supercast.ui.pages.home.layers.main.components.tiesprovider.strick.Strick


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

        Settings()

        Height (5)

        Blobs(
            tiesList = tiesList,
            chosenTie = chosenTie,
            setChosenTie = setChosenTie
        )

        Height (5)

        Strick()

    }

}