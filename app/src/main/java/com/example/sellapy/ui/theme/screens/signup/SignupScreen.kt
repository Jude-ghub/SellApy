package com.example.sellapy.ui.theme.screens.signup

import androidx.compose.foundation.Image
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.text.KeyboardActions
import androidx.compose.foundation.text.KeyboardOptions
import androidx.compose.foundation.verticalScroll
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Email
import androidx.compose.material.icons.filled.Lock
import androidx.compose.material.icons.filled.Person
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.Icon
import androidx.compose.material3.OutlinedTextField
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.paint
import androidx.compose.ui.input.key.Key
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.input.KeyboardType
import androidx.compose.ui.text.input.PasswordVisualTransformation
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavController
import androidx.navigation.compose.rememberNavController
import com.example.sellapy.R
import com.example.sellapy.data.AuthViewModel
import com.example.sellapy.navigation.ROUT_LOGIN
import com.example.sellapy.ui.theme.PurpleGrey80
import com.example.sellapy.ui.theme.Yellow


@Composable
fun SignupScreen(navController: NavController){

    Column (modifier = Modifier
        .fillMaxSize()
        .verticalScroll(rememberScrollState())
        .paint(
            painterResource(id = R.drawable.bak),
            contentScale = ContentScale.FillBounds
        ),
        horizontalAlignment = Alignment.CenterHorizontally
    ){
        Spacer(modifier = Modifier.height(20.dp))

        Image(
            painter = painterResource(id = R.drawable.img) ,
            contentDescription = "product",
            modifier = Modifier.size(100.dp)
        )

        Spacer(modifier = Modifier.height(10.dp))

        Text(
            text = "SellApy",
            fontSize = 50.sp,
            fontFamily = FontFamily.Cursive,
            color = PurpleGrey80
        )

        Spacer(modifier = Modifier.height(10.dp))

        Text(
            text = "Don't have an account? Create account",
            fontSize = 20.sp,
            fontFamily = FontFamily.SansSerif,
            color = Yellow
        )

        var name by remember { mutableStateOf("") }
        var email by remember { mutableStateOf("") }
        var password by remember { mutableStateOf("") }
        var confpassword by remember { mutableStateOf("") }

        OutlinedTextField(
            value = name ,
            onValueChange = { name = it},
            modifier = Modifier
                .fillMaxWidth()
                .padding(10.dp, 10.dp),
            leadingIcon = { Icon(imageVector = Icons.Default.Person, contentDescription = "", tint = PurpleGrey80)},
            label = { Text(text = "Fullname")},
            keyboardOptions = KeyboardOptions( keyboardType = KeyboardType.Text)
        )

        Spacer(modifier = Modifier.height(10.dp))

        OutlinedTextField(
            value = email ,
            onValueChange = { email = it},
            modifier = Modifier
                .fillMaxWidth()
                .padding(10.dp, 10.dp),
            leadingIcon = { Icon(imageVector = Icons.Default.Email, contentDescription = "", tint = PurpleGrey80)},
            label = { Text(text = "Email")},
            keyboardOptions = KeyboardOptions( keyboardType = KeyboardType.Email)
        )

        Spacer(modifier = Modifier.height(10.dp))

        OutlinedTextField(
            value = password ,
            onValueChange = { password = it},
            modifier = Modifier
                .fillMaxWidth()
                .padding(10.dp, 10.dp),
            leadingIcon = { Icon(imageVector = Icons.Default.Lock, contentDescription = "", tint = PurpleGrey80)},
            label = { Text(text = "Password")},
            keyboardOptions = KeyboardOptions( keyboardType = KeyboardType.Password),
            visualTransformation = PasswordVisualTransformation()
        )

        Spacer(modifier = Modifier.height(10.dp))

        OutlinedTextField(
            value = confpassword ,
            onValueChange = { confpassword = it},
            modifier = Modifier
                .fillMaxWidth()
                .padding(10.dp, 10.dp),
            leadingIcon = { Icon(imageVector = Icons.Default.Lock, contentDescription = "", tint = PurpleGrey80)},
            label = { Text(text = "Confirm password")},
            keyboardOptions = KeyboardOptions( keyboardType = KeyboardType.Password),
            visualTransformation = PasswordVisualTransformation()
        )

        Spacer(modifier = Modifier.height(10.dp))

        val context = LocalContext.current
        val authViewModel = AuthViewModel(navController, context)

        Button(
            onClick = { authViewModel.signup(email, password, confpassword) },
            colors = ButtonDefaults.buttonColors(PurpleGrey80)
        ) {
            Text(text = "Create an account")
        }

        Spacer(modifier = Modifier.height(10.dp))

        Button(onClick = { navController.navigate(ROUT_LOGIN) }) {
            Text(
                text = "Already have an account, Log in",
                fontSize = 20.sp,
                fontFamily = FontFamily.SansSerif,
                color = Yellow,
                modifier = Modifier.clickable { navController.navigate(ROUT_LOGIN) }
            )

        }






    }



}

@Composable
@Preview(showBackground = true)
fun SignupScreenPreview(){
    SignupScreen(rememberNavController())
}
