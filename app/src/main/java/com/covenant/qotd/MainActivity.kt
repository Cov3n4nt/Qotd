package com.covenant.qotd

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.animation.AnimatedContent
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.setValue
import androidx.compose.ui.Modifier
import androidx.core.graphics.component1
import androidx.core.graphics.component2
import com.covenant.qotd.ui.theme.QotdTheme
import java.time.LocalDate
import kotlin.text.Typography.quote

const val FavoriteKey = "FAVE_KEY"
const val DateKey = "DATE_KEY"

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        var genre by mutableStateOf(0)
        val sharedPref = getSharedPreferences("Quote", MODE_PRIVATE)
        var favState by mutableStateOf(sharedPref.getString(FavoriteKey, null))
        var date by mutableStateOf(LocalDate.ofEpochDay(sharedPref.getLong(DateKey, 0)))



        setContent {
            QotdTheme {

            }

            Surface(
                modifier = Modifier.fillMaxSize(),
                color = MaterialTheme.colorScheme.background
            ) {
                AnimatedContent(
                    targetState = genre,
                    transitionSpec = {
                        sharedZAxis(forward = targetState != 0)
                    },
                    contentKey = { it != 0 },
                    modifier = Modifier.fillMaxSize(),

                    ) { targetGenre ->
                    when (targetGenre) {
                        0 -> Menu(targetGenre, onGenreChange = { genre = it }, hasFavorite = favState != null)
                        else -> {
                            QuoteScreen(targetGenre, onGenreChange = { genre = it }, onFavoriteChange = {
                                sharedPref.edit().putString(FavoriteKey, it).apply()
                                favState = sharedPref.getString(FavoriteKey, null)
                                sharedPref.edit().putLong(DateKey, LocalDate.now().toEpochDay()).apply()
                                date = LocalDate.ofEpochDay(sharedPref.getLong(DateKey, 0))
                            },
                                favorite = favState ?: "",
                                date = date
                            )
                        }
                    }
                }
            }
        }
    }
}



