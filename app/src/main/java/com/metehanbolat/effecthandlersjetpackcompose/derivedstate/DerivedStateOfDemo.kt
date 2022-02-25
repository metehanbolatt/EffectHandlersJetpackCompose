package com.metehanbolat.effecthandlersjetpackcompose.derivedstate

import androidx.compose.material.Button
import androidx.compose.material.Text
import androidx.compose.runtime.*

@Composable
fun DerivedStateOfDemo() {
    var counter by remember { mutableStateOf(0) }

    /** normalText */
    val counterText = "The counter is $counter"

    /** derivedStateOf */
    val derivedCounterText by derivedStateOf { "The counter is $counter" }

    Button(onClick = {  counter++ }) {
        Text(text = derivedCounterText)
    }
}