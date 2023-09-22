package com.covenant.qotd

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.ArrowBack
import androidx.compose.material.icons.filled.Refresh
import androidx.compose.material.icons.filled.Star
import androidx.compose.material.icons.filled.StarBorder
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
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.covenant.qotd.Logic.Category
import com.covenant.qotd.Logic.GetQuote
import com.covenant.qotd.MenuStuff.Card
import com.covenant.qotd.MenuStuff.MenuBtn
import com.covenant.qotd.ui.theme.QotdTheme
import java.time.LocalDate

@Composable
fun QuoteScreen(
    genre: Int,
    onGenreChange: (Int) -> Unit,
    onFavoriteChange: (String?)-> Unit,
    favorite: String,
    date: LocalDate
) {


    Column(verticalArrangement = Arrangement.Center,horizontalAlignment = Alignment.CenterHorizontally,
        modifier = Modifier
            .fillMaxHeight()
            .fillMaxHeight()
            .padding(10.dp)){

       when(genre){
           1 -> {
               var quote by remember { mutableStateOf(GetQuote(Category.Inspirational)) }

               fun refresh(){
                   quote = GetQuote(Category.Inspirational)
               }

               Text(text = "Inspirational",
               fontFamily = FontFamily.Monospace,
               textAlign = TextAlign.Center,
               modifier = Modifier.padding(5.dp))

               Text(text = quote,
               fontFamily = FontFamily.Monospace,
               textAlign = TextAlign.Center,
               modifier = Modifier.padding(40.dp))

                Row {
                    Card(
                        icon = Icons.Default.Refresh,
                        text = "Refresh", onClick = { refresh() },
                        modifier = Modifier.padding(10.dp)
                        )
                    Card(
                        icon = Icons.Default.Star,
                        text = "Favorite",
                        onClick = { onFavoriteChange(quote) },
                        modifier = Modifier.padding(10.dp)
                        )

                }




           }
           2 ->{

               var quote by remember { mutableStateOf(GetQuote(Category.Existential)) }

               fun refresh(){
                   quote = GetQuote(Category.Existential)
               }
               Text(text = "Existential",
                   fontFamily = FontFamily.Monospace,
                   textAlign = TextAlign.Center,
                   modifier = Modifier.padding(5.dp))

               Text(text = quote,
                   fontFamily = FontFamily.Monospace,
                   textAlign = TextAlign.Center,
                   modifier = Modifier.padding(40.dp))


               Row {
                   Card(
                       icon = Icons.Default.Refresh,
                       text = "Refresh", onClick = { refresh() },
                       modifier = Modifier.padding(10.dp)
                   )
                   Card(
                       icon = Icons.Default.Star,
                       text = "Favorite",
                       onClick = { onFavoriteChange(quote) },
                       modifier = Modifier.padding(10.dp)
                   )

               }

           }
           3 ->{

               var quote by remember { mutableStateOf(GetQuote(Category.Love)) }

               fun refresh(){
                   quote = GetQuote(Category.Love)
               }

               Text(text = "Love",
                   fontFamily = FontFamily.Monospace,
                   textAlign = TextAlign.Center,
                   modifier = Modifier.padding(5.dp))

               Text(text = quote,
                   fontFamily = FontFamily.Monospace,
                   textAlign = TextAlign.Center,
                   modifier = Modifier.padding(40.dp))

               Row {
                   Card(
                       icon = Icons.Default.Refresh,
                       text = "Refresh", onClick = { refresh() },
                       modifier = Modifier.padding(10.dp)
                   )
                   Card(
                       icon = Icons.Default.Star,
                       text = "Favorite",
                       onClick = { onFavoriteChange(quote) },
                       modifier = Modifier.padding(10.dp)
                   )

               }
           }
           4 -> {
               Text(text = "Favorite Quote",
                   fontFamily = FontFamily.Monospace,
                   textAlign = TextAlign.Center,
                   modifier = Modifier.padding(5.dp))


                   Text(text = favorite,
                       fontFamily = FontFamily.Monospace,
                       textAlign = TextAlign.Center,
                       modifier = Modifier.padding(40.dp))

               Text(text = date.toString(),
                   fontFamily = FontFamily.Monospace,
                   textAlign = TextAlign.Center,
                   modifier = Modifier.padding(40.dp))

               Card(
                   icon = Icons.Default.StarBorder,
                   text = "Un-Favorite",
                   onClick = { onFavoriteChange(null) },
                   modifier = Modifier.padding(10.dp)
                       .fillMaxWidth()
               )

           }
       }
        Card(
            icon = Icons.Default.ArrowBack,
            text = "menu",
            onClick = { onGenreChange(0) },
            modifier = Modifier.padding(10.dp)
                .fillMaxWidth(1f)
        )







    }
}


@Preview
@Composable
fun QuoteScreenPrev() {
    QotdTheme {
        QuoteScreen(genre = 4, onGenreChange = {0}, favorite = "", onFavoriteChange = {""}, date = LocalDate.now())
    }
}