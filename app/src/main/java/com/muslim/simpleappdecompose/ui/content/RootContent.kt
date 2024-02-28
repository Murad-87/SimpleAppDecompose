package com.muslim.simpleappdecompose.ui.content

import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import com.arkivanov.decompose.extensions.compose.jetpack.stack.Children
import com.muslim.simpleappdecompose.presentation.DefaultRootComponent
import com.muslim.simpleappdecompose.presentation.RootComponent
import com.muslim.simpleappdecompose.ui.theme.SimpleAppDecomposeTheme

@Composable
fun RootContent(
    component: DefaultRootComponent
) {

    SimpleAppDecomposeTheme {
        Box(modifier = Modifier.fillMaxSize()) {
            Children(stack = component.stack) {
                when (val instance = it.instance) {

                    is RootComponent.Child.AddContact -> {
                        AddContact(component = instance.component)
                    }

                    is RootComponent.Child.ContactList -> {
                        Contacts(component = instance.component)
                    }

                    is RootComponent.Child.EditContact -> {
                        EditContact(component = instance.component)
                    }
                }
            }
        }
    }
}