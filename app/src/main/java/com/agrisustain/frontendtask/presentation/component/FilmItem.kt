package com.agrisustain.frontendtask.presentation.component

import androidx.compose.foundation.Image
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Column
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
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.text.style.TextOverflow
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.agrisustain.frontendtask.R
import com.agrisustain.frontendtask.model.Film

@Composable
fun FilmItem (
    film: Film,
    modifier: Modifier = Modifier,
    onItemClicked: (Int) -> Unit
){
    Column(
        horizontalAlignment = Alignment.CenterHorizontally,
        modifier = modifier.clickable {
            onItemClicked(film.id)
        }
    ) {
        film.gambar?.let { painterResource(id = it) }?.let {
            Image(
                painter = it,
                contentDescription = film.judul, modifier = Modifier
                    .clip(RoundedCornerShape(8.dp))
                    .size(150.dp)
            )
        }
        Text(
            text = film.judul,
            style = MaterialTheme.typography.titleMedium,
            overflow = TextOverflow.Ellipsis,
            textAlign = TextAlign.Center,
            modifier = Modifier.width(150.dp),
            maxLines = 1
        )
    }
}

@Preview(showBackground = true)
@Composable
fun PreviewFilmItem (){
    FilmItem(
        film = Film(
            1,
            "Fight Club",
            "Sinopsis Contoh",
            R.drawable.fightclub
        )
    ) { }
}