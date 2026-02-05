package com.yigitberk.composerestaurantdesign_2026.screens

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.gestures.snapping.SnapPosition
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.foundation.text.KeyboardOptions
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.Text
import androidx.compose.material3.TextButton
import androidx.compose.material3.TextField
import androidx.compose.material3.TextFieldDefaults
import androidx.compose.runtime.Composable
import androidx.compose.runtime.remember
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.modifier.modifierLocalConsumer
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.input.KeyboardType
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.yigitberk.composerestaurantdesign_2026.R
import com.yigitberk.composerestaurantdesign_2026.ui.theme.ComposeRestaurantDesign_2026Theme


@Composable
fun LoginScreen() {
    Column(
        verticalArrangement = Arrangement.Center,
        horizontalAlignment = Alignment.CenterHorizontally,
        modifier = Modifier.background(Color.White)
            .fillMaxSize()
    ) {
        Image(
            painter = painterResource(R.drawable.login_pic),
            contentDescription = "Login Picture",
            modifier = Modifier.fillMaxWidth()
                .height(280.dp)
        )
        Spacer(modifier = Modifier.height(32.dp))
        Text(
            text = "Login",
            style = TextStyle(
                fontSize = 34.sp,
                fontWeight = FontWeight.Bold,
                color = Color.Black
            ),
            modifier = Modifier
                .fillMaxWidth()
                .padding(horizontal = 20.dp)
            ,textAlign = TextAlign.Start
        )

        //Input Fields
        val email = remember { "" }
        val password = remember { "" }

        Spacer(modifier = Modifier.height(10.dp))

            TextField(
                value = email,
                onValueChange = {},
                label = { Text(text = "EmailID or Mobile") },
                modifier = Modifier.fillMaxWidth()
                    .padding(horizontal = 30.dp),
                keyboardOptions = KeyboardOptions(keyboardType = KeyboardType.Email),
                colors = TextFieldDefaults.colors(
                    unfocusedContainerColor = Color.Transparent,
                    focusedContainerColor = Color.Transparent
                ),
                leadingIcon = {
                    Image(
                        painter = painterResource(id = R.drawable.work),
                        contentDescription = "Email Icon",
                        modifier = Modifier.size(20.dp)
                    )
                }
            )

            Spacer(Modifier.height(10.dp))

            TextField(
                value = password,
                onValueChange = {},
                label = { Text(text = "Password") },
                modifier = Modifier.fillMaxWidth()
                    .padding(horizontal = 30.dp),
                keyboardOptions = KeyboardOptions(keyboardType = KeyboardType.Password),
                colors = TextFieldDefaults.colors(
                    unfocusedContainerColor = Color.Transparent,
                    focusedContainerColor = Color.Transparent
                ),
                leadingIcon = {
                    Image(
                        painter = painterResource(id = R.drawable.password),
                        contentDescription = "Password Icon",
                        modifier = Modifier.size(20.dp)
                    )
                }
            )
            Spacer(Modifier.height(10.dp))
            TextButton(
                onClick = { "navigate to screen" },
                modifier = Modifier.fillMaxWidth()
                    .padding(horizontal = 30.dp)
            ) {
                Text(
                    "Forgot Password?",
                    modifier = Modifier.fillMaxWidth(),
                    textAlign = TextAlign.End
                )
            }

        Spacer(Modifier.height(10.dp))

        Button(modifier = Modifier.fillMaxWidth()
            .height(48.dp)
            .padding(horizontal = 30.dp),
            onClick = {},
            colors = ButtonDefaults.buttonColors(Color(100,252,217)),
            shape = RoundedCornerShape(12.dp)// for corner radius
        ) {
            Text(
                text = "Continue",
                color = Color.Black,
                style = TextStyle(
                    fontSize = 18.sp
                )
            )
        }


    }
}

@Preview(showBackground = true)
@Composable
fun LoginPreview() {
    ComposeRestaurantDesign_2026Theme {
        LoginScreen()
    }
}