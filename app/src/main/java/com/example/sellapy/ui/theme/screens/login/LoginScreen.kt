package com.example.sellapy.ui.theme.screens.login

import androidx.compose.foundation.Image
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.text.KeyboardOptions
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Email
import androidx.compose.material.icons.filled.Lock
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
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.input.KeyboardType
import androidx.compose.ui.text.input.PasswordVisualTransformation
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavController
import androidx.navigation.compose.rememberNavController
import com.example.sellapy.R
import com.example.sellapy.data.AuthViewModel
import com.example.sellapy.navigation.ROUT_SIGNUP
import com.example.sellapy.ui.theme.PurpleGrey80
import com.example.sellapy.ui.theme.Yellow


@Composable
fun LoginScreen(navController: NavController){

    Column(modifier = Modifier.fillMaxWidth(),
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        Image(
            painter = painterResource(id = R.drawable.img) ,
            contentDescription = "product",
            modifier = Modifier.size(100.dp)
        )
        Spacer(modifier = Modifier.height(10.dp))

        Text(
            text = "Welcome back",
            fontSize = 50.sp,
            fontFamily = FontFamily.Cursive,
            color = PurpleGrey80
        )

        Spacer(modifier = Modifier.height(10.dp))

        Text(
            text = "Already have an account. Please enter your credentials",
            fontSize = 20.sp,
            fontFamily = FontFamily.SansSerif,
            color = Yellow,
            textAlign = TextAlign.Center
        )

        var email by remember { mutableStateOf("") }
        var password by remember { mutableStateOf("") }

        Spacer(modifier = Modifier.height(10.dp))

        OutlinedTextField(
            value = email ,
            onValueChange = { email = it},
            modifier = Modifier
                .fillMaxWidth()
                .padding(10.dp, 10.dp),
            leadingIcon = { Icon(imageVector = Icons.Default.Email, contentDescription = "", tint = PurpleGrey80) },
            label = { Text(text = "Email")},
            keyboardOptions = KeyboardOptions( keyboardType = KeyboardType.Email)
        )

        Spacer(modifier = Modifier.height(10.dp))

        //Password
        OutlinedTextField(
            value = password ,
            onValueChange = { password = it},
            modifier = Modifier
                .fillMaxWidth()
                .padding(10.dp, 10.dp),
            leadingIcon = { Icon(imageVector = Icons.Default.Lock, contentDescription = "", tint = PurpleGrey80) },
            label = { Text(text = "Password")},
            keyboardOptions = KeyboardOptions( keyboardType = KeyboardType.Password),
            visualTransformation = PasswordVisualTransformation()
        )

        Spacer(modifier = Modifier.height(10.dp))

        val context = LocalContext.current
        val authViewModel = AuthViewModel(navController, context)

        //Row
        Row {
            // User Button
            Button(
                onClick = { authViewModel.login(email, password) },
                colors = ButtonDefaults.buttonColors(PurpleGrey80)
            ) {
                Text(text = "Login as User")
            }

            Spacer(modifier = Modifier.width(30.dp))

            //Admin Button
            Button(
                onClick = { authViewModel.adminlogin(email, password) },
                colors = ButtonDefaults.buttonColors(PurpleGrey80)
            ) {
                Text(text = "Login as an Admin")
            }
        }
        //End of row

        Spacer(modifier = Modifier.height(10.dp))

        Text(
            text = "Do not have an account? Register",
            fontSize = 20.sp,
            fontFamily = FontFamily.SansSerif,
            color = Yellow,
            modifier = Modifier.clickable { navController.navigate(ROUT_SIGNUP) }
        )










    }



}

@Composable
@Preview(showBackground = true)
fun LoginScreenPreview(){
    LoginScreen(rememberNavController())
}

// login into firebase and create account
// connect to your project and authenticate
// in your project com.example create two packages data and models
// inside models create a kotlin class called User
// use the codes from the User
// create another kotlin class inside data that will carry functions
// go to sign up button for login
// stand on onclick..
// on top of your button paste..
//val context = LocalContext.current
//val authViewModel = AuthViewModel(navController, context)
// inside onclick paste..
// { authViewModel.signup(name, email, password,confpassword) },
// do the same for all buttons
// in your login file.. login as a user.. do the same process
