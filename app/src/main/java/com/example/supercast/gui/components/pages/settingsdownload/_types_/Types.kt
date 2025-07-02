// Settings page - Download page - _types_

package com.example.supercast.gui.components.pages.settingsdownload._types_



class Segue (

	val title: String = "",
	val onPress: (() -> Unit)? = {},

	val description: String? = null,
	val rightPic: Int? = null,

	val editText: EditText? = null,
	val switcher: Switcher? = null,
	val scrollChooseList: ScrollChooseList? = null,

	val isDivider: Boolean = false

)



class EditText (

	var text: String,
	val pic: Int

)



class Switcher (

	var state: Boolean

)



class ScrollChooseList (

	val chooses: Array <ScrollChooseListVariant>,
	val onChoose: () -> Unit

)



class ScrollChooseListVariant (

	val text: String,
	val isChosen: Boolean

)