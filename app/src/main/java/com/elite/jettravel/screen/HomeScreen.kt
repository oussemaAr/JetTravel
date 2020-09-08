package com.elite.jettravel.screen

import androidx.compose.foundation.ScrollableRow
import androidx.compose.foundation.Text
import androidx.compose.foundation.layout.*
import androidx.compose.material.Scaffold
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.*
import androidx.compose.runtime.Composable
import androidx.compose.runtime.mutableStateOf
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.ui.tooling.preview.Preview
import com.elite.jettravel.component.CategoryItem
import com.elite.jettravel.component.DestinationComponent


@Composable
fun HomeScreen() {
    Scaffold(
        backgroundColor = Color(0XFFEFEFEF),
        bodyContent = { HomeBody() }
    )
}

val icons = arrayListOf(
    Icons.Default.SingleBed,
    Icons.Default.DirectionsWalk,
    Icons.Default.DirectionsBike,
    Icons.Default.DirectionsCar,
    Icons.Default.DirectionsBus,
)

@Preview
@Composable
fun HomeBody() {

    val index = mutableStateOf(-1)

    Column {
        Text(
            text = "What you would like \nto find",
            modifier = Modifier.padding(20.dp, 60.dp, 120.dp, 0.dp),
            style = TextStyle(
                fontSize = 30.sp,
                fontWeight = FontWeight.Bold
            )
        )
        Spacer(modifier = Modifier.height(20.dp))
        ScrollableRow {
            repeat(icons.size) {
                CategoryItem(icon = icons[it], state = index.value == it) {
                    index.value = it
                }
            }
        }
        Spacer(modifier = Modifier.height(20.dp))
        DestinationComponent()
    }
}