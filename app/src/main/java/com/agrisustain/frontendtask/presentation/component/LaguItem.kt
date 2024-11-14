package com.agrisustain.frontendtask.presentation.component

import androidx.compose.foundation.Image
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
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
import com.agrisustain.frontendtask.model.Lagu

@Composable
fun LaguItem (
    lagu: Lagu,
    modifier: Modifier = Modifier,
//    onItemClicked: (Int) -> Unit
){
    Column(
        horizontalAlignment = Alignment.CenterHorizontally,
//        modifier = modifier.clickable {
//            onItemClicked(lagu.id)
//        }
    ) {
        lagu.gambar?.let { painterResource(id = it) }?.let {
            Image(
                painter = it,
                contentDescription = lagu.judul, modifier = Modifier
                    .clip(RoundedCornerShape(8.dp))
                    .size(150.dp)
                    .align(alignment = Alignment.Start)
            )
        }
        Column {
            Text(
                text = lagu.judul,
                style = MaterialTheme.typography.titleMedium,
                overflow = TextOverflow.Ellipsis,
                textAlign = TextAlign.Start,
                modifier = Modifier.width(150.dp),
                maxLines = 2
            )
            Text(
                text = "By : ${lagu.penyanyi}",
                style = MaterialTheme.typography.titleSmall,
                overflow = TextOverflow.Ellipsis,
                textAlign = TextAlign.Start,
                modifier = Modifier.width(150.dp),
                maxLines = 2
            )
        }
    }
}

@Preview(showBackground = true)
@Composable
fun PreviewLaguItem (){
    LaguItem(
        lagu = Lagu(
            1,
            "Happiness",
            "Rex Orange County",
            R.drawable.happiness
        )
    )
}