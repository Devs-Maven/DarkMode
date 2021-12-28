package com.example.darkmode

import androidx.compose.foundation.isSystemInDarkTheme
import androidx.compose.material.*
import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.Color


    private val customDarkColor = darkColors(
        primary = Color.Black,
        secondary = Color.White,
        background = Color.DarkGray,
    )

    private val customLightColor = lightColors(
        primary = Color.Yellow,
        secondary = Color.Black,
        background = Color.White
    )

    @Composable
    fun CustomTheme(
        darkTheme: Boolean = isSystemInDarkTheme(),
        content: @Composable () -> Unit
    ){
        val customColors = if(darkTheme) customDarkColor
                            else customLightColor
        MaterialTheme(
            colors = customColors,
            content = content
        )
    }