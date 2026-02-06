package com.yigitberk.composerestaurantdesign_2026

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.runtime.Composable
import androidx.compose.ui.tooling.preview.Preview
import com.yigitberk.composerestaurantdesign_2026.screens.LoginScreen
import com.yigitberk.composerestaurantdesign_2026.screens.StartScreen
import com.yigitberk.composerestaurantdesign_2026.ui.theme.ComposeRestaurantDesign_2026Theme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            ComposeRestaurantDesign_2026Theme {
                LoginScreen()
            }
        }
    }
}



@Preview(showBackground = true)
@Composable
fun GreetingPreview() {
    ComposeRestaurantDesign_2026Theme {

    }
}