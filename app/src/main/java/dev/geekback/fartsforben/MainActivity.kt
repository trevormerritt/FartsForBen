package dev.geekback.fartsforben

import android.media.MediaPlayer
import android.os.Bundle
import android.widget.Button
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.ExperimentalLayoutApi
import androidx.compose.foundation.layout.FlowRow
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.material3.TextButton
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import dev.geekback.fartsforben.ui.theme.FartsForBenTheme

class MainActivity : ComponentActivity() {
    private var mediaPlayer: MediaPlayer? = null
    private val farts: Array<Int> = arrayOf(
        R.raw.dry_fart,
        R.raw.awesome_3,
        R.raw.wet_fart_1,
        R.raw.rec_10s_nelgvad,
        R.raw.fartmeme,
        R.raw.fart_4_228242,
        R.raw.short_fart_185140,
        R.raw.fart_83471,
        R.raw.fart_9_228245,
        R.raw.fart9,
        R.raw.rec_3s_15,
        R.raw.fart_1_228241,
        R.raw.fart_sound_effect_c,
        R.raw.fart_meme_sound,
        R.raw.fart_6_228248,
        R.raw.huge_fart_89723,
        R.raw.fart_noises_83359,
        R.raw.fart_squeeze_60793,
        R.raw.fart_with_reverb,
        R.raw.fart_2,
        R.raw.fart_7_228246,
        R.raw.wet_fart_6139,
        R.raw.fart_145914,
        R.raw.dry_fart_3,
        R.raw.funny_fart_216687,
        R.raw.fart_with_extra_reverb,
        R.raw.fart_91011,
        R.raw.mario_meme,
        R.raw.fart_8_228244,
        R.raw.fart_107648
    )

    @OptIn(ExperimentalLayoutApi::class)
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        mediaPlayer = MediaPlayer.create(this, R.raw.fart_2);

        enableEdgeToEdge()
        setContent {
            FartsForBenTheme {
                Scaffold(modifier = Modifier.fillMaxSize()) { innerPadding ->
                    Column(
                        horizontalAlignment = Alignment.CenterHorizontally,
                        modifier = Modifier
                        .padding(innerPadding)) {
                        Text("There are " + farts.size + " farts");

                        FlowRow(modifier = Modifier.padding(8.dp)) {
                            farts.forEach {
                                TextButton({
                                    println("Down");
                                    MediaPlayer.create(applicationContext, it).start();
                                }) {
                                    Text("Fart " + resources.getResourceEntryName(it));
                                } //  val b = Button(applicationContext);

                            }
                        }
                    }
                }
            }
        }
    }
}

@Composable
fun Greeting(name: String, modifier: Modifier = Modifier) {

    Box (modifier) {

    }


    Text(
        text = "Hello $name!",
        modifier = modifier
    )
}

@Preview(showBackground = true)
@Composable
fun GreetingPreview() {
    FartsForBenTheme {
        Greeting("Android")
    }
}