package com.github.henriquechsf.todocompose.data.converters

import androidx.room.TypeConverter
import com.github.henriquechsf.todocompose.data.models.Priority

class PriorityConverter {
    @TypeConverter
    fun fromPriority(priority: Priority) = priority.name

    @TypeConverter
    fun toPriority(priority: String) = Priority.valueOf(priority)
}