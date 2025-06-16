// Home page - Main layer - Ties provider - Strick

package com.example.supercast.gui.components.pages.home.mainlayer.tiesprovider.strick

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.Font
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.supercast.R
import com.example.supercast.ui.colors.Colors

import com.example.supercast.gui.components.distinctive.spaces.Height
import com.example.supercast.gui.components.distinctive.spaces.Width
import com.example.supercast.gui.components.global.mainlayer.actiontext.ActionText
import com.example.supercast.gui.components.global.mainlayer.descriptionbutton.DescriptionButton
import com.example.supercast.gui.components.global.mainlayer.actionsbutton.ActionsButton



private val fontListenersCounter = FontFamily (Font (R.font.archivo_regular))
private val colorListenersCounter = Colors.Grey

private const val isDescriptionOpened_defaultState = false
private const val textListeners = "слушателей"

private val colorStrickBack = Colors.BarBorder
private val colorStrickCorner = Colors.TieBarBackground



@Composable
fun Strick () {

    val listenersNum = 505

    val (isOpened, setIsOpened) = remember {mutableStateOf (isDescriptionOpened_defaultState)}

    val onActionsButtonPress = {}

    val descriptionText = "В этом разделе я рассказываю про новости каждого дня. Кто-то что-то изобрел? У кого-то взорвался телефон? Я обязательно расскажу!\n\nЗдесь подкасты выхоят каждый день. а Брюхановой в 2021. Хочу сделать Россию лучше и избраться мэром Москвы когда-нибудь :)"


    Row (
        verticalAlignment = Alignment.CenterVertically,
        modifier = Modifier
            .height (60.dp)
            .fillMaxWidth ()
            .background (color = colorStrickBack)
            .padding (vertical = 2.dp)
            .background (color = colorStrickCorner)
    ) {

        ListenersCounter (
            listenersNum = listenersNum,
            modifier = Modifier.weight (1f)
        )

        Width (
            13.dp
        )

        DescriptionButton (
            isOpened = isOpened,
            setIsOpened = setIsOpened
        )

        Width (
             28.5.dp
        )

        ActionsButton (
            onPress = onActionsButtonPress
        )

        Width (
            28.5.dp
        )

    }

    if (isOpened) {

        Width (
            5.dp
        )

        Description (
            text = descriptionText
        )

    }

}



@Composable
private fun ListenersCounter (
    listenersNum: Int,
    modifier: Modifier = Modifier
) {

    val text = "$listenersNum $textListeners"


    Text (
        text = text,
        fontSize = 15.sp,
        fontFamily = fontListenersCounter,
        color = colorListenersCounter,
        modifier = Modifier
            .padding (start = 48.dp)
            .then (modifier)
    )

}



@Composable
private fun Description (
    text: String
) {

    val editButtonPress = {}


    @Composable
    fun EditButton (
        onPress: () -> Unit
    ) {

        ActionText (
            isReversed = true,
            text = "Редактировать",
            picture = painterResource (R.drawable.edit_ordinary_light),
            onPress = onPress,
            contentAlignment = Alignment.CenterEnd,
            modifier = Modifier
                .fillMaxWidth ()
                .padding (end = 24.dp, bottom = 15.dp)
        )

    }


    @Composable
    fun Main (
        text: String
    ) {

        Text (
            text = text,
            fontSize = 15.5.sp,
            fontFamily = FontFamily (Font (R.font.arimo_regular)),
            color = Colors.Text,
            modifier = Modifier
                .padding (horizontal = 8.dp)
                .clip (RoundedCornerShape (12.dp))
                .background (Colors.Blocks)
                .padding (bottom = 12.dp, top = 15.dp, end = 25.dp, start = 25.dp)
        )

    }


    Height (
        21.dp
    )

    EditButton (
        onPress = {editButtonPress ()}
    )

    Main (
        text = text
    )

}