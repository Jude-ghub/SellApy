package com.example.sellapy.navigation

import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.navigation.NavHostController
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import com.example.sellapy.ui.theme.screens.about.AboutScreen
import com.example.sellapy.ui.theme.screens.contact.ContactScreen
import com.example.sellapy.ui.theme.screens.dashboard.DashboardScreen
import com.example.sellapy.ui.theme.screens.details.DetailsScreen
import com.example.sellapy.ui.theme.screens.home.HomeScreen
import com.example.sellapy.ui.theme.screens.intent.IntentScreen
import com.example.sellapy.ui.theme.screens.login.LoginScreen
import com.example.sellapy.ui.theme.screens.products.AddProductsScreen
import com.example.sellapy.ui.theme.screens.products.ViewProductsScreen
import com.example.sellapy.ui.theme.screens.signup.SignupScreen
import com.example.sellapy.ui.theme.screens.splash.SplashScreen
import com.example.sellapy.ui.theme.screens.students.AddStudentsScreen


@Composable
fun AppNavHost(
    modifier: Modifier = Modifier,
    navController: NavHostController = rememberNavController(),
    startDestination:String = ROUT_SPLASH
) {
    NavHost(
        navController = navController,
        startDestination = startDestination,
        modifier = modifier
    ) {


        composable(ROUT_SIGNUP) {
            SignupScreen(navController = navController)
        }

        composable(ROUT_LOGIN) {
            LoginScreen(navController = navController)
        }

        composable(ROUT_ABOUT) {
            AboutScreen(navController = navController)
        }

        composable(ROUT_HOME) {
            HomeScreen(navController = navController)
        }

        composable(ROUT_DETAIL) {
            DetailsScreen(navController = navController)
        }

        composable(ROUT_CONTACT) {
            ContactScreen(navController = navController)
        }

        composable(ROUT_DASHBOARD) {
            DashboardScreen(navController = navController)
        }

        composable(ROUT_SPLASH) {
            SplashScreen(navController = navController)
        }

        composable(ROUT_INTENT) {
            IntentScreen(navController = navController)
        }

        composable(ADD_PRODUCTS_URL) {
            AddProductsScreen(navController = navController)
        }
        composable(VIEW_PRODUCTS_URL) {
            ViewProductsScreen(navController = navController)
        }
        composable(ADD_STUDENT_URL) {
            AddStudentsScreen(navController = navController)
        }
        composable(VIEW_STUDENT_URL) {
            AddStudentsScreen(navController = navController)
        }


    }
}