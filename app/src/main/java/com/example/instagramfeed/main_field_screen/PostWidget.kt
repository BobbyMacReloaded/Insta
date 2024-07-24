package com.example.instagramfeed.main_field_screen

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.material3.Icon
import androidx.compose.material3.IconButton
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.AnnotatedString
import androidx.compose.ui.text.SpanStyle
import androidx.compose.ui.text.buildAnnotatedString
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.instagramfeed.R
import com.example.instagramfeed.model.User

@Composable
fun PostWidget(
    user: User
) {
Column(
    modifier = Modifier.fillMaxWidth()
) {
   Row(
horizontalArrangement = Arrangement.SpaceBetween,
       modifier = Modifier
           .fillMaxWidth()
           .padding(10.dp)
   ) {
Row (
    verticalAlignment = Alignment.CenterVertically
){
Icon(painter = user.profilePic,
    modifier = Modifier
        .clip(CircleShape)
        .size(40.dp),
    contentDescription = "profile pic")
    Spacer(modifier = Modifier.width(10.dp))
    Column {
        Text(text = user.userName,
            fontWeight = FontWeight.Bold,
            fontSize = 18.sp)
        Spacer(modifier = Modifier.height(5.dp))
        Text(text = user.location,
            fontSize = 14.sp
        )
        Spacer(modifier = Modifier.height(10.dp))


    }
}
       IconButton(onClick = { /*TODO*/ }) {
          Icon(painter = painterResource(id = R.drawable.ic_more),
              contentDescription = "More options")
       }
   }
    Image(painter = user.postPic, contentDescription = "Post",
        modifier = Modifier.fillMaxWidth(),
        contentScale = ContentScale.FillWidth)
    Row(
        horizontalArrangement = Arrangement.SpaceBetween,
        modifier = Modifier
            .fillMaxWidth()
            .padding(10.dp)
    ) {
Row(
    horizontalArrangement = Arrangement.SpaceBetween
) {
    IconButton(onClick = { /*TODO*/ }) {
       Icon(painter = painterResource(id = R.drawable.ic_like_outline),
           contentDescription = "like",
           tint = Color.Black,
           modifier = Modifier.size(25.dp))
    }
    IconButton(onClick = { /*TODO*/ }) {
        Icon(painter = painterResource(id = R.drawable.ic_comment),
            contentDescription = "comment",
            tint = Color.Black,
            modifier = Modifier.size(30.dp))
    }
    IconButton(onClick = { /*TODO*/ }) {
        Icon(painter = painterResource(id = R.drawable.ic_send),
            contentDescription = "send",
            tint = Color.Black,
            modifier = Modifier.size(25.dp))
    }

}
        IconButton(onClick = { /*TODO*/ }) {
            Icon(painter = painterResource(id = R.drawable.ic_save),
                contentDescription = "save",
                tint = Color.Black,
                modifier = Modifier.size(25.dp))
        }

    }
    Column (
        modifier = Modifier
            .fillMaxWidth()
            .padding(horizontal = 10.dp)
    ){
Text(text = "${user.likeCount} likes")
        Text(text = buildAnnotatedString {
            append(
                AnnotatedString(
                    text = "${user.userName}:",

                    spanStyle = SpanStyle(fontWeight = FontWeight.Bold)
                )
            )
            append(user.caption)
        })
        Spacer(modifier = Modifier.height(5.dp))
        Text(text = "View all ${user.commentCount} comments",
            color = Color.DarkGray,
            fontSize = 13.sp)
    }

}
}
@Preview(showBackground = true)
@Composable
fun PostPreview(){
    PostWidget(
        User(
            location = "Canada",
            likeCount = 100,
            commentCount = 10,
            caption = "Such an adorable scene",
            postPic = painterResource(id = R.drawable.jon_snow_post) ,
            userName = "John Snow",
            profilePic = painterResource(id = R.drawable.jon_snow),
        )
    )
}