package com.example.sellapy.ui.theme.screens.dashboard

import android.widget.Space
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Card
import androidx.compose.material3.CardDefaults
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavController
import androidx.navigation.compose.rememberNavController
import com.example.sellapy.R
import com.example.sellapy.navigation.ROUT_DETAIL
import com.example.sellapy.navigation.ROUT_HOME
import com.example.sellapy.navigation.ROUT_INTENT
import com.example.sellapy.ui.theme.Brown
import com.example.sellapy.ui.theme.Purple80
import com.example.sellapy.ui.theme.PurpleGrey40
import com.example.sellapy.ui.theme.Yellow
import androidx.compose.foundation.clickable as clickable1


@Composable
fun DashboardScreen(navController: NavController){

    Column (
        modifier = Modifier
            .fillMaxSize()
            .background(PurpleGrey40),
        horizontalAlignment = Alignment.CenterHorizontally
        ){

        Spacer(modifier = Modifier.height(10.dp))

        Image(
            painter = painterResource(id = R.drawable.img) ,
            contentDescription = "product",
            modifier = Modifier.size(100.dp)
        )

        Spacer(modifier = Modifier.height(10.dp))

        Text(
            text = "The best online shop",
            fontSize = 20.sp,
            fontWeight = FontWeight.SemiBold,
            modifier = Modifier.fillMaxWidth(),
            textAlign = TextAlign.Center
        )

        Spacer(modifier = Modifier.height(30.dp))

        Column {
            Card (
                modifier = Modifier
                    .fillMaxWidth()
                    .height(700.dp).clickable1 {
                        navController.navigate(ROUT_HOME)
                    },
                shape = RoundedCornerShape(topStart = 50.dp, topEnd = 50.dp),
                colors = CardDefaults.cardColors(Purple80)
            ){

                //Row1
                Row(modifier = Modifier.padding(20.dp)) {
                    //Card1
                    Card (modifier = Modifier
                        .width(160.dp)
                        .height(180.dp)
                    ){
                        Spacer(modifier = Modifier.height(30.dp))

                        Box(
                            modifier = Modifier.fillMaxWidth(),
                            contentAlignment = Alignment.Center){
                            Image(
                                painter = painterResource(id = R.drawable.home) ,
                                contentDescription = "" ,
                                modifier = Modifier.size(100.dp))
                        }
                        Text(
                            text = "Home",
                            modifier = Modifier.fillMaxWidth(),
                            textAlign = TextAlign.Center,
                            fontSize = 20.sp,
                            fontWeight = FontWeight.SemiBold
                        )
                    }
                    //End of card1

                    Spacer(modifier = Modifier.width(30.dp))

                    //Card2
                    Card (modifier = Modifier
                        .width(160.dp)
                        .height(180.dp)
                    ){
                        Spacer(modifier = Modifier.height(30.dp))

                        Box(
                            modifier = Modifier.fillMaxWidth(),
                            contentAlignment = Alignment.Center){
                            Image(
                                painter = painterResource(id = R.drawable.profile) ,
                                contentDescription = "" ,
                                modifier = Modifier.size(100.dp))
                        }
                        Text(
                            text = "Profile",
                            modifier = Modifier.fillMaxWidth(),
                            textAlign = TextAlign.Center,
                            fontSize = 20.sp,
                            fontWeight = FontWeight.SemiBold
                        )
                    }
                    //End of card2
                }
                //End of row1

                //Row2
                Row(modifier = Modifier.padding(20.dp)) {
                    //Card3
                    Card (modifier = Modifier
                        .width(160.dp)
                        .height(180.dp)
                    ){
                        Spacer(modifier = Modifier.height(30.dp))

                        Box(
                            modifier = Modifier.fillMaxWidth(),
                            contentAlignment = Alignment.Center){
                            Image(
                                painter = painterResource(id = R.drawable.chats) ,
                                contentDescription = "" ,
                                modifier = Modifier.size(100.dp))
                        }
                        Text(
                            text = "Messages",
                            modifier = Modifier.fillMaxWidth(),
                            textAlign = TextAlign.Center,
                            fontSize = 20.sp,
                            fontWeight = FontWeight.SemiBold
                        )

                    }
                    //End of card3

                    Spacer(modifier = Modifier.width(30.dp))

                    //Card4
                    Card (modifier = Modifier
                        .width(160.dp)
                        .height(180.dp)
                    ){
                        Spacer(modifier = Modifier.height(30.dp))

                        Box(
                            modifier = Modifier.fillMaxWidth(),
                            contentAlignment = Alignment.Center){
                            Image(
                                painter = painterResource(id = R.drawable.settings) ,
                                contentDescription = "" ,
                                modifier = Modifier.size(100.dp))
                        }
                        Text(
                            text = "Settings",
                            modifier = Modifier.fillMaxWidth(),
                            textAlign = TextAlign.Center,
                            fontSize = 20.sp,
                            fontWeight = FontWeight.SemiBold
                        )
                    }
                    //End of card4
                }
                //End of row2

                //Row3
                Row(modifier = Modifier.padding(20.dp)) {
                    //Card5
                    Card (modifier = Modifier
                        .width(160.dp)
                        .height(180.dp)
                        .clickable1 { navController.navigate(ROUT_DETAIL) }
                    ){
                        Spacer(modifier = Modifier.height(30.dp))

                        Box(
                            modifier = Modifier.fillMaxWidth(),
                            contentAlignment = Alignment.Center){
                            Image(
                                painter = painterResource(id = R.drawable.products) ,
                                contentDescription = "" ,
                                modifier = Modifier.size(100.dp))
                        }
                        Text(
                            text = "Products",
                            modifier = Modifier.fillMaxWidth(),
                            textAlign = TextAlign.Center,
                            fontSize = 20.sp,
                            fontWeight = FontWeight.SemiBold
                        )

                    }
                    //End of card5

                    Spacer(modifier = Modifier.width(30.dp))

                    //Card6
                    Card (modifier = Modifier
                        .width(160.dp)
                        .height(180.dp)
                        .clickable { navController.navigate(ROUT_INTENT) }
                    ){
                        Spacer(modifier = Modifier.height(30.dp))

                        Box(
                            modifier = Modifier.fillMaxWidth(),
                            contentAlignment = Alignment.Center){
                            Image(
                                painter = painterResource(id = R.drawable.intent) ,
                                contentDescription = "" ,
                                modifier = Modifier.size(100.dp))
                        }
                        Text(
                            text = "Intent",
                            modifier = Modifier.fillMaxWidth(),
                            textAlign = TextAlign.Center,
                            fontSize = 20.sp,
                            fontWeight = FontWeight.SemiBold
                        )

                    }
                    //End of card6

                }
                //End of row3

            }
        }


    }



}

@Composable
@Preview(showBackground = true)
fun DashboardScreenPreview(){
    DashboardScreen(rememberNavController())
}
