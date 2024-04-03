package com.example.chooseme.ui.screen

import android.util.Log
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import com.example.chooseme.ui.theme.ChooseMeTheme

@Composable
fun SearchScreen(){

    Surface (modifier = Modifier.fillMaxSize(), color = MaterialTheme.colorScheme.background){
        Text(text = "Search")
    }
    Log.d("Search", "SearchScreen: ???")
}



