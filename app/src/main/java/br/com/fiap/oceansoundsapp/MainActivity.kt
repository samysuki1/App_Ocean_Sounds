package br.com.fiap.oceansoundsapp

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.BorderStroke
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.offset
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.Card
import androidx.compose.material3.CardDefaults
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.colorResource
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import br.com.fiap.oceansoundsapp.ui.theme.OceanSoundsAppTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            OceanSoundsAppTheme {
                // A surface container using the 'background' color from the theme
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colorScheme.background
                ) {
                    OceanSoundsAppScreen()
                }
            }
        }
    }
}

@Composable
fun OceanSoundsAppScreen() {
    Box(
        modifier = Modifier.fillMaxSize()
    ) {
        Column(
            modifier = Modifier
                .fillMaxWidth()
        ) {
            // ---- header ---------
            Column(
                horizontalAlignment = Alignment.CenterHorizontally,
                modifier = Modifier
                    .fillMaxWidth()
                    .height(260.dp)
                    .background(colorResource(id = R.color.purple_700))
            ) {
                Image(
                    painter = painterResource(id = R.drawable.recompensas),
                    contentDescription = "Imagem Recompensas de Leitura"
                )
            }
            // --- formulário
            Column(
                modifier = Modifier
                    .fillMaxWidth()
                    .padding(horizontal = 32.dp)
            ) {
                Card(
                    modifier = Modifier
                        .offset(y = (-15).dp)
                        .fillMaxWidth()
                        .height(300.dp),
                    colors = CardDefaults
                        .cardColors(containerColor = Color.White),
                    elevation = CardDefaults.cardElevation(4.dp),
                    border = BorderStroke(width = 2.dp, Color.Cyan)
                ) {
                    Column(
                        horizontalAlignment = Alignment.CenterHorizontally,
                        verticalArrangement = Arrangement.SpaceEvenly,
                        modifier = Modifier
                            .background(Color.White)
                            .fillMaxWidth()
                            .fillMaxHeight()
                    ) {
                        Text(
                            text = "Baú de Tesouros",
                            fontSize = 20.sp,
                            fontWeight = FontWeight.Bold,
                            color = Color.Blue
                        )
                        Button(onClick = { /*TODO*/ },
                            shape = RoundedCornerShape(8.dp),
                            colors = ButtonDefaults.buttonColors(containerColor = Color.Blue),
                            border = BorderStroke(width = 3.dp, Color.Cyan)
                        ) {
                            Text(text = "Iniciar Pesquisa")
                        }
                        Button(onClick = { /*TODO*/ },
                            shape = RoundedCornerShape(8.dp),
                            colors = ButtonDefaults.buttonColors(containerColor = Color.Blue),
                            border = BorderStroke(width = 3.dp, Color.Cyan)) {
                            Text(text = "Pesquisa Concluída")
                        }
                    }
                }
            }
        }

        // -- Card Resultado
        Card(
            modifier = Modifier
                .offset(y = (570).dp, x = (20).dp)
                .height(190.dp),
            colors = CardDefaults
                .cardColors(containerColor = Color.White)
        ) {
            Image(
                painter = painterResource(id = R.drawable.mapa),
                contentDescription = "Imagem Mapa de Esforços Locais")

        }
    }
}