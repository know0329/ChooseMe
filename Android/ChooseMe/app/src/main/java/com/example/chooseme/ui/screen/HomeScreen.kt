package com.example.chooseme.ui.screen

import android.util.Log
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.BottomAppBar
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.NavigationBar
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.tooling.preview.Preview
import androidx.navigation.NavController
import androidx.navigation.compose.currentBackStackEntryAsState
import com.example.chooseme.MyApp
import com.example.chooseme.ui.theme.ChooseMeTheme
import com.example.chooseme.ui.theme.Screen

@Composable
fun HomeScreen(){

    Surface (modifier = Modifier.fillMaxSize(), color = MaterialTheme.colorScheme.background){
        Text(text = "Home")
    }
    Log.d("Home", "HomeScreen: ???")
}



@Preview(showBackground = true)
@Composable
fun GreetingPreview() {
    ChooseMeTheme {
        HomeScreen()
    }
}

