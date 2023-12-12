package com.example.planer

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class MainActivity : AppCompatActivity(){

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val dnevni = findViewById<Button>(R.id.btn_dnevni);
        val kalendar = findViewById<Button>(R.id.btn_kalendar);
        val beleske = findViewById<Button>(R.id.btn_beleske);
        val login = findViewById<Button>(R.id.btn_login);
        val list30 = findViewById<Button>(R.id.btn_list30);

        list30.setOnClickListener{
            val intent = Intent(this, RecyclerViewList::class.java)
            startActivity(intent)
        }

        kalendar.setOnClickListener {
            val intent = Intent(this, Kalendar::class.java)
            startActivity(intent)
        }

        dnevni.setOnClickListener {
            val intent = Intent(this, DnevniPlaner::class.java)
            startActivity(intent)
        }

        beleske.setOnClickListener {
            val intent = Intent(this, Notes::class.java)
            startActivity(intent)
        }

        login.setOnClickListener {
            val intent = Intent(this, Login::class.java)
            startActivity(intent)
        }

    }
}