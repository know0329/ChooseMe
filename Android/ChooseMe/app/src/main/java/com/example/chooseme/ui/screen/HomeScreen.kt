package com.example.chooseme.ui.screen

import android.os.Build
import android.util.Log
import androidx.annotation.RequiresApi
import androidx.compose.foundation.Image
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.material3.CircularProgressIndicator
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.constraintlayout.compose.ConstraintLayout
import com.example.chooseme.model.VoteResponse
import com.example.chooseme.model.repository.VoteRepository
import com.example.chooseme.R
import com.example.chooseme.ui.theme.ChooseMeTheme
import com.example.chooseme.util.StringFomatter
import com.skydoves.landscapist.glide.GlideImage
import java.net.URL

@RequiresApi(Build.VERSION_CODES.O)
@Composable
fun HomeScreen() {
    val voteRepository = VoteRepository()
    val testData = voteRepository.testAlldata()
    Surface(modifier = Modifier
        .fillMaxSize()
        .padding(16.dp), color = MaterialTheme.colorScheme.background) {
        Column {
            Appbar(Modifier)
            LazyColumn() {
                items(testData){
                        it -> VoteItem(vote = it)
                }
            }
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


@RequiresApi(Build.VERSION_CODES.O)
@Composable
fun VoteItem(vote : VoteResponse){

    if(vote.confidentiality){

    }
    else{
        Column {
            Row(
                verticalAlignment = Alignment.CenterVertically,
            ) {
                CreaterImage(url = URL(vote.createrImage))
                Spacer(modifier = Modifier.width(10.dp))
                Text(vote.createrName)
                Text(text = StringFomatter.formatTimeRemaining(vote.expirationDate),
                    modifier = Modifier.weight(1f),
                    textAlign = TextAlign.End
                    )
                Spacer(modifier = Modifier.width(10.dp))
            }
            VoteImage(vote.candidates[0].candidateData)
        }
    }

}
@Composable
fun CreaterImage(url : URL){
    GlideImage( // CoilImage, FrescoImage
        imageModel = url,
        modifier = Modifier
            .size(64.dp)
            .clip(CircleShape),
        // shows an indicator while loading an image.
        loading = {
            ConstraintLayout(
                modifier = Modifier.fillMaxSize()
            ) {
                val indicator = createRef()
                CircularProgressIndicator(
                    modifier = Modifier.constrainAs(indicator) {
                        top.linkTo(parent.top)
                        bottom.linkTo(parent.bottom)
                        start.linkTo(parent.start)
                        end.linkTo(parent.end)
                    }
                )
            }
        },
        // shows an error text if fail to load an image.
        failure = {
            Text(text = "이미지 로드 실패")
        }
    )
}
@Composable
fun VoteImage(url : String){
    GlideImage( // CoilImage, FrescoImage
        imageModel = url,
        modifier = Modifier.clip(CircleShape),
        // shows an indicator while loading an image.
        loading = {
            ConstraintLayout(
                modifier = Modifier.fillMaxSize()
            ) {
                val indicator = createRef()
                CircularProgressIndicator(
                    modifier = Modifier.constrainAs(indicator) {
                        top.linkTo(parent.top)
                        bottom.linkTo(parent.bottom)
                        start.linkTo(parent.start)
                        end.linkTo(parent.end)
                    }
                )
            }
        },
        // shows an error text if fail to load an image.
        failure = {
            Text(text = "이미지 로드 실패")
        }
    )
}

@RequiresApi(Build.VERSION_CODES.O)
@Preview(showBackground = true)
@Composable
fun GreetingPreview() {
    ChooseMeTheme {
        HomeScreen()
    }
}

