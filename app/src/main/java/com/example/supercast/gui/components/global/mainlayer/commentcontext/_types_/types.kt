// Global components - MainLayer - Comment context - Types

package com.example.supercast.gui.components.global.mainlayer.commentcontext._types_



class Comment (

	val authorAva: Int,
	val authorName: String,
	val publicationDate: Int,
	val blab: Blab? = null,
	val voice: Voice? = null,
	val commentsNum: Int,
	val citatesNum: Int,
	val starsNum: Int

) {

	class Blab (

		val text: String

	)

	class Voice (

		val audio: String,
		val transcription: String,
		val duration: Int,
		val listensNum: Int

	)

}