package com.metehanbolat.effecthandlersjetpackcompose

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import com.metehanbolat.effecthandlersjetpackcompose.ui.theme.EffectHandlersJetpackComposeTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            EffectHandlersJetpackComposeTheme {

            }
        }
    }
}
