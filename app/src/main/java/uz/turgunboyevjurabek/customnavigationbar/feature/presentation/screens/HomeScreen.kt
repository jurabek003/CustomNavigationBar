package uz.turgunboyevjurabek.customnavigationbar.feature.presentation.screens

import android.annotation.SuppressLint
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.navigationBarsPadding
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.statusBarsPadding
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.material3.Scaffold
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import uz.turgunboyevjurabek.customnavigationbar.feature.presentation.components.CustomBottomBar
import uz.turgunboyevjurabek.customnavigationbar.feature.presentation.components.ListUI

@SuppressLint("UnusedMaterial3ScaffoldPaddingParameter")
@Composable
fun HomeScreen(modifier: Modifier = Modifier) {
    Scaffold(
        bottomBar = {
            CustomBottomBar()
        },
        content = {
            Column(
                modifier=modifier
            ) {
                LazyColumn(
                    modifier = modifier
                        .fillMaxSize()
                ) {
                    items(100){
                        ListUI(modifier=modifier.statusBarsPadding())
                    }
                }
            }
        }
    )
}