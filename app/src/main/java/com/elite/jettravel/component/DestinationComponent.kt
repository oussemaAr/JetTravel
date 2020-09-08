package com.elite.jettravel.component

import androidx.compose.foundation.Icon
import androidx.compose.foundation.Image
import androidx.compose.foundation.Text
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.ListItem
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.NearMe
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.imageResource
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.ui.tooling.preview.Preview
import com.elite.jettravel.ui.Blue300
import com.elite.jettravel.R
import com.elite.jettravel.ui.Grey300
import com.elite.jettravel.ui.Grey500

@Preview
@Composable
fun DestinationComponent() {
    DestinationTitle()
    DestinationItem()
}

@Preview
@Composable
fun DestinationTitle() {
    Row(modifier = Modifier.padding(20.dp, 0.dp)) {
        Text(
            text = "Top Destination",
            modifier = Modifier.weight(1F),
            style = TextStyle(
                fontSize = 22.sp,
                fontWeight = FontWeight.Bold,
                letterSpacing = 1.5.sp
            )
        )
        Text(
            text = "See All",
            style = TextStyle(
                color = Blue300,
                fontSize = 16.sp,
                fontWeight = FontWeight.W600,
            )
        )
    }
}

@Preview
@Composable
fun DestinationItem() {
    Column(
        modifier = Modifier
            .width(200.dp)
            .padding(8.dp)
            .clip(RoundedCornerShape(8.dp))
            .background(color = Color.White)

    ) {
        Stack {
            Image(
                asset = imageResource(id = R.drawable.paris),
                modifier = Modifier
                    .clip(RoundedCornerShape(16F))
            )
            ListItem(
                modifier = Modifier.gravity(Alignment.BottomStart),
                secondaryText = {
                    Row {
                        Icon(
                            asset = Icons.Default.NearMe,
                            tint = Color.White
                        )
                        Text(
                            text = "France",
                            color = Color.White
                        )
                    }
                }, text = {
                    Text(
                        text = "Paris",
                        style = TextStyle(
                            color = Color.White,
                            fontSize = 22.sp,
                            fontWeight = FontWeight.W600,
                            letterSpacing = 1.2.sp,
                        )
                    )
                })
        }
        Text(
            text = "3 Activities",
            style = TextStyle(
                color = Color.Black,
                fontSize = 22.sp,
                fontWeight = FontWeight.Bold,
                letterSpacing = 1.2.sp,
            ),
            modifier = Modifier.padding(8.dp)
        )
        Text(
            text = "Visit us For More information and fun to have while you have the chance",
            color = Grey500,
            fontSize = 12.sp,
            modifier = Modifier.padding(8.dp, 0.dp, 8.dp, 8.dp)
        )
    }
}
