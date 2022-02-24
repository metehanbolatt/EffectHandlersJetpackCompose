package com.metehanbolat.effecthandlersjetpackcompose

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.material.Button
import androidx.compose.material.Text
import androidx.compose.runtime.*
import com.metehanbolat.effecthandlersjetpackcompose.ui.theme.EffectHandlersJetpackComposeTheme
import kotlinx.coroutines.delay

class MainActivity : ComponentActivity() {

    private var i = 0

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            var text by remember { mutableStateOf("") }
            EffectHandlersJetpackComposeTheme {
                LaunchedEffect(key1 = text) {
                    delay(1000L)
                    println("The text is $text")
                }
            }
        }
    }
}
