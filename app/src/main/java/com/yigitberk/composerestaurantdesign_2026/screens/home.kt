package com.yigitberk.composerestaurantdesign_2026.screens

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.material3.Icon
import androidx.compose.material3.IconButton
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.saveable.rememberSaveable
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.semantics.semantics
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.yigitberk.composerestaurantdesign_2026.R
import com.yigitberk.composerestaurantdesign_2026.ui.theme.ComposeRestaurantDesign_2026Theme


@Composable
fun HomeScreen(){
    Column(
        Modifier.fillMaxSize()
            .background(Color.White),
        verticalArrangement = Arrangement.Center,
        horizontalAlignment = Alignment.CenterHorizontally
    ) {


        // isToggled initial value should be read from a view model or persistent storage.
        var isToggled by rememberSaveable { mutableStateOf(false) }

        //top bar
        Column(
            modifier = Modifier.background(Color(100, 252, 217))
                .fillMaxWidth()
                .height(200.dp)
                .padding(horizontal = 30.dp),
            verticalArrangement = Arrangement.Center,
            horizontalAlignment = Alignment.CenterHorizontally
        ) {

            Row(
                modifier = Modifier.fillMaxWidth().height(80.dp),
                verticalAlignment = Alignment.CenterVertically,
                horizontalArrangement = Arrangement.SpaceBetween //separate them to the right and left
            ) {

                //Hamburger IconButton
                IconButton(
                    modifier = Modifier.fillMaxHeight(),
                    onClick = {}
                ) {
                    Icon(
                        modifier = Modifier.fillMaxSize()
                            .padding(5.dp),
                        painter = if (isToggled) painterResource(R.drawable.icon_menu) else painterResource(R.drawable.icon_menu),
                        contentDescription = if (isToggled) "Selected icon button" else "Unselected icon button."
                    )
                }

                //Cart IconButton
                IconButton(
                    modifier = Modifier.fillMaxHeight(),
                    onClick = {}
                ) {
                    Icon(
                        modifier = Modifier.fillMaxSize()
                            .padding(5.dp),
                        painter = if (isToggled) painterResource(R.drawable.icon_cart) else painterResource(R.drawable.icon_cart),
                        contentDescription = if (isToggled) "Selected icon button" else "Unselected icon button."
                    )
                }

            }

        }

        /*Rows*/
        LazyColumn(
            modifier = Modifier
                .fillMaxSize().background(Color.White)
        ) {

        }
    }

}


@Preview(showBackground = true)
@Composable
fun HomePreview() {
    ComposeRestaurantDesign_2026Theme {
        HomeScreen()
    }
}