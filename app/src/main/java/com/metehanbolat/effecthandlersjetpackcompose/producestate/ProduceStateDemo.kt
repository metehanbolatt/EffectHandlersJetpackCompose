package com.metehanbolat.effecthandlersjetpackcompose.producestate

import androidx.compose.runtime.Composable
import androidx.compose.runtime.State
import androidx.compose.runtime.collectAsState
import androidx.compose.runtime.produceState
import kotlinx.coroutines.delay
import kotlinx.coroutines.flow.flow

@Composable
fun produceStateDemo(countUpTo: Int): State<Int> {
    return produceState(initialValue = 0) {
        while (value < countUpTo) {
            delay(1000L)
            value++
        }
    }
}

/** We can use produce state instead of the flow structure below. */
@Composable
fun flowCollector(countUpTo: Int): State<Int> {
    return flow {
        var value = 0
        while (value < countUpTo) {
            delay(1000L)
            value++
            emit(value)
        }
    }.collectAsState(initial = 0)
}