package com.metehanbolat.effecthandlersjetpackcompose

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.material.Button
import androidx.compose.material.Text
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import com.metehanbolat.effecthandlersjetpackcompose.ui.theme.EffectHandlersJetpackComposeTheme

class MainActivity : ComponentActivity() {

    private var i = 0

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            var text by remember { mutableStateOf("") }
            EffectHandlersJetpackComposeTheme {
                Button(onClick = { text += "#"}) {
                    i++ /** That would be considered a side-effect because that is something that escapes the scope of a composable function. */
                    Text(text = text)
                }

            }
        }
    }
}
