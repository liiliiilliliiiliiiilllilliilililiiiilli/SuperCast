// Main page - Main layer - Content

package com.example.supercast.gui.components.pages.otheruser.mainlayer.content

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import kotlin.String
import com.example.supercast.ui.pics.Pics

import com.example.supercast.gui.components.distinctive.spaces.Height
import com.example.supercast.gui.components.global.mainlayer.post.Post



private const val Post_1_InfoBar_left = ""
private const val Post_1_InfoBar_right = "27.03.2020"
private val Post_1_MainBlock_Top_picAva = Pics.SamplesAva_8
private const val Post_1_MainBlock_Top_textDitleName = "Sydney Sweeny"
private const val Post_1_MainBlock_Top_textDitleTie = "апдейты"
private const val Post_1_MainBlock_Top_numStars = 629
private val Post_1_MainBlock_ContextPlot_orationData = arrayOf (
    "Па́вел Вале́рьевич Ду́ров — российский предприниматель в  сфере информационных технологий, основатель социальной сети «ВКонтакте» и кроссплатформенного мессенджера Telegram."
)
private val Post_1_MainBlock_ContextPlot_attachmentData = arrayOf (
    "Citate",
    ""
)
private const val Post_1_MainBlock_ContextPlot_textPublicationFromWho = ""
private val Post_1_MainBlock_ContextPlot_picsMedia = arrayOf (
    Pics.SamplesAva_1
)
private const val Post_1_MainBlock_ContextPlot_isAttachmentOpened = true
private val Post_1_MainBlock_AudioPlot_data = arrayOf (
    "Podcast",
    ""
)
private const val Post_1_SegueBar_comments = 27
private const val Post_1_SegueBar_citates = 0



private const val Post_2_InfoBar_left = "Редактировано"
private const val Post_2_InfoBar_right = "Только что"
private val Post_2_MainBlock_Top_picAva = Pics.SamplesAva_9
private const val Post_2_MainBlock_Top_textDitleName = "Джастин Ройланд"
private const val Post_2_MainBlock_Top_textDitleTie = "основное"
private const val Post_2_MainBlock_Top_numStars = 12505
private val Post_2_MainBlock_ContextPlot_orationData = arrayOf (
    "В отличие от дирижаблей, воздушные шары не имеют двигателей для самостоятельного горизонтального движения в воздухе. В зависимости от наполнения различают монгольфьеры (шары, наполненные нагретым воздухом), шарльеры (наполнены лёгким газом, как правило, водородом или гелием) и розьеры (воздушные суда, использующие одновременно газ и воздух, размещённые в отдельных оболочках). "
)
private val Post_2_MainBlock_ContextPlot_attachmentData = arrayOf (
    "Media",
    ""
)
private const val Post_2_MainBlock_ContextPlot_textPublicationFromWho = ""
private val Post_2_MainBlock_ContextPlot_picsMedia = arrayOf (
    Pics.SamplesAva_4,
    Pics.SamplesAva_2,
    Pics.SamplesAva_5,
    Pics.SamplesAva_9,
    Pics.SamplesAva_8
)
private const val Post_2_MainBlock_ContextPlot_isAttachmentOpened = true
private val Post_2_MainBlock_AudioPlot_data = arrayOf (
    "Voice",
    ""
)
private const val Post_2_SegueBar_comments = 5288
private const val Post_2_SegueBar_citates = 47



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
            InfoBar_left = Post_2_InfoBar_left,
            InfoBar_right = Post_2_InfoBar_right,
            MainBlock_Top_picAva = Post_2_MainBlock_Top_picAva,
            MainBlock_Top_textDitleName = Post_2_MainBlock_Top_textDitleName,
            MainBlock_Top_textDitleTie = Post_2_MainBlock_Top_textDitleTie,
            MainBlock_Top_numStars = Post_2_MainBlock_Top_numStars,
            MainBlock_ContextPlot_orationData = Post_2_MainBlock_ContextPlot_orationData,
            MainBlock_ContextPlot_attachmentData = Post_2_MainBlock_ContextPlot_attachmentData,
            MainBlock_ContextPlot_isAttachmentOpened = Post_2_MainBlock_ContextPlot_isAttachmentOpened,
            MainBlock_ContextPlot_textPublicationFromWho = Post_2_MainBlock_ContextPlot_textPublicationFromWho,
            MainBlock_ContextPlot_picsMedia = Post_2_MainBlock_ContextPlot_picsMedia,
            MainBlock_AudioPlot_data = Post_2_MainBlock_AudioPlot_data,
            SegueBar_comments = Post_2_SegueBar_comments,
            SegueBar_citates = Post_2_SegueBar_citates,

            isInner = false
        )

        Height (12)

        Post (
            InfoBar_left = Post_1_InfoBar_left,
            InfoBar_right = Post_1_InfoBar_right,
            MainBlock_Top_picAva = Post_1_MainBlock_Top_picAva,
            MainBlock_Top_textDitleName = Post_1_MainBlock_Top_textDitleName,
            MainBlock_Top_textDitleTie = Post_1_MainBlock_Top_textDitleTie,
            MainBlock_Top_numStars = Post_1_MainBlock_Top_numStars,
            MainBlock_ContextPlot_orationData = Post_1_MainBlock_ContextPlot_orationData,
            MainBlock_ContextPlot_attachmentData = Post_1_MainBlock_ContextPlot_attachmentData,
            MainBlock_ContextPlot_textPublicationFromWho = Post_1_MainBlock_ContextPlot_textPublicationFromWho,
            MainBlock_ContextPlot_picsMedia = Post_1_MainBlock_ContextPlot_picsMedia,
            MainBlock_ContextPlot_isAttachmentOpened = Post_1_MainBlock_ContextPlot_isAttachmentOpened,
            MainBlock_AudioPlot_data = Post_1_MainBlock_AudioPlot_data,
            SegueBar_comments = Post_1_SegueBar_comments,
            SegueBar_citates = Post_1_SegueBar_citates,

            isInner = false
        )

        Height (12)

//        }

    }

}