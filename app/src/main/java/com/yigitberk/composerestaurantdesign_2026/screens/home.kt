package com.yigitberk.composerestaurantdesign_2026.screens

import android.widget.Space
import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.text.input.TextFieldState
import androidx.compose.foundation.text.input.rememberTextFieldState
import androidx.compose.foundation.verticalScroll
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Icon
import androidx.compose.material3.IconButton
import androidx.compose.material3.ListItem
import androidx.compose.material3.SearchBar
import androidx.compose.material3.SearchBarDefaults
import androidx.compose.material3.Shapes
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.saveable.rememberSaveable
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.Shape
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.semantics.isTraversalGroup
import androidx.compose.ui.semantics.semantics
import androidx.compose.ui.semantics.traversalIndex
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.yigitberk.composerestaurantdesign_2026.R
import com.yigitberk.composerestaurantdesign_2026.ui.theme.ComposeRestaurantDesign_2026Theme


@Composable
fun HomeScreen(){
    Column(
        Modifier.fillMaxSize()
            .background(Color.White),
        /*
        verticalArrangement = Arrangement.Center,
        horizontalAlignment = Alignment.CenterHorizontally
         */
    ) {


        // isToggled initial value should be read from a view model or persistent storage.
        var isToggled by rememberSaveable { mutableStateOf(false) }

        //SearchBar
        // 1. TextFieldState for the input text
        val myTextFieldState = rememberTextFieldState()
        // result list
        val myResults = listOf("Burger King", "Pizza Hut", "McDonald's", "Dönerci Ali")

        //top bar
        Column(
            modifier = Modifier.background(Color(100, 252, 217))
                .fillMaxWidth()
                .padding(top = 40.dp, bottom = 20.dp) // Sabit height yerine padding ile nefes aldırıyoruz
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

            //Spacer(modifier = Modifier.height(30.dp))

            //SearchBar
            SimpleSearchBar(
                textFieldState = myTextFieldState,
                onSearch = {query ->
                    println("Searched word ${query}")
                },
                searchResults = myResults,
                modifier = Modifier.padding(top = 10.dp, bottom = 10.dp)
            )

        }

        /*Rows*/
        LazyColumn(
            modifier = Modifier
                .fillMaxSize().background(Color.White)
        ) {

        }
    }

}

//SearchBar with suggestions
@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun SimpleSearchBar(
    textFieldState: TextFieldState,
    onSearch: (String) -> Unit,
    searchResults: List<String>,
    modifier: Modifier = Modifier
) {
    // Controls expansion state of the search bar
    var expanded by rememberSaveable { mutableStateOf(false) }

    Box(
        modifier
            .fillMaxWidth()
            .semantics { isTraversalGroup = true }
    ) {
        SearchBar(
            modifier = Modifier
                .align(Alignment.TopCenter)
                .semantics { traversalIndex = 0f },
            inputField = {
                SearchBarDefaults.InputField(
                    query = textFieldState.text.toString(),
                    onQueryChange = { textFieldState.edit { replace(0, length, it) } },
                    onSearch = {
                        onSearch(textFieldState.text.toString())
                        expanded = false
                    },
                    expanded = expanded,
                    onExpandedChange = { expanded = it },
                    placeholder = { Text("Search for Shops and Restaurants")},
                    leadingIcon = {
                        Icon(
                            modifier = Modifier.fillMaxHeight().width(17.dp),
                            painter =  painterResource(R.drawable.icon_search),
                            contentDescription = "Search Icon"
                        )
                    }
                )
            },
            expanded = expanded,
            onExpandedChange = { expanded = it },
        ) {
            // Display search results in a scrollable column
            Column(Modifier.verticalScroll(rememberScrollState())) {
                searchResults.forEach { result ->
                    ListItem(
                        headlineContent = { Text(result) },
                        modifier = Modifier
                            .clickable {
                                textFieldState.edit { replace(0, length, result) }
                                expanded = false
                            }
                            .fillMaxWidth()
                    )
                }
            }
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