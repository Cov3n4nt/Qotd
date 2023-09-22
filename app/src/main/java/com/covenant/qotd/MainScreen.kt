package com.covenant.qotd

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.covenant.qotd.MenuStuff.MenuBtn
import com.covenant.qotd.MenuStuff.Quoteofday
import com.covenant.qotd.ui.theme.QotdTheme

@Composable
fun Menu(genre:Int, onGenreChange: (Int)->Unit, hasFavorite: Boolean) {

    Column(modifier = Modifier
        .fillMaxWidth()
        .fillMaxHeight()
        .padding(10.dp),
        horizontalAlignment = Alignment.CenterHorizontally,
        verticalArrangement = Arrangement.Center
    ){
        Quoteofday()
        MenuBtn(genre = genre, onGenreChange = onGenreChange, hasFavorite = hasFavorite)
    }

}

@Preview
@Composable
fun MenuPrev() {
    QotdTheme {
        Menu(genre = 0, onGenreChange = { }, hasFavorite = false)
    }
}