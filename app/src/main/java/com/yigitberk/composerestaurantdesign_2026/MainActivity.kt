package com.yigitberk.composerestaurantdesign_2026

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.runtime.Composable
import androidx.compose.ui.tooling.preview.Preview
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import com.yigitberk.composerestaurantdesign_2026.screens.ForgotPasswordScreen
import com.yigitberk.composerestaurantdesign_2026.screens.HomeScreen
import com.yigitberk.composerestaurantdesign_2026.screens.LoginScreen
import com.yigitberk.composerestaurantdesign_2026.screens.ResetPasswordScreen
import com.yigitberk.composerestaurantdesign_2026.screens.SignUpConfirmScreen
import com.yigitberk.composerestaurantdesign_2026.screens.SignupScreen
import com.yigitberk.composerestaurantdesign_2026.screens.StartScreen
import com.yigitberk.composerestaurantdesign_2026.ui.theme.ComposeRestaurantDesign_2026Theme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            val navController = rememberNavController()

            ComposeRestaurantDesign_2026Theme {
                NavHost(navController,"Start_Screen"){
                    composable("Start_Screen") {
                        StartScreen(navController)
                    }
                    composable("Login_Screen"){
                        LoginScreen(navController)
                    }
                    composable("Start_Screen"){
                        StartScreen(navController)
                    }
                    composable("Signup_Screen"){
                        SignupScreen(navController)
                    }
                    composable("SignupConfirm_Screen"){
                        SignUpConfirmScreen(navController)
                    }
                    composable("ForgotPassword_Screen"){
                        ForgotPasswordScreen()
                    }
                    composable("ResetPassword_Screen"){
                        ResetPasswordScreen()
                    }
                    composable("Home_Screen"){
                        HomeScreen()
                    }
                }

               // HomeScreen()
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