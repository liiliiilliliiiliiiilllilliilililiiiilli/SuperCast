// Home page - Main layer - Content

package com.example.supercast.ui.pages.home.layers.main.components.content

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import kotlin.Array
import kotlin.String

import com.example.supercast.lib.pics.Pics

import com.example.supercast.ui.components.spaces.Height

import com.example.supercast.ui.components.post.Post

import com.example.supercast.ui.components.post._types_.Post



private val postData_1 = Post (
    infoBar = Post.InfoBar (
        right = "27.03.2020"
    ),
    mainBlock = Post.MainBlock (
        topBar = Post.MainBlock.TopBar (
            pic = Pics.__image_8__,
            name = "Sydney Sweeny",
            tie = "апдейты",
            stars = 629
        ),
        contextPlot = Post.MainBlock.ContextPlot (
            orationData = arrayOf ("Па́вел Вале́рьевич Ду́ров — российский предприниматель в  сфере информационных технологий, основатель социальной сети «ВКонтакте» и кроссплатформенного мессенджера Telegram."),
            attachmentData = arrayOf ("Citate", ""),
            isAttachmentOpenedState = true,
            textPublicationFromWho = "",
            picsMedia = arrayOf (Pics.__image_1__)
        ),
        audioPlot = Post.MainBlock.AudioPlot (
            data = arrayOf ("Podcast", "")
        ),
        isPostInner = false
    ),
    segueBar = Post.SegueBar (
        comments = 27,
        citates = 0
    )
)

private val postData_2 = Post (
    infoBar = Post.InfoBar (
        left = "Редактировано",
        right = "Только что"
    ),
    mainBlock = Post.MainBlock (
        topBar = Post.MainBlock.TopBar (
            pic = Pics.__image_9__,
            name = "Джастин Ройланд",
            tie = "основное",
            stars = 12505
        ),
        contextPlot = Post.MainBlock.ContextPlot (
            orationData = arrayOf ("В отличие от дирижаблей, воздушные шары не имеют двигателей для самостоятельного горизонтального движения в воздухе. В зависимости от наполнения различают монгольфьеры (шары, наполненные нагретым воздухом), шарльеры (наполнены лёгким газом, как правило, водородом или гелием) и розьеры (воздушные суда, использующие одновременно газ и воздух, размещённые в отдельных оболочках). "),
            attachmentData = arrayOf ("Media", ""),
            isAttachmentOpenedState = true,
            textPublicationFromWho = "",
            picsMedia = arrayOf (Pics.__image_4__, Pics.__image_2__, Pics.__image_5__, Pics.__image_9__, Pics.__image_8__)
        ),
        audioPlot = Post.MainBlock.AudioPlot (
            data = arrayOf ("Voice", "")
        ),
        isPostInner = false
    ),
    segueBar = Post.SegueBar (
        comments = 5288,
        citates = 47
    )
)



@Composable
fun Content (
    posts: Array <String>,
    modifier: Modifier = Modifier
) {

    Column (
        modifier = Modifier
            .fillMaxWidth ()
            .then (modifier)
    ) {

//        posts.forEach {data ->

        Post (
            data = postData_1
        )

        Height (12)

        Post (
            data = postData_2
        )

        Height (12)

//        }

    }

}