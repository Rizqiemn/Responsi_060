package com.example.responsi060

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_dashboard.*

class dashboard : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_dashboard)
        val intent = intent
        val email=intent.getStringExtra("Email")
        val pass=intent.getStringExtra("Pass")
        val namakamu=intent.getStringExtra("Namakamu")
        val alamatkamu=intent.getStringExtra("Alamatkamu")
        val emailkamu = intent.getStringExtra("Emailkamu")
        val passkamu=intent.getStringExtra("Passkamu")

        val hasil=findViewById<TextView>(R.id.textView)
        hasil.text ="Nama : "+namakamu+"\nAlamat : "+alamatkamu+"\nEmail : " + emailkamu + "\nPassword : " + passkamu

        button2.setOnClickListener(){
            val intent=Intent(this@dashboard, registrasi::class.java)
            toast("Menuju Form Registrasi", Toast.LENGTH_LONG)
            startActivity(intent)
        }
        button3.setOnClickListener(){
            val intent=Intent(this@dashboard, MainActivity::class.java)
            toast("Menuju Form Login", Toast.LENGTH_LONG)
            startActivity(intent)
        }
}

    private fun toast(message: String,length: Int=Toast.LENGTH_LONG) {
            Toast.makeText(this, message, length).show()
    }
}
