package com.irisona.mediaviewer

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Scaffold
import androidx.compose.ui.Modifier
import com.irisona.mediaviewer.presentation.MediaItemsScreen
import com.irisona.mediaviewer.ui.theme.IrisMediaViewerTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            IrisMediaViewerTheme {
                Scaffold(modifier = Modifier.fillMaxSize()) { innerPadding ->
                    MediaItemsScreen(
                        items = emptyList(),
                        modifier = Modifier.padding(innerPadding)
                    )
                }
            }
        }
    }
}