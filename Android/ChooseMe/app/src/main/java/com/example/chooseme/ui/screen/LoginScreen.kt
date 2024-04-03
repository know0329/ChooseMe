package com.example.chooseme.ui.screen

import android.graphics.drawable.Drawable
import android.text.style.ClickableSpan
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
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.layout.wrapContentWidth
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.material3.contentColorFor
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.chooseme.R

@Composable
fun LoginScreen(
    onLoginSuccess : () -> Unit
){
    Surface(modifier = Modifier.fillMaxSize(), color = MaterialTheme.colorScheme.background,
        ) {
        Column (modifier = Modifier.fillMaxSize(),
            verticalArrangement = Arrangement.Center,
            horizontalAlignment = Alignment.CenterHorizontally) {
            Image(painter = painterResource(id = R.drawable.logo), contentDescription = "앱 아이콘",
                modifier = Modifier.fillMaxWidth())
            Spacer(modifier = Modifier.height(128.dp))
            SocialLoginButton("카카오", { onLoginSuccess() }, R.drawable.kakaologin)
            Spacer(modifier = Modifier.height(32.dp))
            SocialLoginButton("네이버", { onLoginSuccess() }, R.drawable.naverlogin)
            Spacer(modifier = Modifier.height(32.dp))
            SocialLoginButton("구글", { onLoginSuccess() }, R.drawable.googlelogin)
        }

    }
}
@Composable
fun SocialLoginButton(
    loginType : String,
    onLoginSuccess: () -> Unit,
    loginBackground : Int
) {
    Box(
        modifier = Modifier
            .fillMaxWidth()
            .background(Color.Transparent) // 배경을 투명하게 설정

    ) {
        Image(
            painter = painterResource(id = loginBackground),
            contentDescription = null, // 이미지에 대한 접근성 설명은 없음
            modifier = Modifier
                .align(Alignment.Center)
                .clickable(onClick = { onLoginSuccess() })
        )
        Text(
            text = "${loginType}로 로그인하기",
            color = Color.White,
            fontWeight = FontWeight.Bold,
            modifier = Modifier.align(Alignment.Center) // 텍스트를 가운데 정렬
        )
    }
}
