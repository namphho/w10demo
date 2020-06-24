package com.hnam.w10demo

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import androidx.lifecycle.ViewModel
import androidx.lifecycle.ViewModelProvider
import androidx.lifecycle.ViewModelProviders

class MainActivity : AppCompatActivity() {

    lateinit  var tvTitle : TextView
    lateinit  var btnAdd : Button
    var count = 0

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        tvTitle = findViewById(R.id.tv_text)
        btnAdd = findViewById(R.id.btn_add)
        tvTitle.text = "$count"
        btnAdd.setOnClickListener {
            count++
            tvTitle.text = "$count"
        }
    }
}
