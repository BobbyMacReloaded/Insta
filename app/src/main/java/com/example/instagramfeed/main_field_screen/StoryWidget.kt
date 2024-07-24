package com.example.instagramfeed.main_field_screen

import androidx.compose.foundation.Canvas
import androidx.compose.foundation.Image
import androidx.compose.foundation.border
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Brush
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.drawscope.Stroke
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.Font
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.instagramfeed.R
import com.example.instagramfeed.model.User

@Composable
fun StoryWidget (
    user: User
){
Box(modifier =Modifier.padding(10.dp),
    contentAlignment = Alignment.TopCenter){
Canvas(modifier = Modifier.size(80.dp)) {
val instagramColors = listOf(Color.Yellow,
    Color.Red, Color.Magenta)
    drawCircle(
        Brush.linearGradient(colors = instagramColors),
        style = Stroke(width = 15f)
    )
}
    Column(
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
Image(painter = user.profilePic,
    modifier = Modifier
        .clip(CircleShape)
        .border(width = 3.dp, color = Color.White, shape = CircleShape)
        .size(80.dp),
    contentDescription = "Profile Pic")
        Spacer(modifier = Modifier.height(10.dp))
        Text(text = user.userName,
            fontFamily = FontFamily(Font(R.font.robotocondensed)),
            color = Color.DarkGray)
    }

}

}
@Preview(showBackground = true)
@Composable
fun StoryPreview(){
    StoryWidget(
        User(
            location = "Manchester",
            likeCount = 100,
            commentCount = 10,
            caption = "Gone to watch manchester Humiliation",
            postPic = painterResource(id = R.drawable.jorah_mormont_post) ,
            userName = "John Snow",
            profilePic = painterResource(id = R.drawable.jon_snow),
        )
    )
}