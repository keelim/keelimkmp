package ui.screen

import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.text.BasicText
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp

@Composable
fun Header(
    modifier: Modifier = Modifier,
) {
    Row(
        modifier = modifier
            .padding(all = 16.dp)
            .fillMaxWidth(),
    ) {
        BasicText(
            text = "경제 캘린더",
        )
    }
}