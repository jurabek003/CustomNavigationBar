package uz.turgunboyevjurabek.customnavigationbar.feature.presentation.components

import androidx.compose.foundation.background
import androidx.compose.foundation.isSystemInDarkTheme
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.navigationBarsPadding
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.material3.Icon
import androidx.compose.material3.NavigationBar
import androidx.compose.material3.NavigationBarItem
import androidx.compose.material3.NavigationBarItemColors
import androidx.compose.material3.NavigationBarItemDefaults
import androidx.compose.material3.ShapeDefaults
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableIntStateOf
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.saveable.rememberSaveable
import androidx.compose.runtime.setValue
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.colorResource
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import uz.turgunboyevjurabek.customnavigationbar.R
import uz.turgunboyevjurabek.customnavigationbar.feature.domain.madels.BottomNavigationItem

@Composable
fun CustomBottomBar(modifier: Modifier = Modifier) {
    val items = listOf(
        BottomNavigationItem(
            title = "Home",
            selectedIcon = painterResource(id = R.drawable.ic_home_filled),
            unselectedIcon = painterResource(id = R.drawable.ic_home_outlined),
            screenRout = "home"
        ),
        BottomNavigationItem(
            title = "Messages",
            selectedIcon = painterResource(id = R.drawable.ic_chat_filled),
            unselectedIcon = painterResource(id = R.drawable.ic_chat_outlined),
            screenRout = "messages"
        ),
        BottomNavigationItem(
            title = "Portfolio",
            selectedIcon = painterResource(id = R.drawable.ic_portfolio_filled),
            unselectedIcon = painterResource(id = R.drawable.ic_portfoli_outlined),
            screenRout = "profile"
        ),
        BottomNavigationItem(
            title = "Settings",
            selectedIcon = painterResource(id = R.drawable.ic_settings_filled),
            unselectedIcon = painterResource(id = R.drawable.ic_settings_outlined),
            screenRout = "settings"
        )
    )

    var selectedTabIndex by rememberSaveable {
        mutableIntStateOf(0)
    }
    var screenName by rememberSaveable {
        mutableStateOf("Asosiy")
    }

    Surface(
        shape = ShapeDefaults.ExtraLarge,
        modifier = modifier
            .background(Color.Transparent)
            .padding(horizontal = 15.dp)
            .navigationBarsPadding()
            .padding(bottom = 10.dp)
            .fillMaxWidth()
    ) {
        NavigationBar {
            items.forEachIndexed { index, bottomNavigationItem ->
                val color =  if (isSystemInDarkTheme()) {
                    if (selectedTabIndex == index) colorResource(id = R.color.select_ic) else Color.LightGray
                }else{
                    if (selectedTabIndex == index) colorResource(id = R.color.select_ic) else Color.DarkGray
                }

                val fontWeight=if (selectedTabIndex == index) FontWeight.Bold else FontWeight.Normal

                NavigationBarItem(selected = selectedTabIndex == index,
                    onClick = { selectedTabIndex=index },
                    icon = {
                        Icon(
                            painter = if (selectedTabIndex == index) bottomNavigationItem.selectedIcon else bottomNavigationItem.unselectedIcon,
                            contentDescription = null,
                            tint = color,
                            modifier = Modifier.size(25.dp)
                        )
                    },
                    colors = NavigationBarItemDefaults.colors(
                        indicatorColor = Color.Transparent,
                    ),
                    alwaysShowLabel = false,
                    label = {
                        Text(text = bottomNavigationItem.title, color = color, fontWeight = fontWeight, fontSize = 12.sp)
                    }
                )
            }
        }
    }
}

@Preview
@Composable
private fun CustomBottomBarPreview() {
    CustomBottomBar()
}
