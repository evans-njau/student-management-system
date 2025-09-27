package com.example.studentmanagmentsystem

import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import androidx.lifecycle.ViewModelProvider

class AddStudentActivity : AppCompatActivity() {

    private lateinit var viewModel: StudentViewModel

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_add_student)

        viewModel = ViewModelProvider(this)[StudentViewModel::class.java]

        val etName = findViewById<EditText>(R.id.etName)
        val etReg = findViewById<EditText>(R.id.etRegNumber)
        val etCourse = findViewById<EditText>(R.id.etCourse)
        val btnSave = findViewById<Button>(R.id.btnSave)

        btnSave.setOnClickListener {
            val student = Student(
                name = etName.text.toString(),
                regNumber = etReg.text.toString(),
                course = etCourse.text.toString()
            )
            viewModel.insert(student)
            Toast.makeText(this, "Student Added!", Toast.LENGTH_SHORT).show()
            finish()
        }
    }
}
