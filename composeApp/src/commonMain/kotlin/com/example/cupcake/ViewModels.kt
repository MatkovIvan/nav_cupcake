package com.example.cupcake

import androidx.lifecycle.viewmodel.initializer
import androidx.lifecycle.viewmodel.viewModelFactory
import com.example.cupcake.ui.OrderViewModel

val VIEW_MODEL_FACTORY = viewModelFactory {
    initializer { OrderViewModel() }
}
