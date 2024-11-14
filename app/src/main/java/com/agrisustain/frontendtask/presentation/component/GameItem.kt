package com.agrisustain.frontendtask.presentation.component

import androidx.compose.foundation.Image
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.agrisustain.frontendtask.R
import com.agrisustain.frontendtask.model.Game

@Composable
fun GameItem(
    game: Game,
    modifier: Modifier = Modifier,
    onItemClicked: (Int) -> Unit,
) {
    Row(
        verticalAlignment = Alignment.CenterVertically,
        modifier = modifier
            .fillMaxWidth()
            .clickable { onItemClicked(game.id) }
    ) {
        game.gambar?.let { painterResource(id = it) }?.let {
            Image(
                painter = it,
                contentDescription = game.nama,
                contentScale = ContentScale.Crop,
                modifier = Modifier
                    .clip(CircleShape)
                    .size(80.dp)
            )
        }
        Spacer(modifier = Modifier.width(16.dp))
        Column {
            Text(text = game.nama, style = MaterialTheme.typography.titleMedium)
            Row {
                Text(text = game.deskripsi, color = MaterialTheme.colorScheme.primary, maxLines = 1)
            }
        }
    }
}

@Preview(showBackground = true)
@Composable
private fun PreviewGameItem () {
    GameItem(
        game = Game(1,
            "Mobile Legend",
            "Deskripsi Mobile Legend ",
            R.drawable.mole),
                onItemClicked = { gameid ->
            println("Mentor Id : $gameid") }
    )
}

