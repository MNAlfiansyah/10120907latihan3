//Nim : 10120907
//Nama : Muhammad Nur Alviansyah
//Kelas : IF10
//Tanggal : 30 April 2023

package com.example.a10120907latihan3

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button

class WelcomeActivity : AppCompatActivity(), View.OnClickListener {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_welcome)

        val buttonMulai : Button = findViewById(R.id.buttonMulai)
        buttonMulai.setOnClickListener(this)
    }

    override fun onClick(v: View?) {
        when(v?.id){
            R.id.buttonMulai -> {
                val moveIntent = Intent(this@WelcomeActivity, LoginActivity::class.java)
                startActivity(moveIntent)
            }
        }
    }
}