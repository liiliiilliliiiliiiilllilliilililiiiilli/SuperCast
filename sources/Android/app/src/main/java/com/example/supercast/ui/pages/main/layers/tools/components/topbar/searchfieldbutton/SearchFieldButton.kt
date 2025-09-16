// Main page - Tools layer - Top bar - Search field button

package com.example.supercast.ui.pages.main.layers.tools.components.topbar.searchfieldbutton

import androidx.compose.foundation.clickable
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.size
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp

import com.example.supercast.ui.components.spaces.Width

import com.example.supercast.lib.colors.Colors
import com.example.supercast.lib.fonts.Fonts
import com.example.supercast.lib.pics.Pics



private val colorSearch = Colors.Grey

private val fontSearch = Fonts.ArchivoBold

private val picSearch = Pics.SearchGrey

private const val textPicSearchDescription = "[search pic]"

private const val textSearch = "Поиск"



@Composable
fun SearchFieldButton (
	onPress: () -> Unit
) {

	Row (
		verticalAlignment = Alignment.CenterVertically,
		modifier = Modifier
			.clickable (onClick = {onPress ()})
			.height (37.75.dp)
	) {

		Text (
			text = textSearch,
			fontSize = 17.sp,
			color = colorSearch,
			fontFamily = fontSearch
		)

		Width (2.5)

		Image (
			painter = painterResource (picSearch),
			contentDescription = textPicSearchDescription,
			modifier = Modifier
				.padding (9.5.dp)
				.size (17.dp)
		)

	}

}