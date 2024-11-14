package com.agrisustain.frontendtask.presentation

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.LazyRow
import androidx.compose.foundation.lazy.items
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavController
import androidx.navigation.compose.rememberNavController
import com.agrisustain.frontendtask.data.MyDummyData
import com.agrisustain.frontendtask.data.MyDummyData.film
import com.agrisustain.frontendtask.model.Film
import com.agrisustain.frontendtask.model.Game
import com.agrisustain.frontendtask.navigation.Screen
import com.agrisustain.frontendtask.presentation.component.FilmItem
import com.agrisustain.frontendtask.presentation.component.GameItem

@Composable
fun ListScreen (
    navController: NavController,
    modifier: Modifier = Modifier,
    game: List<Game> = MyDummyData.game,
    film: List<Film> = MyDummyData.film
) {
    LazyColumn(
        verticalArrangement = Arrangement.spacedBy(8.dp),
        modifier = modifier
    ) {
        item {
            Column {
                Text(
                    text = "Favorite Movies",
                    fontWeight = FontWeight.Bold,
                    fontSize = 25.sp,
                    modifier = Modifier.padding(8.dp)
                )
                LazyRow(
                    contentPadding = PaddingValues(16.dp),
                    horizontalArrangement = Arrangement.spacedBy(8.dp),
                    modifier = modifier
                ) {
                    items(film, key = { it.id }) {
                        FilmItem(film = it) { filmid ->
                            navController.navigate(Screen.DetailFilm.route + "/$filmid")
                        }
                    }
                }
                Text(
                    text = "Favorite Games",
                    fontWeight = FontWeight.Bold,
                    fontSize = 25.sp,
                    modifier = Modifier.padding(8.dp)
                )
            }
        }
        items(game, key = { it.id }) {
            GameItem(game = it) { gameid ->
                    navController.navigate(Screen.DetailGame.route + "/$gameid")
            }
        }
    }
}

@Preview(showBackground = true)
@Composable
private fun PreviewListScreen (){
    ListScreen(navController = rememberNavController())
}