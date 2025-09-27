package com.example.studentmanagmentsystem

import androidx.room.Entity
import androidx.room.PrimaryKey
import androidx.room.Index

@Entity(
    tableName = "students",
    indices = [Index(value = ["regNumber"], unique = true)]
)
data class Student(
    @PrimaryKey(autoGenerate = true) val id: Int = 0,
    val name: String,
    val regNumber: String,
    val course: String
)
