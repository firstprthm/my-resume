package com.firstprthm.myresume.ui

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp

@Composable
fun SettingsScreen() {
    Column(
        modifier = Modifier.fillMaxSize()
            .padding(10.dp)
    )
    {
        Text("This is the settings screen.")
    }
}