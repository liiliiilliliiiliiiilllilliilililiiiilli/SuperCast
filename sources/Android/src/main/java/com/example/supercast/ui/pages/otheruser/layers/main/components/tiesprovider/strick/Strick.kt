// Other user page - Main layer - Ties provider - Strick

package com.example.supercast.ui.components.pages.otheruser.mainlayer.tiesprovider.strick

import androidx.compose.foundation.background
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.offset
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.ui.Alignment
import androidx.compose.ui.draw.clip
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp

import com.example.supercast.lib.colors.Colors
import com.example.supercast.lib.fonts.Fonts
import com.example.supercast.lib.pics.Pics

import com.example.supercast.ui.components.common.spaces.Height
import com.example.supercast.ui.components.common.spaces.Width

import com.example.supercast.ui.components.layers.mainlayer.descriptionbutton.DescriptionButton



private const val isDescriptionOpened_defaultState = false

private val colorAudience = Colors.Grey
private val colorStrickBack = Colors.BarBorder
private val colorStrickCorner = Colors.TieBarBackground
private val colorTextDescription = Colors.Text

private val fontDescription = Fonts.ArimoRegular
private val fontAudience = Fonts.ArchivoSemiBold

private val picCheck = Pics.CheckLight

private const val textPicCheckDescription = "[check pic]"

private const val textDescriptioAction = "Редактировать"
private const val textSubscribe = "Подписаться"
private const val textSubscribed = "Подписано"
private const val textListeners = "слушателей"

private const val textDescription = "В этом разделе я рассказываю про новости каждого дня. Кто-то что-то изобрел? У кого-то взорвался телефон? Я обязательно расскажу!\n\nЗдесь подкасты выхоят каждый день. а Брюхановой в 2021. Хочу сделать Россию лучше и избраться мэром Москвы когда-нибудь :)"



@Composable
fun Strick () {

    val audience = 9

    val (isOpened, setIsOpened) = remember {mutableStateOf (isDescriptionOpened_defaultState)}

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

        Width (23)

        SubscriptionButton ()

        Width (23)

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

    }

    if (isOpened) {

        Width (5)

        Description (
            text = descriptionText
        )

    }

}



@Composable
private fun SubscriptionButton () {

    val text = textSubscribed


    Row (
        verticalAlignment = Alignment.CenterVertically,
        horizontalArrangement = Arrangement.Center,
        modifier = Modifier
            .clip (RoundedCornerShape (50))
            .background (Colors.Button)
            .padding (vertical = 1.5.dp)

            .clip (RoundedCornerShape (47.5f))
            .background (Colors.Button)
            .padding (top = 6.dp, start = 15.dp, end = 15.dp, bottom = 6.dp)
    ) {

        Text (
            text = text,
            fontSize = 14.sp,
            color = Colors.PreWhite,
            fontFamily = Fonts.ArchivoExtraBold
        )

        Width (8)

        Image (
            painter = painterResource (picCheck),
            contentDescription = textPicCheckDescription,
            modifier = Modifier
                .size (8.dp)
                .offset (y = 0.75.dp)
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
        modifier = modifier
    )

}



@Composable
private fun Description (
    text: String
) {

    Height (21)

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