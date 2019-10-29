package com.example.responsi060

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.*
import kotlinx.android.synthetic.main.activity_registrasi.*

class registrasi : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_registrasi)
        //reg
        val namakamu=findViewById<EditText>(R.id.nama)
        val alamatkamu=findViewById<EditText>(R.id.alamat)
        val emailkamu=findViewById<EditText>(R.id.email)
        val passkamu=findViewById<EditText>(R.id.pass)

        button.setOnClickListener(){
            val emailkamu=emailkamu.text.toString()
            val passkamu=passkamu.text.toString()
            val alamatkamu=alamatkamu.text.toString()
            val namakamu=namakamu.text.toString()

            intent= Intent(this@registrasi, dashboard2::class.java)
            intent.putExtra("Namakamu", namakamu)
            intent.putExtra("Alamatkamu",alamatkamu)
            intent.putExtra("Emailkamu", emailkamu)
            intent.putExtra("Passkamu", passkamu)
            startActivity(intent)
        }
    }
}

