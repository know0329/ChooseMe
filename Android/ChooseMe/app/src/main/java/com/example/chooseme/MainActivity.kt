package com.example.chooseme

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.tooling.preview.Preview
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import com.example.chooseme.ui.theme.ChooseMeTheme
import com.example.chooseme.ui.screen.LoginScreen

class MainActivity : ComponentActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            ChooseMeTheme {
                // A surface container using the 'background' color from the theme
                MyApp()

                }
            }
        }
}

@Composable
fun MyApp() {
    val navController = rememberNavController()

    var isLoginIn by remember {mutableStateOf(false)}

    NavHost(navController = navController, startDestination = if(isLoginIn) "home" else "login"){
        composable("login"){
            LoginScreen(onLoginSuccess = { isLoginIn = true})
        }
        composable("home"){
//            HomeScreen()
        }
    }
}

@Preview(showBackground = true)
@Composable
fun GreetingPreview() {
    ChooseMeTheme {
        MyApp()
    }
}