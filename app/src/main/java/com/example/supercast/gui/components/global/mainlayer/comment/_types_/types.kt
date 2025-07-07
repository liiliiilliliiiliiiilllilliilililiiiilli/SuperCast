// Global components - Main layer - Comment - Types

package com.example.supercast.gui.components.global.mainlayer.comment._types_



class Comment (

	val ava: Int,
	val name: String,
	val date: Int,
	val blab: Blab? = null,
	val voice: Voice? = null,
	val comments: Int,
	val citates: Int,
	val stars: Int

) {

	class Blab (

		val text: String

	)

	class Voice (

		val audio: String,
		val transcription: String,
		val duration: Int,
		val listens: Int

	)

}