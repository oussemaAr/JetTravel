package com.elite.jettravel

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.compose.ui.platform.setContent
import androidx.core.view.WindowCompat.*
import com.elite.jettravel.screen.HomeScreen
import com.elite.jettravel.ui.JetTravelTheme

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setDecorFitsSystemWindows(window, false)
        setContent {
            JetTravelTheme {
                HomeScreen()
            }
        }
    }
}