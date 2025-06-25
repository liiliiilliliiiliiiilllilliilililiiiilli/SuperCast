// Graphical interface!

package com.example.supercast.gui

import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.runtime.Composable

import com.example.supercast.gui.components.distinctive.guibackground.GuiBackground
import com.example.supercast.gui.pages.collections.Collections as CollectionsPage
import com.example.supercast.gui.pages.main.Main as MainPage
import com.example.supercast.gui.pages.home.Home as HomePage
import com.example.supercast.gui.pages.otheruser.OtherUser as OtherUserPage
import com.example.supercast.gui.pages.subscribers.Subscribers as SubscribersPage
import com.example.supercast.gui.pages.subscriptions.Subscriptions as SubscriptionsPage
import com.example.supercast.gui.pages.settings.Settings as SettingsPage
import com.example.supercast.gui.pages.myhistory.MyHistory as MyHistoryPage
import com.example.supercast.gui.pages.myplaylists.MyPlaylists as MyPlaylistsPage
import com.example.supercast.gui.pages.mycomments.MyComments as MyCommentsPage



@Preview (
    showSystemUi = true,
    showBackground = true
)
@Composable
fun Gui () {

    GuiBackground {

        CollectionsPage ()
//        MainPage ()
//        HomePage ()

//        OtherUserPage ()

//        SubscribersPage ()
//        SubscriptionsPage ()

//        SettingsPage ()

//        MyHistoryPage ()
//        MyPlaylistsPage ()
//        MyCommentsPage ()

    }

}