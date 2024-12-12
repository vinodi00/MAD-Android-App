package com.diascreation.e_learning_app

import android.os.Bundle
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import android.app.DatePickerDialog
import android.app.TimePickerDialog
import android.widget.Button
import android.widget.EditText
import android.widget.Toast
import java.util.*
class Popup : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_popup)

        val saveButton: Button = findViewById(R.id.saveButton)
        val typeInput: EditText = findViewById(R.id.typeInput)
        val moduleInput: EditText = findViewById(R.id.moduleInput)
        val seatInput: EditText = findViewById(R.id.seatInput)
        val hallInput: EditText = findViewById(R.id.hallInput)
        val dateInput: EditText = findViewById(R.id.dateInput)
        val timeInput: EditText = findViewById(R.id.timeInput)
        val durationInput: EditText = findViewById(R.id.durationInput)

        // Set up the DatePickerDialog for the date input
        dateInput.setOnClickListener {
            showDatePicker(dateInput)
        }

        // Set up the TimePickerDialog for the time input
        timeInput.setOnClickListener {
            showTimePicker(timeInput)
        }

        // Set up the Save button listener
        saveButton.setOnClickListener {
            val type = typeInput.text.toString()
            val module = moduleInput.text.toString()
            val seat = seatInput.text.toString()
            val hall = hallInput.text.toString()
            val date = dateInput.text.toString()
            val time = timeInput.text.toString()
            val duration = durationInput.text.toString()

            // Perform data validation (optional)
            if (type.isEmpty() || module.isEmpty() || date.isEmpty() || time.isEmpty()) {
                Toast.makeText(this, "Please fill in all required fields", Toast.LENGTH_SHORT).show()
            } else {
                // Logic to save the task (database or any other logic)
                Toast.makeText(this, "Task Saved", Toast.LENGTH_SHORT).show()
            }
        }
    }

    // Function to show DatePicker dialog
    private fun showDatePicker(dateInput: EditText) {
        val calendar = Calendar.getInstance()
        val year = calendar.get(Calendar.YEAR)
        val month = calendar.get(Calendar.MONTH)
        val day = calendar.get(Calendar.DAY_OF_MONTH)

        val datePickerDialog = DatePickerDialog(
            this,
            { _, selectedYear, selectedMonth, selectedDay ->
                val formattedDate = "${selectedDay}/${selectedMonth + 1}/${selectedYear}"
                dateInput.setText(formattedDate)
            },
            year, month, day
        )
        datePickerDialog.show()
    }

    // Function to show TimePicker dialog
    private fun showTimePicker(timeInput: EditText) {
        val calendar = Calendar.getInstance()
        val hour = calendar.get(Calendar.HOUR_OF_DAY)
        val minute = calendar.get(Calendar.MINUTE)

        val timePickerDialog = TimePickerDialog(
            this,
            { _, selectedHour, selectedMinute ->
                val formattedTime = String.format("%02d:%02d", selectedHour, selectedMinute)
                timeInput.setText(formattedTime)
            },
            hour, minute, true
        )
        timePickerDialog.show()
    }
}




