package com.example.practiceappjetpactcompose

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
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
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Call
import androidx.compose.material.icons.filled.Email
import androidx.compose.material.icons.filled.Share
import androidx.compose.material3.Icon
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.painter.Painter
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.practiceappjetpactcompose.ui.theme.PracticeAppJetpactComposeTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            PracticeAppJetpactComposeTheme {
                Surface(modifier = Modifier.fillMaxSize()) {
                    BusinessCardArticle()
                }
            }
        }
    }
}



@Composable
fun BusinessCardArticle() {
    Box(
        modifier = Modifier
            .background(color = Color(0xFFC5E0C6))
            .fillMaxSize()
    ) {
        Column (
            modifier = Modifier
                .fillMaxWidth()
                .padding(top = 210.dp),
            horizontalAlignment = Alignment.CenterHorizontally,
            verticalArrangement = Arrangement.Center
        ) {
            Image(
                painter = painterResource(R.drawable.android_logo),
                contentDescription = null,
                Modifier
                    .height(120.dp)
                    .background(color = Color(0xFF182C35))
                    .padding(12.dp)
            )
            Text(
                text = stringResource(R.string.fullName),
                fontSize = 44.sp,
                fontFamily = FontFamily.SansSerif,
                color = Color.Black
            )
            Text(
                text = stringResource(R.string.businessTitle),
                fontWeight = FontWeight.Bold,
                color = Color(0xFF44725A)
            )
            Spacer(modifier = Modifier.weight(1f))
        }
        Column (
            modifier = Modifier
                .width(200.dp)
                .align(alignment = Alignment.BottomCenter)
                .padding(bottom = 100.dp),
            horizontalAlignment = Alignment.Start,
            verticalArrangement = Arrangement.spacedBy(8.dp)
        ) {
            Row (Modifier.padding(5.dp)) {
                Icon(
                    imageVector = Icons.Default.Call,
                    contentDescription = null,
                    Modifier.padding(end = 10.dp),
                    tint = Color.Black
                )
                Text(
                    text = stringResource(R.string.telNum),
                    color = Color.Black
                )
            }
            Row (Modifier.padding(5.dp)) {
                Icon(
                    imageVector = Icons.Default.Share,
                    contentDescription = null,
                    Modifier.padding(end = 10.dp),
                    tint = Color.Black
                )
                Text(
                    text = stringResource(R.string.linkedin),
                    color = Color.Black
                )
            }
            Row (Modifier.padding(5.dp)) {
                Icon(
                    imageVector = Icons.Default.Email,
                    contentDescription = null,
                    Modifier.padding(end = 10.dp),
                    tint = Color.Black
                )
                Text(
                    text = stringResource(R.string.email),
                    color = Color.Black
                )
            }
        }
    }
}



@Preview(showBackground = true)
@Composable
fun ArticlePreview() {
    PracticeAppJetpactComposeTheme {
        BusinessCardArticle()
    }
}

// Quadrant Article
@Composable
fun QuadrantArticle() {
    Column(Modifier.fillMaxWidth()) {
        Row (
            modifier = Modifier.weight(1f)
        ) {
            QuadrantCard(
                backgroundColor = Color(0xFFEADDFF),
                title = stringResource(R.string.title1),
                content = stringResource(R.string.content1),
                modifier = Modifier.weight(1f)
            )
            QuadrantCard(
                backgroundColor = Color(0xFFD0BCFF),
                title = stringResource(R.string.title2),
                content = stringResource(R.string.content2),
                modifier = Modifier.weight(1f)
            )
        }
        Row (
            modifier = Modifier.weight(1f)
        ) {
            QuadrantCard(
                backgroundColor = Color(0xFFB69DF8),
                title = stringResource(R.string.title3),
                content = stringResource(R.string.content3),
                modifier = Modifier.weight(1f)
            )
            QuadrantCard(
                backgroundColor = Color(0xFFF6EDFF),
                title = stringResource(R.string.title4),
                content = stringResource(R.string.content4),
                modifier = Modifier.weight(1f)
            )
        }
    }
}

@Composable
fun QuadrantCard(
    backgroundColor: Color,
    title: String,
    content: String,
    modifier: Modifier
) {
    Column(
        modifier = modifier
            .fillMaxHeight()
            .fillMaxWidth()
            .background(backgroundColor)
            .padding(16.dp),
        verticalArrangement = Arrangement.Center,
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        Text(
            text = title,
            fontWeight = FontWeight.Bold,
            modifier = Modifier.padding(bottom = 16.dp)
        )
        Text(
            text = content,
            textAlign = TextAlign.Justify
        )
    }
}


// Complete Work Card
@Composable
fun ArticleCompleteCard() {
    Column (
        modifier = Modifier
            .fillMaxHeight()
            .fillMaxWidth(),
        verticalArrangement = Arrangement.Center,
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        Image(painter = painterResource(R.drawable.ic_task_completed), contentDescription = null)
        Text(
            text = stringResource(R.string.completedMessage),
            fontWeight = FontWeight.Bold,
            modifier = Modifier.padding(top = 24.dp, bottom = 8.dp)
        )
        Text(
            text = stringResource(R.string.niceWork),
            fontSize = 16.sp
        )
    }
}





// Article Card
@Composable
fun ComposeArticleCard() {
    ArticleCard(
        title = stringResource(R.string.title),
        explanation = stringResource(R.string.explanation),
        content = stringResource(R.string.content),
        image = painterResource(R.drawable.bg_compose_background)
    )
}

@Composable
fun ArticleCard(
    title: String,
    explanation: String,
    image: Painter,
    content: String,
    modifier: Modifier = Modifier
) {
    Column {
        Image(painter = image, contentDescription = null)
        Text (
            text = title,
            modifier = Modifier.padding(16.dp),
            fontSize = 24.sp
        )
        Text(
            text = explanation,
            modifier = Modifier.padding(start = 16.dp, end = 16.dp),
            textAlign = TextAlign.Justify
        )
        Text(
            text = content,
            modifier = Modifier.padding(16.dp),
            textAlign = TextAlign.Justify
        )
    }
}
