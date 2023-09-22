package com.covenant.qotd

import androidx.compose.animation.core.tween
import androidx.compose.animation.fadeIn
import androidx.compose.animation.fadeOut
import androidx.compose.animation.scaleIn
import androidx.compose.animation.scaleOut
import androidx.compose.animation.slideInHorizontally
import androidx.compose.animation.slideOutHorizontally
import androidx.compose.animation.togetherWith
import androidx.compose.ui.unit.Density
import androidx.compose.ui.unit.dp


//By Hamuel, ayaw niya po daw walang animation.
fun sharedZAxis(forward: Boolean = true) =
    scaleIn(
        animationSpec = tween(durationMillis = 300),
        initialScale = if (forward) 0.8f else 1.1f,
    ) + fadeIn(
        animationSpec = tween(
            delayMillis = 90,
            durationMillis = 210,
        ),
    ) togetherWith scaleOut(
        animationSpec = tween(durationMillis = 300),
        targetScale = if (forward) 1.1f else 0.8f,
    ) + fadeOut(animationSpec = tween(durationMillis = 90))