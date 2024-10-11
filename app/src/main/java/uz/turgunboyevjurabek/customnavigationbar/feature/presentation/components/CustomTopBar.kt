@file:OptIn(ExperimentalMaterial3Api::class)

package uz.turgunboyevjurabek.customnavigationbar.feature.presentation.components

import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.ShapeDefaults.ExtraLarge
import androidx.compose.material3.Text
import androidx.compose.material3.TopAppBar
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.shadow
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.unit.dp

@Composable
fun CustomTopBar(modifier: Modifier = Modifier) {
    TopAppBar(
        modifier = modifier
            .shadow(
                5.dp,
                shape = ExtraLarge,
                spotColor = Color.Green,
                clip = true
            ),
        title = {
            Text(text = "Top App Bar")
        }
    )
}