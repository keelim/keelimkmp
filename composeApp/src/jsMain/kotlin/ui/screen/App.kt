package ui.screen

import androidx.compose.runtime.Composable
import org.jetbrains.compose.web.dom.Div
import org.jetbrains.skia.Color

@Composable
fun App() {
    Div(
        attrs = {
            style {
                property("background-color", Color.RED)
            }
        },
    )
}
