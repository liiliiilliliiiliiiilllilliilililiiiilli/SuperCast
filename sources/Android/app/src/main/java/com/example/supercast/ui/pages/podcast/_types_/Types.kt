// Podcast page - Types

package com.example.supercast.ui.pages.podcast._types_

import com.example.supercast.ui.components.comment._types_.Comment
import com.example.supercast.ui.components.post._types_.Post



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

		class Preview (

			val bubbles: Array <Bubble>

		) {

			class Bubble (

				val speaker: String,
				val speakerRole: String,
				val speech: String

			)

		}

		class Track (

			val duration: Int,
			val current: Int

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
			val audience: Int,
			val isSubscribed: Boolean

		)

		class Chatters (

			val num: Int,
			val avas: Array <Int>

		)

		class Stats (

			val stars: Int,
			val listens: Int

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