package ui.article

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import space12
import space8

val items = listOf(
    "SSL Pinning"
)
@Composable
fun Article(
    modifier: Modifier = Modifier,
) {
    LazyColumn(
        modifier = modifier.padding(
            vertical = space8,
            horizontal = space12,
        ),
        verticalArrangement = Arrangement.spacedBy(space12)
    ) {
        item {
            Text(
                text = "Article",
                style = MaterialTheme.typography.displaySmall,

            )
        }
        items(items) {item ->
            Text(
                text = item,
                style = MaterialTheme.typography.bodyMedium,
            )
        }
    }
}