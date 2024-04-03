import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Icon
import androidx.compose.material3.NavigationBar
import androidx.compose.material3.NavigationBarItem
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.ui.Modifier
import androidx.navigation.NavDestination
import androidx.navigation.NavDestination.Companion.hierarchy
import androidx.navigation.NavGraph.Companion.findStartDestination
import androidx.navigation.NavHostController
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.currentBackStackEntryAsState
import androidx.navigation.compose.rememberNavController
import com.example.chooseme.ui.navigation.Screens
import com.example.chooseme.ui.navigation.listOfNavItems
import com.example.chooseme.ui.screen.HomeScreen
import com.example.chooseme.ui.screen.LoginScreen
import com.example.chooseme.ui.screen.MyPageScreen
import com.example.chooseme.ui.screen.SearchScreen

@Composable
fun AppNavigation(isLoginIn: Boolean) {
    val navController: NavHostController = rememberNavController()

    Scaffold(
        bottomBar = {
            if (isLoginIn) {
                NavigationBar {
                    val navBackStackEntry by navController.currentBackStackEntryAsState()
                    val currentDestination: NavDestination? = navBackStackEntry?.destination

                    listOfNavItems.forEach { navItem ->
                        NavigationBarItem(
                            selected = currentDestination?.hierarchy?.any { it.route == navItem.route } == true,
                            onClick = {
                                navController.navigate(navItem.route) {
                                    popUpTo(navController.graph.findStartDestination().id) {
                                        saveState = true
                                    }
                                    launchSingleTop = true
                                    restoreState = true
                                }
                            },
                            icon = { Icon(imageVector = navItem.icon, contentDescription = null) },
                            label = {
                                Text(text = navItem.label)
                            }
                        )
                    }
                }
            }
        }
    ) { paddingValues ->
        NavHost(navController = navController, startDestination = if(isLoginIn) Screens.HomeScreen.name else Screens.LoginScreen.name,
            modifier = Modifier.padding(paddingValues)) {
            composable(route = Screens.HomeScreen.name) {
                HomeScreen()
            }
            composable(route = Screens.SearchScreen.name) {
                 SearchScreen()
            }
            composable(route = Screens.MyPageScreen.name) {
                 MyPageScreen()
            }
            composable(route = Screens.LoginScreen.name) {
                LoginScreen(onLoginSuccess = { })
            }
        }
    }
}
