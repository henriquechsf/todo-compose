package com.github.henriquechsf.todocompose.data

import androidx.room.Database
import androidx.room.RoomDatabase
import androidx.room.TypeConverters
import com.github.henriquechsf.todocompose.data.converters.PriorityConverter
import com.github.henriquechsf.todocompose.data.models.TodoTask

@Database(entities = [TodoTask::class], version = 1, exportSchema = false)
@TypeConverters(PriorityConverter::class)
abstract class TodoDatabase : RoomDatabase() {

    abstract fun todoDao(): TodoDao
}