package com.example.funfactjetpackcomposeproj

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.navigation.NavController
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import com.example.funfactjetpackcomposeproj.ui.screens.FunFactNavigationGraph
import com.example.funfactjetpackcomposeproj.ui.screens.Routes
import com.example.funfactjetpackcomposeproj.ui.screens.UserInputScreen
import com.example.funfactjetpackcomposeproj.ui.screens.WelcomeScreen
import com.example.funfactjetpackcomposeproj.ui.theme.FunFactJetpackComposeProjTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            FunFactJetpackComposeProjTheme {
                FunFactsApp()
            }
        }
    }

    @Composable
    fun FunFactsApp(){
        FunFactNavigationGraph()
    }
}
