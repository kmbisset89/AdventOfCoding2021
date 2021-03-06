import androidx.compose.material.MaterialTheme
import androidx.compose.desktop.ui.tooling.preview.Preview
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.material.Button
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.window.Window
import androidx.compose.ui.window.application

@Composable
@Preview
fun App() {
    var day1 by remember { mutableStateOf("Run Challenge : Day 1") }
    var day2 by remember { mutableStateOf("Run Challenge : Day 2") }

    MaterialTheme {
        Column(Modifier.fillMaxWidth()) {
            Text("Advent Of Code Challenge", modifier = Modifier.fillMaxWidth().align(Alignment.CenterHorizontally))
            Button(onClick = { day1 = DayOneChallenge.runTask(Part.TWO) }, modifier = Modifier.fillMaxWidth()) {
                Text(day1)
            }
            Button(onClick = { day2 = DayTwoChallenge.runChallenge(Part.ONE) }, modifier = Modifier.fillMaxWidth()) {
                Text(day2)
            }
        }
    }
}

fun main() = application {
    Window(onCloseRequest = ::exitApplication) {
        App()
    }
}
