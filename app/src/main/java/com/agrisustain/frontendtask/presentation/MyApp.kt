package com.agrisustain.frontendtask.presentation

import androidx.compose.foundation.layout.padding
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.automirrored.filled.List
import androidx.compose.material.icons.filled.Home
import androidx.compose.material.icons.filled.List
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Icon
import androidx.compose.material3.NavigationBar
import androidx.compose.material3.NavigationBarItem
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.material3.TopAppBar
import androidx.compose.material3.TopAppBarDefaults
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.navigation.NavController
import androidx.navigation.NavGraph.Companion.findStartDestination
import androidx.navigation.NavHostController
import androidx.navigation.NavType
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.currentBackStackEntryAsState
import androidx.navigation.compose.rememberNavController
import androidx.navigation.navArgument
import com.agrisustain.frontendtask.R
import com.agrisustain.frontendtask.model.Mahasiswa
import com.agrisustain.frontendtask.navigation.NavigationItem
import com.agrisustain.frontendtask.navigation.Screen

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun MyApp (
    modifier: Modifier = Modifier,
    navController: NavHostController = rememberNavController()
) {
    val context = LocalContext.current

    Scaffold(
        topBar = {
            TopAppBar(
                title = { Text(text = "FrontEnd Task") },
                actions = {
//                    IconButton(onClick = {  }) {
//                        Icon(
//                            imageVector = Icons.Default.Share, contentDescription = stringResource(
//                                id = R.string.menu_share
//                            )
//                        )
//                    }
                },
                colors = TopAppBarDefaults.topAppBarColors(containerColor = Color.LightGray)
            )
        },
        bottomBar = {
            BottomBar(navController)
        },
        modifier = modifier
    ) { contentPadding ->
        NavHost(
            navController = navController,
            startDestination = Screen.About.route,
            modifier = modifier.padding(contentPadding)
        ) {
            composable(Screen.About.route) {
                AboutScreen(
                    mahasiswa = Mahasiswa(1, "Aldo Rizki Mukhtar", "aldorizki@gmail.com", "Poltek Batam", "TRPL", R.drawable.aldo),
                    navController = NavController(context)
                )
            }

            composable(Screen.List.route) {
                ListScreen(navController)
            }

            composable(Screen.Grid.route) {
                GridScreen(navController)
            }

            composable(
                Screen.DetailGame.route + "/{gameid}",
                arguments = listOf(navArgument("gameid") { type = NavType.IntType })
            ) { navBackStackEntry ->
                DetailGameScreen(
                    navController = navController,
                    gameid = navBackStackEntry.arguments?.getInt("gameid")
                )
            }
            composable(
                Screen.DetailFilm.route + "/{filmid}",
                arguments = listOf(navArgument("filmid") { type = NavType.IntType })
            ) { navBackStackEntry ->
                DetailFilmScreen(
                    navController = navController,
                    filmid = navBackStackEntry.arguments?.getInt("filmid")
                )
            }
        }
    }
}

@Composable
private fun BottomBar (
    navController: NavHostController,
    modifier: Modifier = Modifier
) {
    NavigationBar (
        modifier = Modifier
    ){
        val navBackStackEntry by navController.currentBackStackEntryAsState()
        val currentRoute = navBackStackEntry?.destination?.route
        val navigationItems = listOf(
            NavigationItem(
                title = stringResource(id = R.string.menu_about),
                icon = Icons.Default.Home,
                screen = Screen.About
            ),
            NavigationItem(
                title = stringResource(id = R.string.menu_list),
                icon = Icons.AutoMirrored.Filled.List,
                screen = Screen.List
            ),
            NavigationItem(
                title = stringResource(id = R.string.menu_grid),
                icon = Icons.AutoMirrored.Filled.List,
                screen = Screen.Grid
            )
        )
        navigationItems.map { item ->
            NavigationBarItem(
                selected = currentRoute == item.screen.route,
                onClick = {
                    navController.navigate(item.screen.route) {
                        popUpTo(navController.graph.findStartDestination().id) {
                            saveState = true
                        }
                        restoreState = true
                        launchSingleTop = true
                    }
                },
                icon = { Icon(imageVector = item.icon, contentDescription = item.title) },
                label = { Text(text = item.title) }
            )
        }
    }
}

@Preview
@Composable
private fun PreviewBottomBar () {
    MyApp()
//    BottomBar(navController = rememberNavController())
}
