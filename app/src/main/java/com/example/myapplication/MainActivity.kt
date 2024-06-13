package com.example.myapplication

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Card
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.myapplication.ui.theme.MyApplicationTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        setContent {
            ImageCard()

        }
    }

    @Composable
    fun ImageCard() {
        Card(
            shape = RoundedCornerShape(8.dp)
        ) {
            Box(modifier = Modifier.height(200.dp)) {


            }
        }
    }

    @Composable
    fun Greeting(name: String) {
        Text(text = "hello $name!")
    }

    @Preview(showBackground = true)
    @Composable
    fun DefaultPreivew() {
        MyApplicationTheme {
            Greeting("성공")
        }
    }

    @Preview(showBackground = true)
    @Composable
    fun DefaultPreivew2() {
        MyApplicationTheme {
            Greeting("성공")
        }
    }
}
