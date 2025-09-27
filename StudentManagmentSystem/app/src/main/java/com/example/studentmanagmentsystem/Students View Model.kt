package com.example.studentmanagmentsystem

import android.app.Application
import androidx.lifecycle.*
import kotlinx.coroutines.launch

class StudentViewModel(application: Application) : AndroidViewModel(application) {
    private val repository: StudentRepository
    val allStudents: LiveData<List<Student>>

    init {
        val dao = StudentDatabase.getDatabase(application).studentDao()
        repository = StudentRepository(dao)
        allStudents = repository.allStudents
    }

    fun insert(student: Student) = viewModelScope.launch {
        repository.insert(student)
    }
}
