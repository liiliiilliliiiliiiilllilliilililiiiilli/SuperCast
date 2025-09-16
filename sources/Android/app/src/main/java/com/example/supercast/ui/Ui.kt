// User interface!

package com.example.supercast.ui

import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.runtime.Composable

import com.example.supercast.ui.components.uibackground.UiBackground

import com.example.supercast.ui.pages.collections.Collections as CollectionsPage
import com.example.supercast.ui.pages.main.Main as MainPage
import com.example.supercast.ui.pages.home.Home as HomePage
import com.example.supercast.ui.pages.otheruser.OtherUser as OtherUserPage
import com.example.supercast.ui.pages.subscribers.Subscribers as SubscribersPage
import com.example.supercast.ui.pages.subscriptions.Subscriptions as SubscriptionsPage
import com.example.supercast.ui.pages.collectionsmyhistory.CollectionsMyHistory as MyHistoryPage
import com.example.supercast.ui.pages.collectionsmyplaylists.CollectionsMyPlaylists as MyPlaylistsPage
import com.example.supercast.ui.pages.collectionsmycomments.CollectionsMyComments as MyCommentsPage
import com.example.supercast.ui.pages.settings.Settings as SettingsPage
import com.example.supercast.ui.pages.settingsaccount.SettingsAccount as SettingsAccountPage
import com.example.supercast.ui.pages.settingsappearance.SettingsAppearance as SettingsAppearancePage
import com.example.supercast.ui.pages.settingsnotifications.SettingsNotifications as SettingsNotificationsPage
import com.example.supercast.ui.pages.settingsabout.SettingsAbout as SettingsAboutPage
import com.example.supercast.ui.pages.settingsfolders.SettingsFolders as SettingsFoldersPage
import com.example.supercast.ui.pages.settingsfoldersfolder.SettingsFoldersFolder as SettingsFoldersFolderPage
import com.example.supercast.ui.pages.settingsrecssystem.SettingsRecsSystem as SettingsRecsSystemPage
import com.example.supercast.ui.pages.settingsplayer.SettingsPlayer as SettingsPlayerPage
import com.example.supercast.ui.pages.settingsdownload.SettingsDownload as SettingsDownloadPage
import com.example.supercast.ui.pages.publication.Publication as PublicationPage
import com.example.supercast.ui.pages.comment.Comment as CommentPage
import com.example.supercast.ui.pages.playlist.Playlist as PlaylistPage
import com.example.supercast.ui.pages.playqueue.PlayQueue as PlayQueuePage
import com.example.supercast.ui.pages.podcast.Podcast as PodcastPage



@Preview (
    showSystemUi = true,
    showBackground = true
)
@Composable
fun Ui () {

    UiBackground {

        CollectionsPage ()
        MainPage ()
        HomePage ()
        OtherUserPage ()
        SubscribersPage ()
        SubscriptionsPage ()
        MyHistoryPage ()
        MyPlaylistsPage ()
        MyCommentsPage ()
        SettingsPage ()
        SettingsAccountPage ()
        SettingsAppearancePage ()
        SettingsNotificationsPage ()
        SettingsAboutPage ()
        SettingsFoldersPage ()
        SettingsFoldersFolderPage ()
        SettingsRecsSystemPage ()
        SettingsPlayerPage ()
        SettingsDownloadPage ()
        PublicationPage ()
        CommentPage ()
        PlaylistPage ()
        PlayQueuePage ()
        PodcastPage ()

    }

}