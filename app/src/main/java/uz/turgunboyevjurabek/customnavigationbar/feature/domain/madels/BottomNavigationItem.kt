package uz.turgunboyevjurabek.customnavigationbar.feature.domain.madels

import androidx.compose.ui.graphics.painter.Painter

data class BottomNavigationItem(
    val title: String,
    val selectedIcon: Painter,
    val unselectedIcon:Painter,
    val screenRout:String
)