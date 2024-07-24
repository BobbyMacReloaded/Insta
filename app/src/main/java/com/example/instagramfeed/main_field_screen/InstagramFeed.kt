package com.example.instagramfeed.main_field_screen

import androidx.compose.foundation.border
import androidx.compose.foundation.layout.offset
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.LazyRow
import androidx.compose.foundation.lazy.items
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.material3.BottomAppBar
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.HorizontalDivider
import androidx.compose.material3.Icon
import androidx.compose.material3.IconButton
import androidx.compose.material3.NavigationBarItem
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.material3.TopAppBar
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.Font
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.instagramfeed.R
import com.example.instagramfeed.model.User

@Composable
fun InstagramFeed() {
    val user= listOf(
        User(
            location = "Canada",
            likeCount = 100,
            commentCount = 10,
            caption = "Such an adorable scene",
            postPic = painterResource(id = R.drawable.jon_snow_post) ,
            userName = "John Snow",
            profilePic = painterResource(id = R.drawable.jon_snow),
        ),
        User(
            location = "Liverpool",
        likeCount = 120,
        commentCount = 100,
        caption = "Stuck in the area",
        postPic = painterResource(id = R.drawable.arya_stark_post) ,
        userName = "Aryan Stark",
        profilePic = painterResource(id = R.drawable.arya_stark),
    ),
        User(
            location = "New York",
            likeCount = 90,
            commentCount = 101,
            caption = "Check out my new post",
            postPic = painterResource(id = R.drawable.bran_stark_post) ,
            userName = "Bryan Stark",
            profilePic = painterResource(id = R.drawable.bran_stark),
        ),
        User(
            location = "Atlanta",
            likeCount = 100,
            commentCount = 10,
            caption = "Check out this Pick",
            postPic = painterResource(id = R.drawable.daenerys_targaryen_post) ,
            userName = "targaryen",
            profilePic = painterResource(id = R.drawable.daenerys_targaryen),
        ),
        User(
            location = "Manchester",
            likeCount = 100,
            commentCount = 10,
            caption = "Gone to watch manchester Humiliation",
            postPic = painterResource(id = R.drawable.jorah_mormont_post) ,
            userName = "John Snow",
            profilePic = painterResource(id = R.drawable.jon_snow),
        ),
        User(
            location = "Canada",
            likeCount = 100,
            commentCount = 10,
            caption = "He got Me looking like :",
            postPic = painterResource(id = R.drawable.tyrian_lannister_post) ,
            userName = "lan" ,
            profilePic = painterResource(id = R.drawable.tyrian_lannister),
        )
    )
    Scaffold(
        topBar = {
            InstagramTopBar()
        },
        bottomBar = {
            BottomBar()
        },
        floatingActionButton = {},
        containerColor = Color.White ,
    ) {innerPadding->
      LazyColumn (
          modifier = Modifier.padding(innerPadding)
      ){

item {
    LazyRow {
        items(user){item->
     StoryWidget(user = item)
        }
    }

}
        item {
            HorizontalDivider()
        }
        items(user){user->
PostWidget(user = user)
        }
    }
}
      }


@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun InstagramTopBar(){
    val instagramTitleFont = FontFamily(Font(R.font.instagram_logo_font))
TopAppBar(

    title = { Text(
modifier = Modifier.offset(y = 5.dp),
        color = Color.Black,
        text = "Instagram",
        fontFamily = instagramTitleFont,
        fontSize = 35.sp
    ) },
    actions = {
        IconButton(onClick = { /*TODO*/ }) {
            Icon(painter = painterResource(id = R.drawable.ic_add), contentDescription = "add",
                tint = Color.White,
                modifier = Modifier.size(25.dp))
        }
        IconButton(onClick = { /*TODO*/ }) {
            Icon(painter = painterResource(id = R.drawable.ic_send), contentDescription = "send message",
                tint = Color.Black,
                modifier = Modifier.size(25.dp))
        }
    })
}
@Composable
fun BottomBar() {
    BottomAppBar(containerColor = Color.White) {
        NavigationBarItem(
            selected = true,
            onClick = { /*TODO*/ },
            icon = {
                Icon(
                    painter = painterResource(id = R.drawable.ic_home_filled),
                    contentDescription = "home",
                    modifier = Modifier
                        .size(24.dp)
                        .padding(4.dp)
                )
            },
        )
        NavigationBarItem(
            selected = false,
            onClick = { /*TODO*/ },
            icon = {
                Icon(
                    painter = painterResource(id = R.drawable.ic_search),
                    contentDescription = "search",
                    modifier = Modifier
                        .size(24.dp)
                        .padding(4.dp)
                )
            },
        )
        NavigationBarItem(
            selected = false,
            onClick = { /*TODO*/ },
            icon = {
                Icon(
                    painter = painterResource(id = R.drawable.ic_reels_outline),
                    contentDescription = "reels",
                    modifier = Modifier
                        .size(24.dp)
                        .padding(4.dp)
                )
            },
        )
        NavigationBarItem(
            selected = false,
            onClick = { /*TODO*/ },
            icon = {
                Icon(
                    painter = painterResource(id = R.drawable.ic_like_outline),
                    contentDescription = "like",
                    modifier = Modifier
                        .size(24.dp)
                        .padding(4.dp)
                )
            },
        )
        NavigationBarItem(
            selected = false,
            onClick = { /*TODO*/ },
            icon = {
                Icon(
                    painter = painterResource(id = R.drawable.jon_snow_post),
                    contentDescription = "profile",
                    modifier = Modifier
                        .size(32.dp)
                        .clip(CircleShape)
                        .border(1.dp, Color.Gray, CircleShape)
                        .padding(2.dp)
                )
            },
        )
    }
}


@Preview(showBackground = true)
@Composable
fun InstagramPreview(){
    InstagramFeed()
}