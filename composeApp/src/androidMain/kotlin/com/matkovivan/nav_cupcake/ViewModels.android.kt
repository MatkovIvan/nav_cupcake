package com.matkovivan.nav_cupcake

import androidx.compose.runtime.Composable
import androidx.lifecycle.ViewModel
import kotlin.reflect.KClass

@Composable
internal actual fun <VM : ViewModel> viewModel(
    modelClass: KClass<VM>
): VM = androidx.lifecycle.viewmodel.compose.viewModel(modelClass.java)

