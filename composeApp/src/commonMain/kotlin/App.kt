
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.verticalScroll
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.unit.dp
import com.keelim.kmp.Res
import com.keelim.kmp.aside
import com.keelim.kmp.header
import com.keelim.kmp.nav
import com.keelim.kmp.section
import org.jetbrains.compose.resources.stringResource
import ui.article.Article
import ui.aside.Aside
import ui.footer.Footer
import ui.header.Header
import ui.nav.Nav
import ui.section.Section

@Composable
fun App() {
    MaterialTheme {
        val scrollState = rememberScrollState()
        Column(
            modifier = Modifier
                .fillMaxSize()
                .background(Color.Black)
                .verticalScroll(scrollState)
            ,
            verticalArrangement = Arrangement.spacedBy(12.dp)
        ) {
            Header(
                modifier = Modifier
                    .weight(1f)
                    .fillMaxSize()
                    .background(Color.Black)
            ) {
                Text(
                    text = stringResource(Res.string.header),
                    modifier = Modifier
                        .background(Color.Blue),
                    style = MaterialTheme.typography.headlineSmall
                )
            }
            Nav(
                modifier = Modifier
                    .weight(1f)
                    .fillMaxSize()
                    .background(Color.Cyan)
            ) {
                Text(
                    text = stringResource(Res.string.nav),
                    modifier = Modifier
                        .background(Color.Blue),
                    style = MaterialTheme.typography.headlineSmall
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
                        text = stringResource(Res.string.section),
                        modifier = Modifier
                            .background(Color.Blue),
                        style = MaterialTheme.typography.headlineSmall
                    )
                }
                Article(
                    modifier = Modifier
                        .weight(5f)
                        .fillMaxSize()
                        .background(Color.Green),
                )
                Aside(
                    modifier = Modifier
                        .weight(2f)
                        .fillMaxSize()
                        .background(Color.Magenta)
                ) {
                    Text(
                        text = stringResource(Res.string.aside),
                        modifier = Modifier
                            .background(Color.Blue),
                        style = MaterialTheme.typography.headlineSmall
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
