// Podcast page - Types

package com.example.supercast.gui.components.pages.podcast._types_

import com.example.supercast.gui.components.global.mainlayer.commentcontext._types_.Comment
import com.example.supercast.gui.components.global.mainlayer.post._types_.Post



class Player (

	content: Content,
	credits: Credits

) {

	class Content (

		ditle: Ditle,
		track: Track,
		preview: Preview

	) {

		class Ditle (

			title: String,
			stage: String

		)

		class Track (

			totalDuration: Int,
			currentPosition: Int

		)

		class Preview (

			data: String

		)

	}

	class Credits (

		creator: Creator,
		chaatters: Chatters,
		stats: Stats,
		description: Description

	) {

		class Creator (

			ava: Int,
			tie: String,
			name: String,
			listeners: Int,
			isSubscribed: Boolean

		)

		class Chatters (

			num: Int,
			avas: Array <Int>

		)

		class Stats (

			stars: Int,
			listenes: Int

		)

		class Description (

			text: String

		)

	}

}



class Reactions (

	whichOpened: String,
	comments: Array <Comment>,
	citates: Array <Post>,

)