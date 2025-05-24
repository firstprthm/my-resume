package com.firstprthm.myresume.ui

import androidx.compose.foundation.Image
import androidx.compose.foundation.border
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.firstprthm.myresume.R

@Composable
fun HomeScreen() {
    val listOfAchievements = listOf(
        "First Rank Holder, 1st Year",
        "Class Topper",
        "First Rank Holder, 1st Year",
        "Class Topper","First Rank Holder, 1st Year",
        "Class Topper","First Rank Holder, 1st Year",
        "Class Topper","First Rank Holder, 1st Year",
        "Class Topper","First Rank Holder, 1st Year",
        "Class Topper","First Rank Holder, 1st Year",
        "Class Topper","First Rank Holder, 1st Year",
        "Class Topper","First Rank Holder, 1st Year",
        "Class Topper","First Rank Holder, 1st Year",
        "Class Topper","First Rank Holder, 1st Year",
        "Class Topper","First Rank Holder, 1st Year",
        "Class Topper","First Rank Holder, 1st Year",
        "Class Topper","First Rank Holder, 1st Year",
        "Class Topper","First Rank Holder, 1st Year",
        "Class Topper","First Rank Holder, 1st Year",
        "Class Topper","First Rank Holder, 1st Year",
        "Class Topper","First Rank Holder, 1st Year",
        "Class Topper","First Rank Holder, 1st Year",
        "Class Topper","First Rank Holder, 1st Year",
        "Class Topper","First Rank Holder, 1st Year",
        "Class Topper","First Rank Holder, 1st Year",
        "Class Topper","First Rank Holder, 1st Year",
        "Class Topper"
    )

    Column {
        Row(
            horizontalArrangement = Arrangement.Center,
            verticalAlignment = Alignment.CenterVertically,
            modifier = Modifier
                .align(alignment = Alignment.CenterHorizontally)
                .width(200.dp)
                .height(200.dp),
            content = {
                Image(
                    painter = painterResource(R.drawable.profile),
                    contentDescription = "Profile Pic",
                    modifier = Modifier.weight(0.5f)
                        .clip(shape = CircleShape)
                        .border(
                            width = 2.dp,
                            color = Color(33, 150, 243, 255),
                            shape = CircleShape
                        ),
                    contentScale = ContentScale.Crop
                )
            }
        )
        Row(
            horizontalArrangement = Arrangement.Center,
            verticalAlignment = Alignment.CenterVertically,
            modifier = Modifier.fillMaxWidth()
                .align(alignment = Alignment.CenterHorizontally)
        )  {
            Text(
                text = "Pratham Prabhakar",
                fontSize = 30.sp,
                fontWeight = FontWeight.Bold,
                modifier = Modifier.padding(top = 5.dp)
            )
        }

        LazyColumn(
            modifier = Modifier.fillMaxSize()
                .padding(vertical = 20.dp)
                .padding(horizontal = 30.dp)
        ) {

            item {
                Text(
                    text = "B.Tech in Information Science & Engineering\nNMAMIT'28\nwww.linkedin.com/in/firstprthm\n",
                    fontStyle = FontStyle.Italic,
                    textAlign = TextAlign.Center,
                )
            }


            item {
                Text(
                    text = "Achievements",
                    fontSize = 22.sp,
                    fontWeight = FontWeight.Bold
                )
            }

            items(listOfAchievements) { achievement->
                Text(text = achievement)
            }
        }
    }


}