package com.irisona.mediaviewer.data.model

import com.irisona.mediaviewer.util.LocalDateTimeSerializer
import kotlinx.serialization.Serializable
import org.threeten.bp.LocalDateTime

@Serializable
data class MediaItems(
    val items: List<MediaItem>
)

@Serializable
data class MediaItem(
    val title: String,
    val thumbnail: String,
    val videos: List<VideoItem>
)

@Serializable
data class VideoItem(
    val url: String,
    @Serializable(with = LocalDateTimeSerializer::class)
    val date: LocalDateTime
)