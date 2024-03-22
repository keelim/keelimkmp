
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.unit.dp
import org.jetbrains.compose.resources.ExperimentalResourceApi
import ui.article.Article
import ui.aside.Aside
import ui.footer.Footer
import ui.header.Header
import ui.nav.Nav
import ui.section.Section

@OptIn(ExperimentalResourceApi::class)
@Composable
fun App() {
    MaterialTheme {
        Column(
            modifier = Modifier
                .fillMaxSize()
                .background(Color.Black),
            verticalArrangement = Arrangement.spacedBy(12.dp)
        ) {
            Header(
                modifier = Modifier
                    .weight(1f)
                    .fillMaxSize()
                    .background(Color.Black)
            ) {
                Text(
                    text = "Header",
                    modifier = Modifier
                        .background(Color.Blue),
                    style = MaterialTheme.typography.h1
                )
            }
            Nav(
                modifier = Modifier
                    .weight(1f)
                    .fillMaxSize()
                    .background(Color.Cyan)
            ) {
                Text(
                    text = "Nav",
                    modifier = Modifier
                        .background(Color.Blue),
                    style = MaterialTheme.typography.h1
                )
            }
            Row(
                modifier = Modifier
                    .weight(6f)
                    .fillMaxSize()
                    .background(Color.Red),
                horizontalArrangement = Arrangement.spacedBy(12.dp)
            ) {
                Section(
                    modifier = Modifier
                        .weight(2f)
                        .fillMaxSize()
                        .background(Color.Gray)
                ) {
                    Text(
                        text = "Section",
                        modifier = Modifier
                            .background(Color.Blue),
                        style = MaterialTheme.typography.h1
                    )
                }
                Article(
                    modifier = Modifier
                        .weight(5f)
                        .fillMaxSize()
                        .background(Color.Green),
                ) {
                    Text(
                        text = "Article",
                        modifier = Modifier
                            .background(Color.Blue),
                        style = MaterialTheme.typography.h1
                    )
                }
                Aside(
                    modifier = Modifier
                        .weight(2f)
                        .fillMaxSize()
                        .background(Color.Magenta)
                ) {
                    Text(
                        text = "Aside",
                        modifier = Modifier
                            .background(Color.Blue),
                        style = MaterialTheme.typography.h1
                    )
                }
            }
            Footer(
                modifier = Modifier
                    .weight(1.3f)
                    .fillMaxSize()
                    .background(Color.Yellow)
            )
        }
    }
}
