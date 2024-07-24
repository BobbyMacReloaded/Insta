package com.example.instagramfeed.model

import androidx.compose.ui.graphics.painter.Painter

data class User(
    val userName:String ,
    val profilePic:Painter,
    val postPic:Painter,
    val location:String,
    val caption:String,
    val likeCount:Int,
    val commentCount:Int
)
