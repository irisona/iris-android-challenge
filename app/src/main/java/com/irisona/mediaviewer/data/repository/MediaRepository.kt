package com.irisona.mediaviewer.data.repository

import android.content.Context
import com.irisona.mediaviewer.data.model.MediaItem
import com.irisona.mediaviewer.data.model.MediaItems
import com.irisona.mediaviewer.util.AssetReader

class MediaRepository(
    private val context: Context,
    private val assetReader: AssetReader = AssetReader()
) : IMediaRepository {

    override fun getAllItems(): List<MediaItem> =
        assetReader.read<MediaItems>(context, FILE_NAME)?.items ?: emptyList()


    companion object {
        private const val FILE_NAME = "media_items.json"
    }
}