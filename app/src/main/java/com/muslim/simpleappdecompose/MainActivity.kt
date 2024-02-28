package com.muslim.simpleappdecompose

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import com.arkivanov.decompose.defaultComponentContext
import com.muslim.simpleappdecompose.presentation.DefaultRootComponent
import com.muslim.simpleappdecompose.ui.content.RootContent

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        val root = DefaultRootComponent(componentContext = defaultComponentContext())
        setContent {
            RootContent(component = root)
        }
    }
}