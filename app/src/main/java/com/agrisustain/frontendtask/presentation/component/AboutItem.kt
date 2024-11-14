package com.agrisustain.frontendtask.presentation.component

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.shape.CircleShape
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
import com.agrisustain.frontendtask.model.Mahasiswa

@Composable
fun AboutItem (
    mahasiswa: Mahasiswa
) {
    Column (
        horizontalAlignment = Alignment.CenterHorizontally,

    ) {
        Image(
            painter = painterResource(id = mahasiswa.foto),
            contentDescription = mahasiswa.nama, modifier = Modifier
                .clip(RoundedCornerShape(8.dp))
                .size(200.dp)
        )
        Spacer(modifier = Modifier.height(16.dp))
        Text(
            text = mahasiswa.nama,
            style = MaterialTheme.typography.titleLarge,
            overflow = TextOverflow.Ellipsis,
            textAlign = TextAlign.Center,
            modifier = Modifier.width(200.dp),
//            maxLines = 1
        )
    }
}

@Preview(showBackground = true)
@Composable
fun PreviewAboutItem () {
    AboutItem(
        mahasiswa = Mahasiswa(1, "Aldo Rizki Mukhtar", "aldorizki@gmail.com", "Poltek Batam", "TRPL", R.drawable.aldo)
    )
}