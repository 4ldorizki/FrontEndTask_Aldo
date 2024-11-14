package com.agrisustain.frontendtask.navigation

sealed class Screen (val route: String){
    object About : Screen("about")
    object List : Screen("list")
    object Grid : Screen("grid")
    object DetailGame : Screen("detail_game")
    object DetailFilm : Screen("detail_film")
//    object DetailGame : Screen("/{gameid}")
//    object DetailFilm : Screen("/{filmid}")
}