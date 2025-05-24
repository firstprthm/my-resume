package com.firstprthm.myresume.ui

import android.widget.Toast
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Home
import androidx.compose.material.icons.filled.Settings
import androidx.compose.material3.BottomAppBar
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Icon
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.material3.TopAppBar
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.text.font.FontStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.sp
import androidx.navigation.NavHostController
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import com.firstprthm.myresume.ui.theme.MyResumeTheme

enum class MyResumeAppScreen(val title: String) {
    Home(title = "Home"),
    Settings(title = "Settings")
}

@Composable
fun MyResume(navController: NavHostController = rememberNavController()) {
    Scaffold(
        topBar = {
            TopContent()
        },
        bottomBar = {
            BottomContent(navController = navController)
        },
        content = { contentPadding ->
            NavHost(
                navController = navController,
                startDestination = MyResumeAppScreen.Home.title,
                modifier = Modifier.padding(contentPadding)
            ) {
                composable(route = MyResumeAppScreen.Home.title) {
                    HomeScreen()
                }
                composable(route = MyResumeAppScreen.Settings.title) {
                    SettingsScreen()
                }
            }
        }
    )
}


@Composable
fun BottomContent(navController: NavHostController) {
    val context = LocalContext.current

    BottomAppBar(
        containerColor = Color(33, 150, 243, 255),
        contentColor = Color.White,
        content = {
            Row(
                modifier = Modifier.fillMaxWidth(),
                horizontalArrangement = Arrangement.Center,
                verticalAlignment = Alignment.CenterVertically,
                content = {
                    Column(
                        modifier = Modifier
                            .weight(0.5f)
                            .clickable {
                                Toast.makeText(context, "Home Button was clicked", Toast.LENGTH_LONG)
                                    .show()
                                navController.navigate(MyResumeAppScreen.Home.title) {
                                    popUpTo(0)
                                }
                            },
                        horizontalAlignment = Alignment.CenterHorizontally,
                        verticalArrangement = Arrangement.Center,
                        content = {
                            Icon(
                                imageVector = Icons.Default.Home,
                                contentDescription = "Home Button"
                            )
                            Text(text = "Home")
                        })

                    Column(
                        modifier = Modifier
                            .weight(0.5f)
                            .clickable {
                                Toast.makeText(context, "Settings Button was clicked", Toast.LENGTH_LONG)
                                    .show()
                                navController.navigate(MyResumeAppScreen.Settings.title) {
                                    popUpTo(0)
                                }
                            },
                        horizontalAlignment = Alignment.CenterHorizontally,
                        verticalArrangement = Arrangement.Center,
                        content = {
                            Icon(
                                imageVector = Icons.Default.Settings,
                                contentDescription = "Settings Button"
                            )
                            Text(text = "Settings")
                        })
                }
            )
        }
    )
}

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun TopContent() {
    TopAppBar(
        title = {
            Text(
                text = "My Résumé",
                fontWeight = FontWeight.Bold,
                fontStyle = FontStyle.Italic,
                fontSize = 30.sp,
                color = Color(33, 150, 243, 255)
            )
        }
    )
}

@Preview(showBackground = true)
@Composable
fun MyResumePreview() {
    MyResumeTheme {
        MyResume()
    }
}