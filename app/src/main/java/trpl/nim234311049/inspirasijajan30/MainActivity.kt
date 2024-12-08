package trpl.nim234311049.inspirasijajan30

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.material3.CenterAlignedTopAppBar
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.material3.TopAppBarDefaults
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.colorResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.sp
import trpl.nim234311049.inspirasijajan30.model.KueJajanRepository
import trpl.nim234311049.inspirasijajan30.ui.theme.InspirasiJajan30Theme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge() // Mengaktifkan tampilan edge-to-edge
        setContent {
            InspirasiJajan30Theme {
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colorScheme.background
                ) {
                    InspirasiJajanApp() // Memanggil aplikasi utama
                }
            }
        }
    }

    @Composable
    fun InspirasiJajanApp() {
        Scaffold(
            modifier = Modifier.fillMaxSize(),
            topBar = {
                TopAppBar() // Menampilkan TopAppBar
            }
        ) {
            val kue = KueJajanRepository.kue
            KueJajanList(kue = kue, contentPadding = it) // Menampilkan daftar kue
        }
    }

    @OptIn(ExperimentalMaterial3Api::class)
    @Composable
    fun TopAppBar(modifier: Modifier = Modifier) {
        CenterAlignedTopAppBar(
            title = {
                Text(
                    text = stringResource(R.string.top_bar), // Judul TopAppBar dari string resource
                    fontSize = 25.sp,
                    style = MaterialTheme.typography.displayMedium,
                    color = colorResource(id = R.color.white),
                    modifier = Modifier.fillMaxWidth(),
                    textAlign = TextAlign.Center
                )
            },
            colors = TopAppBarDefaults.centerAlignedTopAppBarColors(
                containerColor = colorResource(id = R.color.ungu)
            ),
            modifier = modifier
        )
    }

    @Preview(showBackground = true)
    @Composable
    fun GreetingPreview() {
        InspirasiJajan30Theme {
            InspirasiJajanApp() // Menampilkan aplikasi di preview
        }
    }
}
