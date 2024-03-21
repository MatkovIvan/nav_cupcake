package com.matkovivan.nav_cupcake

import androidx.compose.runtime.Composable
import androidx.lifecycle.ViewModel
import kotlin.reflect.KClass

// Temp workaround: There is no binary compatiable overload published on Android yet.
@Composable
internal expect fun <VM : ViewModel> viewModel(
    modelClass: KClass<VM>
): VM
