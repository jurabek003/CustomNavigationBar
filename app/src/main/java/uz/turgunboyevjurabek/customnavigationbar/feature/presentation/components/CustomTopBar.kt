@file:OptIn(ExperimentalMaterial3Api::class)

package uz.turgunboyevjurabek.customnavigationbar.feature.presentation.components

import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Text
import androidx.compose.material3.TopAppBar
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier

@Composable
fun CustomTopBar(modifier: Modifier = Modifier) {
    TopAppBar(
        title = {
            Text(text = "Top App Bar")
        }
    )
}