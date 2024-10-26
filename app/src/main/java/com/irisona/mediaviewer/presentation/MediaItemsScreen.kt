package com.irisona.mediaviewer.presentation

import androidx.compose.foundation.layout.Column
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import com.irisona.mediaviewer.data.model.MediaItem

@Composable
fun MediaItemsScreen(modifier: Modifier, items: List<MediaItem>) {
    Column(modifier) {
        Text("You currently have ${items.size} media items!")
    }
}