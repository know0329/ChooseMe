package com.example.chooseme.ui.screen

import android.util.Log
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier

@Composable
fun MyPageScreen(){

    Surface (modifier = Modifier.fillMaxSize(), color = MaterialTheme.colorScheme.background){
        Text(text = "MyPage")
    }
    Log.d("MyPage", "MyPageScreen: ???")
}