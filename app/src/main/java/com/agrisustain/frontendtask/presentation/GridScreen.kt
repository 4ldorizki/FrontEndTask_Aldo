package com.agrisustain.frontendtask.presentation

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.lazy.grid.GridCells
import androidx.compose.foundation.lazy.grid.LazyVerticalGrid
import androidx.compose.foundation.lazy.grid.items
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
import com.agrisustain.frontendtask.data.MyDummyData.lagu
import com.agrisustain.frontendtask.model.Lagu
import com.agrisustain.frontendtask.presentation.component.LaguItem

@Composable
fun GridScreen (
    navController: NavController,
) {
    Column {
        Text(
            text = "Favorite Songs",
            fontWeight = FontWeight.Bold,
            fontSize = 25.sp,
            modifier = Modifier.padding(8.dp)
        )

        val laguList = MyDummyData.lagu

        LazyVerticalGrid(
            columns = GridCells.Adaptive(minSize = 120.dp),
            horizontalArrangement = Arrangement.spacedBy(16.dp),
            verticalArrangement = Arrangement.spacedBy(16.dp),
            modifier = Modifier.padding(16.dp)
        ) {
            items(laguList) { laguItem ->
                LaguItem(laguItem)
            }
        }
    }
}

@Preview(showBackground = true)
@Composable
fun PreviewGridScreen () {
    GridScreen(navController = rememberNavController())
}