package com.example.darkmode

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.isSystemInDarkTheme
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material.*
import androidx.compose.runtime.*
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.sp

    class MainActivity : ComponentActivity() {
        override fun onCreate(savedInstanceState: Bundle?) {
            super.onCreate(savedInstanceState)
            setContent {
                CustomTheme{
                    HomeScreen()
                }
            }
        }
    }


@Composable
fun HomeScreen() {

    val uiMode = isSystemInDarkTheme()
    Scaffold(
        topBar = {
            TopAppBar(
                title = {
                    Text(
                      if(uiMode) "Dark Mode" else "Light Mode",
                        color = MaterialTheme.colors.secondary
                    )
                },
                backgroundColor = MaterialTheme.colors.primary
            )
        },
        backgroundColor = MaterialTheme.colors.background
    ){
        Column(
            Modifier.fillMaxSize(),
            Arrangement.Center,
            Alignment.CenterHorizontally
        ){
            Text(
                "Jetpack Compose",
                color = MaterialTheme.colors.secondary
            )
        }
    }
}