package com.elite.jettravel.component

import androidx.compose.foundation.Icon
import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.preferredSize
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.material.Surface
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.AirplanemodeActive
import androidx.compose.runtime.Composable
import androidx.compose.runtime.MutableState
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.vector.VectorAsset
import androidx.compose.ui.unit.dp
import androidx.ui.tooling.preview.Preview
import com.elite.jettravel.ui.*


@Preview
@Composable
fun CategoryItemPreview() {
    CategoryItem(icon = Icons.Default.AirplanemodeActive)
}

@Composable
fun CategoryItem(icon: VectorAsset, state: Boolean = false, click: (() -> Unit) = {}) {
    Surface(
        modifier = Modifier
            .padding(8.dp)
            .preferredSize(64.dp)
            .clip(CircleShape)
            .clickable(onClick = click)
    ) {
        Icon(
            asset = icon,
            tint = if (state) Color.White else Grey500,
            modifier = Modifier.background(
                color = if (state) Cyan300 else Grey300
            )
        )
    }
}