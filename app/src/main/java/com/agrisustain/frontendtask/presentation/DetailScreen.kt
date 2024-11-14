package com.agrisustain.frontendtask.presentation

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavController
import com.agrisustain.frontendtask.R
import com.agrisustain.frontendtask.data.MyDummyData
import com.agrisustain.frontendtask.data.MyDummyData.film
import com.agrisustain.frontendtask.model.Film
import com.agrisustain.frontendtask.model.Game

@Composable
fun DetailGameScreen(
    modifier: Modifier = Modifier,
    navController: NavController,
    gameid: Int?
) {
    val newGameList = MyDummyData.game.filter { game -> game.id == gameid }
    Column(
        modifier = modifier
    ) {
        DetailGameContent(newGameList = newGameList, modifier = Modifier)
    }
}

@Composable
fun DetailGameContent(
    newGameList: List<Game>,
    modifier: Modifier
) {
    if (newGameList.isNotEmpty()) {
        val game = newGameList[0] // Ambil game pertama yang sesuai

        Row(
            verticalAlignment = Alignment.CenterVertically,
            horizontalArrangement = Arrangement.Start,
            modifier = modifier.padding(16.dp)
        ) {
            game.gambar?.let { painterResource(id = it) }?.let {
                Image(
                    painter = it,
                    contentDescription = newGameList[0].nama,
                    modifier = Modifier
                        .size(height = 250.dp, width = 170.dp)
                        .clip(RoundedCornerShape(16.dp))
                )
            }
            Spacer(modifier = Modifier.width(16.dp))
            Column(modifier = Modifier.padding(4.dp)) {
                Text(
                    text = game.nama,
                    fontSize = 25.sp,
                    fontWeight = FontWeight.Bold
                )
                Text(
                    text = "Deskripsi : ${newGameList[0].deskripsi}",
                    style = MaterialTheme.typography.titleSmall
                )
            }
        }
    } else {
        Text(text = "Game not found", modifier = modifier.padding(16.dp))
    }
}

@Composable
fun DetailFilmScreen (
    modifier: Modifier = Modifier,
    navController: NavController,
    filmid: Int?
) {
    val newFilmList = MyDummyData.film.filter { film -> film.id == filmid }
    Column(
        modifier = modifier
    ) {
        DetailFilmContent(newFilmList = newFilmList, modifier = Modifier)
    }
}

@Composable
fun DetailFilmContent (
    newFilmList: List<Film>,
    modifier: Modifier
) {
    if (newFilmList.isNotEmpty()) {
        val film = newFilmList[0] // Ambil film pertama yang sesuai

        Row(
            verticalAlignment = Alignment.CenterVertically,
            horizontalArrangement = Arrangement.Start,
            modifier = modifier.padding(16.dp)
        ) {
            film.gambar?.let { painterResource(id = it) }?.let {
                Image(
                    painter = it,
                    contentDescription = newFilmList[0].judul,
                    modifier = Modifier
                        .size(height = 250.dp, width = 170.dp)
                        .clip(RoundedCornerShape(16.dp))
                )
            }
            Spacer(modifier = Modifier.width(16.dp))
            Column(modifier = Modifier.padding(4.dp)) {
                Text(
                    text = film.judul,
                    fontSize = 25.sp,
                    fontWeight = FontWeight.Bold
                )
                Text(
                    text = "Sinopsis : ${newFilmList[0].sinopsis}",
                    style = MaterialTheme.typography.titleSmall
                )
            }
        }
    } else {
        Text(text = "Film not found", modifier = modifier.padding(16.dp))
    }
}


//
//@Preview(showBackground = true)
//@Composable
//private fun PreviewDetailGameContent () {
//    val sampleGame = Game(
//        id = 2,
//        nama = "Elden Ring",
//        deskripsi = "Deskripsi Elden Ring",
//        gambar = R.drawable.eldenring
//    )
//    DetailGameContent(
//        newGameList = listOf(sampleGame),
//        modifier = Modifier.fillMaxWidth()
//    )
//}

//@Preview(showBackground = true)
//@Composable
//private fun PreviewDetailFilmContent () {
//    val sampleFilm = Film(
//        id = 1,
//        judul = "Fight Club",
//        sinopsis = "Welcome to the fight club",
//        gambar = R.drawable.fightclub
//    )
//    DetailFilmContent(
//        newFilmList = listOf(sampleFilm),
//        modifier = Modifier.fillMaxWidth()
//    )
//}

