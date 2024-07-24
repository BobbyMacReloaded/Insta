package com.example.instagramfeed

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import com.example.instagramfeed.main_field_screen.InstagramFeed
import com.example.instagramfeed.ui.theme.InstagramFeedTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            InstagramFeedTheme {
InstagramFeed()
            }
        }
    }
}

