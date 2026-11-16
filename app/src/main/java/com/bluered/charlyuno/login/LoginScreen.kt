package com.bluered.charlyuno.login

import android.R.attr.onClick
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.text.input.TextFieldLineLimits
import androidx.compose.foundation.text.input.rememberTextFieldState
import androidx.compose.material3.Button
import androidx.compose.material3.Text
import androidx.compose.material3.TextField
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier

@Composable
fun LoginScreen(
    modifier: Modifier = Modifier
) {
    var buttonClicked by remember{ mutableStateOf(false) }

    // Screen config = Tall -> Column
    Column(
        modifier = modifier,
        verticalArrangement = Arrangement.SpaceEvenly,
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        // Title
        Text(
            modifier = Modifier,
            text = "Login",
        )

        // Username credential
        TextField(
            state = rememberTextFieldState(),
            lineLimits = TextFieldLineLimits.SingleLine,
            label = { Text("Username") },
        )

        // Password credential
        TextField(
            state = rememberTextFieldState(),
            lineLimits = TextFieldLineLimits.SingleLine,
            label = { Text("Password") },
        )

        // Login button
        Button(
            onClick = { buttonClicked = true }
        ) {
            Text("Login")
        }

        Text(
            modifier = Modifier,
            text = if (buttonClicked) "Button clicked!" else "Button not clicked yet.",
        )

    }
}