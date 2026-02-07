package com.yigitberk.composerestaurantdesign_2026.screens

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
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
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.material3.TextField
import androidx.compose.material3.TextFieldDefaults
import androidx.compose.runtime.Composable
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
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
fun SignUpConfirmScreen() {
    Column(
        verticalArrangement = Arrangement.Center,
        horizontalAlignment = Alignment.CenterHorizontally,
        modifier = Modifier.background(Color.White)
            .fillMaxSize()
    ) {
        Image(
            painter = painterResource(R.drawable.signupconfirm_pic),
            contentDescription = "Reset Password Picture",
            modifier = Modifier.fillMaxWidth()
                .height(280.dp)
                .padding(horizontal = 30.dp)
        )

        Spacer(modifier = Modifier.height(60.dp))

        Image(
            painter = painterResource(R.drawable.signupconfirm_gif),
            contentDescription = "Reset Password Picture",
            modifier = Modifier.fillMaxWidth()
                .height(150.dp)
                .padding(horizontal = 30.dp)
        )

        Spacer(modifier = Modifier.height(60.dp))

        Text(
            modifier = Modifier.fillMaxWidth(),
            text = "Signed up Successfully",
            style = MaterialTheme.typography.bodyLarge,
            textAlign = TextAlign.Center
        )

        Spacer(Modifier.height(110.dp))

        Button(modifier = Modifier.fillMaxWidth()
            .height(48.dp)
            .padding(horizontal = 30.dp),
            onClick = {},
            colors = ButtonDefaults.buttonColors(Color(100,252,217)),
            shape = RoundedCornerShape(12.dp)// for corner radius
        ) {
            Text(
                text = "Login",
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
fun SignUpConfirmPreview() {
    ComposeRestaurantDesign_2026Theme {
        SignUpConfirmScreen()
    }
}