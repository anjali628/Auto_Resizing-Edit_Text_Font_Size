package com.example.autoresizing_edittextfontsize

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.text.Editable
import android.text.TextWatcher
import android.widget.EditText
import android.widget.TextView

class MainActivity : AppCompatActivity() {

    private lateinit var editText: EditText
    private lateinit var textView: TextView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        editText=findViewById(R.id.edit_text)
        textView=findViewById(R.id.text_view)

        editText.addTextChangedListener(object :TextWatcher{
            override fun beforeTextChanged(p0: CharSequence?, p1: Int, p2: Int, p3: Int) {

            }

            override fun onTextChanged(p0: CharSequence?, p1: Int, p2: Int, p3: Int) {
                textView.setText(p0.toString())
                var size=textView.textSize
                size=size/3
                editText.textSize=size
            }

            override fun afterTextChanged(p0: Editable?) {

            }

        })

    }
}