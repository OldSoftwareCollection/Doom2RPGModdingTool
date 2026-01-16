package com.autumnfall.d2rpgmoddingtool

import androidx.compose.ui.window.Window
import androidx.compose.ui.window.application

fun main() = application {
    Window(
        onCloseRequest = ::exitApplication,
        title = "Doom2RPG Modding Tool",
    ) {
        App()
    }
}