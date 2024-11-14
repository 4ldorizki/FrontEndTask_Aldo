package com.agrisustain.frontendtask.presentation

import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.navigation.NavController
import androidx.navigation.compose.rememberNavController
import com.agrisustain.frontendtask.R
import com.agrisustain.frontendtask.data.MyDummyData
import com.agrisustain.frontendtask.model.Mahasiswa
import com.agrisustain.frontendtask.presentation.component.AboutItem

@Composable
fun AboutScreen (
    mahasiswa: Mahasiswa,
//    mahasiswa: List<Mahasiswa> = MyDummyData.mahasiswa,
    navController: NavController
) {
    Column (
        horizontalAlignment = Alignment.CenterHorizontally,
//        modifier = Modifier
//            .fillMaxSize()
    ){
        Column (
            horizontalAlignment = Alignment.CenterHorizontally,
            modifier = Modifier.fillMaxWidth()
        ){
            Text("Profil", style = MaterialTheme.typography.titleLarge)
            Spacer(modifier = Modifier.height(16.dp))
            AboutItem(mahasiswa = Mahasiswa(1, "Aldo Rizki Mukhtar", "aldorizki@gmail.com", "Poltek Batam", "TRPL", R.drawable.aldo))
        }
        Spacer(modifier = Modifier.height(16.dp))
        Column {
            Box(
                modifier = Modifier
            ) {
                Column (
                    modifier = Modifier
                        .fillMaxWidth()
                        .padding(start = 24.dp),
                    horizontalAlignment = Alignment.Start
                ){
                    Text(text = "Name:", fontWeight = FontWeight.Bold)
                    Text(text = mahasiswa.nama, color = Color.Gray)

                    Spacer(modifier = Modifier.height(16.dp))

                    // Menampilkan Umur
                    Text(text = "Asal:", fontWeight = FontWeight.Bold)
                    Text(text = mahasiswa.kampus, color = Color.Gray)

                    Spacer(modifier = Modifier.height(16.dp))

                    // Menampilkan Alamat
                    Text(text = "Jurusan:", fontWeight = FontWeight.Bold)
                    Text(text = mahasiswa.jurusan, color = Color.Gray)

                    Spacer(modifier = Modifier.height(16.dp))

                    // Menampilkan Email
                    Text(text = "Email:", fontWeight = FontWeight.Bold)
                    Text(text = mahasiswa.email, color = Color.Gray)
                    }
            }
        }
    }
}

@Preview(showBackground = true)
@Composable
private fun PreviewAboutScreen () {
    AboutScreen(
        mahasiswa = Mahasiswa(1, "Aldo Rizki Mukhtar", "aldorizki@gmail.com", "Poltek Batam", "TRPL", R.drawable.aldo),
        navController = rememberNavController()
    )
}