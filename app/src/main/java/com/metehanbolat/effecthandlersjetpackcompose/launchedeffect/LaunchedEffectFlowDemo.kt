package com.metehanbolat.effecthandlersjetpackcompose.launchedeffect

import androidx.compose.runtime.Composable
import androidx.compose.runtime.LaunchedEffect
import kotlinx.coroutines.flow.collect

@Composable
fun LaunchedEffectFlowDemo(viewModel: LaunchedEffectViewModel) {
    LaunchedEffect(key1 = true) { /** If key is true, that means scope run only once. */
        viewModel.sharedFlow.collect { event ->
            when(event) {
                is LaunchedEffectViewModel.ScreenEvents.ShowSnackbar -> {

                }
                is LaunchedEffectViewModel.ScreenEvents.Navigate -> {

                }
            }
        }
    }
}