// Settings subscriptions folders page - _types_

package com.example.supercast.gui.components.pages.settingssubsfolders._types_



class Segue (

	val title: String,
	val description: String? = null,
	val switcher: Switcher? = null,
	val scrollChooseList: ScrollChooseList? = null

)



class Switcher (

	var state: Boolean,
	val onPress: () -> Unit,

)



class ScrollChooseList (

	val chooses: Array <ScrollChooseListVariant>,
	val onChoose: () -> Unit

)



class ScrollChooseListVariant (

	val text: String,
	val isChosen: Boolean

)