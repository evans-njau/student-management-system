package com.example.studentmanagmentsystem

import androidx.lifecycle.LiveData

class StudentRepository(private val studentDao: StudentDao) {
    val allStudents: LiveData<List<Student>> = studentDao.getAllStudents()

    suspend fun insert(student: Student) {
        studentDao.insertStudent(student)
    }
}
