package com.bluered.charlyuno

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.CenterAlignedTopAppBar
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Icon
import androidx.compose.material3.IconButton
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.material3.TopAppBar
import androidx.compose.material3.TopAppBarDefaults
import androidx.compose.material3.rememberTopAppBarState
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.input.nestedscroll.nestedScroll
import androidx.compose.ui.text.style.TextOverflow
import androidx.compose.ui.tooling.preview.Preview
import com.bluered.charlyuno.login.LoginScreen
import com.bluered.charlyuno.ui.theme.CharlyUnoTheme
import com.bluered.charlyuno.ui.theme.LoginBlue
import com.bluered.charlyuno.ui.theme.MustardYellow80

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            CharlyUnoTheme {
                CharlyMainScreen()
            }
        }
    }
}

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun CharlyMainScreen() {
    Scaffold(
//        topBar = {
//            TopAppBar(
//                colors = TopAppBarDefaults.topAppBarColors(
//                    containerColor = MustardYellow80,
//                    titleContentColor = MaterialTheme.colorScheme.primary,
//                ),
//                title = {
//                    Text("Charly Uno")
//                }
//            )
//        },
    ) { innerPadding ->
        LoginScreen(
            modifier = Modifier
                .padding(innerPadding)
                .background(color = LoginBlue)
                .fillMaxSize()
        )
    }
}


//@Preview(showBackground = true)
//@Composable
//fun GreetingPreview() {
//    CharlyUnoTheme {
//        Greeting("Charly")
//    }
//}