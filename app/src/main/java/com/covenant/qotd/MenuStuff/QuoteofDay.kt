package com.covenant.qotd.MenuStuff



import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.covenant.qotd.Logic.GetQotd
import com.covenant.qotd.ui.theme.QotdTheme

@OptIn(ExperimentalStdlibApi::class)
@Composable
fun Quoteofday() {
    Column(horizontalAlignment = Alignment.CenterHorizontally){
        Text(
            text = "Quote of The Day",
            fontFamily =  FontFamily.Monospace,
            modifier = Modifier.padding(5.dp)
        )

        Text(
            text = GetQotd(),
            fontFamily = FontFamily.Monospace,
            textAlign = TextAlign.Center,
            modifier = Modifier.padding(40.dp)
        )

    }

}

@Preview
@Composable
fun quoteofdayPrev() {
    QotdTheme {
        Quoteofday()
    }
}


