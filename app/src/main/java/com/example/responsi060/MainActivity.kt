package com.example.responsi060

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.content.Intent
import android.widget.EditText
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val email=findViewById<EditText>(R.id.email)
        val pass=findViewById<EditText>(R.id.pass)

        login.setOnClickListener() {
            val email = email.text.toString()
            val pass = pass.text.toString()

            //dari registrasi
            val namakamu=intent.getStringExtra("Namakamu")
            val alamatkamu=intent.getStringExtra("Alamatkamu")
            val emailkamu = intent.getStringExtra("Emailkamu")
            val passkamu=intent.getStringExtra("Passkamu")

            if (email.isEmpty() ||pass.isEmpty()){
                Toast.makeText(this,"Tolong Masukan Email Dan Passwor Anda ",Toast.LENGTH_LONG).show()
                return@setOnClickListener
            }



            /*         }
                     if (Email=="furqonfauzi28@gmail.com"||Pass=="terbang123")
         */
            intent= Intent(this,dashboard::class.java)
            intent.putExtra("Emailkamu",emailkamu)
            intent.putExtra("Passkamu",passkamu)
            intent.putExtra("Namakamu",namakamu)
            intent.putExtra("Alamatkamu",alamatkamu)


            intent.putExtra("Email",email)
            intent.putExtra("Pass",pass)
            startActivity(intent)


        }
        reg.setOnClickListener(){
            val intent1=Intent(this@MainActivity,registrasi::class.java)
            toast("Menuju halaman Registrasi!!!",Toast.LENGTH_LONG)
            startActivity(intent1)
        }
    }

    fun toast(message: String,length: Int=Toast.LENGTH_LONG){
        Toast.makeText(this, message, length).show()
    }
}
