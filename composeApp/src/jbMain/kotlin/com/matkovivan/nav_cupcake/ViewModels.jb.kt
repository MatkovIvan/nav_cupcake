package com.matkovivan.nav_cupcake

import androidx.compose.runtime.Composable
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewmodel.initializer
import androidx.lifecycle.viewmodel.viewModelFactory
import com.matkovivan.nav_cupcake.ui.OrderViewModel
import kotlin.reflect.KClass

val VIEW_MODEL_FACTORY = viewModelFactory {
    initializer { OrderViewModel() }
}

@Composable
internal actual fun <VM : ViewModel> viewModel(
    modelClass: KClass<VM>
): VM = androidx.lifecycle.viewmodel.compose.viewModel(modelClass, factory = VIEW_MODEL_FACTORY)