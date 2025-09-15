// Settings page - Player page - Types

package com.example.supercast.ui.pages.settingsplayer._types_



class Segue (

	val title: String = "",
	val switcher: Switcher? = null,
	val scrollChooseList: ScrollChooseList? = null,
	val isDivider: Boolean? = false

) {

	class Switcher (

		var state: Boolean,
		val onPress: () -> Unit,

		)

	class ScrollChooseList (

		val chooses: Array <ScrollChooseListVariant>,
		val onChoose: () -> Unit

	) {

		class ScrollChooseListVariant (

			val text: String,
			val isChosen: Boolean

		)

	}

}