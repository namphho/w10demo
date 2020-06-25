package com.hnam.w10demo

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import androidx.lifecycle.ViewModelProvider

class MainActivity : AppCompatActivity() {

    lateinit  var tvTitle : TextView
    lateinit  var btnAdd : Button
    lateinit var mainVM: MainVM

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val factory = MainVMFactory(10)
        mainVM = ViewModelProvider(this, factory).get(MainVM::class.java)

        tvTitle = findViewById(R.id.tv_text)
        btnAdd = findViewById(R.id.btn_add)
        tvTitle.text = "${mainVM.count}"
        btnAdd.setOnClickListener {
            mainVM.clickAdd()
            tvTitle.text = "${mainVM.count}"
        }
    }
}
