package com.covenant.qotd.MenuStuff

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Favorite
import androidx.compose.material.icons.filled.Lightbulb
import androidx.compose.material.icons.filled.SelfImprovement
import androidx.compose.material.icons.filled.Star
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.covenant.qotd.ui.theme.QotdTheme

@Composable
fun MenuBtn(genre: Int, onGenreChange: (Int) -> Unit, hasFavorite: Boolean) {

    Column(horizontalAlignment = Alignment.CenterHorizontally) {

        Row {
            Column(modifier = Modifier.weight(1f)) {
                Card(
                    icon = Icons.Default.Lightbulb,
                    text = "Inspirational",
                    onClick = { onGenreChange(1) },
                    modifier = Modifier.padding(10.dp).fillMaxWidth()
                )
                Card(
                    icon = Icons.Default.Favorite,
                    text = "Love",
                    onClick = { onGenreChange(3) },
                    modifier = Modifier.padding(10.dp).fillMaxWidth()
                )
            }
            Column(modifier = Modifier.weight(1f)) {
                Card(
                    icon = Icons.Default.SelfImprovement,
                    text = "Existential",
                    onClick = { onGenreChange(2) },
                    modifier = Modifier.padding(10.dp).fillMaxWidth()
                )
                Card(
                    icon = Icons.Default.Star,
                    text = " Favorites",
                    enabled = hasFavorite,
                    onClick = { onGenreChange(4) },
                    modifier = Modifier.padding(10.dp).fillMaxWidth()
                )
            }
        }

    }

}

@Preview
@Composable
fun MenuBtnsPrev() {
    QotdTheme {
        MenuBtn(genre = 0, onGenreChange = {0}, hasFavorite = false)
    }
}