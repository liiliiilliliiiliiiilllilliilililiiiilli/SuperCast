// Podcast page - Types

package com.example.supercast.gui.components.pages.podcast._types_

import com.example.supercast.gui.components.global.mainlayer.comment._types_.Comment
import com.example.supercast.gui.components.global.mainlayer.post._types_.Post



class Player (

	val content: Content,
	val credits: Credits

) {

	class Content (

		val ditle: Ditle,
		val preview: Preview,
		val track: Track

	) {

		class Ditle (

			val title: String,
			val stage: String

		)

		class Track (

			val totalDuration: Int,
			val currentPosition: Int

		)

		class Preview (

			val data: Array <Bubble>

		)

		class Bubble (

			val speaker: String,
			val speakerRole: String,
			val speech: String

		)

	}

	class Credits (

		val creator: Creator,
		val chatters: Chatters,
		val stats: Stats,
		val description: Description

	) {

		class Creator (

			val ava: Int,
			val tie: String,
			val name: String,
			val listeners: Int,
			val isSubscribed: Boolean

		)

		class Chatters (

			val num: Int,
			val avas: Array <Int>

		)

		class Stats (

			val stars: Int,
			val listenes: Int

		)

		class Description (

			val text: String

		)

	}

}



class Reactions (

	val whichOpened: String,
	val comments: (Array <Comment>)? = null,
	val citates: (Array <Post>)? = null

)