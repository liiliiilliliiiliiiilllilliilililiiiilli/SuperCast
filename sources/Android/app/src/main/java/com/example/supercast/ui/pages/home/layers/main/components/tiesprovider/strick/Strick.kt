// Home page - Main layer - Ties provider - Strick

package com.example.supercast.ui.pages.home.layers.main.components.tiesprovider.strick

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.ui.Alignment
import androidx.compose.ui.draw.clip
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp

import com.example.supercast.lib.colors.Colors
import com.example.supercast.lib.fonts.Fonts
import com.example.supercast.lib.pics.Pics

import com.example.supercast.ui.components.spaces.Height
import com.example.supercast.ui.components.spaces.Width

import com.example.supercast.ui.components.actiontext.ActionText
import com.example.supercast.ui.components.descriptionbutton.DescriptionButton
import com.example.supercast.ui.components.actionsbutton.ActionsButton



private const val isDescriptionOpened_defaultState = false

private val colorAudience = Colors.Grey
private val colorStrickBack = Colors.BarBorder
private val colorStrickCorner = Colors.TieBarBackground
private val colorTextDescription = Colors.Text

private val fontDescription = Fonts.ArimoRegular
private val fontAudience = Fonts.ArchivoSemiBold

private val picPen = Pics.PenOrdinaryGreyLight

private const val textDescriptioAction = "Редактировать"
private const val textDescription = "В этом разделе я рассказываю про новости каждого дня. Кто-то что-то изобрел? У кого-то взорвался телефон? Я обязательно расскажу!\n\nЗдесь подкасты выхоят каждый день. а Брюхановой в 2021. Хочу сделать Россию лучше и избраться мэром Москвы когда-нибудь :)"
private const val textListeners = "слушателей"



@Composable
fun Strick () {

    val audience = 505

    val (isOpened, setIsOpened) = remember {mutableStateOf (isDescriptionOpened_defaultState)}

    val onActionsButtonPress = {}

    val descriptionText = textDescription


    Row (
        verticalAlignment = Alignment.CenterVertically,
        modifier = Modifier
            .height (60.dp)
            .fillMaxWidth ()
            .background (colorStrickBack)
            .padding (vertical = 2.dp)
            .background (colorStrickCorner)
    ) {

        Audience (
            num = audience,
            modifier = Modifier.weight (1f)
        )

        Width (13)

        DescriptionButton (
            isOpened = isOpened,
            setIsOpened = setIsOpened
        )

        Width (28.5)

        ActionsButton (
            onPress = onActionsButtonPress
        )

        Width (28.5)

    }

    if (isOpened) {

        Width (5)

        Description (
            text = descriptionText
        )

    }

}



@Composable
private fun Audience (
    num: Int,
    modifier: Modifier = Modifier
) {

    val text = "$num $textListeners"


    Text (
        text = text,
        fontSize = 15.sp,
        color = colorAudience,
        fontFamily = fontAudience,
        modifier = Modifier
            .padding (start = 48.dp)
            .then (modifier)
    )

}



@Composable
private fun Description (
    text: String
) {

    @Composable
    fun EditButton (
        onPress: () -> Unit
    ) {

        Box (
            contentAlignment = Alignment.CenterEnd,
            modifier = Modifier
                .fillMaxWidth ()
                .padding (end = 24.dp, bottom = 15.dp)
        ) {

            ActionText (
                text = textDescriptioAction,
                pic = picPen,
                isReversed = true,
                onPress = onPress
            )

        }

    }


    @Composable
    fun Main (
        text: String
    ) {

        Text (
            text = text,
            fontSize = 15.5.sp,
            color = colorTextDescription,
            fontFamily = fontDescription,
            modifier = Modifier
                .padding (horizontal = 8.dp)
                .clip (RoundedCornerShape (12.dp))
                .background (Colors.Blocks)
                .padding (bottom = 12.dp, top = 15.dp, end = 25.dp, start = 25.dp)
        )

    }


    Height (21)

    EditButton (
        onPress = {}
    )

    Main (
        text = text
    )

}