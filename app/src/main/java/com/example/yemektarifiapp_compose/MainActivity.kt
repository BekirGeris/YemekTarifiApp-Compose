package com.example.yemektarifiapp_compose

import android.annotation.SuppressLint
import android.os.Bundle
import android.util.Log
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.aspectRatio
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.material3.TopAppBar
import androidx.compose.material3.TopAppBarDefaults
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.colorResource
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.yemektarifiapp_compose.ui.theme.YemekTarifiAppComposeTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            YemekTarifiAppComposeTheme {
                // A surface container using the 'background' color from the theme
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colorScheme.background
                ) {
                    Page()
                }
            }
        }
    }
}

@SuppressLint("UnusedMaterial3ScaffoldPaddingParameter")
@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun Page() {
    val appBarHeight = 56.dp
    Scaffold(
        topBar = {
            TopAppBar(
                title = { MyText(text = "Yemek Tarifi") },
                colors = TopAppBarDefaults.smallTopAppBarColors(
                    containerColor = colorResource(id = R.color.primary),
                    titleContentColor = colorResource(id = R.color.white)
                )
            )
        },
        content = {
            Column(
                horizontalAlignment = Alignment.CenterHorizontally,
                modifier = Modifier
                    .fillMaxSize()
                    .padding(top = appBarHeight)
            ) {
                Image(
                    painter = painterResource(id = R.drawable.img),
                    contentDescription = "",
                    modifier = Modifier
                        .fillMaxWidth()
                        .aspectRatio(1f)
                )
                Row(
                    modifier = Modifier.fillMaxWidth()
                ) {
                    Button(
                        onClick = { Log.d("bekbek", "Like") },
                        colors = ButtonDefaults.buttonColors(
                            containerColor = colorResource(id = R.color.primary)
                        ),
                        modifier = Modifier.weight(50f),
                        shape = RoundedCornerShape(8.dp)
                    ) {
                        MyText(text = "Like")
                    }
                    Button(
                        onClick = { Log.d("bekbek", "Comment") },
                        colors = ButtonDefaults.buttonColors(
                            containerColor = colorResource(id = R.color.primary)
                        ),
                        modifier = Modifier.weight(50f),
                        shape = RoundedCornerShape(8.dp)
                    ) {
                        MyText(text = "Comment")
                    }
                }

                Column(
                    modifier = Modifier
                        .fillMaxWidth()
                        .padding(all = 10.dp)
                ) {
                    Text(
                        text = "Köfte",
                        color = colorResource(id = R.color.alternativePrimary),
                        fontSize = 18.sp,
                    )
                    Row(
                        modifier = Modifier.fillMaxWidth(),
                        horizontalArrangement = Arrangement.SpaceBetween
                    ) {
                        MyText(text = "Izgaraya Uygun")
                        MyText(text = "7 Haziran")
                    }
                    Text(
                        text = "dafvnh owqav noea woa nfqwanen qwkek nwqkaKDCNK AWNSEK NFKASNEDKNFKC NASKDENKSANDEKFN ASKND",
                        modifier = Modifier.padding(all = 10.dp),
                        textAlign = TextAlign.Center
                    )
                }
            }
        }
    )
}

@Composable
fun MyText(text: String) {
    Text(text = text)
}

@Preview(showBackground = true)
@Composable
fun GreetingPreview() {
    YemekTarifiAppComposeTheme {
        Page()
    }
}