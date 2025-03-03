package br.senai.sp.jandira.bmi.screens

import androidx.compose.foundation.BorderStroke
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Button
import androidx.compose.material3.Card
import androidx.compose.material3.Text
import androidx.compose.material3.TextField
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Brush
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.RectangleShape
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import br.senai.sp.jandira.bmi.R

@Composable
fun HomeScreen(modifier: Modifier = Modifier) {
    Box(
        modifier = Modifier
            .fillMaxSize()
            .background(
               brush = Brush.linearGradient(
                   listOf(
                       Color(0xFF007AE7),
                       Color(0xFF243298),
                       Color(0xFF2A64BB),
                       Color(0xFF2E8577)
                   )
               )
            )
    ){
      Column(
          modifier =Modifier
              .fillMaxSize()
              .background(Color.Transparent),
          verticalArrangement = Arrangement.SpaceBetween,
          horizontalAlignment = Alignment.CenterHorizontally
      ){
          Image(
              painter = painterResource(
                  R.drawable.sport
              ),
              contentDescription = "",
              modifier = Modifier
                  .padding(
                      top = 32.dp
                  )
          )
          Text(
              text = stringResource(
                  R.string.welcome
              ),
              fontSize = 30.sp,
              color = Color.White,
              fontWeight = FontWeight.SemiBold
          )
          Card(
              modifier = Modifier
                  .fillMaxWidth()
                  .height(400.dp),
              shape = RoundedCornerShape(
                  topStart = 60.dp,
                  topEnd = 60.dp
              ),
          ) {
              Column(
                  modifier = Modifier
                      .fillMaxSize()
                      .padding(32.dp)
              ) {
                  Column(
                      modifier = Modifier
                          .fillMaxWidth()
                          .height(150.dp)
                  ) { Text(
                      text = stringResource(
                          R.string.your_name
                      ),

                  ) }
                  Button(onClick = {}) {
                      Text(
                          text = stringResource(
                              R.string.next
                          )
                      )
                  }
              }
          }
      }
    }
}

@Preview
@Composable
private fun HomeScreenPreview() {
    HomeScreen()
}
