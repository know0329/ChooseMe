package com.example.chooseme.ui.screen

import android.graphics.Paint.Align
import android.util.Log
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.material3.BottomAppBar
import androidx.compose.material3.Button
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.NavigationBar
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.Constraints
import androidx.compose.ui.unit.dp
import androidx.constraintlayout.compose.ConstraintLayout
import androidx.navigation.NavController
import androidx.navigation.compose.currentBackStackEntryAsState
import com.example.chooseme.MyApp
import com.example.chooseme.R
import com.example.chooseme.ui.theme.ChooseMeTheme
import com.example.chooseme.ui.theme.Screen

@Composable
fun HomeScreen() {

    Surface(modifier = Modifier.fillMaxSize(), color = MaterialTheme.colorScheme.background) {
        Column {
            Appbar(Modifier)
        }
    }
    Log.d("Home", "HomeScreen: ???")
}

@Composable
fun Appbar(modifier: Modifier) {
    Row(modifier = modifier, verticalAlignment = Alignment.CenterVertically) {
        Image(
            painter = painterResource(id = R.drawable.logo),
            contentDescription = "앱 아이콘",
            modifier = Modifier.size(80.dp)
        )

        Spacer(modifier = Modifier.weight(1f))

        Image(
            painter = painterResource(id = R.drawable.baseline_add_box_24),
            contentDescription = null, // 이미지에 대한 접근성 설명은 없음
            modifier = Modifier
                .size(56.dp)
                .clickable(onClick = { })
        )

        Image(
            painter = painterResource(id = R.drawable.testimg),
            contentDescription = null, // 이미지에 대한 접근성 설명은 없음
            modifier = Modifier
                .size(64.dp)
                .clip(CircleShape)
        )


    }
}


@Preview(showBackground = true)
@Composable
fun GreetingPreview() {
    ChooseMeTheme {
        HomeScreen()
    }
}

