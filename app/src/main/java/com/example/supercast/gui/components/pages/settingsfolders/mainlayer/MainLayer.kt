// Settings page - Subscriptions folders page - Main layer

package com.example.supercast.gui.components.pages.settingsfolders.mainlayer

import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.statusBarsPadding
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.verticalScroll
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp

import com.example.supercast.gui.components.distinctive.spaces.Height
import com.example.supercast.gui.components.pages.settingsfolders.mainlayer.faqcomment.FaqComment
import com.example.supercast.gui.components.pages.settingsfolders.mainlayer.foldersseguelist.FoldersSegueList

import com.example.supercast.gui.components.pages.settingsfolders._types_.FolderSegue



private const val textFaqComment = "Папки подписок - отдельные настраиваемые ленты на главной странице.\n\nСоздайте папки по интересам, группируя разделы авторов, на которых подписаны."



@Composable
fun MainLayer () {

    Box (
        modifier = Modifier.fillMaxSize ()
    ) {

        Column (
            modifier = Modifier
                .verticalScroll (rememberScrollState ())
                .statusBarsPadding ()
                .padding (vertical = 65.5.dp)
                .fillMaxWidth ()
        ) {

            Height (11/2)

            Height (14)

            FaqComment (
                text = textFaqComment
            )

            Height (14)

            FoldersSegueList (
                folders = arrayOf (
                    FolderSegue (
                        title = "Интересы",
                        subsNum = 5
                    ),
                    FolderSegue (
                        title = "Для прогулок",
                        subsNum = 23
                    ),
                    FolderSegue (
                        title = "Космос",
                        subsNum = 5
                    ),
                    FolderSegue (
                        title = "Джем",
                        subsNum = 15
                    ),
                    FolderSegue (
                        title = "Путешествия",
                        subsNum = 8
                    ),
                    FolderSegue (
                        title = "Остальное",
                        subsNum = 51
                    ),
                    FolderSegue (
                        title = "Подписки",
                        subsNum = 156
                    )
                )
            )

            Height (11/2)

        }

    }

}