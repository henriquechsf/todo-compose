package com.github.henriquechsf.todocompose.data.models

import androidx.compose.ui.graphics.Color
import com.github.henriquechsf.todocompose.ui.theme.HighPriorityColor
import com.github.henriquechsf.todocompose.ui.theme.LowPriorityColor
import com.github.henriquechsf.todocompose.ui.theme.MediumPriorityColor
import com.github.henriquechsf.todocompose.ui.theme.NonePriorityColor

enum class Priority(val color: Color) {
    HIGH(color = HighPriorityColor),
    MEDIUM(color = MediumPriorityColor),
    LOW(color = LowPriorityColor),
    NONE(color = NonePriorityColor)
}