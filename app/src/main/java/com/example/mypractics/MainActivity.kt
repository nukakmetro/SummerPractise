package com.example.mypractics

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.KeyEvent
import android.view.View
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import android.widget.Toast
import androidx.core.view.isInvisible
import com.example.mypractics.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    private var clickButton: Button? = null

    private lateinit var binding: ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        val newBinding = ActivityMainBinding.inflate(layoutInflater)
        binding = newBinding
        setContentView(newBinding.root)

        binding.button.setOnClickListener{

        }
        var name = ""
        var height = 0
        var weight = 0
        var age = 0
        var n = 50
        var count = 1;
        var editText = findViewById<EditText>(R.id.editText)
        clickButton = findViewById<Button>(R.id.button)
        var viewText = findViewById<TextView>(R.id.textView)
        var viewError = findViewById<TextView>(R.id.textView2)
        var viewResult = findViewById<TextView>(R.id.textView4)
        var check = false

        clickButton?.setOnClickListener {
            viewError.setVisibility(View.INVISIBLE)

            if (editText.length() > 0) {
                when (count) {
                    1 -> {
                        if ((editText.length() > 0) || (editText.length() <= n)) {
                            viewText.text = "enter your height"
                            name = editText.text.toString()
                            editText.setText("")
                            count++
                            n = 250
                        } else {
                            viewError.text = "field cannot be empty"
                            viewError.setVisibility(View.VISIBLE)
                        }
                    }

                    2 -> {
                        if (editText.text.toString().toInt() > 0 && editText.text.toString()
                                .toInt() < 250
                        ) {
                            viewText.text = "enter your weight"
                            height = editText.text.toString().toInt()
                            editText.setText("")
                            count++
                        } else {
                            viewError.text = " meaning 0-250"
                            viewError.setVisibility(View.VISIBLE)
                        }
                    }

                    3 -> {
                        if (editText.text.toString().toInt() > 0 && editText.text.toString()
                                .toInt() < 250
                        ) {
                            viewText.text = "enter your age"
                            weight = editText.text.toString().toInt()
                            editText.setText("")
                            count++
                            n = 150
                        } else {
                            viewError.text = " meaning 0-250"
                            viewError.setVisibility(View.VISIBLE)
                        }
                    }

                    4 -> {
                        if (editText.text.toString().toInt() > 0 && editText.text.toString()
                                .toInt() < 150
                        ) {
                            viewText.text = ""
                            age = editText.text.toString().toInt()
                            editText.setText("")
                            clickButton!!.text = "result"
                            count++
                            n = 150
                            check = true
                        } else {
                            viewError.text = " meaning 0-150"
                            viewError.setVisibility(View.VISIBLE)
                        }
                    }

                }

            } else {
                viewError.text = "field cannot be empty"
                viewError.setVisibility(View.VISIBLE)
            }
            if (check) {
                var cofActiv = 1.4
                var calories = (weight * 10 + height * 6.25 - age * 5) * cofActiv
                var nds = height / weight
                var ipoteca = weight / age
                clickButton!!.setVisibility(View.GONE)
                editText.setVisibility(View.GONE)
                viewResult.text =
                    "calories: " + calories + "\nNDS: " + nds + "\nipoteca: " + ipoteca
            }
        }

    }

    override fun onDestroy() {
        super.onDestroy()
        binding 
    }


}
