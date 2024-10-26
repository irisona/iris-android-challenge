package com.irisona.mediaviewer.data.repository

import com.irisona.mediaviewer.data.model.MediaItem

interface IMediaRepository {

    fun getAllItems(): List<MediaItem>
}