package com.example.myapplication

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.myapplication.ui.theme.MyApplicationTheme
import androidx.compose.ui.graphics.Color

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
          Box(modifier = Modifier
              .background(color = Color.Green)
              .fillMaxWidth().height(200.dp),
              contentAlignment = Alignment.TopEnd){
              Text(text = "hello ")
              Box (modifier =  Modifier.fillMaxSize().padding(16.dp),
                  contentAlignment =  Alignment.BottomEnd){

                  Text(text = "1456464566523 ")
              }
          }

    }
}

@Composable
fun  Greeting(name:String){
        Text(text = "hello $name!")
}

@Preview(showBackground = true)
@Composable
fun DefaultPreivew(){
    MyApplicationTheme{
        Greeting("성공")
    }
}
@Preview(showBackground = true)
@Composable
fun DefaultPreivew2(){
    MyApplicationTheme{
        Greeting("성공")
    }
}}
