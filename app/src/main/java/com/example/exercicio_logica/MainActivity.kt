package com.example.exercicio_logica

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        var list = listOf("1", 2, 3.0, true, "abcd", 5.75)

        val button = findViewById<Button>(R.id.button)
        val textview = findViewById<TextView>(R.id.textView)
        var index = 0

        button.setOnClickListener {
            if (index+1 <= list.size) {
                textview.text = list[index].toString()
                index += 1
            } else {
                textview.text = "Todos os itens da lista já foram mostrados."
            }
        }
    }
}