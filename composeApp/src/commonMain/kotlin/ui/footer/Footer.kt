package ui.footer

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.padding
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import getPlatform
import space12

@Composable
fun Footer(
    modifier: Modifier = Modifier,
) {
    Row(
        modifier = modifier
            .padding(all = space12),
        horizontalArrangement = Arrangement.SpaceBetween,
        verticalAlignment = Alignment.CenterVertically,
    ) {
        Text(
            text = "Footer",
            modifier = Modifier
                .background(Color.Blue),
            style = MaterialTheme.typography.h1
        )

        Column(
            modifier = Modifier.align(Alignment.Bottom),
        ) {
            Text(
                text = getPlatform().name,
                modifier = Modifier
                    .align(Alignment.End),
                style = MaterialTheme.typography.subtitle1,
            )
            Text(
                text = "ⓒ 2024. keelim Inc. All rights reserved.",
                modifier = Modifier
                    .align(Alignment.End),
                style = MaterialTheme.typography.subtitle1,
            )
        }
    }
}