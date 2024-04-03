package com.example.chooseme

import AppNavigation
import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.material3.BottomAppBar
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.tooling.preview.Preview
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import com.example.chooseme.ui.navigation.Screens
import com.example.chooseme.ui.screen.HomeScreen
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
    if (isLoginIn) {
        // 네비게이션 화면 표시
        AppNavigation(isLoginIn = isLoginIn)
    } else {
        // 로그인 화면 표시
        LoginScreen(onLoginSuccess = {
            // 로그인 성공 시
            isLoginIn = true // 로그인 상태를 변경

        })
    }
}

@Preview(showBackground = true)
@Composable
fun GreetingPreview() {
    ChooseMeTheme {
        MyApp()
    }
}