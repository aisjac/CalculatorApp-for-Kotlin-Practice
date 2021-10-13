package com.example.myapplication

import android.graphics.Color
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.*

class CalculatorUiPage : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_calculator_ui_page)


        calaulation()

    }

    private fun calaulation() {

        // EditText and textView Initialization
        var firstEditText = findViewById<EditText>(R.id.editTextFirstNumberId)
        var secondEditText = findViewById<EditText>(R.id.editTextSecondNumberId)
        var resultTextView = findViewById<TextView>(R.id.textViewResultShowId)

        // Button initialization
        var addbutton = findViewById<Button>(R.id.imageButtonAddId)
        var subbutton = findViewById<Button>(R.id.imageButtonSubId)
        var mutlibutton = findViewById<Button>(R.id.imageButtonMultiId)
        var divbutton = findViewById<Button>(R.id.imageButtonDivId)




        addbutton.setOnClickListener() {

            //get value to string
            var firstValue = firstEditText.text.toString()
            var secondValue = secondEditText.text.toString()

            if (firstValue.isEmpty() || secondValue.isEmpty()) {
                Toast.makeText(this, "Field Can't be Empty!", Toast.LENGTH_SHORT).show()
            } else {
//                resultTextView.text.toString(firstValue.toDouble() + secondValue.toDouble())
//                var x = firstValue.toDouble()
//                var y = secondValue.toDouble()
//                var z = (x+y)

//                var result = (firstValue.toDouble() + secondValue.toDouble())

                resultTextView.text = "%.2f".format(firstValue.toDouble() + secondValue.toDouble())
                resultTextView.setTextColor(Color.BLACK)
            }
        }

        subbutton.setOnClickListener() {

            //get value to string
            var firstValue = firstEditText.text.toString()
            var secondValue = secondEditText.text.toString()

            if (firstValue.isEmpty() || secondValue.isEmpty()) {
                Toast.makeText(this, "Field Can't be Empty!", Toast.LENGTH_SHORT).show()
            } else {
//                resultTextView.text.toString(firstValue.toDouble() + secondValue.toDouble())
//                var x = firstValue.toDouble()
//                var y = secondValue.toDouble()
//                var z = (x+y)

//                var result = (firstValue.toDouble() + secondValue.toDouble())

                resultTextView.text = "%.2f".format(firstValue.toDouble() - secondValue.toDouble())
                resultTextView.setTextColor(Color.BLACK)
            }



        }

        mutlibutton.setOnClickListener() {
            //get value to string
            var firstValue = firstEditText.text.toString()
            var secondValue = secondEditText.text.toString()

            if (firstValue.isEmpty() || secondValue.isEmpty()) {
                Toast.makeText(this, "Field Can't be Empty!", Toast.LENGTH_SHORT).show()
            } else {
//                resultTextView.text.toString(firstValue.toDouble() + secondValue.toDouble())
//                var x = firstValue.toDouble()
//                var y = secondValue.toDouble()
//                var z = (x+y)

//                var result = (firstValue.toDouble() + secondValue.toDouble())

                resultTextView.text = "%.2f".format(firstValue.toDouble() * secondValue.toDouble())
                resultTextView.setTextColor(Color.BLACK)
            }

        }

        divbutton.setOnClickListener() {
            //get value to string
            var firstValue = firstEditText.text.toString()
            var secondValue = secondEditText.text.toString()

            if (firstValue.isEmpty() || secondValue.isEmpty()) {
                Toast.makeText(this, "Field Can't be Empty!", Toast.LENGTH_SHORT).show()
            } else {
//                resultTextView.text.toString(firstValue.toDouble() + secondValue.toDouble())
//                var x = firstValue.toDouble()
//                var y = secondValue.toDouble()
//                var z = (x+y)

//                var result = (firstValue.toDouble() + secondValue.toDouble())

                resultTextView.text = "%.2f".format(firstValue.toDouble() / secondValue.toDouble())
                resultTextView.setTextColor(Color.BLACK)
            }

        }

    }
}