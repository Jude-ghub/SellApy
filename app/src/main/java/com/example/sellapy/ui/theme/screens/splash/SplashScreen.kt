package com.example.sellapy.ui.theme.screens.splash

import android.annotation.SuppressLint
import android.window.SplashScreen
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.Card
import androidx.compose.material3.CardDefaults
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.rememberCoroutineScope
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavController
import androidx.navigation.compose.rememberNavController
import com.example.sellapy.R
import com.example.sellapy.navigation.ROUT_DASHBOARD
import com.example.sellapy.navigation.ROUT_DETAIL
import com.example.sellapy.ui.theme.Purple80
import com.example.sellapy.ui.theme.Yellow
import kotlinx.coroutines.delay
import kotlinx.coroutines.launch


@SuppressLint("CoroutineCreationDuringComposition")
@Composable
fun SplashScreen(navController: NavController){

    Column(modifier = Modifier.fillMaxSize()) {

        val coroutine = rememberCoroutineScope()
        coroutine.launch {
            delay(3000)
            navController.navigate(ROUT_DASHBOARD)
        }

        Card(
            modifier = Modifier
                .fillMaxWidth()
                .height(400.dp),
            shape = RoundedCornerShape(bottomStart = 50.dp, bottomEnd = 50.dp),
            colors = CardDefaults.cardColors(Purple80)
        ){
            Column(
                verticalArrangement = Arrangement.Center,
                horizontalAlignment = Alignment.CenterHorizontally,
                modifier = Modifier.fillMaxSize()
            ){
                Image(
                    painter = painterResource(id = R.drawable.img_1) ,
                    contentDescription = "",
                    modifier = Modifier.size(100.dp)
                )

                Text(
                    text = "Welcome to SellApy",
                    fontSize = 40.sp,
                    fontFamily = FontFamily.Cursive,
                    color = Color.Yellow
                )

                Text(
                    text = "Your home for tech gadgets",
                    fontSize = 20.sp,
                    fontFamily = FontFamily.Cursive,
                    color = Color.Yellow
                )
            }
        }

        Spacer(modifier = Modifier.height(30.dp))


        Text(
            text = "Technological device means any computer, cellular phone, smartphone, digital camera, video camera, audio recording device, or other electronic device that can be used for creating, storing, or transmitting information in the form of electronic data.",
            fontSize = 15.sp,
            color = Color.DarkGray,
            textAlign = TextAlign.Center,
            modifier = Modifier.fillMaxWidth()
        )

        Spacer(modifier = Modifier.height(15.dp))

        Button(
            onClick = {  },
            colors = ButtonDefaults.buttonColors(Yellow),
            modifier = Modifier
                .fillMaxWidth()
                .padding(30.dp, 30.dp)
        ) {
            Text(text = "LET'S BEGIN")
        }

    }



}

@Composable
@Preview(showBackground = true)
fun SplashScreen(){
    SplashScreen(rememberNavController())
}
