package com.irisona.mediaviewer.util

import android.content.Context
import android.util.Log
import kotlinx.serialization.json.Json
import java.io.BufferedReader
import java.io.InputStreamReader

class AssetReader {

    inline fun <reified T> read(context: Context, path: String): T? =
        try {
            val file = context.assets.open(path)
            val bufferedReader = BufferedReader(InputStreamReader(file))
            val stringBuilder = StringBuilder()
            bufferedReader.useLines { lines ->
                lines.forEach {
                    stringBuilder.append(it)
                }
            }
            Json.decodeFromString<T>(stringBuilder.toString())
        } catch (e: Exception) {
            Log.e(this::class.simpleName, e.message, e)
            null
        }
}