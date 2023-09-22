package com.covenant.qotd.MenuStuff


import android.icu.lang.UCharacter.VerticalOrientation
import androidx.compose.animation.animateColorAsState
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Api
import androidx.compose.material.icons.outlined.AlarmOn
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Icon
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.RectangleShape
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.covenant.qotd.Logic.Category
import com.covenant.qotd.Logic.GetQuote

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun Card(
    icon: ImageVector,
    text: String,
    onClick:() -> Unit,
    modifier: Modifier = Modifier,
    enabled: Boolean = true,
) {
    val color by animateColorAsState(
        if (enabled) MaterialTheme.colorScheme.surface
        else MaterialTheme.colorScheme.onSurface.copy(alpha = 0.12f)
    )
    val contentColor by animateColorAsState(
        if (enabled) MaterialTheme.colorScheme.onSurface
        else MaterialTheme.colorScheme.onSurface.copy(alpha = 0.38f)
    )

    Surface(
        modifier = modifier,
        shape = RectangleShape,
        tonalElevation = 1.dp,
        onClick = onClick,
        enabled = enabled,
        color = color,
        contentColor = contentColor,
    ) {
        Column(
            verticalArrangement = Arrangement.Center,
            horizontalAlignment = Alignment.CenterHorizontally,
            modifier = Modifier.padding(28.dp)
        ) {
            Icon(imageVector = icon, contentDescription = text)
            Text(text = text)
        }
    }
}

@Preview
@Composable
fun Cardprev() {
    Card(icon = Icons.Outlined.AlarmOn, "Alarm", modifier = Modifier.padding(24.dp), onClick = {})
}