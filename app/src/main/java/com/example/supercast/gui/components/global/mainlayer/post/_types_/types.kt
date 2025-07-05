// Global components - Main layer - Post - Types

package com.example.supercast.gui.components.global.mainlayer.post._types_



class Post (

	val infoBar: InfoBar,
	val mainBlock: MainBlock,
	val segueBar: SegueBar

) {

	class InfoBar (

		val left: String? = null,
		val right: String? = null

	)

	class MainBlock (

		val topBar: TopBar,
		val contextPlot: ContextPlot,
		val audioPlot: AudioPlot,
		val isPostInner: Boolean

	) {

		class TopBar (

			val pic: Int,
			val textDitleName: String,
			val textDitleTie: String,
			val numStars: Int

		)

		class ContextPlot (

			val orationData: Array <String>,
			val attachmentData: Array <String>,
			val isAttachmentOpenedState: Boolean,
			val textPublicationFromWho: String,
			val picsMedia: Array <Int>

		)

		class AudioPlot (

			val data: Array <String>

		)

	}

	class SegueBar (

		val comments: Int,
		val citates: Int

	)

}