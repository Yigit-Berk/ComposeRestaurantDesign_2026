package com.yigitberk.composerestaurantdesign_2026.screens

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.gestures.snapping.SnapPosition
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
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
import androidx.compose.material3.HorizontalDivider
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.material3.TextButton
import androidx.compose.material3.TextField
import androidx.compose.material3.TextFieldDefaults
import androidx.compose.runtime.Composable
import androidx.compose.runtime.mutableStateOf
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
        var email = remember { mutableStateOf("") }
        var password = remember { mutableStateOf("") }

        Spacer(modifier = Modifier.height(10.dp))

            TextField(
                value = email.value,
                onValueChange = {
                    email.value = it
                },
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
                value = password.value,
                onValueChange = {
                    password.value = it
                },
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

        Spacer(Modifier.height(20.dp))

        // OR text
        Row(
            modifier = Modifier
                .fillMaxWidth()
                .padding(horizontal = 30.dp),
            verticalAlignment = Alignment.CenterVertically
        ) {
            // Left Line
            HorizontalDivider(
                modifier = Modifier.weight(1f),
                thickness = 1.dp,
                color = Color.LightGray
            )

            // Middle Text
            Text(
                text = "OR",
                modifier = Modifier.padding(horizontal = 16.dp),
                style = MaterialTheme.typography.bodyMedium,
                color = Color.Black
            )

            // Right Line
            HorizontalDivider(
                modifier = Modifier.weight(1f),
                thickness = 1.dp,
                color = Color.LightGray
            )
        }

        Spacer(Modifier.height(20.dp))

        Button(modifier = Modifier.fillMaxWidth()
            .height(48.dp)
            .padding(horizontal = 30.dp),
            onClick = {},
            colors = ButtonDefaults.buttonColors(Color(243,242,242)),
            shape = RoundedCornerShape(12.dp)// for corner radius
        ) {
            Row(
                modifier = Modifier.fillMaxWidth(),
                verticalAlignment = Alignment.CenterVertically,
                horizontalArrangement = Arrangement.Start // İkonu sola, yazıyı merkeze almak için
            ) {
                Image(
                    painter = painterResource(id = R.drawable.icon_google),
                    contentDescription = "Google Logo",
                    modifier = Modifier.size(24.dp)
                )
                Text(
                    modifier = Modifier.fillMaxWidth(),
                    text = "Login With Google",
                    color = Color.Black,
                    style = MaterialTheme.typography.bodyLarge,
                    textAlign = TextAlign.Center
                )
            }
        }

        Spacer(Modifier.height(10.dp))

        Button(modifier = Modifier.fillMaxWidth()
            .height(48.dp)
            .padding(horizontal = 30.dp),
            onClick = {},
            colors = ButtonDefaults.buttonColors(Color(243,242,242)),
            shape = RoundedCornerShape(12.dp)// for corner radius
        ) {
            Row(
                modifier = Modifier.fillMaxWidth(),
                verticalAlignment = Alignment.CenterVertically,
                horizontalArrangement = Arrangement.Start // icon to the left and text to be centered
            ) {
                Image(
                    painter = painterResource(id = R.drawable.icon_facebook),
                    contentDescription = "Facebook Logo",
                    modifier = Modifier.size(24.dp)
                )
                Text(
                    modifier = Modifier.fillMaxWidth(),
                    text = "Login With Facebook",
                    color = Color.Black,
                    style = MaterialTheme.typography.bodyLarge,
                    textAlign = TextAlign.Center
                )
            }
        }

        Spacer(Modifier.height(20.dp))

        Row(
            modifier = Modifier.fillMaxWidth()
                .padding(horizontal = 30.dp),
            verticalAlignment = Alignment.CenterVertically,
            horizontalArrangement = Arrangement.Center
        ) {
            Text(
                "New to us?"
            )
            TextButton(
                onClick = {/*Navigate to ...*/}
            ) {
                Text(
                    "Register"
                )
            }
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